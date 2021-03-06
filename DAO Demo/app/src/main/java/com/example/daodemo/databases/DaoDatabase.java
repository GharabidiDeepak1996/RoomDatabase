package com.example.daodemo.databases;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface DaoDatabase {

    @Insert
    void insertAll(EntitTable entitTable);
    @Delete
    void Delete(EntitTable delete);
    @Update
    void Update(EntitTable update);

    @Query("SELECT * FROM mydatabase")
    List<EntitTable> Alldata();
}
