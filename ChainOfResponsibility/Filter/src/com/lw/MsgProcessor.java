package com.lw;

public class MsgProcessor {
    private String msg;
    private FilterChain fc;

    /**
     * 处理字符串
     * @return
     */
    public String process(){
        String str = fc.doFilter(msg);
        return str;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public FilterChain getFc() {
        return fc;
    }

    public void setFc(FilterChain fc) {
        this.fc = fc;
    }
}
