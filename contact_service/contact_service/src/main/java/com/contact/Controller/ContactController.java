package com.contact.Controller;

import com.contact.Service.ContactService;
import com.contact.entity.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @GetMapping("/user/{userId}")
    public List<Contacts> getContacts(@PathVariable("userId") Long userId){

        return contactService.getContactsOfUser(userId);
    }
}
