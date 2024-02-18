package com.careca.springproject.entities;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable{
    @Setter @Getter  @EqualsAndHashCode.Include private Long id;
    @Setter @Getter private String name;
    @Setter @Getter private String email;
    @Setter @Getter private String number;
    @Setter @Getter private String password;
}
