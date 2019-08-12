package com.programmingworld.mak.roommvvmprojects.Room.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


import com.programmingworld.mak.roommvvmprojects.Room.Model.Book;

import java.util.List;

@Dao
public interface BookDAO {

    @Insert
     void insert(Book book);

    @Update
     void update(Book book);

    @Delete
    void delte(Book book);

    @Query("SELECT * FROM books_table")
    LiveData<List<Book>> getAllBooks();

    @Query("SELECT * FROM books_table WHERE category_id==:categoryId")
    LiveData<List<Book>> getBooks(int categoryId);



}