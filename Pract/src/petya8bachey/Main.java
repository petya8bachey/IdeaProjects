package petya8bachey;

import petya8bachey.collection.Item;
import petya8bachey.collection.Stack;

public class Main {
    public static void main(String[] args){
        /*
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(14);
        myStack.push(13);
        myStack.push(12);
        System.out.println(myStack.pop());
        myStack.push(11);
        myStack.printAll();
        Item<Integer> foundItem = myStack.search(14);
        System.out.println(foundItem);
        наследование
        очереди
        многопоточность
        */
        Stack<String> myStack = new Stack<String>();
        System.out.println(myStack.pop());
        myStack.push("12");
        myStack.push("34");
        myStack.printAll();
        System.out.println(myStack.pop());
        Item<String> foundItem = myStack.search("12");
        System.out.println(foundItem);
    }
}
