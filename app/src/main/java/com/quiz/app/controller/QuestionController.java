package com.quiz.app.controller;

import com.quiz.app.model.Question;
import com.quiz.app.repository.QuestionRepo;
import com.quiz.app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

        @GetMapping("category/{category}")
        public List<Question> getQuestionsByCategory(@PathVariable String category) {
            return questionService.getQuestionsByCategory(category);
        }

        @PostMapping("add")
        public String addQuestion(@RequestBody Question question){
                return questionService.addQuestion(question);
        }
}
