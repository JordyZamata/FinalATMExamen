package com.examen.cards.model;


import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@Setter
public class Card {

    private String cardNumber;
    private boolean active;

}
