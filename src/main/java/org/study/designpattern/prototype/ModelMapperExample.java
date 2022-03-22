package org.study.designpattern.prototype;


import org.modelmapper.ModelMapper;

public class ModelMapperExample {


    public static void main(String[] args) {
        GithubRepository repo = new GithubRepository();
        repo.setName("rr");
        repo.setUser("falcon225");

        GithubIssue issue = new GithubIssue(repo);
        issue.setId(1);
        issue.setTitle("title");
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(issue, GithubIssueData.class);
        System.out.println(githubIssueData);
        System.out.println("Model Mapper shallow copy");
        System.out.println(githubIssueData.getRepository() == issue.getRepository());
        githubIssueData.getRepository().setUser("pig225");
        System.out.println(repo.getUser());

    }
}
