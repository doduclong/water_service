/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.ConfigurationDao;
import dao.CustomerDao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import model.ProgressiveLevel;

/**
 *
 * @author doduc
 */
@WebServlet(name = "ConfigurationServlet", urlPatterns = {"/configuration"})
public class ConfigurationServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        ConfigurationDao configurationDao = new ConfigurationDao();
        List<ProgressiveLevel> listProgressive  = configurationDao.getAllProgressiveLevel();
        List<ProgressiveLevel> listProgressiveSh = new ArrayList<>();
        ProgressiveLevel progressiveSx = new ProgressiveLevel();
        ProgressiveLevel progressiveKd = new ProgressiveLevel();
        for(int i=0; i<listProgressive.size(); i++){
            if(listProgressive.get(i).getType().equalsIgnoreCase("kd")){
                progressiveKd = listProgressive.get(i);
                listProgressive.remove(listProgressive.get(i));
            }
            if(listProgressive.get(i).getType().equalsIgnoreCase("sx")){
                progressiveSx = listProgressive.get(i);
                listProgressive.remove(listProgressive.get(i));
            }
        }
        request.setAttribute("listProgressive", listProgressive);
        request.setAttribute("progressiveSx", progressiveSx);
        request.setAttribute("progressiveKd", progressiveKd);
        RequestDispatcher rd = request.getRequestDispatcher("configuration.jsp");
        rd.forward(request, response);
    }

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
            throws ServletException, IOException 
    {

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
