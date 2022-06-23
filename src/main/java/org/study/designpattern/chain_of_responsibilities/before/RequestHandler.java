package org.study.designpattern.chain_of_responsibilities.before;

public class RequestHandler {

    /**
     * 아래 코드는 SRP 위배 왜냐면 인증 확인과 리퀘스트 처리를 둘다 하기 때문에
     * @param request
     */
    public void handler(Request request) {

        System.out.println("인증이 되어 리퀘스트 처리" + request.getBody());
    }

}
