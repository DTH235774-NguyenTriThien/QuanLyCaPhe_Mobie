package com.example.quanlycaphe.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.quanlycaphe.entity.*;

import com.example.quanlycaphe.dao.*;

@Database(
        entities = {
                NhanVien.class,
                TaiKhoan.class,
                CaLam.class,
                ChamCong.class,
                BangLuong.class,
                KhachHang.class,
                NguyenLieu.class,
                SanPham.class,
                CongThuc.class,
                BanAn.class,
                HoaDon.class,
                ChiTietHoaDon.class,
                InventoryMovements.class
        },
        version = 1
)
public abstract class AppDatabase extends RoomDatabase {

    public abstract NhanVienDao nhanVienDao();
    public abstract HoaDonDao hoaDonDao();
    public abstract ChiTietHoaDonDao chiTietHoaDonDao();

    // thêm dần sau
}