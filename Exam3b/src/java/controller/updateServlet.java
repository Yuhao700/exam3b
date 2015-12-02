/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelper.UpdateQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;

/**
 *
 * @author Drake
 */
@WebServlet(name = "updateServlet", urlPatterns = {"/updateMember"})
public class updateServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updateServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
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
       int custID = Integer.parseInt(request.getParameter("custID"));
       String firstname = request.getParameter("firstName");
       String lastname = request.getParameter("lastName");
       String addr1 = request.getParameter("addr1");
       String addr2 = request.getParameter("addr2");
       String city = request.getParameter("city");
       String state = request.getParameter("state");
       String zip = request.getParameter("zip");
       String EmailAddr = request.getParameter("emailAddr");
       int age = Integer.parseInt(request.getParameter("age"));
       
       Customer member = new Customer();
       member.setcustID(custID);
       member.setfirstName(firstname);
       member.setlastName(lastname);
       member.setaddr1(addr1);
       member.setaddr2(addr2);
       member.setCity(city);
       member.setState(state);
       member.setZip(zip);
       member.setEmailAddr(EmailAddr);
       member.setAge(age);
       
       UpdateQuery uq = new UpdateQuery();
       uq.doUpdate(member);
       
       String url = "/read";
       
       RequestDispatcher dispatcher = request.getRequestDispatcher(url);
       dispatcher.forward(request, response);
       
       
       
        
        
        
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
