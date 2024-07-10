package com.example.service.impl;

import com.example.domain.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();
    void add(Guest guest);
    String update(Guest guest);

    Guest get(String name);

    void delete(String name);
}
