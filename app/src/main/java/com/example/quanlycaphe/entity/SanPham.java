package com.example.quanlycaphe.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SanPham")
public class SanPham {

    @PrimaryKey
    @NonNull
    public String MaSP;

    public String TenSP;

    public String LoaiSP;

    public Double DonGia;

    public String TrangThai;

    public String ImagePath;
}