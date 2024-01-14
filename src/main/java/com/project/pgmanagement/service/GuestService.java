package com.project.pgmanagement.service;

import com.project.pgmanagement.entity.Guest;
import com.project.pgmanagement.mapper.GuestMapper;
import com.project.pgmanagement.model.GuestRequest;
import com.project.pgmanagement.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService implements IGuestService{


    @Autowired
    private  GuestRepository guestRepository;

    @Override
    public Guest createGuest(GuestRequest guestRequest) {
        return guestRepository.save(GuestMapper.INSTANCE.guestRequestToGuest(guestRequest));
    }
}

