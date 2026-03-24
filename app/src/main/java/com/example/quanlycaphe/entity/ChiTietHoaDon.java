package com.example.quanlycaphe.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "ChiTietHoaDon",
        foreignKeys = {

                @ForeignKey(entity = HoaDon.class,
                        parentColumns = "MaHD",
                        childColumns = "MaHD",
                        onDelete = ForeignKey.CASCADE),

                @ForeignKey(entity = SanPham.class,
                        parentColumns = "MaSP",
                        childColumns = "MaSP")
        }
)
public class ChiTietHoaDon {

    @PrimaryKey(autoGenerate = true)
    public int ChiTietID;

    public String MaHD;

    public String MaSP;

    public int SoLuong;

    public Double DonGia;

    public Double ThanhTien;

    public String GhiChu;
}