package com.aman.controller;

import com.aman.model.Card;
import com.aman.service.IncreaseCardNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CardController {

    IncreaseCardNumber increaseCardNumber;

    public  CardController(IncreaseCardNumber increaseCardNumber){
        this.increaseCardNumber = increaseCardNumber;
    }

    @GetMapping("/card")
    public String increaseCardNumber (@RequestBody Card card) {
            String s = increaseCardNumber.increaseCardNumber(card);
            return s;

    }

    @GetMapping(value = "/card1")
    public String increasCardNumber () {

        return "succces";

    }

}
