package org.learning.java.springlamiapizzeriacrud.controller;

import jakarta.validation.Valid;
import org.learning.java.springlamiapizzeriacrud.model.Offer;
import org.learning.java.springlamiapizzeriacrud.repository.OfferRepository;
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
@RequestMapping("/offer")
public class OfferController {

    @Autowired
    private OfferRepository offerRepository;

    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping
    public String index(Model model) {
        List<Offer> offerList;
        offerList = offerRepository.findAll();
        model.addAttribute("offers", offerList);
        return "offer/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Offer offer = new Offer();
        model.addAttribute("offer", offer);
        return "offer/form";

    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("offer") Offer formOffer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "offer/form";
        }
        offerRepository.save(formOffer);
        return "redirect:/pizza";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Offer> result = offerRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("offer", result.get());
            return "offer/edit";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Offer with id " + id + " not found");
        }
    }

    @PostMapping("/edit/{id}")
    public String doEdit(@PathVariable Integer id, @Valid @ModelAttribute("offer") Offer formOffer,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/offer/edit"; //
        }
        offerRepository.save(formOffer);
        return "redirect:/pizza";
    }

}
