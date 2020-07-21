package com.weird.questions;

public abstract class Base {
    protected String question;
    protected String userAnswer;
    protected String correctAnswer;

    public Base(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public Boolean isUserAnswerCorrect() throws Exception {
        return this.correctAnswer.equals(this.userAnswer);
    }
}