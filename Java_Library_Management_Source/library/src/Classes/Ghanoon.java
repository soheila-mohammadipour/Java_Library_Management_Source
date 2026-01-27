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
public class Ghanoon {

    private int gkod;
    private String gonvan;
    private int ghanoon;

    public enum GhanoonIndex {

        GKOD(0), GONVAN(1), GHANOON(2);

        private final int code;

        private GhanoonIndex(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public Ghanoon(int gkod, String gonvan, int ghanoon) {
        this.gkod = gkod;
        this.gonvan = gonvan;
        this.ghanoon = ghanoon;
    }

    public int getGhanoon() {
        return ghanoon;
    }

    public int getGkod() {
        return gkod;
    }

    public String getGonvan() {
        return gonvan;
    }

    public void setGhanoon(int ghanoon) {
        this.ghanoon = ghanoon;
    }

    public void setGkod(int gkod) {
        this.gkod = gkod;
    }

    public void setGonvan(String gonvan) {
        this.gonvan = gonvan;
    }

    public void insertGhanoon() {
        String sql;
        sql = String.format("INSERT INTO ROOT.GHANOON"
                + " (GKOD, GONVAN, GHANOON)"
                + " VALUES (%d, '%s', %d)",
                this.gkod, this.gonvan, this.ghanoon);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void updateGhanoon() {
        String sql;
        sql = String.format("update ROOT.GHANOON g"
                + " set g.GONVAN = '%s', g.GHANOON = %d"
                + " where g.GKOD = %d",
                this.gonvan, this.ghanoon, this.gkod);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void deleteGhanoon() {
        String sql;
        sql = String.format("delete from ROOT.GHANOON g"
                + " where g.GKOD = %d", this.gkod);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }
}
