package org.study.designpattern.decorator.before;


import org.study.designpattern.decorator.after.CommentDecorator;
import org.study.designpattern.decorator.after.CommentServiceImpl;
import org.study.designpattern.decorator.after.SpamFilterService;
import org.study.designpattern.decorator.after.TrimService;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService =commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        //Client client = new Client(new CommentService());
        //Client client = new Client(new TrimCommentService());
        /**
         * 여기서 TrimCommentService, SpamFilteringCommentService를 동시에 적용하고 싶을때 데코레이터 패턴을 사용할 수 있다.
         * 다중 상속은 안되지..
         * 확장을 하려면 계속 상속을 해야한다.
         */

        Client client = new Client(new SpamFilteringCommentService());

        client.writeComment("할라할라...");
        client.writeComment("http://myblog.com");

    }
}
