package com.example.quanlycaphe.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CaLam")
public class CaLam {

    @PrimaryKey
    public int MaCa;

    public String TenCa;
    public String GioBatDau;
    public String GioKetThuc;
}
