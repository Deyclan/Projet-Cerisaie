package com.epul.cerisaie.controler;

import com.epul.cerisaie.dao.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Controleur {
    /*
    private String methodNameResolver;

    public void setMethodNameResolver(String methodNameResolver) {
        this.methodNameResolver = methodNameResolver;
    }

    public String getMethodNameResolver() {
        return methodNameResolver;
    }
    */

    // /
    // / Affichage de la page d'accueil
    // /
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView Afficheindex(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Afficheindex2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView Afficheindex3(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("index");
    }

    // / Affichage de la page PLANNING
    @RequestMapping(value = "planning")
    public ModelAndView afficherPlanning(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String destinationPage;
        try {
            ServiceActivite serviceActivite = new ServiceActivite();
            request.setAttribute("mesActivites", serviceActivite.getListActivite());
            destinationPage = "planning";
        } catch (Exception e) {
            request.setAttribute("MesErreurs", e.getMessage());
            destinationPage = "Erreur";
        }
        return new ModelAndView(destinationPage);
    }
    // CLIENTS
    @RequestMapping(value = "listeClients")
    public ModelAndView afficherClients(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String destinationPage;
        try {
            ServiceClient serviceClient = new ServiceClient();
            request.setAttribute("mesClients", serviceClient.getListClient());
            destinationPage = "listeClients";
        } catch (Exception e) {
            request.setAttribute("MesErreurs", e.getMessage());
            destinationPage = "Erreur";
        }
        return new ModelAndView(destinationPage);
    }
    // SEJOURS
    @RequestMapping(value = "listeSejours")
    public ModelAndView afficherSejours(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String destinationPage;
        try {
            ServiceSejour serviceSejour = new ServiceSejour();
            request.setAttribute("mesSejours", serviceSejour.getListSejour());
            destinationPage = "listeSejours";
        } catch (Exception e) {
            request.setAttribute("MesErreurs", e.getMessage());
            destinationPage = "Erreur";
        }
        return new ModelAndView(destinationPage);
    }
    // SPORTS
    @RequestMapping(value = "listeSports")
    public ModelAndView afficherSports(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String destinationPage;
        try {
            ServiceSport serviceSport = new ServiceSport();
            request.setAttribute("mesSports", serviceSport.getListSport());
            destinationPage = "listeSports";
        } catch (Exception e) {
            request.setAttribute("MesErreurs", e.getMessage());
            destinationPage = "Erreur";
        }
        return new ModelAndView(destinationPage);
    }
    // EMPLACEMENTS
    @RequestMapping(value = "listeEmplacements")
    public ModelAndView afficherEmplacement(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String destinationPage;
        try {
            ServiceEmplacement serviceEmplacement = new ServiceEmplacement();
            request.setAttribute("mesEmplacements", serviceEmplacement.getListEmplacement());
            destinationPage = "listeEmplacements";
        } catch (Exception e) {
            request.setAttribute("MesErreurs", e.getMessage());
            destinationPage = "Erreur";
        }
        return new ModelAndView(destinationPage);
    }
    // TYPES EMPLACEMENT
    @RequestMapping(value = "listeTypesEmpl")
    public ModelAndView afficherTypesEmpl(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String destinationPage;
        try {
            ServiceTypeEmplacement serviceTypeEmplacement = new ServiceTypeEmplacement();
            request.setAttribute("mesTypesEmplacement", serviceTypeEmplacement.getListTypeEmplacement());
            destinationPage = "listeTypesEmpl";
        } catch (Exception e) {
            request.setAttribute("MesErreurs", e.getMessage());
            destinationPage = "Erreur";
        }
        return new ModelAndView(destinationPage);
    }
}
