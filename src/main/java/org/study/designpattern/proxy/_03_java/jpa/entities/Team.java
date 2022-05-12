package org.study.designpattern.proxy._03_java.jpa.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    //mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true,
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Member> members = new ArrayList<>();


    public void addMember(Member member) {
        this.members.add(member);
        member.setTeam(this);
    }
}
