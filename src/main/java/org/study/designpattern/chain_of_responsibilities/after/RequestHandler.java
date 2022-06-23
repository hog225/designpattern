package org.study.designpattern.chain_of_responsibilities.after;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handler(Request req) {
        if (this.nextHandler != null) {
            this.nextHandler.handler(req);
        }
    }
}
