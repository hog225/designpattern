package org.study.designpattern.proxy._03_java;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.study.designpattern.proxy._03_java.jpa.entities.Member;
import org.study.designpattern.proxy._03_java.jpa.entities.Team;

import javax.persistence.*;
import javax.transaction.Transactional;

@SpringBootApplication
public class App {

    @PersistenceContext
    EntityManager em;


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

    @Bean
    public ApplicationRunner applicationRunner(GameService gameService) {
        return args -> {
            gameService.startGame();
        };
    }

    @Bean
    @Transactional
    public void applicationRunner2() {
        Team team1 = new Team();
        team1.setName("team1");

        Member member1 = new Member();
        member1.setName("member1");
        team1.addMember(member1);

        em.persist(team1);
        em.flush();
        em.clear();

        Member member = em.find(Member.class, member1.getId());


        System.out.println("team2 = " + member.getClass().getName());
        System.out.println("team2.getMember() = " + member.getTeam().getClass().getName());
        em.flush();
        em.clear();

        Team team = em.find(Team.class, team1.getId());
        System.out.println("member = " + team.getClass().getName());
        System.out.println("member.getTeam() = " + team.getMembers());



    }
}
