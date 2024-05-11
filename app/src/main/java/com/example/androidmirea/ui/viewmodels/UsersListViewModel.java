package com.example.androidmirea.ui.viewmodels;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mitrofanovaviktoria.data.Repository;
import com.example.mitrofanovaviktoria.data.User;

import java.util.List;

public class UsersListViewModel extends ViewModel {
    public Repository repository = null;
    public MutableLiveData<List<User>> users = new MutableLiveData<>();


    public void init(Application application) {
        repository = new Repository(application);
        users = repository.getUsers();
    }

    public void createUser() {
        repository.addUser(new User());
    }
}

