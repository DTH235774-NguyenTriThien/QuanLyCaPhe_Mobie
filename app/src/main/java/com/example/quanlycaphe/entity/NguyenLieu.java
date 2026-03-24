package com.example.quanlycaphe.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "NguyenLieu")
public class NguyenLieu {

    @PrimaryKey
    @NonNull
    public String MaNL;

    public String TenNL;
    public String DonVi;

    public Double SoLuongTon;
}
