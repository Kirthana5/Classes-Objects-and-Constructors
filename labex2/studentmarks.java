/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class studentmarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       //1st object
       student obj1=new student(1);
       obj1.getdata();
       obj1.calc();
       obj1.display(1);
       
       
       //2nd object
       student obj2=new student(2);
       obj2.getdata();
       obj2.calc();
       obj2.display(2);
       
       
       //3rd object
       student obj3=new student(3);
       obj3.getdata();
       obj3.calc();
       obj3.display(3);
       
       
       //4th object
       student obj4=new student(4);
       obj4.getdata();
       obj4.calc();
       obj4.display(4);
       
       
       //5th object
       student obj5=new student(5);
       obj5.getdata();
       obj5.calc();
       obj5.display(5);

    }
    
}
class student
{  
    int n;
    float m1,m2,m3,m4,m5;
    double tot,avg;
    student(int n)
    {
       System.out.println("\nEnter student details "+n+":");
    }
    void getdata()
    {
       Scanner val=new Scanner(System.in);
       System.out.println("Enter marks 1:");
       m1=val.nextFloat();
       System.out.println("Enter marks 2:");
       m2=val.nextFloat();
       System.out.println("Enter marks 3:");
       m3=val.nextFloat();
       System.out.println("Enter marks 4:");
       m4=val.nextFloat();
       System.out.println("Enter marks 5:");
       m5=val.nextFloat();
    }
    void calc()
    {
        tot=(double)m1+m2+m3+m4+m5;
        avg=tot/5;
    }
    void display(int n)
    {
        System.out.print("\nStudent no."+n+"\nMarks 1:"+m1+"\nMarks 2:"+m2+"\nMarks 3:"+m3+"\nMarks 4:"+m4+"\nMarks 5:"+m5+"\nTotal marks:"+tot+"\nAverage:"+avg+"\n");
    }
}
