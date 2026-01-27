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
public class Rezerv {

    private int mid;
    private int bsabt;
    private String date;
    private String retdate;

    public enum RezervIndex {

        BSABT(0), MID(2), RDATE(5), RRETDATE(6);

        private final int code;

        private RezervIndex(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public Rezerv(int mid, int bsabt, String date, String retdate) {
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

    public void insertRezerv() {
        String sql;
        sql = String.format("insert into ROOT.REZERV "
                + "values(%d, %d, '%s', '%s')",
                this.mid, this.bsabt,
                this.date, this.retdate);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void updateRezerv() {
        String sql;
        sql = String.format("update ROOT.REZERV r set r.RRETDATE = '%s'"
                + "where r.MID = %d"
                + " and r.RBSABT = %d"
                + " and r.RDATE = '%s'",
                this.retdate, this.mid, this.bsabt, this.date);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void deleteRezerv() {
        String sql;
        sql = String.format("delete from ROOT.REZERV"
                + "where r.MID = %d"
                + " and r.RBSABT = %d"
                + " and r.RDATE = '%s'"
                + " and r.RRETDATE = '%s'",
                this.mid, this.bsabt, this.date, this.retdate);
    }
}
