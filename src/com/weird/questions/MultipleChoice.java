package com.weird.questions;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Base {
    protected ArrayList<String> possibleAnswers;

    public MultipleChoice(String question, ArrayList<String> possibleAnswers, String correctAnswer) {
        super(question, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public String toString() {
        String possibleAnswersListed = "";
        for (int i = 0; i < this.possibleAnswers.size(); i++) {
            possibleAnswersListed += "\n" + (i + 1) + "-" + this.possibleAnswers.get(i);
        }

        return  "\nPlease select the correct answer.[number] \n" +
                getQuestion() + possibleAnswersListed;
    }

    public void multipleChoiceQuestion(Scanner input) {
        String userAnswer = "";

        System.out.println("Answer: ");

        while (userAnswer.trim().equals("")) {
            userAnswer = input.nextLine();
        }

        this.setUserAnswer(userAnswer);

        System.out.println("\n");
    }
}