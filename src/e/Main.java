package e;

import java.util.ArrayList;
import java.util.Random;

public class Main {
     
    public static void main(String[] args) {
        QuestionList list = QuestionList.getQuestionListRandomly(5);

        for (Question q : list.getQuestions()) {
            System.out.println(q.getQuestionBody() + "_"
                    + q.getCorrectAnswer());
        }
    }
}
