/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.math.numbers;

/**
 *
 * @author canvera
 */
public class GCD {
    static int gcd(int a,int b){
         int module;
         if(a>=b){
             module=a%b;
             if(module==0)
             {  return b;}
             else { return gcd(b,module);
             
         }
         }
         else{
              module=b%a;                
             if(module==0)
                 { return a;}
             else { return gcd(a,module);     }
         }
     }
    public static void main(String[] args) {
        
        System.out.println(gcd(91,97));
        
    }
    
}
