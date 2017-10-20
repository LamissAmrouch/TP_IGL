/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_igl;

import java.util.ArrayList;

/**
 *
 * @author ALGER
 */
public class Tp_igl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TailleException
    {
        ArrayList<Integer> Vecteur1=new ArrayList<Integer>(); 
        ArrayList<Integer> resultat=new ArrayList<Integer>();
         ArrayList<Integer> resultat1=new ArrayList<Integer>();
          ArrayList<Integer> resultat2=new ArrayList<Integer>();
           ArrayList<Integer> Vecteur2=new ArrayList<Integer>();
           Vecteur1.add(1);
           Vecteur1.add(5);
           Vecteur1.add(7);
           Vecteur1.add(10);
           Vecteur1.add(198);
           Vecteur1.add(12);
           Vecteur1.add(17);
           Vecteur2.add(10);
           Vecteur2.add(55);
           Vecteur2.add(77);
           Vecteur2.add(1);
           Vecteur2.add(98);
           Vecteur2.add(2);
           Vecteur2.add(7);
           VecteurHelper.MaxMinVector(Vecteur1);
           resultat=VecteurHelper.InverserVecteur(Vecteur1);
           for(int i=0;i<resultat.size();i++)
           {System.out.println("  "+resultat.get(i));}
           System.out.println(" le somme ;");
           try{resultat1 =VecteurHelper.SommerVecteur(Vecteur1,Vecteur2);}
           catch(Exception e){}
                      for(int i=0;i<resultat1.size();i++)
           {System.out.println("  "+resultat1.get(i));}
               resultat =VecteurHelper.Trier(Vecteur1); 
                System.out.println(" le vecteur trier");
                          for(int i=0;i<Vecteur1.size();i++)
           {System.out.println("  "+Vecteur1.get(i));}
                           resultat2 =VecteurHelper.FonctionVecteur(Vecteur1); 
                System.out.println(" le vecteur aprés l'application de la fonction");
                           for(int i=0;i<resultat2.size();i++)
           {System.out.println("  "+resultat2.get(i));}
    }
    
}
