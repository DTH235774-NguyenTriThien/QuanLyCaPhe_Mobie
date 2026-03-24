package com.example.quanlycaphe.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "ChamCong",
        foreignKeys = {
                @ForeignKey(entity = NhanVien.class,
                        parentColumns = "MaNV",
                        childColumns = "MaNV",
                        onDelete = ForeignKey.SET_NULL),

                @ForeignKey(entity = CaLam.class,
                        parentColumns = "MaCa",
                        childColumns = "MaCa",
                        onDelete = ForeignKey.SET_NULL)
        }
)
public class ChamCong {

    @PrimaryKey
    public int MaCham;

    public String MaNV;
    public Integer MaCa;
    public String NgayLam;

    public String ClockIn;
    public String ClockOut;

    public String GhiChu;
}
