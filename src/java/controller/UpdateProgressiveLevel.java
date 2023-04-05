/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConfigurationDao;
import dao.CustomerDao;
import java.io.IOException;
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
@WebServlet("/update")
public class UpdateProgressiveLevel extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        int id = Integer.parseInt( request.getParameter("id"));
        ConfigurationDao configurationDao = new ConfigurationDao();
        ProgressiveLevel progressiveLevel  = configurationDao.getProgressiveLevelById(id);
        request.setAttribute("progressiveLevel", progressiveLevel);
        RequestDispatcher rd = request.getRequestDispatcher("updateProgressiveLevel.jsp");
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
            throws ServletException, IOException {
        
//        int id = Integer.parseInt( request.getParameter("id"));
//        ConfigurationDao configurationDao = new ConfigurationDao();
//        ProgressiveLevel progressiveLevel  = configurationDao.getProgressiveLevelById(id);
//        request.setAttribute("progressiveLevel", progressiveLevel);
//        RequestDispatcher rd = request.getRequestDispatcher("updateProgressiveLevel.jsp");
//        rd.forward(request, response);
            String sid = request.getParameter("id");
            String slevel = request.getParameter("level");
            String squantity = request.getParameter("quantity");
            String sprice = request.getParameter("price");
            String stype = request.getParameter("type");
            
            ConfigurationDao dao = new ConfigurationDao();
            dao.updateProgressiveLevel(Integer.parseInt(sid), Integer.parseInt(slevel), Integer.parseInt(squantity), Integer.parseInt(sprice), stype);
            response.sendRedirect("configuration");
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
