package com.klasemen.tdi_test.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_klasemen")
public class KlasemenModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String tim;
    private int ranking;
    private int pertandingan;
    private int menang;
    private int seri;
    private int kalah;
    private int gol;
    private int kebobolan;
    private int selisih_gol;
    private int poin;

    public KlasemenModel() {
    }

    public KlasemenModel(Long id, String tim, int ranking, int pertandingan, int menang, int seri, int kalah, int gol,
            int kebobolan, int selisih_gol, int poin) {
        this.id = id;
        this.tim = tim;
        this.ranking = ranking;
        this.pertandingan = pertandingan;
        this.menang = menang;
        this.seri = seri;
        this.kalah = kalah;
        this.gol = gol;
        this.kebobolan = kebobolan;
        this.selisih_gol = selisih_gol;
        this.poin = poin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getPertandingan() {
        return pertandingan;
    }

    public void setPertandingan(int pertandingan) {
        this.pertandingan = pertandingan;
    }

    public int getMenang() {
        return menang;
    }

    public void setMenang(int menang) {
        this.menang = menang;
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }

    public int getKalah() {
        return kalah;
    }

    public void setKalah(int kalah) {
        this.kalah = kalah;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public int getKebobolan() {
        return kebobolan;
    }

    public void setKebobolan(int kebobolan) {
        this.kebobolan = kebobolan;
    }

    public int getSelisih_gol() {
        return selisih_gol;
    }

    public void setSelisih_gol(int selisih_gol) {
        this.selisih_gol = selisih_gol;
    }

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }

}