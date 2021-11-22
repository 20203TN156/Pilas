package com.company;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.print();

        System.out.println("------------------------");
        stack.pop();
        System.out.println("El top es " +stack.peek());
        stack.print();
        System.out.println("------------------------");
        stack.pop();
        stack.pop();
        stack.print();
    }
}
