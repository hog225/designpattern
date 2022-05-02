package org.study.designpattern.decorator.before;

public class TrimCommentService extends CommentService {

    @Override
    public void addComment(String comment){
        String newComment = comment.replace(".", "");
        System.out.println(newComment);

    }
}
