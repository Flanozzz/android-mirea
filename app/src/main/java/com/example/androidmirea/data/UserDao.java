package com.example.androidmirea.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAllItems();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(User entity);
}
