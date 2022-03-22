package org.study.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class GithubIssueData {
    private int id;
    private String title;
    private GithubRepository repository;

}
