package org.study.designpattern.decorator.after;

public class CommentDecorator implements CommentService {
    CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        this.commentService.addComment(comment);
    }
}
