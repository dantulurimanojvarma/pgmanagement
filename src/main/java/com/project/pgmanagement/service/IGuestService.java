package com.project.pgmanagement.service;

import com.project.pgmanagement.entity.Guest;
import com.project.pgmanagement.model.GuestRequest;

public interface IGuestService {


    public Guest createGuest(GuestRequest guestRequest);


}
