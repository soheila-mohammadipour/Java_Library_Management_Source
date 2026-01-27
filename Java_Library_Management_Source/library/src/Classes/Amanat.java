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
public class Amanat {

    private int ukod;
    private int mid;
    private int bsabt;
    private String date;
    private String retdate;

    public enum AmanatIndex {

        UKOD(0), MID(3), BSABT(6), DATE(8), RETDATE(9);

        private final int code;

        private AmanatIndex(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public Amanat(int ukod, int mid, int bsabt, String date, String retdate) {
        this.ukod = ukod;
        this.mid = mid;
        this.bsabt = bsabt;
        this.date = date;
        this.retdate = retdate;
    }

    public int getBsabt() {
        return bsabt;
    }

    public String getDate() {
        return date;
    }

    public int getMid() {
        return mid;
    }

    public String getRetdate() {
        return retdate;
    }

    public int getUkod() {
        return ukod;
    }

    public void setBsabt(int bsabt) {
        this.bsabt = bsabt;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setRetdate(String retdate) {
        this.retdate = retdate;
    }

    public void setUkod(int ukod) {
        this.ukod = ukod;
    }

    public void insertAmanat() {
        String sql;
        sql = String.format("INSERT INTO ROOT.AMANAT"
                + " (AUKOD, AMID, ABSABT, ADATE, RETDATE)"
                + " VALUES (%d, %d, %d, '%s', '%s')",
                this.ukod, this.mid, this.bsabt, this.date, this.retdate);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void updateAmanat() {
        String sql;
        sql = String.format("update ROOT.AMANAT a"
                + " set a.RETDATE = '%s'"
                + " where a.AUKOD = %d"
                + " and a.AMID = %d"
                + " and a.ABSABT = %d"
                + " and a.ADATE = '%s'", this.retdate, this.ukod,
                this.mid, this.bsabt, this.date);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void deleteAmanat() {
        String sql;
        sql = String.format("update ROOT.AMANAT a"
                + " set a.RETDATE = null"
                + " where a.AUKOD = %d"
                + " and a.AMID = %d"
                + " and a.ABSABT = %d"
                + " and a.ADATE = '%s'", this.ukod,
                this.mid, this.bsabt, this.date);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }
}
