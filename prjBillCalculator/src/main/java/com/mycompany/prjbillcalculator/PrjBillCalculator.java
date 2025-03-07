/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbillcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author Clayton
 */
public class PrjBillCalculator {
        public static final double dblTip = 0.10;
    
    public static void main(String[] args) {
       String sDishName = "";
       double dblPrice = 0.0 , dblSubTotal = 0.0 , dblTipAmount = 0.0 , dblFinal = 0.0;
       int iQuantity = 0;
       
       sDishName = JOptionPane.showInputDialog(null,"Enter the dish name");
       dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the price of " + sDishName));
       iQuantity = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the quantity ordered"));
       
       dblSubTotal = calcSubtotal(dblPrice,iQuantity);
       dblTipAmount = calcTip(dblSubTotal);
       dblFinal = calcTotal(dblSubTotal,dblTipAmount);
       printInvoice(sDishName,dblSubTotal,dblTipAmount,dblFinal);
    }
    
    private static double calcSubtotal(double dblPrice , int iQuantity){
        return(dblPrice * iQuantity);
        
    }
    private static double calcTip(double dblSubTotal){
       return(dblSubTotal * dblTip); 
    }
    private static double calcTotal(double dblSubTotal , double dblTipAmount){
        return(dblSubTotal + dblTipAmount);
    }
    private static void printInvoice(String sDishName , double dblSubTotal , double dblTipAmount ,double dblFinal ){
        JOptionPane.showMessageDialog(null, "DISH NAME : " + sDishName + "\n SUBTOTAL : R" + dblSubTotal 
                                      + "\n TIP AMOUNT : R" + dblTipAmount + "\n FINAL TOTAL : R" + dblFinal);
    }

  
}

   
