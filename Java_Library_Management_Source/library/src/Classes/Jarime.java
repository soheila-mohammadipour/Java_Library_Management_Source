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
public class Jarime {

    private int mid;
    private String date;
    private int nkod;
    private int ukod;

    public Jarime(int mid, String date, int nkod, int ukod) {
        this.mid = mid;
        this.date = date;
        this.nkod = nkod;
        this.ukod = ukod;
    }

    public String getDate() {
        return date;
    }

    public int getMid() {
        return mid;
    }

    public int getNkod() {
        return nkod;
    }

    public int getUkod() {
        return ukod;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setNkod(int nkod) {
        this.nkod = nkod;
    }

    public void setUkod(int ukod) {
        this.ukod = ukod;
    }

    public static String[] selectNJarime() {
        DataAcces da = new DataAcces("select * from ROOT.NJARIME");
        String[][] data = da.getData();
        String[] njarime = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            njarime[i] = data[i][1];
        }
        return njarime;
    }

    public void insertJarime() {
        String sql;
        sql = String.format("INSERT INTO ROOT.JARIME"
                + " (JMID, JDATE, JNKOD, JUKOD)"
                + " VALUES (%d, '%s', %d, %d)",
                this.mid, this.date, this.nkod, this.ukod);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

}
