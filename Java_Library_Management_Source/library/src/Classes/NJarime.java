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
public class NJarime {

    private int nkod;
    private String njarime;
    private int nmizan;

    public enum NJarimeIndex {

        NKOD(0), NJARIME(1), NMIZAN(2);
        private final int code;

        private NJarimeIndex(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public NJarime(int nkod, String njarime, int nmizan) {
        this.nkod = nkod;
        this.njarime = njarime;
        this.nmizan = nmizan;
    }

    public String getNjarime() {
        return njarime;
    }

    public int getNkod() {
        return nkod;
    }

    public int getNmizan() {
        return nmizan;
    }

    public void setNjarime(String njarime) {
        this.njarime = njarime;
    }

    public void setNkod(int nkod) {
        this.nkod = nkod;
    }

    public void setNmizan(int nmizan) {
        this.nmizan = nmizan;
    }

    public void insertNJarime() {
        String sql;
        sql = String.format("INSERT INTO ROOT.NJARIME (NKOD, NJARIME, NMIZAN)"
                + " VALUES (%d, '%s', %d)",
                this.nkod, this.njarime, this.nmizan);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void updateNJarime() {
        String sql;
        sql = String.format("update ROOT.NJARIME n"
                + " set n.NJARIME = '%s', n.NMIZAN = %d"
                + " where n.NKOD = %d",
                this.njarime, this.nmizan, this.nkod);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void deleteNJarime() {
        String sql;
        sql = String.format("delete from ROOT.NJARIME n"
                + " where n.NKOD = %d", this.nkod);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }
}
