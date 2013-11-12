/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Pays;
import modele.Dep;
import modele.Med;
import modele.Connect;


/**
 *
 * @author lmartinez
 */

public class Control extends HttpServlet {

    private Pays p;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        p = new Pays();//instancie les objets utiles 
    }

    public void destroy() {
        Connect.close();
    }

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String page;
//       String choix = request.getParameter("choix");
        Collection<Dep>lesDeps=p.getLesDeps();
        request.setAttribute("lesDeps", lesDeps);
        page="listeDep.jsp";
        
//        if (choix !=null){
//           String departement=request.getParameter("departement");
//           Emplacement emp=b.getLeType(choix).getEmpDispo(nomAbonne);
//           if(emp==null)
//           {
//               page="empNonDispo.jsp";
//           }
//           else
//           {
//             request.setAttribute("code", emp.getCode());
//             request.setAttribute("prix", b.getLeType(choix).getPrix());
//             page = "empDispo.jsp";  
//           }
//           
//           
//            
//            
//        }
//        else{
//        Map<String, Type> l = b.getLesTypes();
//        request.setAttribute("listeDep", l);
//        request.setAttribute("leDep", p.getLesDeps());
//        request.setAttribute("lieu", b.getLieu());
//        request.setAttribute("date", b.getDate());
//        
//        page = "index.jsp";
//        }
//        
        
        request.getRequestDispatcher(page).forward(request, response);



    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
