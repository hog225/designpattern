package org.study.designpattern.decorator.after;

public class CommentServiceImpl implements CommentService{
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
