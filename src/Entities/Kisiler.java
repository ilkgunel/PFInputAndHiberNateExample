package Entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Kisiler {
    private int id;
    private String isimSoyisim;
    private String telefonno;
    private String adres;
    private String il;
    private Date dogumtarihi;
    private String parola;
    private String hakkindabilgi;
    private int yas;
    private String cinsiyet;
    private String medenihal;
    private int eskimaas;
    private String kullanilanotobüsler;
    private int verilenoy;
    private String keyboarddusunce;
    private String yasamakistenensehir;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "isim_soyisim")
    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    @Basic
    @Column(name = "telefonno")
    public String getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }

    @Basic
    @Column(name = "adres")
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Basic
    @Column(name = "il")
    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    @Basic
    @Column(name = "dogumtarihi")
    public Date getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(Date dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    @Basic
    @Column(name = "parola")
    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Basic
    @Column(name = "hakkindabilgi")
    public String getHakkindabilgi() {
        return hakkindabilgi;
    }

    public void setHakkindabilgi(String hakkindabilgi) {
        this.hakkindabilgi = hakkindabilgi;
    }

    @Basic
    @Column(name = "yas")
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Basic
    @Column(name = "cinsiyet")
    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Basic
    @Column(name = "medenihal")
    public String getMedenihal() {
        return medenihal;
    }

    public void setMedenihal(String medenihal) {
        this.medenihal = medenihal;
    }

    @Basic
    @Column(name = "eskimaas")
    public int getEskimaas() {
        return eskimaas;
    }

    public void setEskimaas(int eskimaas) {
        this.eskimaas = eskimaas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kisiler kisiler = (Kisiler) o;

        if (eskimaas != kisiler.eskimaas) return false;
        if (id != kisiler.id) return false;
        if (yas != kisiler.yas) return false;
        if (adres != null ? !adres.equals(kisiler.adres) : kisiler.adres != null) return false;
        if (cinsiyet != null ? !cinsiyet.equals(kisiler.cinsiyet) : kisiler.cinsiyet != null) return false;
        if (dogumtarihi != null ? !dogumtarihi.equals(kisiler.dogumtarihi) : kisiler.dogumtarihi != null) return false;
        if (hakkindabilgi != null ? !hakkindabilgi.equals(kisiler.hakkindabilgi) : kisiler.hakkindabilgi != null)
            return false;
        if (il != null ? !il.equals(kisiler.il) : kisiler.il != null) return false;
        if (isimSoyisim != null ? !isimSoyisim.equals(kisiler.isimSoyisim) : kisiler.isimSoyisim != null) return false;
        if (medenihal != null ? !medenihal.equals(kisiler.medenihal) : kisiler.medenihal != null) return false;
        if (parola != null ? !parola.equals(kisiler.parola) : kisiler.parola != null) return false;
        if (telefonno != null ? !telefonno.equals(kisiler.telefonno) : kisiler.telefonno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (isimSoyisim != null ? isimSoyisim.hashCode() : 0);
        result = 31 * result + (telefonno != null ? telefonno.hashCode() : 0);
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        result = 31 * result + (il != null ? il.hashCode() : 0);
        result = 31 * result + (dogumtarihi != null ? dogumtarihi.hashCode() : 0);
        result = 31 * result + (parola != null ? parola.hashCode() : 0);
        result = 31 * result + (hakkindabilgi != null ? hakkindabilgi.hashCode() : 0);
        result = 31 * result + yas;
        result = 31 * result + (cinsiyet != null ? cinsiyet.hashCode() : 0);
        result = 31 * result + (medenihal != null ? medenihal.hashCode() : 0);
        result = 31 * result + eskimaas;
        return result;
    }

    @Basic
    @Column(name = "kullanilanotobüsler")
    public String getKullanilanotobüsler() {
        return kullanilanotobüsler;
    }

    public void setKullanilanotobüsler(String kullanilanotobüsler) {
        this.kullanilanotobüsler = kullanilanotobüsler;
    }

    @Basic
    @Column(name = "verilenoy")
    public int getVerilenoy() {
        return verilenoy;
    }

    public void setVerilenoy(int verilenoy) {
        this.verilenoy = verilenoy;
    }

    @Basic
    @Column(name = "keyboarddusunce")
    public String getKeyboarddusunce() {
        return keyboarddusunce;
    }

    public void setKeyboarddusunce(String keyboarddusunce) {
        this.keyboarddusunce = keyboarddusunce;
    }

    @Basic
    @Column(name = "yasamakistenensehir")
    public String getYasamakistenensehir() {
        return yasamakistenensehir;
    }

    public void setYasamakistenensehir(String yasamakistenensehir) {
        this.yasamakistenensehir = yasamakistenensehir;
    }
}
