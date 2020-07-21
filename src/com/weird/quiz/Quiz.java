package com.weird.quiz;

import com.weird.questions.Base;

import java.util.ArrayList;

public class Quiz {

    public ArrayList<Base> questions;

    public Quiz(ArrayList<Base> questions) {
        this.questions = questions;
    }

    public void addQuestion(Base aQuestion){
        questions.add(aQuestion);
    }

    public String gradeQuiz() throws Exception {
        Double totalSum = 0.0;
        int index = 1;
        for (Base aQuestion : this.questions) {
            System.out.println("Question " + index + " Comparison: " + (aQuestion.isUserAnswerCorrect()));
            index++;
            if (aQuestion.isUserAnswerCorrect()){
                totalSum += 1;
            }
        }

        return (totalSum/this.questions.size())*100 + "%";
    }
}