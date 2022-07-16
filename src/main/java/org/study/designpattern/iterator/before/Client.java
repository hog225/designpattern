package org.study.designpattern.iterator.before;

import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("3333333");
        board.addPost("444444");
        board.addPost("33alsdjfs");

        // Iterator pattern 을 쓰지 않으면 클라이언트가 Post에 데이터 구조에 대해 알아야 한다.
        List<Post> posts = board.getPosts();
        for (Post a : posts) {
            System.out.println(a);
        }


        System.out.println("최신글부터 순회 ");
        Collections.sort(posts, (p1, p2) -> p2.getCreateDateTime().compareTo(p1.getCreateDateTime()));
        for (Post a : posts) {
            System.out.println(a);
        }

    }
}
