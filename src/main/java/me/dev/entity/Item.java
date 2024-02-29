package me.dev.entity;


import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import me.dev.advenced.MonetaryAmount;
import me.dev.converter.ZipcodeConverter;
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
    @Convert(converter = ZipcodeConverter.class,
         attributeName = "zipcode")
    protected Adress adress;
//    @Convert(converter = ZipcodeConverter.class,
//            attributeName = "zipcode")
//    @AttributeOverrides({
//            @AttributeOverride(name = "street",
//                    column = @Column(name = "BILLING_STREET")),
//            @AttributeOverride(name = "zipcode",
//                    column = @Column(name = "BILLING_ZIPCODE", length = 10)),
//            @AttributeOverride(name = "city",
//                    column = @Column(name = "BILLING_CITY"))
//    })
//    protected Adress billingAddress;


    @AttributeOverride(name = "street",
                    column = @Column(name = "BILLING_STREET")
    )
    protected Adress billingAddress;

    @Column(name = "PRICE")
    protected MonetaryAmount priceNow;
}
