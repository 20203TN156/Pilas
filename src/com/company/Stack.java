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

    public void push (String data){
        if (isEmpty()){
            bottom = new Nodo(data);
            top = bottom;
        } else{
            Nodo nuevo = new Nodo(data);
            top.setNext(nuevo);
        }
    }
}
