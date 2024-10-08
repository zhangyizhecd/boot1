package org.yizhe.boot1.dao;

import org.yizhe.boot1.converter.GenderConverter;
import org.yizhe.boot1.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="student")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="age")
    private int age;

    @Column(name="gender")
    @Convert(converter=GenderConverter.class)
    private Gender gender;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
