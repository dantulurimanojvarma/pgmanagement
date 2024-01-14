package com.project.pgmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "guest_name", nullable = false)
    private String guestName;

    @Size(max = 20)
    @NotNull
    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @Size(max = 255)
    @NotNull
    @Column(name = "guest_email", nullable = false)
    private String guestEmail;

    @Size(max = 255)
    @NotNull
    @Column(name = "guest_proof", nullable = false)
    private String guestProof;

    @Size(max = 255)
    @NotNull
    @Column(name = "guest_food_opted", nullable = false)
    private String guestFoodOpted;

    @NotNull
    @Column(name = "room_number", nullable = false)
    private Integer roomNumber;

    @Size(max = 255)
    @NotNull
    @Column(name = "guest_exists", nullable = false)
    private String guestExists;

    @NotNull
    @Column(name = "registered_date", nullable = false)
    private LocalDate registeredDate;

    @Column(name = "updated_date")
    private Instant updatedDate;

    @NotNull
    @Column(name = "due_date", nullable = false)
    private LocalDate dueDate;

}