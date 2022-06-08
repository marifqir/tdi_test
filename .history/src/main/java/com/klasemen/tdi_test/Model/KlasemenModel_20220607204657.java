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
}