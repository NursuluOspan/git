package e;

import java.util.ArrayList;

public class Question {
    
    private static int CURRENT_ID = 1;

    private int id;
    private String questionBody;
    private ArrayList<String> answers;
    private String correctAnswer;

    public Question() {
        this.id = CURRENT_ID;
        CURRENT_ID++;
        answers = new ArrayList<String>();
    }

    public boolean checkAnswer(String input){
        return this.correctAnswer.equals(input);
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }
    
    
}
