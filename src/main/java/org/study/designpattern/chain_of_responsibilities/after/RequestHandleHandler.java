package org.study.designpattern.chain_of_responsibilities.after;

public class RequestHandleHandler extends RequestHandler {


    public RequestHandleHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("REQUEST HANDLER : " + request.getBody());
        super.handler(request);
    }
}
