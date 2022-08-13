package com.bridgelabz.addressbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private String message;
    private Object data;

}
