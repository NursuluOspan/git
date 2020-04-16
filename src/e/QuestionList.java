package e;

import java.util.ArrayList;
import java.util.Random;

public class QuestionList {
    
    private ArrayList<Question> questions;
    public QuestionList(){
        this.questions = new ArrayList<Question>();
    }

    public static QuestionList getQuestionList(){
        QuestionList list = new QuestionList();
        //1
        Question q = new Question();
        q.setQuestionBody(" ... - это перпендикуляр опущенный из верщины треугольника на противопложную сторону?");
        ArrayList<String> ans = new ArrayList<String>();
        ans.add("Медиана");
        ans.add("Катет");
        ans.add("Высота");
        q.setAnswers(ans);
        q.setCorrectAnswer("Высота");
        list.questions.add(q);

        //2
        q = new Question();
        q.setQuestionBody("Сколько центров у треугольника?");
        ans = new ArrayList<String>();
        ans.add("3");
        ans.add("5");
        ans.add("9");
        q.setAnswers(ans);
        q.setCorrectAnswer("3");
        list.questions.add(q);

        //3
        q = new Question();
        q.setQuestionBody("Прямоугольник это частный случай:");
        ans = new ArrayList<String>();
        ans.add("Квадрата");
        ans.add("Ромба");
        ans.add("Параллелограмма");
        q.setAnswers(ans);
        q.setCorrectAnswer("Параллелограмма");
        list.questions.add(q);

        //4
        q = new Question();
        q.setQuestionBody("Любой угол прямоугольника равен:");
        ans = new ArrayList<String>();
        ans.add("45 градусам");
        ans.add("90 градусам");
        ans.add("60 градусам");
        q.setAnswers(ans);
        q.setCorrectAnswer("90 градусам");
        list.questions.add(q);
        
        //5
        q = new Question();
        q.setQuestionBody("Можно ли называть прямоугольник ромбом?");
        ans = new ArrayList<String>();
        ans.add("Да");
        ans.add("Нет");
        ans.add("Зависит от условия задачи");
        q.setAnswers(ans);
        q.setCorrectAnswer("Да");
        list.questions.add(q);
        
        //6
        q = new Question();
        q.setQuestionBody("Сколько высот в треугольнике?");
        ans = new ArrayList<String>();
        ans.add("1");
        ans.add("3");
        ans.add("Зависит от вида треугольника");
        q.setAnswers(ans);
        q.setCorrectAnswer("3");
        list.questions.add(q);
        
        //7
        q = new Question();
        q.setQuestionBody("Чему равна сумма углов прямоугольника?");
        ans = new ArrayList<String>();
        ans.add("90");
        ans.add("180");
        ans.add("360");
        q.setAnswers(ans);
        q.setCorrectAnswer("360");
        list.questions.add(q);
        
        //8
        q = new Question();
        q.setQuestionBody("Диагонали пересекаются под прямым углом. Это верно:");
        ans = new ArrayList<String>();
        ans.add("только для прямоугольника");
        ans.add("только для ромба");
        ans.add("для ромба и квадрата");
        q.setAnswers(ans);
        q.setCorrectAnswer("для ромба и квадрата");
        list.questions.add(q);
        return list;
    }

    public static QuestionList getQuestionListRandomly(int size){
        QuestionList list = getQuestionList();
        QuestionList newList = new QuestionList();
        if(size > list.getQuestions().size()){
            size = list.getQuestions().size();
        }
        while (true) {
            int temp = (new Random()).nextInt(list.getQuestions().size());
            if (newList.getQuestions().contains(
                    list.getQuestions().get(temp)) == false) {
                newList.getQuestions().add(list.getQuestions().get(temp));
            }
            if(newList.getQuestions().size() == size){
                break;
            }
        }
        return newList;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
    

