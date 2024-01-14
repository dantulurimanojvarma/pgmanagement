package com.project.pgmanagement.controller;

import com.project.pgmanagement.entity.Guest;
import com.project.pgmanagement.model.GuestRequest;
import com.project.pgmanagement.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pgmanagement/guest")
public class GuestController {

    @Autowired
    public IGuestService guestService;


    @PostMapping
    public ResponseEntity addGuest(@RequestBody GuestRequest guestRequest){

        validateGuest(guestRequest);
        Guest guest = guestService.createGuest(guestRequest);
        return new ResponseEntity(guest, HttpStatus.OK);

    }

    private void validateGuest(GuestRequest guestRequest) {
    }

    @GetMapping("/{guestId}")
    public GuestRequest getGuestById(@PathVariable Long guestId){
        GuestRequest guestRequest = new GuestRequest();
        guestRequest.setGuestName("manoj");
        guestRequest.setGuestEmail("dantulurimanojvarma@gmail.com");
        return guestRequest;
    }




}
