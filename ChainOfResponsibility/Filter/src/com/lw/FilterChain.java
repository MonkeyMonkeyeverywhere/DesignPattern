package com.lw;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter){
        this.filters.add(filter);
        return this;
    }

    @Override
    public String doFilter(String str){
        String r = str;
        for(Filter f: filters) {
            r = f.doFilter(r);
        }
        return r;
    }
}
