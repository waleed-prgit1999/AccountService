package com.example.AccountService.repository;

import com.example.AccountService.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends JpaRepository<Contact, String> {
    @Query(value = "select * from Contact where id = :id", nativeQuery = true)
    public Contact getContactByContactId(@Param("id") Integer id);
}
