package org.study.designpattern.decorator.after;

import org.study.designpattern.decorator.before.TrimCommentService;

public class TrimService extends CommentDecorator {

    public TrimService(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {

        this.commentService.addComment(this.trim(comment));
    }

    private String trim(String comment) {
        return comment.replace(".", "");
    }

}
