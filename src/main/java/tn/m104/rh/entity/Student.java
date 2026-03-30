package tn.m104.rh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

//première modification
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

//dexième modification
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer rollNumber;
    String name;
    String address;
    Double percentage;

}
