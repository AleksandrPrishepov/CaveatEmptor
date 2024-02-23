package me.dev.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;


@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Adress {
    @NotNull
    @Column(nullable = false)
    protected String street;
    @NotNull
    @Column(nullable = false)
    protected String zipcode;
    @NotNull
    @Column(nullable = false)
    protected  String city;


}
