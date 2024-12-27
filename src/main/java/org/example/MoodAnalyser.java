package org.example;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){

    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String analyseMood(){
        try{
            if(message!=null && message.toLowerCase().contains("sad")){
                return "SAD";
            }
            else {
                return "Happy";
            }
        }
        catch (Exception e){
                return "HAPPY";
        }
    }
}
