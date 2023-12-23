package com.contact.Service;

import com.contact.entity.Contacts;

import java.util.List;

public interface ContactService {
   public  List<Contacts> getContactsOfUser(Long userId);
}
