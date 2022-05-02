package org.study.designpattern.decorator.before;

public class SpamFilteringCommentService extends CommentService{

    @Override
    public void addComment(String comment){
        if (!comment.contains("http"))
            System.out.println(comment);

    }
}
