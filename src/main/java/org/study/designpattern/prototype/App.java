package org.study.designpattern.prototype;

public class App {
    public static void main(String arg []) throws CloneNotSupportedException{
        GithubRepository repo = new GithubRepository();
        repo.setName("rr");
        repo.setUser("falcon225");

        GithubIssue issue = new GithubIssue(repo);
        System.out.println(issue.getUrl());

        // GithubIssue 를 깁론해서 데이터만 바꾸고 싶다. 이게 프로토타입

        GithubIssue clone = (GithubIssue) issue.clone();

        System.out.println(clone != issue);
        System.out.println(clone.equals(issue));
        // shallow copy
        System.out.println(clone.getRepository() == issue.getRepository());

        // 기본 클론은 shallow copy다 primitive 타입 이외에는 기존의 reference 를 그대로 가르킨다.
        // deep copy는 reference 를 추가로 만든다.


    }
}
