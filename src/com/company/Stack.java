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
            top = nuevo;
        }
    }

    public void print(){
        if (!isEmpty()){
            print(bottom);
        }
    }

    private void print(Nodo next){
        if(next.getNext() == null){
            System.out.println(next.getData());
        } else{
            print(next.getNext());
            System.out.println(next.getData());
        }
    }

    public String peek(){
        return this.top.getData();
    }

    public void pop(){
        if (!isEmpty()){
            if (top == bottom){
                System.out.println("Eliminando a... " + this.bottom.getData());
                bottom = null;
            } else{
                Nodo next = bottom;
                Nodo aux = top;

                while (next.getNext() != null && next.getNext()!=top){
                    next = next.getNext();
                }

                next.setNext(null);
                top = next;
                System.out.println("Eliminando a... " +aux.getData());
            }
        }
    }
}
