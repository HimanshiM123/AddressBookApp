package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<AddressModel, Long> {
}
