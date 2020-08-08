/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2;

/**
 *
 * @author ELCOT
 */
public class bankaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account c1=new Account("pk520","Adhi");
        Account c2=new Account("pk560","Dia",c1.balance);
        System.out.println("\nCUSTOMER 1 DETAILS:\n");
        System.out.println("\nID:"+(c1.getid()));
        System.out.println("\nName:"+(c1.getname()));
        System.out.println("\nInitial balance:Rs."+(c1.getbalance()));
        System.out.println("\n============");
        System.out.println("\nCUSTOMER 2 DETAILS:");
        System.out.println("\nID:"+(c2.getid()));
        System.out.println("\nName:"+(c2.getname()));
        System.out.println("\nInitial balance:Rs."+(c2.getbalance()));
        System.out.println("\n============");
        System.out.println("\nBalance after Credit in customer 1's account:");
        System.out.println("Rs."+(c1.credit(1500)));
        System.out.println("\nBalance after Debit customer 1's account:");
        System.out.println("Rs."+(c1.debit(500)));
        System.out.println("\n============");
        System.out.println("\nBalance of customer "+(c1.getname()+"\nRs."+(c1.getbalance())));
        c1.transferto(c2,450);
        
        System.out.println("\n============");
        System.out.println("\nAFTER TRANSACTION CUSTOMER DETAILS:");
        
        //1st customer
        System.out.println("\n============");
        System.out.println("\nCUSTOMER 1:");
        System.out.println(c1.toString());
        
        //2nd customer
        System.out.println("\n============");
        System.out.println("\nCUSTOMER 2:");
        System.out.println(c2.toString());

    }
    
}
class Account
{
    String id,name;
    int balance=0;
    Account(String i,String n)
    {
        id=i;
        name=n;
    }
    Account(String i,String n,int b)
    {
        id=i;
        name=n;
        balance=b;
    }
    String getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getbalance()
    {
        return balance;
    }
    int credit(int amount)
    {
        balance+=amount;
        return balance;
    }
    int debit(int amount)
    {
        if(amount<=balance)
            balance-=amount;
        else
            System.out.println("Amount exceeded balance!!");
        return balance;
    }
    int transferto(Account Acc1,int amount)
    {
        if(amount<=balance)
            Acc1.balance=amount;
        else
            System.out.println("Amount exceeded balance!!");
        return balance;
            
    }
    @Override
    public String toString()
    {
        return("\nID: "+id+"\nName: "+name+"\nBalance: Rs."+balance);
    }
}