package me.dev.entity;


import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;


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


    private String family;
    @org.hibernate.annotations.ColumnDefault("1.0")
    @org.hibernate.annotations.Generated(
            GenerationTime.ALWAYS
    )
    protected BigDecimal initialPrice;


    @Column(updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    protected Date lastModified;

    @Column(updatable = false)
    @org.hibernate.annotations.UpdateTimestamp
    protected Date lastModified4;

    @Column(name = "date")
    private Date dateoperation = new Date();

    protected Adress adress;

    @AttributeOverrides({
            @AttributeOverride(name = "street",
                    column = @Column(name = "BILLING_STREET")),
            @AttributeOverride(name = "zipcode",
                    column = @Column(name = "BILLING_ZIPCODE", length = 5)),
            @AttributeOverride(name = "city",
                    column = @Column(name = "BILLING_CITY"))
    })
    protected Adress billingAddress;


    private byte[] pop = {5,6,89};
}
