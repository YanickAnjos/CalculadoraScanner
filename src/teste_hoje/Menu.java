/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_hoje;

import java.util.Scanner;

/**
 *
 * @author UserPL022Pc07
 */
public class Menu {

    int luz;
    int agua;
    int renda;
    int gas;
    
    int soma;

    public Menu() {
        
      
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduza o valor da agua!\n");
        agua = sc.nextInt();
        System.out.println("Introduza o valor da luz!\n");
        luz = sc.nextInt();
        System.out.println("Introduza o valor do gas!\n");
        gas = sc.nextInt();
        System.out.println("Introduza o valor da renda\n");
        renda = sc.nextInt();

        
        soma = luz + agua + renda + gas ;
        
        System.out.println("<!> O Total das sua Despesas são:<!> " + soma);
        

    }

}
