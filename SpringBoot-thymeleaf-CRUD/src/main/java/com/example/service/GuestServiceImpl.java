package com.example.service;

import com.example.dao.GuestDao;
import com.example.domain.Guest;
import com.example.service.impl.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao guestDao;

    public GuestServiceImpl(){}
    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public String update(Guest guest) {
        guestDao.update(guest);
        return "redirect:/guest/list";
    }

    @Override
    public Guest get(String name) {
        return guestDao.get(name);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }


}
