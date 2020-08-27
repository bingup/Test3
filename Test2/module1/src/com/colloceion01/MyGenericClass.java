package com.colloceion01;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }

    public MVP getMvp() {
        return mvp;
    }

    public  <MVP>MVP show(MVP mvp){
        return mvp;
    }
}
