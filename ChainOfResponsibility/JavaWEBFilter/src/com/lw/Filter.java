package com.lw;

public interface Filter {
    public void doFilter(Request request,Response response,FilterChain chain);
}
