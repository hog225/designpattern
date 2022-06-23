package org.study.designpattern.chain_of_responsibilities.after;

public class Client {

    public static void main(String[] args) {
        var req = new Request("request !!!!!!!");

        RequestHandler handler = new AuthRequestHandler(new LoggingRequestHandler(new RequestHandleHandler(null)));
        handler.handler(req);

    }

}
