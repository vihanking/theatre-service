package com.adp.theatreservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;

     private String name;

     private int seatCount;

     @OneToOne(cascade = CascadeType.ALL)
     private Address address;

}
