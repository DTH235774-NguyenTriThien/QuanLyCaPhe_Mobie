package com.example.quanlycaphe.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "InventoryMovements",
        foreignKeys = @ForeignKey(
                entity = NguyenLieu.class,
                parentColumns = "MaNL",
                childColumns = "MaNL",
                onDelete = ForeignKey.SET_NULL
        )
)
public class InventoryMovements {

    @PrimaryKey(autoGenerate = true)
    public int MovementID;

    public String MaNL;

    public Double ChangeQty;

    public String MovementType;

    public String Timestamp;
}