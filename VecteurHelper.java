/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_igl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ALGER
 */
class VecteurHelper {
    /*une classe qui assure des opérations sur les vecteurs qui sont:
    trier un vecteur
    inverser les éléments d'un vecteur
    donner la somme de deux vecteurs
    appliquer une fonction sur les élements d'un vecteur
    donner le maximum et le minimum d'un vecteur simultanément
    
    
    */
    static public ArrayList<Integer> Trier(ArrayList<Integer> vect1)
    {//une méthode qui trie un vecteur donner en entré de cette fonction
    Collections.sort(vect1);//trier le vecteur en utilisant la méthode sort pour les collections 
    return(vect1);//retourner le vecteur aprés avoir le trier 
   
    }
            
      static int fonction(int p)
      {//cette fonction appliue une certain formules sur un entier donner en entré
          
          
          return(p*2);//retourner l'élément aprés avoir le trier
      
      
      }
            
            
            
            
            
 static public ArrayList<Integer> SommerVecteur(ArrayList<Integer> vect1,ArrayList<Integer> vect2)throws TailleException
 { /*une fonction ui retourne un vecteur qui contient la somme des deux vecteurs*/
     
     ArrayList<Integer> vect3 =new ArrayList<Integer>();//déclaration de la liste qui cintient le résultat de la somme
     int ind=0;//indice des éléments dans la nouvelle liste
     if(vect1.size()!= vect2.size())//test qui la taille des deux listes est différente
     {
         System.out.println("les deux vecteurs ont des tailles différentes ! vous pouvez pas faire la somme");//afficher qu'on peut pas faire la somme des deux vecteurs
         throw new TailleException();//générer une excdeption si la taille est différente
     }
     else{//sinon on peut faire la somme
    int indice;//un indice pour parcourir les deux vecteurs
 
    for(indice=0;indice<vect1.size();indice++)//boucle pour parcourir les deux vecteurs
    { 
     ind  = vect1.get(indice)+vect2.get(indice);//effectuer la somme entre les deux éléments des deux vecteurs
     vect3.add(ind);//ajouter la somme obtenue a la nouvelle liste
 
    }
    return(vect3); //retourner la liste qui contient la somme 
 }
 
 
 
 }
 
static public ArrayList<Integer> InverserVecteur(ArrayList<Integer> vect1)
{//une méthode qui inverse un vecteur
    
    ArrayList<Integer> vect3 =new ArrayList<Integer>();//le vecteur qui contient le résultat d'inversement de la liste
int taille=vect1.size();//récuperer la taille du vecteur
int i;//indice pour parcourir la liste
for(i=taille-1;i>=0;i--)//parcourir la liste en commencant par le dernier élément pour l'inverser
{
vect3.add(vect1.get(i));//inverser les éléments du vecteur

}
return(vect3);//retourner le vecteur inverser


}
static public void MaxMinVector(ArrayList<Integer> vect1)
{//une méthode qui affiche le minimum et le maximun d'un vecteur
int max=vect1.get(0);//initialiser le max par la premier valeur du vecteur
int min=vect1.get(0);//initialiser le min par le permier valeur du vectuer
int taille=vect1.size();//récuperer la taille de vecteur
for(int i=1;i<taille;i++)//une boucle pour parcourir la liste
{
if(vect1.get(i)>max)//si l'élément courant est supérieur au max 
{
    max=vect1.get(i);//je mets a jour le max
}
if(vect1.get(i)<min)//si l'élément courant est inférieur au min
{
    min=vect1.get(i);//je mets a jour le min
}
}
System.out.println("le maximum de vecteur :"+max);//afficher le maximun du vecteur
System.out.println("le minimum de vecteur :"+min);//afficher le minimum du vecteur



}

static ArrayList<Integer> FonctionVecteur(ArrayList<Integer> vect1)
{//une méthode qui applique une fonction aux éléments du vecteur
ArrayList<Integer> vect3 =new ArrayList<Integer>();//le vecteur qui contient les éléments du vecteur aprés l'application de la fonction
for(int i=0;i<vect1.size();i++)//parcourir le vecteur
{
    vect3.add(fonction(vect1.get(i)));//appliquer la fonction aux élément courant
}
return(vect3);//retourner le vecteur qui contient les valeurs transformés

}



}
     
    
    
