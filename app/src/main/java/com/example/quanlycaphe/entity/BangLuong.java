package com.example.quanlycaphe.entity;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "BangLuong",
        foreignKeys = @ForeignKey(
                entity = NhanVien.class,
                parentColumns = "MaNV",
                childColumns = "MaNV",
                onDelete = ForeignKey.SET_NULL
        )
)
public class BangLuong {

    @PrimaryKey(autoGenerate = true)
    public int MaLuong;

    public String MaNV;

    public int Thang;
    public int Nam;

    public Double TongGio;
    public Double LuongThucTe;

    public String TrangThai;
}