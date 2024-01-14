package com.project.pgmanagement.mapper;

import com.project.pgmanagement.entity.Guest;
import com.project.pgmanagement.model.GuestRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GuestMapper {

    GuestMapper INSTANCE = Mappers.getMapper(GuestMapper.class);

    @Mapping(target = "guestPhoneNumber", source = "phoneNumber")
    GuestRequest guestToGuestRequest(Guest guest);


    @Mapping(target = "phoneNumber" , source = "guestPhoneNumber")
    Guest guestRequestToGuest(GuestRequest guestRequest);
}
