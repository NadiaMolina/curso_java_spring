/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.controladores;

import com.google.gson.Gson;
import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.logica.ServicioClientes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nadia
 */
public class EliminarControladores extends HttpServlet {

   
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("application/json;charset=UTF-8");
    
        try (PrintWriter salida = response.getWriter()){
       
        String email = request.getParameter("email");
        
        ServicioClientes servCli;
        servCli= new ServicioClientes();
        
       Cliente cli = servCli.obtenerUno(email);
            String jsonText = null;
            String text = null;
            if (cli != null) {
                servCli.eliminar(email);

                text = "Se ha eliminado este usuario:  " + "email: " + email + " nombre: " + cli.getNombre();

            } else {
                text = "El email no existe";

            }
            jsonText = new Gson().toJson(text);
            salida.print(jsonText);

        }
     
    }

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
@Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

