package org.study.designpattern.decorator.after;



public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService =commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        /**
         * SpamFilterService 에서 addComment 실행 여기서 필터링된 Comment 가
         * TrimService 의 addComment 의 입력으로 들어감
         * CommentServiceImpl 의 addComment 에서 Print
         */
        Client client = new Client(new SpamFilterService(new TrimService(new CommentServiceImpl())));

        client.writeComment("할라할라...");
        client.writeComment("http://myblog.com");

        // or
        CommentService commentService = new CommentServiceImpl();
        boolean filter = true;
        boolean trim = false;
        if (filter)
            commentService = new SpamFilterService(commentService);
        if (trim)
            commentService = new TrimService(commentService);

        Client secondClient = new Client(commentService);
        // trim 은 안되어야 정상 !
        secondClient.writeComment("할라할라.......");
        secondClient.writeComment("http://myblog.com");

    }
}
