package com.company;

public class Nodo {
    private String data;
    private Nodo next;

    public Nodo(String data) {
        this.data = data;
        this.next = null;
    }
        public String getData(){
            return data;
        }

        public void setData(String data){
        this.data = data;
        }

        public Nodo getNext(){
            return next;
        }

        public void setNext(Nodo next){
        this.next = next;
        }
    }


