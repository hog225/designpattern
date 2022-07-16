package org.study.designpattern.iterator.before;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Board {
    List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        posts.add(new Post(content));
    }
}
