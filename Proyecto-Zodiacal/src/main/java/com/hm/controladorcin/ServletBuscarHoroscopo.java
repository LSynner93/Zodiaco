/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hm.controladorcin;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hm.modelonon.Pitoniza;
import com.hm.modelonon.Zodiaco;

/**
 *
 * @author LSynner
 */
public class ServletBuscarHoroscopo extends HttpServlet {

    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        PrintWriter out= response.getWriter();
        String nombre = request.getParameter("nombre");
        String signo = request.getParameter("signo");
        
        Pitoniza pito = new Pitoniza (new Zodiaco());
       
        out.println("Bienvenid@ " + nombre +", tu signo es: " +signo);
        out.println("y tu horoscopo es: " + pito.obtenerFuturo(signo));
        
        
    }
}
