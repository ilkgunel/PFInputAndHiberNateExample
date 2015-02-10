package Entities;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.text.SimpleDateFormat;
import java.text.ParseException;

@ManagedBean
public class VeriTabaninaGonderme {
    String isimSoyisim;
    String telefonno;
    String adres;
    String il;
    Date dogumtarihi;
    String parola;
    String parolaOnay;
    String hakkindabilgi;
    int yas;
    String cinsiyet;
    boolean medenihal;
    int eskimaas=2000;
    boolean sartlarKabulEdildimi;
    String islemSonucu="";
    boolean islemSonucunuGoster;
    int verilenOy;
    String keyboardDusunce;
    String yasamakIstenenSehir;
    List<String> otobusler;
    List<String> kullanilanOtobusler=new ArrayList<String>();

    @PostConstruct
    public void doldur()
    {
        otobusler=new ArrayList<String>();
        otobusler.add("İETT");
        otobusler.add("ÖHO");
        otobusler.add("İOAŞ");
    }

    public void setYasamakIstenenSehir(String yasamakIstenenSehir) {
        this.yasamakIstenenSehir = yasamakIstenenSehir;
    }

    public String getYasamakIstenenSehir() {
        return yasamakIstenenSehir;
    }

    public String getKeyboardDusunce() {
        return keyboardDusunce;
    }

    public void setKeyboardDusunce(String keyboardDusunce) {
        this.keyboardDusunce = keyboardDusunce;
    }

    public int getVerilenOy() {
        return verilenOy;
    }

    public void setVerilenOy(int verilenOy) {
        this.verilenOy = verilenOy;
    }

    public List<String> getOtobusler() {
        return otobusler;
    }

    public void setKullanilanOtobusler(List<String> kullanilanOtobusler) {
        this.kullanilanOtobusler = kullanilanOtobusler;
    }

    public List<String> getKullanilanOtobusler() {
        return kullanilanOtobusler;
    }

    public void setParolaOnay(String parolaOnay) {
        this.parolaOnay = parolaOnay;
    }

    public String getParolaOnay() {
        return parolaOnay;
    }

    public boolean isIslemSonucunuGoster() {
        return islemSonucunuGoster;
    }

    public void setIslemSonucunuGoster(boolean islemSonucunuGoster) {
        this.islemSonucunuGoster = islemSonucunuGoster;
    }

    public void setIslemSonucu(String islemSonucu) {
        this.islemSonucu = islemSonucu;
    }

    public String getIslemSonucu() {
        return islemSonucu;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public Date getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(Date dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getHakkindabilgi() {
        return hakkindabilgi;
    }

    public void setHakkindabilgi(String hakkindabilgi) {
        this.hakkindabilgi = hakkindabilgi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getEskimaas() {
        return eskimaas;
    }

    public void setEskimaas(int eskimaas) {
        this.eskimaas = eskimaas;
    }

    public boolean getMedenihal() {
        return medenihal;
    }

    public void setMedenihal(boolean medenihal) {
        this.medenihal = medenihal;
    }



    public boolean isSartlarKabulEdildimi() {
        return sartlarKabulEdildimi;
    }

    public void setSartlarKabulEdildimi(boolean sartlarKabulEdildimi) {
        this.sartlarKabulEdildimi = sartlarKabulEdildimi;
    }

    public List<String> completeText(String ilBaslangici) {
        List<String> results = new ArrayList<String>();
        String illerDizisi[]={"İstanbul","Ankara","Bursa","İzmir","Adana","Balıkesir","Samsun","Trabzon"};

        for(String muhtemelil : illerDizisi)
        {
            if(muhtemelil.toUpperCase().startsWith(ilBaslangici.toUpperCase()))
            {
                results.add(muhtemelil);
            }
        }

        return results;
    }

    public void veriTabaninaGonder()
    {
        if(sartlarKabulEdildimi) {
            //dogumTarihi
            //SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd");
            //java.util.Date utilDate = dt.parse(dogumtarihi);
            java.sql.Date yeniDogumTarihi = new java.sql.Date(dogumtarihi.getTime());
            Kisiler kisilerNesnesi = new Kisiler();
            kisilerNesnesi.setIsimSoyisim(isimSoyisim);
            kisilerNesnesi.setTelefonno(telefonno);
            kisilerNesnesi.setAdres(adres);
            kisilerNesnesi.setIl(il);
            kisilerNesnesi.setDogumtarihi(yeniDogumTarihi);
            kisilerNesnesi.setParola(parola);
            kisilerNesnesi.setHakkindabilgi(hakkindabilgi);
            kisilerNesnesi.setYas(yas);
            kisilerNesnesi.setCinsiyet(cinsiyet);
            if(medenihal)
            {
                kisilerNesnesi.setMedenihal("Evli");
            }
            else if (!medenihal)
            {
                kisilerNesnesi.setMedenihal("Bekar");
            }
            kisilerNesnesi.setEskimaas(eskimaas);
            kisilerNesnesi.setParola(parola);
            kisilerNesnesi.setKullanilanotobüsler(kullanilanOtobusler.toString());
            kisilerNesnesi.setVerilenoy(verilenOy);
            kisilerNesnesi.setKeyboarddusunce(keyboardDusunce);
            kisilerNesnesi.setYasamakistenensehir(yasamakIstenenSehir);

            /*SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session oturum = sessionFactory.openSession();
            oturum.beginTransaction();
            oturum.save(kisilerNesnesi);
            oturum.getTransaction().commit();*/

            Configuration configuration=new Configuration();
            configuration.configure();
            ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties()).build();
            SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);
            Session oturum=sessionFactory.openSession();
            oturum.beginTransaction();
            oturum.save(kisilerNesnesi);
            oturum.getTransaction().commit();

            islemSonucu="Bilgileriniz Alındı,Teşekkürler";
            islemSonucunuGoster=true;
        }
        else
        {
            islemSonucu="Verilen Bilgilerin Doğru Olduğu Kabul Edilmemiş!";
            islemSonucunuGoster=true;
        }
    }

}
