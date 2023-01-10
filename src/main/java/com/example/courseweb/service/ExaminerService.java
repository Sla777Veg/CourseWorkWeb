package com.example.courseweb.service;
import com.example.courseweb.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
