package com.example.quanlycaphe.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.quanlycaphe.entity.ChiTietHoaDon;

import java.util.List;

@Dao
public interface ChiTietHoaDonDao {

    @Insert
    void insert(ChiTietHoaDon ct);

    @Query("SELECT * FROM ChiTietHoaDon WHERE MaHD = :maHD")
    List<ChiTietHoaDon> getByHoaDon(String maHD);
}