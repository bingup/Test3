package com.com.day011.test3;

import java.util.ArrayList;

public class JieDaiYuan {
    private Filter filter;

    public JieDaiYuan(Filter filter) {
        this.filter = filter;
    }

    public JieDaiYuan() {
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void jieDai(int n, int m, ArrayList<User> list,String str) {
        for (int i = n; i <= m; i++) {
            list.get(i).setName(str);
        }
    }

    public void setClass(User u, String str) {
        u.setName(str);
    }
}
