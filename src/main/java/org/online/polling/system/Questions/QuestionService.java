package org.online.polling.system.Questions;

import org.online.polling.system.Database.DatabaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestionService {

    private Map<Long,QuestionModel> questionsMap= DatabaseClass.getQuestions();

    public QuestionService() {
        questionsMap.put(1L,new QuestionModel(1L,"Q11111","A","B","C","D"));
        questionsMap.put(2L,new QuestionModel(2L,"Q2","A","B","C","D"));
    }

    public List<QuestionModel> getAllQuestions()
    {
        return new ArrayList<QuestionModel>(questionsMap.values());
    }

    public QuestionModel addQuestion(QuestionModel question)
    {
        question.setId(questionsMap.size()+1);
        questionsMap.put(question.getId(),question);
        return question;
    }

    public QuestionModel updateQuestion(QuestionModel question)
    {
//        if(question.getId()<=0)
//        {
//            return null;
//        }
//        System.out.println(question);
        questionsMap.put(question.getId(),question);
        return question;
    }

    public QuestionModel removeQuestion(long id)
    {
        return questionsMap.remove(id);
    }
}
