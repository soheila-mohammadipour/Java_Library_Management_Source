/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DataAcces.DataAcces;

/**
 *
 * @author mad
 */
public class User {

    private int kod;
    private String nam;
    private String famil;
    private String semat;
    private int dastresi;
    private String userName;
    private String pass;

    public enum UserIndex {

        KOD(0), NAM(1), FAMIL(2), SEMAT(3), DASTRESI(4), USERNAME(5), PASS(6);

        private final int code;

        private UserIndex(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public User(int kod, String nam, String famil, String semat, int dastresi, String userName, String Pass) {
        this.kod = kod;
        this.nam = nam;
        this.famil = famil;
        this.semat = semat;
        this.dastresi = dastresi;
        this.userName = userName;
        this.pass = Pass;
    }

    public int getKod() {
        return kod;
    }

    public String getNam() {
        return nam;
    }

    public String getFamil() {
        return famil;
    }

    public String getSemat() {
        return semat;
    }

    public int getDastresi() {
        return dastresi;
    }

    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return pass;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public void setFamil(String famil) {
        this.famil = famil;
    }

    public void setSemat(String semat) {
        this.semat = semat;
    }

    public void setDastresi(int dastresi) {
        this.dastresi = dastresi;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String Pass) {
        this.pass = Pass;
    }

    public void insertUser() {
        String sql;
        sql = String.format("INSERT INTO ROOT.UUSER "
                + "(UKOD, UNAM, UFAMIL, USEMAT, UDASTRESI, UUSERNAME, UPASS) "
                + "VALUES (%d, '%s', '%s', '%s', %d, '%s', '%s')",
                this.kod, this.nam, this.famil, this.semat, this.dastresi,
                this.userName, this.pass);
        DataAcces newUser = new DataAcces();
        newUser.exeQ(sql);
    }

    public static User selectUser(String sql) {
        DataAcces da = new DataAcces(sql);
        String[][] data = da.getData();
        if (data.length == 1) {
            int kod = Integer.parseInt(data[0][UserIndex.KOD.getCode()]);
            String nam = data[0][UserIndex.NAM.getCode()];
            String famil = data[0][UserIndex.FAMIL.getCode()];
            String semat = data[0][UserIndex.SEMAT.getCode()];
            int dastresi = Integer.parseInt(data[0][UserIndex.DASTRESI.getCode()]);
            String userName = data[0][UserIndex.USERNAME.getCode()];
            String pass = data[0][UserIndex.PASS.getCode()];

            User retUser = new User(kod, nam, famil, semat, dastresi, userName, pass);
            return retUser;
        } else {
            return null;
        }
    }

    public void updateUser() {
        String sql;
        sql = String.format("update ROOT.UUSER u "
                + "set u.UNAM = '%s', u.UFAMIL = '%s',"
                + " u.USEMAT = '%s', u.UDASTRESI = %d,"
                + " u.UUSERNAME = '%s', u.UPASS = '%s' "
                + "where u.UKOD = %d", this.nam, this.famil, this.semat,
                this.dastresi, this.userName, this.pass, this.kod);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void deleteUser() {
        String sql;
        sql = String.format("delete from ROOt.UUSER u"
                + " where u.UKOD = %d", this.kod);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }
}
