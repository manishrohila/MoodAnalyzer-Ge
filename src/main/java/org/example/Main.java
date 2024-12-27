package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        // Test Case 1.1
        String message1 = "I am in Sad Mood";
        String result1 = moodAnalyser.analyseMood(message1);
        System.out.println("Message: " + message1 + " | Mood: " + result1);

        // Test Case 1.2
        String message2 = "I am in Any Mood";
        String result2 = moodAnalyser.analyseMood(message2);
        System.out.println("Message: " + message2 + " | Mood: " + result2);
    }
}