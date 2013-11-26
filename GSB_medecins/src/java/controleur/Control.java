/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;
import java.util.TreeSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Connect;
import modele.Dep;
import modele.Med;
import modele.Pays;

/**
 *
 * @author lmartinez
 */
public class Control extends HttpServlet {

    private Pays p;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        p = new Pays(); //instancie les objets utiles 
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
        String page = null;
        String choix = request.getParameter("choix");
        String numDep = request.getParameter("numDep");
        String lMedNom= request.getParameter("lMedNom");
        String LSpe = request.getParameter("lSpe");

        if (choix != null) {
            if (choix.equals("lDep")) {
                if (numDep == null) {
                    Collection<Dep> d = p.getLesDeps();
                    request.setAttribute("listeDeps", d);
                    page = "listeDep.jsp";
                } else {
                    Collection<Med> m = p.getLeDep(numDep).getLesMed();
                    request.setAttribute("listeMeds", m);
                    page = "listMedParDep.jsp";
                }
            } else if (choix.equals("lMed")) {
                if(lMedNom==null){
                page = "listeMed.jsp";
                }
                else{
                    Collection <Med>medParNom= new TreeSet<Med>();
                    for(Dep unDep :p.getLesDeps()){
                        for(Med unMed : unDep.getLesMed()){
                            if(unMed.getNom().startsWith(lMedNom)){
                                medParNom.add(unMed);
                            }
                        }
                    }
                    request.setAttribute("medParNom", medParNom);
                    page="listMedParNom.jsp";
                }
            }
            else if (choix.equals ("lSpe")){
                if(LSpe==null){
                page="listeSpe.jsp";
                }
                else{
                    Collection<Med>medParSpe = new TreeSet<Med>();
                    
                    
                }
            }
            
        } else {
            page = "index.jsp";
        }
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
