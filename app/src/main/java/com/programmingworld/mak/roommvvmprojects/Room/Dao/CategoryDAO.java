package com.programmingworld.mak.roommvvmprojects.Room.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.programmingworld.mak.roommvvmprojects.Room.Model.Category;

import java.util.List;

@Dao
public interface CategoryDAO {

    @Insert
    void insert(Category category);

    @Insert
    void insert(Category... category);

    @Insert
    void insert(List<Category> category);

    @Delete
    void delete(Category category);

    @Update
    void update(Category category);

    @Query("SELECT * FROM categories_table")
    LiveData<List<Category>> getAllCategories();

}
