package org.online.polling.system.Answers;

public class AnswerModel {
    private long id;
    private String question;
    private int questions_id,option1,option2,option3,option4;


    public AnswerModel() {
    }

    public AnswerModel(long id, String question, int questions_id, int option1, int option2, int option3, int option4) {
        this.id = id;
        this.question = question;
        this.questions_id = questions_id;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuestions_id() {
        return questions_id;
    }

    public void setQuestions_id(int questions_id) {
        this.questions_id = questions_id;
    }

    public int getOption1() {
        return option1;
    }

    public void setOption1(int option1) {
        this.option1 = option1;
    }

    public int getOption2() {
        return option2;
    }

    public void setOption2(int option2) {
        this.option2 = option2;
    }

    public int getOption3() {
        return option3;
    }

    public void setOption3(int option3) {
        this.option3 = option3;
    }

    public int getOption4() {
        return option4;
    }

    public void setOption4(int option4) {
        this.option4 = option4;
    }

    //    public AnswerModel(long id, String question, long questions_id, long option1, long option2, long option3, long option4) {
//        this.id = id;
//        this.question = question;
//        this.questions_id = questions_id;
//        this.option1 = option1;
//        this.option2 = option2;
//        this.option3 = option3;
//        this.option4 = option4;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public long getQuestions_id() {
//        return questions_id;
//    }
//
//    public void setQuestions_id(long questions_id) {
//        this.questions_id = questions_id;
//    }
//
//    public long getOption1() {
//        return option1;
//    }
//
//    public void setOption1(long option1) {
//        this.option1 = option1;
//    }
//
//    public long getOption2() {
//        return option2;
//    }
//
//    public void setOption2(long option2) {
//        this.option2 = option2;
//    }
//
//    public long getOption3() {
//        return option3;
//    }
//
//    public void setOption3(long option3) {
//        this.option3 = option3;
//    }
//
//    public long getOption4() {
//        return option4;
//    }
//
//    public void setOption4(long option4) {
//        this.option4 = option4;
//    }


}
