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

    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;
    private String confirm_password;

    public KlasemenModel() {
    }
