package com.quiz.app.controller;

import com.quiz.app.model.Question;
import com.quiz.app.repository.QuestionRepo;
import com.quiz.app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("allQuestions")
    public  List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
}
