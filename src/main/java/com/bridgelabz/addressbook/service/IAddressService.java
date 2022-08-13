package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressDTO;
import com.bridgelabz.addressbook.model.AddressModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAddressService {
    String getMessage();

    List<AddressModel> getListContacts();

    AddressModel getContactById(long getId);

    void deleteContact(long id);

    String AddAddressBook(AddressDTO addressDTO);

    AddressModel updateAddressContact(long getId, AddressDTO addressDTO);
}
