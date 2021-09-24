package com.company;


public class QuizRunner {

    public static void main(String[] args) {
        // write your code here
        Quiz myQuiz = new Quiz(new ArrayList<>());
        ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("1. option a","2. option b","3. option c","4. option d"));
        ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(2,3));
        Checkbox newQuestion1 = new Checkbox(2, "Which of these are...");
        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("1. option e","2. option f","3. option g","4. option h"));
        MultipleChoice newQuestion2 = new MultipleChoice(1,"Which of...");
        myQuiz.addQuestion(newQuestion2);
        TrueFalse newQuestion3 = new TrueFalse(1,"My Question");
        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();

        myQuiz.gradeQuiz();

    }
}

/*only a main method. The program should create several questions, present them to the user, accept the user’s responses,
and then tell them whether their answers were correct or incorrect.*/

