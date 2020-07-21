package com.weird.questions;

import java.util.Scanner;

public class TrueFalse extends Base{
    public TrueFalse(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public String toString() {
        return  "\n[Please answer YES(y) or NO(n)]" +
                getQuestion();
    }

    public Boolean isUserAnswerCorrect() throws Exception {
        if (!"yn".contains(getUserAnswer().toLowerCase())){
            throw new Exception("Please try again. Only (y/n) allowed");
        }
        return getCorrectAnswer().equals(getUserAnswer());
    }

    public void trueFalseQuestion(Scanner input) {
        String userAnswer = "";
        System.out.println("Answer: ");

        while (!userAnswer.toLowerCase().equals("y") && !userAnswer.toLowerCase().equals("n")) {
            userAnswer = input.nextLine();
        }

        this.setUserAnswer(userAnswer);

        System.out.println("\n");
    }
}