package org.study.designpattern.chain_of_responsibilities.before;

public class AuthRequestHandler extends RequestHandler {

    @Override
    public void handler(Request request) {

        System.out.println("------- 인증 !! ");
        super.handler(request);
    }

}
