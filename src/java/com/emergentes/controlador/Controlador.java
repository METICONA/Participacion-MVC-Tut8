
package com.emergentes.controlador;

import com.emergentes.modelo.Personas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      int op = Integer.parseInt(request.getParameter("op"));
      
      if (op==1){
            Personas p = new Personas();
            request.setAttribute("miPersona", p);
            request.getRequestDispatcher("editar.jsp").forward(request, response);
            
      }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                int id = Integer.parseInt(request.getParameter("id"));
                int edad = Integer.parseInt(request.getParameter("edad"));
                String nombres = request.getParameter("nombres");
                String apellidos = request.getParameter("apellidos");
                String nuevo = request.getParameter("nuevo");
                
                Personas per = new Personas();
                per.setId(id);
                per.setNombres(nombres);
                per.setApellidos(apellidos);
                per.setEdad(edad);
                
                HttpSession ses = request.getSession();
                ArrayList<Personas> lista = (ArrayList<Personas>)ses.getAttribute("listaest");
                
                if(nuevo.equals("true")){
                    lista.add(per);
                    
                }
                else{
                    
                }
                response.sendRedirect("index.jsp");
                 }
                private int buscarIndice(HttpServletRequest request, int id)
                {
                    HttpSession ses= request.getSession();
                    ArrayList<Personas> lista = (ArrayList<Personas>)ses.getAttribute("listaest");
                    
                    int i =0;
                    if (lista.size()>0){
                        while (i<lista.size()){
                            if (lista.get(i).getId()==id){
                                break;
                            }
                            else i++;
                    }
                }
        return i;

}
