package com.adiberrifai.spring5recipeapp.controllers;

import com.adiberrifai.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model, HttpServletRequest request) {

        log.debug("GET /" + request.getRequestURI());

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
