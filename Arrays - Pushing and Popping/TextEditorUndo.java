package com.lesson.lab;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: initialize the stack array
        stack = new String[10];
        // TODO 2: set initial top index to -1
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        // TODO 3: check if the stack is full
        if (top == stack.length - 1) {
               // TODO 4: print message if the stack is full
            System.out.println("Stack is full");
            return;
        }
        top++;   // TODO 5: increment top and add action to the stack
        stack[top] = action; // add action to the stack
        System.out.println("Action added: " + action);// TODO 6: print confirmation message
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        // TODO 7: Check if the stack is empty
        if (top == -1) {
        // TODO 8: Print message if the stack is empty and return null
            System.out.println("Stack is empty");
            return null;
        }
        // TODO 9: Retrieve and remove the top action from the stack
        if (PoppedValue != null) {
        String PoppedValue = stack[top];
        top--;
        // TODO 10: Print confirmation message, return and replace empty string with the undone action
        System.out.println("Action undone: " + undoneAction);
        return undoneAction;
        }

    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // TODO 11: Check if the stack is empty
        if (top == -1) {
        // TODO 12: Print message if the stack is empty and return null
        System.out.println("Stack is empty");
        return null;
        // TODO 13: Return and replace empty string with the most recent action without removing it
        if (top != -1) {
            PeekValue = stack[top];
            System.out.println("Most recent action: " + PeekValue);
            return PeekValue;
        }else{
            System.out.println("Stack is empty");
            return null;
        }
    }
      
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: Check if the stack is empty
        if (top == -1) {

        // TODO 15: Print message if the stack is empty
        System.out.println("Stack is empty");
        // TODO 16: Iterate through the stack and print each action
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }

        // TODO 17: Print a new line after displaying all actions
        System.out.println();
        }
    }
}
