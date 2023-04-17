//Book shop app  about oop 
package com.mycompany.oop_project2;

import java.util.*;

public class Oop_project2 {

     public static Scanner reedval = new Scanner (System.in);
     
    public static void main(String[] args) {
     
         
        boolean ismenu = true ;
       // هعمل لوب بتطلعلي الخيارات باستمرار 
        while (ismenu ){
            System.out.println("-----main menu------");
            System.out.println("1-diplay book all book");
            System.out.println("2-add book ");
            System.out.println("3-update book ");
            System.out.println("4-delete book ");
            System.out.println("5-search book");
            System.out.println("6-exit");
            System.out.println("enter your choice ");
            
            
       int choise =0 ;
          try{
             choise=reedval.nextInt();
      }
         catch ( InputMismatchException e){
             System.out.println(" please inter a  number not text");
         //    عشان لو المستخدم دخل نص وليس رقم 
         }
         
       switch  (choise  ){
            case 1://print all boook 
                //صغرت الكود زخليت عملية الاستدعاء وانشاء مصفوفه وغيره ف الكلاس 
                Book.display_all_book();
                break ;
                case 2://add book  
                Book.add_book();
                
                break ;

                case 3://Update book 
                Book.update_allbook_proprity();
                    
                    break;
                case 4 ://delete book 
                    
                    System.out.println("enter book name ");
                    String serbookname= reedval.next();
                    Book boook = Book.getbookbyname(serbookname );
                    if (boook == null)
                        System.out.println("there is no book with this name");
                    else 
                    {
                if (Book.deletbook(boook)){
                
                    System.out.println("deleted succsseful ");
                
                }else 
                    System.out.println("succsseful faild ");
                    
                    }
                 break;
                case 5 ://search and display 
                    
                     System.out.println("enter book name ");
                    String serbookName= reedval.next();
                    Book booksr = Book.getbookbyname(serbookName );
                    if (booksr == null)
                        System.out.println("there is no book with this name");
                    else 
                    {
                       Book.searchbook(booksr);

                    }
                    break;
                    
                case 6 ://exit form app
                    exitformapp();
                    
                    
}
}
}
public static void exitformapp(){
System.exit(0);//بتخرجني برا البرنامج

}


}

