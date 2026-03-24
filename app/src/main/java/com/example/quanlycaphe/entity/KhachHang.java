package com.example.quanlycaphe.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "KhachHang")
public class KhachHang {

    @PrimaryKey
    @NonNull
    public String MaKH;

    public String TenKH;
    public String SDT;

    public int DiemTichLuy;
}