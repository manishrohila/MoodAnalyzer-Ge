package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test Case 1: Constructor with "I am in Sad Mood"
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        String result1 = moodAnalyser1.analyseMood();
        System.out.println("Message: " + moodAnalyser1.getMessage() + " | Mood: " + result1);

        // Test Case 1.1: Constructor with "I am in Happy Mood"
        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Happy Mood");
        String result2 = moodAnalyser2.analyseMood();
        System.out.println("Message: " + moodAnalyser2.getMessage() + " | Mood: " + result2);

        // Test Case 2: Constructor with null mood
        MoodAnalyser moodAnalyser3 = new MoodAnalyser(null);
        String result3 = moodAnalyser3.analyseMood();
        System.out.println("Message: " + moodAnalyser3.getMessage() + " | Mood: " + result3);
    }
}