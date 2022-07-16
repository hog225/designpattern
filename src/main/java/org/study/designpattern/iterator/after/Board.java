package org.study.designpattern.iterator.after;

import lombok.Data;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
// ConcreteAggregate
public class Board {
    List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        posts.add(new Post(content));
    }

    public Iterator<Post> getDefaultIterator() {
        return this.posts.iterator();
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.getPosts());
    }
}
