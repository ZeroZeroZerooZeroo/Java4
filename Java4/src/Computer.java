import java.util.Scanner;

class Computer{
     	String body_color;
	int computer_price;
	String gaming;

     public Computer(int computer_price, String body_color, String gaming){
	this.computer_price = computer_price;
	this.body_color = body_color;
	this.gaming = gaming;
     }

     public Computer(String body_color){
	computer_price = 0;
	this.body_color = body_color;
	gaming = "gaming";
     }

     public Computer(){
	computer_price = 0;
	body_color = "body_color";
	gaming = "gaming";
     }

     public void input(Scanner in){
         System.out.println("Введите цену компьютера: ");
         this.computer_price=in.nextInt();
         System.out.println("Введите цвет корпуса компьютера: ");
         this.body_color=in.next();
         System.out.println("Ваш компьютер игровой? ");
         this.gaming=in.next();
     }

     public void conclusion(){
         System.out.println("Цена компьютера - " + computer_price + ",   Цвет корпуса компьютера - " + body_color + ", Ваш компьютер игровой? -  " + gaming);
     }
}

