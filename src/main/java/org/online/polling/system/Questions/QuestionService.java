package org.online.polling.system.Questions;

import org.online.polling.system.DatabaseClass.DatabaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestionService {

    private Map<Long,QuestionModel> questionsMap= DatabaseClass.getQuestions();
    private DatabaseClass jdbcConnection = new DatabaseClass();

    public QuestionService() {
        questionsMap.put(1L,new QuestionModel(1L,"Q1","A","B","C","D"));
        questionsMap.put(2L,new QuestionModel(2L,"Q2","A","B","C","D"));
    }

    public List<QuestionModel> getAllQuestions()
    {

        QuestionModel question = new QuestionModel();
        List<QuestionModel> list=new ArrayList<>();
        try{
            Connection connection = jdbcConnection.getConnnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM questions;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                question=new QuestionModel(rs.getLong("questions_id"),rs.getString("questions"),
                        rs.getString("option1"),rs.getString("option2"),rs.getString("option3"),
                        rs.getString("option4"));
                list.add(question);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return list;
        //return new ArrayList<QuestionModel>(questionsMap.values());
    }

    public QuestionModel getQuestion(long id)
    {
        return questionsMap.get(id);
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
        questionsMap.put(question.getId(),question);
        return question;
    }

    public QuestionModel removeQuestion(long id)
    {

        return questionsMap.remove(id);
    }
}
