package com.mycompany.desafio04;

/*
 usuário insere 10 números
e tu vai ordenar
mas agora tem que descobrir qual maior gap entre eles ordenados
 */

public class Programa {

    public static void main(String[] args) {
        Solucao sol = new Solucao();

        sol.PegandoNumeros();  
        
        sol.FirstSort();

        System.out.println(sol.firstNumber);
        
        sol.DiferecaNumeros();  
        
        sol.BigDiference();
    }

}
