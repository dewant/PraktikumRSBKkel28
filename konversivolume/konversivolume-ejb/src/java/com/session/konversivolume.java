/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ASUS
 */
@Stateless
@LocalBean
public class konversivolume {
DecimalFormat a = new DecimalFormat("0.00");
DecimalFormat a2 = new DecimalFormat("0.00");
DecimalFormat a3 = new DecimalFormat("0.000");
DecimalFormat a4 = new DecimalFormat("0.0000");
DecimalFormat a5 = new DecimalFormat("0.00000");
DecimalFormat a6 = new DecimalFormat("0.000000");
DecimalFormat a7 = new DecimalFormat("0.000000");
String result;
    public String kl_hl(double param) {
        return result = a.format((param) * 10);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String kl_dal(double param) {
        return result = a.format((param) * 100);
    }

    public String kl_l(double param) {
        return result = a.format((param) * 1000);
    }

    public String kl_dl(double param) {
       return result = a.format((param) * 10000);
    }

    public String kl_cl(double param) {
       return result = a.format((param) * 100000);
    }

    public String kl_ml(double param) {
        return result = a.format((param) * 1000000);
    }

    public String hl_kl(double param) {
        return result = a3.format((param) * 0.1);
    }

    public String hl_dal(double param) {
       return result = a.format((param) * 10);
    }

    public String hl_l(double param) {
        return result = a.format((param) * 100);
    }

    public String hl_dl(double param) {
        return result = a.format((param) * 1000);
    }

    public String hl_cl(double param) {
       return result = a.format((param) * 10000);
    }

    public String hl_ml(double param) {
        return result = a.format((param) * 100000);
    }

    public String dal_l(double param) {
        return result = a.format((param) * 10);
    }

    public String dal_dl(double param) {
       return result = a.format((param) * 100);
    }

    public String dal_cl(double param) {
       return result = a.format((param) * 1000);
    }

    public String dal_ml(double param) {
       return result = a.format((param) * 10000);
    }

    public String dal_kl(double param) {
        return result = a5.format((param) * 0.01);
    }

    public String dal_hl(double param) {
        return result = a5.format((param) * 0.1);
    }

    public String l_dl(double param) {
       return result = a3.format((param) * 10);
    }

    public String l_cl(double param) {
        return result = a.format((param) * 100);
    }

    public String l_ml(double param) {
        return result = a.format((param) * 1000);
    }

    public String l_kl(double param) {
        return result = a5.format((param) * 0.001);
    }

    

    public String l_dal(double param) {
      return result = a3.format((param) * 0.1);
    }

    public String dl_kl(double param) {
        return result = a6.format((param) * 0.0001);
    }

    public String dl_hl(double param) {
        return result = a5.format((param) * 0.001);
    }

    public String dl_dal(double param) {
       return result = a4.format((param) * 0.01);
    }

    public String dl_l(double param) {
        return result = a3.format((param) * 0.1);
    }

    public String dl_cl(double param) {
        return result = a.format((param) * 10);
    }

    public String dl_ml(double param) {
        return result = a.format((param) * 100);
    }

    public String cl_kl(double param) {
        return result = a6.format((param) * 0.00001);
    }

    public String cl_hl(double param) {
        return result = a6.format((param) * 0.0001);
    }

    public String cl_dal(double param) {
        return result = a5.format((param) * 0.001);
    }

    public String cl_l(double param) {
        return result = a4.format((param) * 0.01);
    }

    public String cl_dl(double param) {
        return result = a3.format((param) * 0.1);
    }

    public String cl_ml(double param) {
        return result = a.format((param) * 10);
    }

    public String ml_kl(double param) {
        return result = a7.format((param) * 0.000001);
    }

    public String ml_hl(double param) {
        return result = a6.format((param) * 0.00001);
    }

    public String ml_dal(double param) {
        return result = a5.format((param) * 0.0001);
    }

    public String ml_l(double param) {
        return result = a4.format((param) * 0.001);
    }

    public String ml_dl(double param) {
        return result = a3.format((param) * 0.01);
    }

    public String ml_cl(double param) {
        return result = a3.format((param) * 0.1);
    }

    public String l_hl(double param) {
        return result = a4.format ((param) * 0.01);
    }
    
}
