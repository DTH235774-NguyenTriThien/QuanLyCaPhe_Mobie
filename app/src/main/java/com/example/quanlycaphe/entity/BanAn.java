package com.example.quanlycaphe.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "BanAn")
public class BanAn {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String tenBan;

    public String trangThai;
}