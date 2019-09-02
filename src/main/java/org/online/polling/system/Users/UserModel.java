package org.online.polling.system.Users;

import java.util.HashMap;
import java.util.Map;

public class UserModel {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Map<Long,String> answerMap=new HashMap<>();


    public UserModel() {
    }

    public UserModel(long id, String firstName, String lastName, String emailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public UserModel(long id, String firstName, String lastName, String emailId, Map<Long, String> answerMap) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.answerMap = answerMap;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Map<Long, String> getAnswerMap() {
        return answerMap;
    }

    public void setAnswerMap(Map<Long, String> answerMap) {
        this.answerMap = answerMap;
    }
}
