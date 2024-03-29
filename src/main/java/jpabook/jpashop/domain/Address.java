package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

@Embeddable
@Getter
public class Address {

    private String city;
    private String Street;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.Street = street;
        this.zipcode = zipcode;
    }
}
