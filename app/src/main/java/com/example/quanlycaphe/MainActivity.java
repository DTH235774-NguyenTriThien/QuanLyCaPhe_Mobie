package com.example.quanlycaphe;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;
import com.example.quanlycaphe.database.AppDatabase;
import com.example.quanlycaphe.entity.NhanVien;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        AppDatabase db = Room.databaseBuilder(
                getApplicationContext(),
                AppDatabase.class,
                "ql_cafe_db"
        ).allowMainThreadQueries().build();

        NhanVien nv = new NhanVien();
        nv.MaNV = "NV01";
        nv.HoTen = "Test NV";

        db.nhanVienDao().insert(nv);

        List<NhanVien> list = db.nhanVienDao().getAll();
    }

}