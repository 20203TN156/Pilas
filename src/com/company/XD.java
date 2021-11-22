package com.company;

import java.util.Stack;

public class XD {
    public static void main(String[] args) {
        java.util.Stack<String> pila = new Stack<>();
        pila.push("1");
        pila.push("2");
        pila.push("3");
        System.out.println(pila);
        System.out.println(pila.pop());
    }
}
