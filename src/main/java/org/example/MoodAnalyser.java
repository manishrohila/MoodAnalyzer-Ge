package org.example;

public class MoodAnalyser {
    public String analyseMood(String message){
        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }
        return "HAPPY";
    }
}
