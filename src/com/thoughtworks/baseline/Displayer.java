package com.thoughtworks.baseline;

//formats and displays the message
public class Displayer {
    String inputString;
    public Displayer(String inputString) {
        this.inputString = inputString;
    }
    public void displayMessage() {
        String[] formattedString = inputString.split(" ");
        for(int i=0;i<formattedString.length-2;i++)
            System.out.print(formattedString[i] + " ");
        System.out.print(":");
        System.out.println(formattedString[formattedString.length-1]);
    }
}
