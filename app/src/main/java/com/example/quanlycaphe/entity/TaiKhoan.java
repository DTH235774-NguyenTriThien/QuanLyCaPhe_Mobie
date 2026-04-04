package com.example.quanlycaphe.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import androidx.room.Index;

@Entity(
        tableName = "TaiKhoan",
        foreignKeys = @ForeignKey(
                entity = NhanVien.class,
                parentColumns = "MaNV",
                childColumns = "MaNV",
                onDelete = ForeignKey.SET_NULL
        ),
        indices = {@Index("MaNV")}
)

public class TaiKhoan {
    @PrimaryKey
    @NonNull
    public String TenDangNhap;

    public String MatKhauHash;
    public String Role;

    public String MaNV;
}
