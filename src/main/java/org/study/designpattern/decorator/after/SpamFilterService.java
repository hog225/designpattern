package org.study.designpattern.decorator.after;

public class SpamFilterService extends CommentDecorator {

    public SpamFilterService(CommentService commentService) {
        super(commentService);
    }


    @Override
    public void addComment(String comment) {
        this.commentService.addComment(spamFilter(comment));
    }

    private String spamFilter(String comment) {
        String newComment = !comment.contains("http") ? comment:"";
        return newComment;
    }
}
