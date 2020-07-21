package com.weird;
import com.weird.questions.Base;
import com.weird.questions.Checkbox;
import com.weird.questions.MultipleChoice;
import com.weird.questions.TrueFalse;
import com.weird.quiz.Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        //Question 1
        TrueFalse firstQuestion = new TrueFalse("\nDo you think you'll pass this quiz?", "y");

        //Question 2
        ArrayList possibleChoicesSecond = new ArrayList<String>(
                Arrays.asList("Might bee","Could bee","Definitely","Unlikely","Must bee"));
        Checkbox secondQuestion = new Checkbox(
                "Are there actually bees on Mars?",
                possibleChoicesSecond,
                "1,2,5");

        //Question 3
        ArrayList possibleChoicesThird = new ArrayList<String>(
                Arrays.asList("Bald", "Dreadlocks", "Mohawk", "Afro", "Friar Tuck"));
        MultipleChoice thirdQuestion = new MultipleChoice(
                "Which is the best haircut for an Orc Warrior?",
                possibleChoicesThird,
                "5");

        //Run the Quiz
        System.out.println(
                "\nNew applicant, \n" +
                "\nWe are going to perform a test of your cognitive capabilities." +
                "\nPlease answer these questions correctly:"
        );

        Scanner in = new Scanner(System.in);

        System.out.println(firstQuestion);
        firstQuestion.trueFalseQuestion(in);

        System.out.println(secondQuestion);
        secondQuestion.checkboxQuestion(in);

        System.out.println(thirdQuestion);
        thirdQuestion.multipleChoiceQuestion(in);

        in.close();

        //Grade the Quiz
        ArrayList someQuestions = new ArrayList<Base>(
                Arrays.asList()
        );

        Quiz aQuiz = new Quiz(someQuestions);

        aQuiz.addQuestion(firstQuestion);
        aQuiz.addQuestion(secondQuestion);
        aQuiz.addQuestion(thirdQuestion);


        System.out.println("Final result: " + aQuiz.gradeQuiz());

    }

}
