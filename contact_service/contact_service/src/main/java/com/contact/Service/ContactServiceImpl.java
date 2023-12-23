package com.contact.Service;

import com.contact.entity.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts

    List<Contacts> contactsList = List.of(
            new Contacts(1L,"hari@gmmail.com","Hari",1110L),
            new Contacts(2L,"mari@gmmail.com","Mari",1110L),
            new Contacts(3L,"nari@gmmail.com","Nari",1111L),
            new Contacts(4L,"jari@gmmail.com","Jari",1111L),
            new Contacts(5L,"sari@gmmail.com","Sari",1112L),
            new Contacts(6L,"lari@gmmail.com","Lari",1112L)
    );
    @Override
    public List<Contacts> getContactsOfUser(Long userId) {
        return contactsList.stream().filter(contacts -> contacts.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
