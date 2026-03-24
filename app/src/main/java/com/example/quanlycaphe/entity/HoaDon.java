package com.example.quanlycaphe.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "HoaDon",
        foreignKeys = {

                @ForeignKey(entity = NhanVien.class,
                        parentColumns = "MaNV",
                        childColumns = "MaNV",
                        onDelete = ForeignKey.SET_NULL),

                @ForeignKey(entity = KhachHang.class,
                        parentColumns = "MaKH",
                        childColumns = "MaKH",
                        onDelete = ForeignKey.SET_NULL),

                @ForeignKey(entity = BanAn.class,
                        parentColumns = "id",
                        childColumns = "idBan")
        }
)
public class HoaDon {

    @PrimaryKey
    @NonNull
    public String MaHD;

    public String NgayLap;

    public String MaNV;

    public String MaKH;

    public int idBan;

    public Double TongTien;

    public Double GiamGia;

    public Double ThanhTien;

    public String TrangThai;

    public Integer DiemSuDung;

    public String GhiChu;
}