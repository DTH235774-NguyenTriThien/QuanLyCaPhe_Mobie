package com.example.quanlycaphe.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(

        tableName = "CongThuc",
        primaryKeys = {"MaSP","MaNL"},
        foreignKeys = {

                @ForeignKey(entity = SanPham.class,
                        parentColumns = "MaSP",
                        childColumns = "MaSP",
                        onDelete = ForeignKey.CASCADE),

                @ForeignKey(entity = NguyenLieu.class,
                        parentColumns = "MaNL",
                        childColumns = "MaNL",
                        onDelete = ForeignKey.CASCADE)
        }
)
public class CongThuc {

    @NonNull
    public String MaSP;

    @NonNull
    public String MaNL;

    public Double SoLuong;
}
