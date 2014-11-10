/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.modelonon;

import java.util.ArrayList;

/**
 *
 * @author LSynner
 */
public class Zodiaco implements Esoterica{
     ArrayList <Signos> signo;

    public Zodiaco() {
        this.signo = new ArrayList();
        signo.add(new Signos("Aries", "Morirás en 7 días >.<"));
        
        signo.add(new Signos("Tauro", "Recuerda estas engordando mucho"));
        
        signo.add(new Signos("Geminis", "Te jalaran las patas en la noche"));
        
        signo.add(new Signos("Cancer", "Tu signo lo dice todo ¬¬"));

        signo.add(new Signos("Leo", "Estaras solo en estos momentos????... Revisa detras de ti"));
        
        signo.add(new Signos("Virgo", "Deberas cuidarte de las sombras de tu cuarto"));
        
        signo.add(new Signos("Libra", "Librate de las personas que te rodean o vas a chafear"));
        
        signo.add(new Signos("Escorpion", "Revisa tu homro creo traes un escor.... insecto"));
        
        signo.add(new Signos("Sagitario", "Te caeras de un caballo"));
        
        signo.add(new Signos("Capricornio", "No comas barbacoa o te hara mucho daño"));
        
        signo.add(new Signos("Acuario", "Si vas a la playa llovera sin parar"));
       
        signo.add(new Signos("Piscis", "Tropezaras varias veces en tu vida y te dolera buajaja"));
    }
    
    public String futuro(String parametro) {
       String futuroT = "";
       
        for(Signos s:signo){
            if(parametro.equalsIgnoreCase(s.getSigno())){
            futuroT= s.getPrediccion();
        
            }
        } 
        
        return futuroT;
    }
    
    
    
}
