package com.atos.firstbackend;

public class Greeting {

    private static Greeting greeting;

    private String greetText = "Hello User!";

    private Greeting() {
    }

    public static Greeting  getGreeting() {
        if(greeting == null) {
            greeting = new Greeting();
        }
        return greeting;
    }

    public String getGreetText() {
        return this.greetText;
    }

    public void setGreetText(String greetText) {
        this.greetText = greetText;
    }
    
}
