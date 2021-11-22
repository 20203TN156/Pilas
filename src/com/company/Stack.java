package com.company;

public class Stack {
    Nodo top;
    Nodo bottom;

    public Stack(){
        this.top = null;
        this.bottom = null;
    }

    public boolean isEmpty(){
        return this.bottom == null;
    }
}
