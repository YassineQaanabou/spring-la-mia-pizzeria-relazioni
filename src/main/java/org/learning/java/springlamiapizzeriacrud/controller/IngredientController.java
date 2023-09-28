package org.learning.java.springlamiapizzeriacrud.controller;

import jakarta.validation.Valid;
import org.learning.java.springlamiapizzeriacrud.model.Ingredient;
import org.learning.java.springlamiapizzeriacrud.repository.IngredientRepository;
import org.learning.java.springlamiapizzeriacrud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping
    public String index(Model model) {
        List<Ingredient> ingredientList;
        ingredientList = ingredientRepository.findAll();
        model.addAttribute("ingredients", ingredientList);
        Ingredient ingredient = new Ingredient();
        model.addAttribute("ingredient", ingredient);
        return "ingredient/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Ingredient ingredient = new Ingredient();
        model.addAttribute("ingredient", ingredient);
        return "ingredient/form";

    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("ingredient") Ingredient ingredientOffer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ingredient/form";
        }
        ingredientRepository.save(ingredientOffer);

        return "redirect:/ingredient";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Ingredient> result = ingredientRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("ingredient", result.get());
            return "ingredient/edit";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ingredient with id " + id + " not found");
        }
    }

    @PostMapping("/edit/{id}")
    public String doEdit(@PathVariable Integer id, @Valid @ModelAttribute("ingredient") Ingredient ingredientForm,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/ingredient/edit"; //
        }
        ingredientRepository.save(ingredientForm);
        return "redirect:/ingredient";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        ingredientRepository.deleteById(id);
        return "redirect:/ingredient";
    }

}

