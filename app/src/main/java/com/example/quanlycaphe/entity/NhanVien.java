package com.example.quanlycaphe.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NhanVien {
    @PrimaryKey
    @NonNull
    public String MaNV;

    public String HoTen;
    public String GioiTinh;
    public String NgaySinh;
    public String ChucVu;
    public Double LuongCoBan;
    public String TrangThai;
}
