package org.online.polling.system.Database;

import org.online.polling.system.Questions.QuestionModel;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    private static Map<Long, QuestionModel> questions = new HashMap<>();

    public static Map<Long, QuestionModel> getQuestions() {
        return questions;
    }
}
