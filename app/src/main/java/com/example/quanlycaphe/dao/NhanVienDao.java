package com.example.quanlycaphe.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Delete;

import com.example.quanlycaphe.entity.NhanVien;

import java.util.List;

@Dao
public interface NhanVienDao {

    @Insert
    void insert(NhanVien nv);

    @Query("SELECT * FROM NhanVien")
    List<NhanVien> getAll();

    @Query("SELECT * FROM NhanVien WHERE MaNV = :maNV")
    NhanVien getById(String maNV);

    @Update
    void update(NhanVien nv);

    @Delete
    void delete(NhanVien nv);
}