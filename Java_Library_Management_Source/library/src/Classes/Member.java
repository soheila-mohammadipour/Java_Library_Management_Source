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
public class Member {

    private int id;
    private String nam;
    private String famil;
    private long kod;
    private String namPedar;
    private String tavalod;
    private long shomare;
    private String jensiat;
    private String adres;
    private String reshte;
    private String aks;
    private String email;
    private String tarikhEn;

    public enum MemberIndex {

        ID(0), NAM(1), FAMIL(2), KOD(3), NAMEPEDAR(4), TAVALOD(5), SHOAMRE(6), JENSIAT(7),
        ADRES(8), RESHTE(9), AKS(10), EMAIL(11), TARIKHEN(12);

        private final int code;

        private MemberIndex(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public Member(int id, String nam, String famil, long kod,
            String namPedar, String tavalod, long shomare,
            String jensiat, String adres, String reshte,
            String aks, String email, String tarikhEn) {
        this.id = id;
        this.nam = nam;
        this.famil = famil;
        this.kod = kod;
        this.namPedar = namPedar;
        this.tavalod = tavalod;
        this.shomare = shomare;
        this.jensiat = jensiat;
        this.adres = adres;
        this.reshte = reshte;
        this.aks = aks;
        this.email = email;
        this.tarikhEn = tarikhEn;
    }

    public String getAdres() {
        return adres;
    }

    public String getAks() {
        return aks;
    }

    public String getEmail() {
        return email;
    }

    public String getFamil() {
        return famil;
    }

    public int getId() {
        return id;
    }

    public String getJensiat() {
        return jensiat;
    }

    public long getKod() {
        return kod;
    }

    public String getNam() {
        return nam;
    }

    public String getNamPedar() {
        return namPedar;
    }

    public String getReshte() {
        return reshte;
    }

    public long getShomare() {
        return shomare;
    }

    public String getTarikhEn() {
        return tarikhEn;
    }

    public String getTavalod() {
        return tavalod;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setAks(String aks) {
        this.aks = aks;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFamil(String famil) {
        this.famil = famil;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJensiat(String jensiat) {
        this.jensiat = jensiat;
    }

    public void setKod(long kod) {
        this.kod = kod;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public void setNamPedar(String namPedar) {
        this.namPedar = namPedar;
    }

    public void setReshte(String reshte) {
        this.reshte = reshte;
    }

    public void setShomare(long shomare) {
        this.shomare = shomare;
    }

    public void setTarikhEn(String tarikhEn) {
        this.tarikhEn = tarikhEn;
    }

    public void setTavalod(String tavalod) {
        this.tavalod = tavalod;
    }

    public void insertMember() {
        String sql;
        sql = String.format("INSERT INTO ROOT.MEMBER "
                + "(MID, MNAM, MFAMIL, MKOD, MNAMPEDAR, MTAVLOD,"
                + " MSHOMARE, MJENSYAT, MADRES, MRESHTE, MAKS,"
                + " MEMAIL, MTARIKHEN) "
                + "VALUES (%d, '%s', '%s', %d, '%s', '%s', %d, '%s',"
                + " '%s', '%s', '%s', '%s', '%s')",
                this.id, this.nam, this.famil, this.kod, this.namPedar,
                this.tavalod, this.shomare, this.jensiat, this.adres,
                this.reshte, this.aks, this.email, this.tarikhEn);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void updateMember() {
        String sql;
        sql = String.format("update ROOT.MEMBER m "
                + "set m.MNAM = '%s', m.MFAMIL = '%s', m.MKOD = %d,"
                + " m.MNAMPEDAR = '%s', m.MTAVLOD = '%s',"
                + " m.MSHOMARE = %d, m.MJENSYAT = '%s',"
                + " m.MADRES = '%s', m.MRESHTE = '%s', m.MAKS = '%s',"
                + " m.MEMAIL = '%s',"
                + " m.MTARIKHEN = '%s' where m.MID = %d",
                this.nam, this.famil, this.kod, this.namPedar,
                this.tavalod, this.shomare, this.jensiat, this.adres,
                this.reshte, this.aks, this.email, this.tarikhEn, this.id);
        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }

    public void deleteMember() {
        String sql;
        sql = String.format("delete from ROOT.MEMBER m"
                + " where m.MID = %d", this.id);

        DataAcces da = new DataAcces();
        da.exeQ(sql);
    }
}
