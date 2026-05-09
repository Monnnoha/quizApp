package com.quiz.app.service;

import com.quiz.app.exception.QuestionNotFoundException;
import com.quiz.app.model.Question;
import com.quiz.app.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        List<Question> questions = questionRepo.findByCategory(category);

        if(questions.isEmpty()){
            throw new QuestionNotFoundException(
                    "No Questions found for category: " + category
            );

        }
        return questions;
    }

    public String addQuestion(Question question){
        questionRepo.save(question);
        return "success";
    }
}
