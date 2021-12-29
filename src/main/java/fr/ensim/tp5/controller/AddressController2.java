package fr.ensim.tp5.controller;

import fr.ensim.tp5.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AddressController2 {

    @GetMapping("/adresse")
    public String showAddresses(Model model) {
        return "adresse";
    }
}

