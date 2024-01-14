package com.project.pgmanagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Getter
@Setter
@ToString
public class GuestRequest {


    @NotBlank(message = "Guest name is required")
    @Size(max = 255, message = "Guest name must not exceed 255 characters")
    private String guestName;

    @NotBlank(message = "Phone number is required")
    @Size(max = 20, message = "Phone number must not exceed 20 characters")
    private String guestPhoneNumber;

    @NotBlank(message = "Guest email is required")
    @Size(max = 255, message = "Guest email must not exceed 255 characters")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Invalid email format")
    private String guestEmail;

    @NotBlank(message = "Guest proof is required")
    @Size(max = 255, message = "Guest proof must not exceed 255 characters")
    private String guestProof;

    @NotBlank(message = "Food preference is required")
    @Size(max = 255, message = "Food preference must not exceed 255 characters")
    @Pattern(regexp = "^(YES|NO)$", message = "Guest food opted must be 'YES' or 'NO'")
    private String guestFoodOpted;

    @NotNull(message = "Room number is required")
    private int guestRoomNumber;

    @NotBlank(message = "Guest status is required")
    @Pattern(regexp = "^(ACTIVE|INACTIVE)$", message = "Guest status must be 'ACTIVE' or 'INACTIVE'")
    private String guestStatus;

    @NotNull(message = "Registered date is required")
    private LocalDate guestRegisteredDate;

    @NotNull(message = "Due date is required")
    private LocalDate guestDueDate;
}
