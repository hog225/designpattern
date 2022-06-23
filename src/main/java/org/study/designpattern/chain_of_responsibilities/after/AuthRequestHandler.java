package org.study.designpattern.chain_of_responsibilities.after;

public class AuthRequestHandler extends RequestHandler{


    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("Auth Request Handle");
        super.handler(request);
        System.out.println("Auth Response ");
    }
}
