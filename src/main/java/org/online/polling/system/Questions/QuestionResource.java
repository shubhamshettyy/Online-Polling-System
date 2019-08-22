package org.online.polling.system.Questions;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/questions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuestionResource {
    QuestionService questionService = new QuestionService();

    @GET
    public List<QuestionModel> getQuestions()
    {
        return questionService.getAllQuestions();
    }

    @PUT
    @Path("/{question_id}")
    public QuestionModel updateQuestion(@PathParam("question_id") long id,QuestionModel question)
    {
        question.setId(id);
        return questionService.updateQuestion(question);
    }

    //@POST


    @DELETE
    @Path("{question_id}")
    public void deleteQuestion(@PathParam("question_id") long id)
    {
//        question.setId(id);
        questionService.removeQuestion(id);
    }

}
