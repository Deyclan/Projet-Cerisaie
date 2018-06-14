package com.epul.cerisaie.controler;

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

    // /
    // / Affichage de la page d'accueil
    // /
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Afficheindex2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("index");
    }

    // /
    // / Affichage de la page d'accueil
    // /
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView Afficheindex3(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("index");
    }

}
