package org.study.designpattern.chain_of_responsibilities.before;

public class Client {

    /**
     *  Clinet 입장에서
     * @param args
     */
    public static void main(String[] args) {
        var req = new Request("안녕 리퀘스트 ");
        var reqHandler = new AuthRequestHandler();
        reqHandler.handler(req);

    }
}
