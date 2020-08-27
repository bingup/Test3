package com.innnerclass;

public class Start {
    private Tesk tesk;

    public Start(Tesk tesk){
        this.tesk = tesk;
    }

    public void run (){
        tesk.task();
    }
}
