/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.session.konversivolume;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class konversiServlet extends HttpServlet {

    @EJB
    private konversivolume konversivolume;

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
        
PrintWriter out = response.getWriter();
        
        
try {            
            
out.println("<html>");
            
out.println("<body");
            
out.println("<h1><center>TUGAS MODUL 2 RSBK</center></h1>");
out.println("<h1><center>KONVERSI VOLUME</center></h1>");
            
String volume = request.getParameter("volume");
            
            
if ((volume != null) && (volume.length() > 0)) {
                
double d = Double.parseDouble(volume);

                if (request.getParameter("KL Ke HL") != null){

                    String klhl = konversivolume.kl_hl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+klhl+"</p>");

                }  
                
                if (request.getParameter("KL Ke DAL") != null) {

                    String kldal = konversivolume.kl_dal(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+kldal+ " .</p>");

                }

                if (request.getParameter("KL Ke L") != null) {

                    String kll = konversivolume.kl_l(d);

                    out.println("<p> HASIL KONVERSI VOLUME: " +kll+ " .</p>");

                }

                if (request.getParameter("KL Ke DL") != null) {

                    String kldl = konversivolume.kl_dl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+kldl+ " .</p>");

                }

                if (request.getParameter("KL Ke CL") != null) {

                    String klcl = konversivolume.kl_cl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+klcl+ " .</p>");

                }
                
                if (request.getParameter("KL Ke ML") != null) {

                    String klml = konversivolume.kl_ml(d);
 
                    out.println("<p> HASIL KONVERSI VOLUME: "+klml+ " .</p>");

                }
                if (request.getParameter("HL Ke KL") != null){

                    String hlkl = konversivolume.hl_kl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+hlkl+"</p>");

                }  
                
                if (request.getParameter("HL Ke DAL") != null) {

                    String hldal = konversivolume.hl_dal(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+hldal+ " .</p>");

                }

                if (request.getParameter("HL Ke L") != null) {

                    String hll = konversivolume.hl_l(d);

                    out.println("<p> HASIL KONVERSI VOLUME: " +hll+ " .</p>");

                }

                if (request.getParameter("HL Ke DL") != null) {

                    String hldl = konversivolume.hl_dl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+hldl+ " .</p>");

                }

                if (request.getParameter("HL Ke CL") != null) {

                    String hlcl = konversivolume.hl_cl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+hlcl+ " .</p>");

                }
                
                if (request.getParameter("HL Ke ML") != null) {

                    String hlml = konversivolume.hl_ml(d);
 
                    out.println("<p> HASIL KONVERSI VOLUME: "+hlml+ " .</p>");

                }
                 if (request.getParameter("DAL Ke L") != null){

                    String dall = konversivolume.dal_l(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+dall+"</p>");

                }  
                
                if (request.getParameter("DAL Ke DL") != null) {

                    String daldl = konversivolume.dal_dl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+daldl+ " .</p>");

                }

                if (request.getParameter("DAL Ke CL") != null) {

                    String dalcl = konversivolume.dal_cl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: " +dalcl+ " .</p>");

                }

                if (request.getParameter("DAL Ke ML") != null) {

                    String dalml = konversivolume.dal_ml(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+dalml+ " .</p>");

                }

                if (request.getParameter("DAL Ke KL") != null) {

                    String dalkl = konversivolume.dal_kl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+dalkl+ " .</p>");

                }
                
                if (request.getParameter("DAL Ke HL") != null) {

                    String dalhl = konversivolume.dal_hl(d);
 
                    out.println("<p> HASIL KONVERSI VOLUME: "+dalhl+ " .</p>");

                }
                 if (request.getParameter("L Ke DL") != null){

                    String ldl = konversivolume.l_dl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+ldl+" .</p>");

                }  
                
                if (request.getParameter("L Ke CL") != null) {

                    String lcl = konversivolume.l_cl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+lcl+ " .</p>");

                }

                if (request.getParameter("L Ke ML") != null) {

                    String lml = konversivolume.l_ml(d);

                    out.println("<p> HASIL KONVERSI VOLUME: " +lml+ " .</p>");

                }

                if (request.getParameter("L Ke KL") != null) {

                    String lkl = konversivolume.l_kl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+lkl+ " .</p>");

                }

                if (request.getParameter("L Ke HL") != null) {

                    String lhl = konversivolume.l_hl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+lhl+ " .</p>");

                }
                
                if (request.getParameter("L Ke DAL") != null) {

                    String ldal = konversivolume.l_dal(d);
 
                    out.println("<p> HASIL KONVERSI VOLUME: "+ldal+ " .</p>");

                }
                if (request.getParameter("DL Ke KL") != null){

                    String dlkl = konversivolume.dl_kl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+dlkl+" .</p>");

                }  
                
                if (request.getParameter("DL Ke HL") != null) {

                    String dlhl = konversivolume.dl_hl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+dlhl+ " .</p>");

                }

                if (request.getParameter("DL Ke DAL") != null) {

                    String dldal = konversivolume.dl_dal(d);

                    out.println("<p> HASIL KONVERSI VOLUME: " +dldal+ " .</p>");

                }

                if (request.getParameter("DL Ke L") != null) {

                    String dll = konversivolume.dl_l(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+dll+ " .</p>");

                }

                if (request.getParameter("DL Ke CL") != null) {

                    String dlcl = konversivolume.dl_cl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+dlcl+ " .</p>");

                }
                
                if (request.getParameter("DL Ke ML") != null) {

                    String dlml = konversivolume.dl_ml(d);
 
                    out.println("<p> HASIL KONVERSI VOLUME: "+dlml+ " .</p>");

                }
                if (request.getParameter("CL Ke KL") != null){

                    String clkl = konversivolume.cl_kl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+clkl+" .</p>");

                }  
                
                if (request.getParameter("CL Ke HL") != null) {

                    String clhl = konversivolume.cl_hl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+clhl+ " .</p>");

                }

                if (request.getParameter("CL Ke HL") != null) {

                    String clhl = konversivolume.cl_hl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: " +clhl+ " .</p>");

                }

                if (request.getParameter("CL Ke DAL") != null) {

                    String cldal = konversivolume.cl_dal(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+cldal+ " .</p>");

                }

                if (request.getParameter("CL Ke L") != null) {

                    String cll = konversivolume.cl_l(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+cll+ " .</p>");

                }
                
                if (request.getParameter("CL Ke DL") != null) {

                    String cldl = konversivolume.cl_dl(d);
 
                    out.println("<p> HASIL KONVERSI VOLUME: "+cldl+ " .</p>");

                }
                 if (request.getParameter("CL Ke ML") != null){

                    String clml = konversivolume.cl_ml(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+clml+" .</p>");

                }  
                
                if (request.getParameter("ML Ke KL") != null) {

                    String mlkl = konversivolume.ml_kl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+mlkl+ " .</p>");

                }

                if (request.getParameter("ML Ke HL") != null) {

                    String mlhl = konversivolume.ml_hl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: " +mlhl+ " .</p>");

                }

                if (request.getParameter("ML Ke DAL") != null) {

                    String mldal = konversivolume.ml_dal(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+mldal+ " .</p>");

                }

                if (request.getParameter("ML Ke L") != null) {

                    String mll = konversivolume.ml_l(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+mll+ " .</p>");

                }
                
                if (request.getParameter("ML Ke DL") != null) {

                    String mldl = konversivolume.ml_dl(d);
 
                    out.println("<p> HASIL KONVERSI VOLUME: "+mldl+ " .</p>");

                }
                 if (request.getParameter("ML Ke CL") != null){

                    String mlcl = konversivolume.ml_cl(d);

                    out.println("<p> HASIL KONVERSI VOLUME: "+mlcl+" .</p>");

                }  
                
   } else {

                out.println("<center>");

                out.println("<p>Masukan Volume:</p>");

                out.println("<form method=\"get\">");

                out.println("<p><input type=\"text\" name=\"volume\" size=\"20\"></p>");

                out.println("<br/>");

                out.println("<br/>");

                out.println("<input type=\"submit\" name=\"KL Ke HL\" value=\"KL Ke HL\">"+ "<input type=\"submit\" name=\"KL Ke DAL\" value=\"KL Ke DAL\">"
                + "<input type=\"submit\" name=\"KL Ke L\" value=\"KL Ke L\">"+ "<input type=\"submit\" name=\"KL Ke DL\" value=\"KL Ke DL\">"
                + "<input type=\"submit\" name=\"KL Ke CL\" value=\"KL Ke CL\">"+ "<input type=\"submit\" name=\"KL Ke ML\" value=\"KL Ke ML\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"HL Ke KL\" value=\"HL Ke KL\">"+"<input type=\"submit\" name=\"HL Ke DAL\" value=\"HL Ke DAL\">"
                +"<input type=\"submit\" name=\"HL Ke L\" value=\"HL Ke L\">"+"<input type=\"submit\" name=\"HL Ke DL\" value=\"HL Ke DL\">"
                +"<input type=\"submit\" name=\"HL Ke CL\" value=\"HL Ke CL\">"+"<input type=\"submit\" name=\"HL Ke ML\" value=\"HL Ke ML\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"DAL Ke KL\" value=\"DAL Ke KL\">"+ "<input type=\"submit\" name=\"DAL Ke HL\" value=\"DAL Ke HL\">"
                +"<input type=\"submit\" name=\"DAL Ke L\" value=\"DAL Ke L\">"+"<input type=\"submit\" name=\"DAL Ke DL\" value=\"DAL Ke DL\">"
                +"<input type=\"submit\" name=\"DAL Ke CL\" value=\"DAL Ke CL\">"+"<input type=\"submit\" name=\"DAL Ke ML\" value=\"DAL Ke ML\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"L Ke KL\" value=\"L Ke KL\">"+ "<input type=\"submit\" name=\"L Ke HL\" value=\"L Ke HL\">"
                +"<input type=\"submit\" name=\"L Ke DAL\" value=\"L Ke DAL\">"+"<input type=\"submit\" name=\"L Ke DL\" value=\"L Ke DL\">"
                +"<input type=\"submit\" name=\"L Ke CL\" value=\"L Ke CL\">"+"<input type=\"submit\" name=\"L Ke ML\" value=\"L Ke ML\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"DL Ke KL\" value=\"DL Ke KL\">"+ "<input type=\"submit\" name=\"DL Ke HL\" value=\"DL Ke HL\">"
                +"<input type=\"submit\" name=\"DL Ke DAL\" value=\"DL Ke DAL\">"+"<input type=\"submit\" name=\"DL Ke L\" value=\"DL Ke L\">"
                +"<input type=\"submit\" name=\"DL Ke CL\" value=\"DL Ke CL\">"+"<input type=\"submit\" name=\"DL Ke ML\" value=\"DL Ke ML\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"CL Ke KL\" value=\"CL Ke KL\">"+ "<input type=\"submit\" name=\"CL Ke HL\" value=\"CL Ke HL\">"
                +"<input type=\"submit\" name=\"CL Ke DAL\" value=\"CL Ke DAL\">"+"<input type=\"submit\" name=\"CL Ke L\" value=\"CL Ke L\">"
                +"<input type=\"submit\" name=\"CL Ke DL\" value=\"CL Ke DL\">"+"<input type=\"submit\" name=\"CL Ke ML\" value=\"CL Ke ML\">");
                out.println("<br/>");
                out.println("<br/>");
                 out.println("<input type=\"submit\" name=\"ML Ke KL\" value=\"ML Ke KL\">"+ "<input type=\"submit\" name=\"ML Ke HL\" value=\"ML Ke HL\">"
                +"<input type=\"submit\" name=\"ML Ke DAL\" value=\"ML Ke DAL\">"+"<input type=\"submit\" name=\"ML Ke L\" value=\"ML Ke L\">"
                +"<input type=\"submit\" name=\"ML Ke DL\" value=\"ML Ke DL\">"+"<input type=\"submit\" name=\"ML Ke CL\" value=\"ML Ke CL\">");
               
                out.println("</center>");

                out.println("</form>");
            
	}
        
        
		} finally {
            
		out.println("</center>");
            
		out.println("</body>");
            
		out.println("</html>");
            
		out.close();
        
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
        processRequest(request, response);
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
