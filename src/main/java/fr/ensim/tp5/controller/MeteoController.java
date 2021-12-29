package fr.ensim.tp5.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp5.Quote;


@Controller
public class MeteoController {

    @PostMapping("/meteo")
    public String showAddresses( @ModelAttribute("address") String adresse, Model model) { //Récupération dans var adresse de ce que l'utilisateur a saisi dans la case
        
    	model.addAttribute("adresse",adresse);
    	
    	String requete = "https://api-adresse.data.gouv.fr/search/?q=";
    	//On remplace les espaces de l'adresse en + dans la chaine de caractere dans l'adresse
    	adresse = adresse.replaceAll(" ", "+");
    	requete = requete + adresse;
    	
    	//Appel à l'API
    	RestTemplate rst = restTemplate(new RestTemplateBuilder());
    	Quote q = rst.getForObject(requete, Quote.class);
    	System.out.println(q);
    	model.addAttribute("feature", q.getFeatures());
    	return "meteo";
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}


