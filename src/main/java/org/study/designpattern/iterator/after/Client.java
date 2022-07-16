package org.study.designpattern.iterator.after;



public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("3333333");
        board.addPost("444444");
        board.addPost("33alsdjfs");

        var iter = board.getPosts().iterator();



        while (iter.hasNext()) {
            System.out.println(iter.next().getContent());
        }

        var newIter = board.getRecentPostIterator();
        while (newIter.hasNext()) {
            System.out.println(newIter.next().getContent());
        }






    }
}
