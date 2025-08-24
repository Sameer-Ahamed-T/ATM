import java.util.*;
import java.util.Scanner;
class Informations
{
    private String Name;
    private int password;
    private int balance;
    public int Accountnumber;
    public int deposit;
    public int withdrawl;
    Informations(String Name,int Accountnumber,int password,int balance)
    {
      this.Name=Name;
      this.Accountnumber=Accountnumber;
      this.password=password;
      this.balance=balance;
    }
    int Deposit()
    {
      Scanner ew=new Scanner(System.in);
      System.out.println("Enter the amount to deposit:");
      deposit=ew.nextInt();
      balance +=deposit;
      return balance;
    }
    int Withdrawl()
    {  
      Scanner re=new Scanner(System.in);
      System.out.print("Enter the amount to withdrawl:");
      withdrawl=re.nextInt();
      if(withdrawl>balance)
      {
          System.out.println("Insufficient Fund");
          return;
      }
      balance-=withdrawl;
      return balance;
    }
}
class ATM_machine
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String Name;int Acc_no;int password;int balance;
    String n;
    System.out.print('Enter the File Name:");
    n=sc.next();
    int h=0;
    String f=n+".txt";
    Informations[] I=new Informations[100];
    if(f==null)
    {
        File fw=new File(f);
        System.out.println("Enter the Details:");
        System.out.print("Enter the Name:");
        Name=sc.nextLine();
        System.out.print("Enter the Account Number:");
        Acc_no=sc.nextInt();
        System.out.print("Enter the Password:");
        password=sc.nextInt();
        System.out.println("Enter the Balance:");
        balance=sc.nextInt();
        I[h]=new Informations(Name,Acc_no,password,balance);
        h+=1;
    }
    int k;
    int j=-1;
    System.out.print("Enter the Account Number:");
    k=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        if(I[i].Accountnumber==k)
                j=i;
    }
    if(j==-1)
    {  
        System.out.println("Not Found");
        return;
    }
    int c;
    System.out.print("Enter your choice:\n1.Deposit\n2.Withdrawl\n3.Mini Statement\n4.Exit\nEnter:");
    c=sc.nextInt();
    switch(c)
    {
        case 1:
              int y=I[j].Deposit();
              FileWriter fin=new FileWriter(f);
              fin.write(y);
              break;
        case 2:
              I[j].Withdrawl();
              FileWriter fout=new FileWriter(f);
              fout.write(y);
              break;
        case 3:
              FileWriter fout=new FileReader(f);
              while((fout.ReaderLine())!=null)
                  {
                      string g=fout.read();
                      System.out.println(g);
                  }
              break;
        case 4:
              return 0;
        default:
              System.out.println("Wrong Input");break;
    }
}
