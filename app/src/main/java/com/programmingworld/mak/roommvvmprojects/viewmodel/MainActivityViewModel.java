package com.programmingworld.mak.roommvvmprojects.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;


import com.programmingworld.mak.roommvvmprojects.Room.Model.Book;
import com.programmingworld.mak.roommvvmprojects.Room.Model.Category;
import com.programmingworld.mak.roommvvmprojects.Room.Repository.EBookShopRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private EBookShopRepository eBookShopRepository;
    private LiveData<List<Category>> allCategories;
    private LiveData<List<Book>> booksOfASelectedCategory;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);

        eBookShopRepository=new EBookShopRepository(application);
    }

    public LiveData<List<Category>> getAllCategories() {

        allCategories=eBookShopRepository.getCategories();
        return allCategories;
    }

    public LiveData<List<Book>> getBooksOfASelectedCategory(int categoryId) {

        booksOfASelectedCategory=eBookShopRepository.getBooks(categoryId);
        return booksOfASelectedCategory;
    }

    public void addNewBook(Book book){
        eBookShopRepository.insertBook(book);
    }

    public void updateBook(Book book){
        eBookShopRepository.updateBook(book);
    }

    public void deleteBook(Book book){
        eBookShopRepository.deleteBook(book);
    }
}
