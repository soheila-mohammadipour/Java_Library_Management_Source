/*
 */
package DataAcces;

import Classes.showMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Abdolsalam dehvari
 */
public class DataAcces {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    private final String dbURL = "jdbc:derby://localhost:1527";
    private final String dbName = "/library";
    private final String username = "root";
    private final String password = "123";

    private int rowCount = 0;
    private int colCount = 0;
    private String[][] data;
    private String sql;

    public DataAcces() {
    }

    public DataAcces(String sql) {
        this.sql = sql;
        exec();
    }

    private boolean connect() {
        try {
            connection = DriverManager.getConnection(dbURL + dbName, username, password);
            statement = connection.createStatement();
            System.out.println("connect");
            return true;
        } catch (SQLException ex) {
            showMessage.error(ex.getMessage());
            return false;
        }
    }

    private boolean disconnect() {
        try {
            statement.close();
            connection.close();
            System.out.println("disconnect");

            return true;
        } catch (SQLException ex) {
            showMessage.error(ex.getMessage());
            return false;
        }
    }

    public void exec() {
        getRowCount();
        select(sql);
    }

    public void exec(String sql) {
        this.sql = sql;
        exec();
    }

    private void select(String sql) {
        try {
            connect();
            resultSet = statement.executeQuery(sql);
            colCount = resultSet.getMetaData().getColumnCount();
            data = new String[rowCount][colCount];
            int i = 0;
            while (resultSet.next()) {
                for (int j = 0; j < colCount; j++) {
                    data[i][j] = resultSet.getString(j + 1);
                }
                i++;
            }
            disconnect();
        } catch (SQLException ex) {
            showMessage.error(ex.getMessage());
        }
    }

    private int getRowCount() {
        try {
            connect();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                rowCount++;
            }
            disconnect();
        } catch (SQLException ex) {
            showMessage.error(ex.getMessage());
        }
        return rowCount;
    }

    public String[][] getData() {
        return data;
    }

    public boolean exeQ(String sql) {
        boolean bl = false;
        try {
            connect();
            bl = statement.execute(sql);
            disconnect();
        } catch (SQLException ex) {
            showMessage.error(ex.getMessage());
        }
        return bl;
    }
}
