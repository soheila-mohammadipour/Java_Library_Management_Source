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
public class Book {

    private int sabt;
    private String saleNashr;
    private String onvan;
    private String nevisande;
    private String nasher;
    private String mahaleNashr;
    private String zaban;
    private long arzesh;
    private String shabak;
    private String kholose;
    private String mozo;
    private String jeld;
    private int tedad;

    public enum BookIndex {

        SABT(0), SALENASHR(1), ONVAN(2), NEVISANDE(3), NASHER(4), MAHALENASHR(5), ZABAN(6),
        ARZESH(7), SHABAK(8), KHOLASE(9), MOZO(10), JELD(11), TEDAD(12);

        private final int code;

        private BookIndex(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public Book(int sabt, String saleNashr, String onvan,
            String nevisande, String nasher, String mahaleNashr, String zaban, long arzesh, String shabak, String kholose,
            String mozo, String jeld, int tedad) {
        this.sabt = sabt;
        this.saleNashr = saleNashr;
        this.onvan = onvan;
        this.nevisande = nevisande;
        this.nasher = nasher;
        this.mahaleNashr = mahaleNashr;
        this.zaban = zaban;
        this.arzesh = arzesh;
        this.shabak = shabak;
        this.kholose = kholose;
        this.mozo = mozo;
        this.jeld = jeld;
        this.tedad = tedad;
    }

    public long getArzesh() {
        return arzesh;
    }

    public String getDate() {
        return saleNashr;
    }

    public String getJeld() {
        return jeld;
    }

    public String getKholose() {
        return kholose;
    }

    public String getMahaleNashr() {
        return mahaleNashr;
    }

    public String getMozo() {
        return mozo;
    }

    public String getNasher() {
        return nasher;
    }

    public String getNevisande() {
        return nevisande;
    }

    public String getOnvan() {
        return onvan;
    }

    public int getSabt() {
        return sabt;
    }

    public String getShabak() {
        return shabak;
    }

    public int getTedad() {
        return tedad;
    }

    public String getZaban() {
        return zaban;
    }

    public void setArzesh(long arzesh) {
        this.arzesh = arzesh;
    }

    public void setDate(String saleNashr) {
        this.saleNashr = saleNashr;
    }

    public void setJeld(String jeld) {
        this.jeld = jeld;
    }

    public void setKholose(String kholose) {
        this.kholose = kholose;
    }

    public void setMahaleNashr(String mahaleNashr) {
        this.mahaleNashr = mahaleNashr;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public void setNasher(String nasher) {
        this.nasher = nasher;
    }

    public void setNevisande(String nevisande) {
        this.nevisande = nevisande;
    }

    public void setOnvan(String Onvan) {
        this.onvan = Onvan;
    }

    public void setSabt(int sabt) {
        this.sabt = sabt;
    }

    public void setShabak(String shabak) {
        this.shabak = shabak;
    }

    public void setTedad(int tedad) {
        this.tedad = tedad;
    }

    public void setZaban(String zaban) {
        this.zaban = zaban;
    }

    public void insertBook() {
        String sql;
        sql = String.format("INSERT INTO ROOT.BOOK "
                + "(BSABT, BSALENASHR, BONVAN, BNEVISANDE, BNASHER,"
                + " BMAHALNASHR, BZABAN, BARZESH, BSHABAK, BKHOLASE,"
                + " BMOZO, BJELD, BTEDAD) "
                + "VALUES (%d, '%s', '%s', '%s', '%s', '%s', '%s', %d,"
                + " '%s', '%s', '%s', '%s', %d)",
                this.sabt, this.saleNashr, this.onvan, this.nevisande,
                this.nasher, this.mahaleNashr, this.zaban, this.arzesh,
                this.shabak, this.kholose, this.onvan, this.jeld, this.tedad);
        DataAcces newBook = new DataAcces();
        newBook.exeQ(sql);
    }

    public void updateBook() {
        String sql;
        sql = String.format("update ROOT.BOOK b "
                + "set b.BSALENASHR = '%s', b.BONVAN = '%s',"
                + " b.BNEVISANDE = '%s', b.BNASHER = '%s',"
                + " b.BMAHALNASHR = '%s', b.BZABAN = '%s',"
                + " b.BARZESH = %d, b.BSHABAK = '%s', b.BKHOLASE = '%s',"
                + " b.BMOZO = '%s', b.BJELD = '%s', b.BTEDAD = %d"
                + " where b.BSABT = %d",
                this.saleNashr, this.onvan, this.nevisande, this.nasher,
                this.mahaleNashr, this.zaban, this.arzesh, this.shabak,
                this.kholose, this.mozo, this.jeld, this.tedad, this.sabt);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void deleteBook() {
        String sql;
        sql = String.format("delete from ROOT.BOOK b"
                + " where b.BSABT = %d", this.sabt);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }
}
