package com.lw;

public class Main {
    public static void main(String[] args) {
        String msg = "大家好 :) ，<script>，敏感，被就业，jojo的奇妙冒险，荒木飞吕彦。";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response");
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter());
        fc.doFilter(request,response,fc);
        System.out.println(request.requestStr);
        System.out.println(response.responseStr);
    }
}
