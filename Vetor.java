
package vetor;

import java.util.Scanner;

import java.util.*;

public class Vetor {
    
     public static void main(String a[])
    {
        Vector <Integer>meuVetor = new Vector();
        
        Scanner input = new Scanner(System.in);

        System.out.println("Tamanho do vetor será: ");
        int totalElem = input.nextInt();
        
        meuVetor.setSize(totalElem);
        
        meuVetor.removeAllElements();
        
        for(int i = 0; i < totalElem; i++)
	{
            
            System.out.println("Informe os valores do vetor:");
            int elemento = input.nextInt();
            meuVetor.addElement(elemento);
				
        }
        
        Enumeration <Integer>valores = meuVetor.elements();
        
        System.out.println("Os elementos são:");
        
        while(valores.hasMoreElements())
        {
            
            System.out.print(valores.nextElement() + " ");
            
        }

        System.out.println("\n");

        System.out.println("Em qual posição será: ");
        int indice = input.nextInt();
        
        System.out.println("Qual número será: ");
        int subsnum = input.nextInt();
        
        meuVetor.add(indice, subsnum);
        
        System.out.println("Os novos elementos são:");
        
        Enumeration <Integer>novosValores = meuVetor.elements();
        
        while(novosValores.hasMoreElements())
        {
            System.out.print(novosValores.nextElement() + " ");
        }

        System.out.println("\n");
    }
    
}
