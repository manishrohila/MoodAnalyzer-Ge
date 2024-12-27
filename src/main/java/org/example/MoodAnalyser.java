package org.example;

public class MoodAnalyser {
    private String message;

    // Default constructor
    public MoodAnalyser() {
    }

    // Parameterized constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // Analyse mood based on the message field
    public String analyseMood() throws customException {
        try{
            if(message==null){
                throw new customException("Mood is null");
            }
            if(message.trim().isEmpty()){
                throw new customException("Message is empty");
            }
            if(message.toLowerCase().contains("said")){
                return "sad";
            }
            else return "happy";
        }
        catch (customException e){
            throw  e;
        }
    }
}
