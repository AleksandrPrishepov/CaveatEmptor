package me.dev.entity;


import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "ITEM")
@Setter
@Getter
@ToString
public class Item {
    @Id
    @GeneratedValue(generator = "custom")
//    @GenericGenerator(name="ID_GENERATO", strategy = "increment")

    private long id;
    @Column(length = 5, name = "MyName")
    @Size(min = 2,
         max = 8)
    private String name;


}
