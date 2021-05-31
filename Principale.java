import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.* ;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.* ;

import static java.util.Arrays.*;

public class Principale {

   /* public static void affichage_selectif (int [] t, Filtrage f){
     for (int val : t) if (f.filtre (val)) System.out.print (val + " * ") ;
            System.out.println () ;
    }*/

    public static void affichage_selectif (int [] t, IntPredicate f){
        for (int val : t) if (f.test(val)) System.out.print (val + " * ") ;
        System.out.println () ;
    }
   /* public static Boolean filtrageNegatifs (int n) { return n < 0 ; }
    public static Boolean filtragePositifs (int n) { return n > 0 ; }
    public static Boolean filtragePairs (int n) { return 2*(n/2)==n ; }*/

    public static void main (String [] args)
    { int [] tab = {1, 4, -2, 9, -3, 5, -3, 12, 7,-11, 0, 6 } ;
      //  System.out.print ("-- Les positifs de tab : ") ;
     //   affichage_selectif (tab, ee -> ee >0) ;
       ArrayList<Integer> a = Stream.of(tab).map(x -> x + 33).filter(x -> x > 0).collect(Collectors.toList());
        System.out.println(a);
        /*affichage_selectif (tab, Affichage::filtragePositifs) ;
        System.out.print ("-- Les negatifs de tab : ") ;
        affichage_selectif (tab, Affichage::filtrageNegatifs) ;
        affichage_selectif (tab, ee -> ee <0) ;
        System.out.print ("-- Les pairs de tab : ") ;
        affichage_selectif (tab, Affichage::filtragePairs) ;
        affichage_selectif (tab, ee -> ee%2==0) ;*/
    }
    /*public static void main (String args[]){

        int [] tab = { 3, 5, -3, 8, 12, 4, 7, 4, 8, 3 } ;

        long nb = IntStream.of(tab).filter(xx -> xx>0).count() ; // 1
        System.out.println ("nb = " + nb) ;

        IntStream.of(tab).filter(xx -> xx >3).sorted() // 2
                .forEach(xx -> System.out.print (xx + " ")) ;
                 System.out.println();

        IntStream.of(tab).filter(xx -> xx>3).sorted().distinct() // 3
                .forEach(xx -> System.out.print (xx + " ")) ;

        int s =IntStream.of(tab).map(xx -> Math.abs(xx)) // 4
                .map(xx -> xx * xx).sum() ;
        System.out.println ("\nresultat = " + s) ;
    }*/
}
