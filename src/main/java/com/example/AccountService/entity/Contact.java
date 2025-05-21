package com.example.AccountService.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Contact")
public class Contact {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        private Integer id;

        @Column(name = "firstName")
        private String firstName;

        @Column(name = "lastName")
        private String lastName;

        @Column(name = "email")
        private String email;

        @Column(name = "phoneNumber")
        private String phoneNumber;
}
