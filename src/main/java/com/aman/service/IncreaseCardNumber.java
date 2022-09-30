package com.aman.service;

import com.aman.model.Card;
import org.springframework.stereotype.Service;

@Service
public class IncreaseCardNumber {

    public String increaseCardNumber ( Card c){
        int number  = c.getNumber() +2 ;
        c.setNumber(number);
        return "success";

    }
}
