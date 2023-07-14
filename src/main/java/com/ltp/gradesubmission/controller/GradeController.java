package com.ltp.gradesubmission.controller;

import com.ltp.gradesubmission.entities.Grades;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GradeController {
   @GetMapping("/grades")
   public String getGrades(Model model){
       Grades grade =  new Grades("Harry","Potions","AA");
       model.addAttribute("Grades",grade);
       return "grades";
   }
}
