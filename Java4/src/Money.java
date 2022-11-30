import java.util.Scanner;

class Money{

     	int income1;
	int income2;
	int expenses;

     public Money(int income1, int income2, int expenses){
         this.income1=income1;
         this.income2=income2;
         this.expenses=expenses;
     }

     public Money(int income1){
         this.income1=income1;
         income2=0;
         expenses=0;
     }

     public Money(){
         income1=0;
         income2=0;
         expenses=0;
     }

     public void input(Scanner in){
         System.out.println("Введите ваш доход 1 за месяц: ");
         this.income1=in.nextInt();
         System.out.println("Введите ваш доход 2 за месяц: ");
         this.income2=in.nextInt();
         System.out.println("Введите ваш расход за месяц: ");
         this.expenses=in.nextInt();
     }

     public void conclusion(){
         System.out.println("Ваш доход 1 за месяц - " + income1 + ", Ваш доход 2 за месяц - " + income2 + ", Ваш расход за месяц -  " + expenses);
     }
    public void Help(help sum){
        sum.res=income1+income2-expenses;
        System.out.println("Общий доход - расход:"+ sum.res);
    }
}

