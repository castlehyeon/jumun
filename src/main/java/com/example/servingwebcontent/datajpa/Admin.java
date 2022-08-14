package com.example.servingwebcontent.datajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long owner_seq;
    private String owner_id;
    private String owner_pwd;
    private String owner_name;
    private int owner_phone;
    private String sign_date;
    private Long store_num;
    private boolean acceptance_as_validation;

    protected Admin() {}

    public Admin(String owner_id, String owner_pwd, String owner_name, int owner_phone, String sign_date, Long store_num, boolean acceptance_as_validation) {
        this.owner_id = owner_id;
        this.owner_pwd = owner_pwd;
        this.owner_name = owner_name;
        this.owner_phone = owner_phone;
        this.sign_date = sign_date;
        this.store_num = store_num;
        this.acceptance_as_validation = acceptance_as_validation;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "owner_seq=" + owner_seq +
                ", owner_id='" + owner_id + '\'' +
                ", owner_pwd='" + owner_pwd + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", owner_phone=" + owner_phone +
                ", sign_date='" + sign_date + '\'' +
                ", store_num=" + store_num +
                ", acceptance_as_validation=" + acceptance_as_validation +
                '}';
    }

    public Long getOwner_seq() {
        return owner_seq;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public String getOwner_pwd() {
        return owner_pwd;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public int getOwner_phone() {
        return owner_phone;
    }

    public String getSign_date() {
        return sign_date;
    }

    public Long getStore_num() {
        return store_num;
    }

    public boolean isAcceptance_as_validation() {
        return acceptance_as_validation;
    }
}
