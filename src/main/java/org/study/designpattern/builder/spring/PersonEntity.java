package org.study.designpattern.builder.spring;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class PersonEntity extends BaseEntity {
    private String name;
    private int weight;


    public static void main(String[] args) {
        PersonEntity personEntity = PersonEntity.builder()
                .birthYear(2022)
                .name("gildong")
                .weight(1)
                .build();

        System.out.println(personEntity);

    }

    @Override
    public String toString() {
        return "name=" + name + ", weight=" + weight + ", birthYear=" + super.getBirthYear();
    }
}
