package com.example.AccountService.controller;

import com.example.AccountService.entity.Contact;
import com.example.AccountService.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable("id") Integer id ) {
        Contact contact =  contactRepository.getContactByContactId(id);
        return ResponseEntity.ok(contact);
    }
}
