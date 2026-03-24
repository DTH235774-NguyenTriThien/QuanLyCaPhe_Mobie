package com.example.quanlycaphe.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlycaphe.entity.HoaDon;

import java.util.List;

@Dao
public interface HoaDonDao {

    @Insert
    void insert(HoaDon hd);

    @Query("SELECT * FROM HoaDon WHERE idBan = :idBan AND TrangThai = 'Chưa thanh toán'")
    HoaDon getHoaDonDangMo(int idBan);

    @Query("SELECT * FROM HoaDon")
    List<HoaDon> getAll();

    @Update
    void update(HoaDon hd);
}