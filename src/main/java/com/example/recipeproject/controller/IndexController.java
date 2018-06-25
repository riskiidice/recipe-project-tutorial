package com.example.recipeproject.controller;

import com.example.recipeproject.domain.Category;
import com.example.recipeproject.domain.UnitOfMeasure;
import com.example.recipeproject.repository.CategoryRepository;
import com.example.recipeproject.repository.UnitOfMeasureRepository;
import com.example.recipeproject.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
