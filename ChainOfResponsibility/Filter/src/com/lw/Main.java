package com.lw;

public class Main {
    public static void main(String[] args) {
        String msg = "大家好 :) ，<script>，敏感，被就业，jojo的奇妙冒险，荒木飞吕彦。";
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter())
                .addFilter(new FaceFilter());
        MsgProcessor processor = new MsgProcessor();
        processor.setMsg(msg);
        processor.setFc(fc);
        String res = processor.process();
        System.out.println(res);
    }
}
