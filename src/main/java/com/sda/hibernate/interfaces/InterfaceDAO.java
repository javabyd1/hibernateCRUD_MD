package com.sda.hibernate.interfaces;

import com.sda.hibernate.model.User;

import java.util.List;

public interface InterfaceDAO {

    public User insertUser (User user);

    public List<User> getAllUsers();

    public void updateUser(int id, String name, String surname);

    public void  removeUser (int id);

    public User findUser(int id);
}
