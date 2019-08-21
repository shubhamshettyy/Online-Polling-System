package org.online.polling.system.Questions;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/questions")
public class QuestionModel {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getQuestions(){
        return "Questions is up";
    }

}
