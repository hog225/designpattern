package org.study.designpattern.chain_of_responsibilities.after;

public class LoggingRequestHandler extends RequestHandler{


    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("Logging Request ");
        super.handler(request);
        System.out.println("Logging Response ");

    }
}
