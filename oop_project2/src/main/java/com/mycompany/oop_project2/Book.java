
package com.mycompany.oop_project2;

import static com.mycompany.oop_project2.Oop_project2.exitformapp;
import static com.mycompany.oop_project2.Oop_project2.reedval;
import java.util.ArrayList;

import java.util.InputMismatchException;


public   class Book {
   private String  name ;
   private String auther ;
   private double price;
    
public  Book (){}
  //هخزن فيها الكتب  
        
     static  ArrayList<Book >booklist=new ArrayList(100);

    public Book(String name, String auther, double price) {
        this.name = name;
        this.auther = auther;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public static  void display_all_book(){
    
    ArrayList <Book >listbook =Book.booklist;
                //خزنت المصفوفه بتاعتي ف في  متغير عشان سهولة الاستخدام
                if (listbook.isEmpty()){
                    System.out.println("there is no book  ");
                }
                else{
                    
                for (Book b :listbook){
                    System.out.println("name : "+b.getName()+"    "+"Author : "+b.getAuther()+"   "+"Price :  "+b.getPrice());
                }
                }
    }
    public static void add_book (){
    
     //هاخد الداتا من المستخدم عشان اقدر اضيف الكتاب
                System.out.println("enter count of books ");
                
                
                int countbook = 0 ;
                try{ countbook =reedval.nextInt();}catch(InputMismatchException e ){
                    System.out.println(" enter a number not text");
                
                }
                if (countbook  ==0){
                    System.out.println(" not valid ,count must be >0");
                }
                else 
                {
                    
                   for (int i =0 ; i < countbook ; i++){
                          System.out.println("enter book   "+(i+1)+" price  ");
                        double bookprice  =reedval.nextDouble();
                    
                        System.out.println("enter book   "+(i+1)+" name ");
                        String bookname =reedval.next();
                            System.out.println("enter book   "+(i+1)+" author ");
                        String bookauthor =reedval.next();
                     
                Book b =new Book ();
                   b.setName(bookname );
                   b.setAuther(bookauthor );
                   b.setPrice(bookprice);
               
                Book.booklist.add(b);
                   }
    
                }
                
                
                
    
    }
    
    
    public static Book getbookbyname (String name ){
    for (Book b2 : booklist){//بيدور علي كتاب معين من خلال اسمه 
        if (b2.name.equals(name  ))
            return b2;
    
    
    }
     
    return null; 
    }
   
    
    
    public static boolean  updatebookname (Book oldbook ,Book newbook ){//هاخد القديم والجديد عشان ابدلهم واحذف القديم 
 //update just for name 
        if(booklist.size()>0){
              int index = -1;
    for(int i=0 ;i<booklist.size ();i++){//بحاول اجيب ترتيب العنصرعشان اعرف هغير اي 
    
     if (   booklist.get(i).getName().equals(oldbook.getName())){
    index =i;
    break;
    }
    
    if (index!=-1 ){
    booklist.get(index).setName(newbook.getName() );
    booklist.get(index).setAuther(newbook.getAuther() );
    booklist.get(index).setPrice(newbook.getPrice() );
    
    //بكده انا حولت القديم ل الجديد يعتبر مسحته 
    return true ;
    }
    
    
    }
  
    }
 return false; 
    }
    public static boolean  updatebookauthor  (Book oldbook ,Book newbook ){//هاخد القديم والجديد عشان ابدلهم واحذف القديم 
 //update just for author 
        if(booklist.size()>0){
              int index = -1;
    for(int i=0 ;i<booklist.size ();i++){//بحاول اجيب ترتيب العنصرعشان اعرف هغير اي 
    
     if (   booklist.get(i).getName().equals(oldbook.getName())){
    index =i;
    break;
    }
    
    if (index!=-1 ){
    booklist.get(index).setAuther(newbook.getAuther() );
    
    return true ;
    }
    }
    }
 return false; 
    }
    
    public static boolean  updatebookprice  (Book oldbook ,Book newbook ){//هاخد القديم والجديد عشان ابدلهم واحذف القديم 
 //update just for price  
        if(booklist.size()>0){
              int index = -1;
    for(int i=0 ;i<booklist.size ();i++){//بحاول اجيب ترتيب العنصرعشان اعرف هغير اي 
    
     if (   booklist.get(i).getName().equals(oldbook.getName())){
    index =i;
    break;
    }
    
    if (index!=-1 ){
    booklist.get(index).setPrice(newbook.getPrice());
    
    return true ;
    }
    }
    }
 return false; 
    }
    public static boolean  deletbook (Book ddbook){//delet book
        if (!booklist.isEmpty()){
       booklist.remove(ddbook );
    return true;
        }
    return false;
    
    
    
    }
     public static boolean searchbook (Book b){
    for (Book b5 : booklist ){
        if (b5.getName().equals(b.getName())){
            System.out.println("name:"+""+b.getName()+"   "+"author:"+" "+b.getAuther()+"   "+"price:"+""+b.getPrice());
        return true ;
        }
    
    }
     
     
     return false;
     }
    
     
  public static void update_allbook_proprity (){
  boolean ismenu= true;
                    while (ismenu ){
                        System.out.println("----Update menu-----");
                        System.out.println("1-Update  book name  ");
                        System.out.println("2-Update book auther  ");
                        System.out.println("3-Update book price ");
                        System.out.println("4-back to main menu");
                        System.out.println("5- exit");
                        System.out.println("enter your choise ");
                        int updatechoise= 0;
                        try { updatechoise =reedval.nextInt();}
                        catch (InputMismatchException e){
                        System.out.println("please inter number  not text ");}
                        
                        switch (updatechoise){
                            case 1 ://update bookname 
                                System.out.println("enter book name  ");
                            String upbookname =reedval.next();
                            Book oldbook =Book.getbookbyname(upbookname);//الكتاب الاصلي 
                            Book newbook =Book.getbookbyname(upbookname);//نسخه من الكتاب الاصلي 
                            if (oldbook  ==null)
                                    System.out.println("there is no book with this name ");
                            else {
                                System.out.println("enter new book name ");
                                String newname =reedval.next();
                                newbook .setName(newname );
                               Book.updatebookname(oldbook, newbook);
                                System.out.println("updated succssefly");
                             
                             
                            }
                            break ;
                            case 2 : //update book author
                               //مينفعش ابحث عن الكتاب بواستطة المؤلف عشان ممكن يكون هناك مؤلف واحد ل اكثر من كتاب 
                                  System.out.println("enter book name  ");
                            upbookname =reedval.next();
                           oldbook =Book.getbookbyname(upbookname);//الكتاب الاصلي 
                             newbook =Book.getbookbyname(upbookname);//نسخه من الكتاب الاصلي 
                            if (oldbook  ==null)
                                    System.out.println("there is no book with this name ");
                            else {
                                System.out.println("enter new book author");
                                String newauthor =reedval.next();
                                newbook .setAuther(newauthor);
                               Book.updatebookname(oldbook, newbook);
                                System.out.println("updated succssefly");
                          
                      
                        }
                          break ;
                            case 3 : //update book price 
                                
                                  System.out.println("enter book name  ");
                               upbookname =reedval.next();
                             oldbook =Book.getbookbyname(upbookname);//الكتاب الاصلي 
                             newbook =Book.getbookbyname(upbookname);//نسخه من الكتاب الاصلي 
                            if (oldbook  ==null)
                                    System.out.println("there is no book with this name ");
                            else {
                                System.out.println("enter new book price");
                               double newprice  =reedval.nextDouble();
                                newbook .setPrice(newprice);
                               if (Book.updatebookname(oldbook, newbook)){//return true 
                                    System.out.println("updated succssefly");
                               }
                               else {
                                    System.out.println("updated falied");
                               
                            }
                          
                            }
                               break ;
                            case 4 : //لو عاوز اخرج من قايمة التحديث
                                
                                ismenu =false;
                             break ;
                             
                             
                            case 5 ://eixt fom app 
                                exitformapp();
                                break ;
                                
                        } //update switch 
                  
                    }//update whiel 
  
  }
    
}
