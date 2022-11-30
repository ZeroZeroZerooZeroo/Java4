import java.util.Scanner;

class Car{
     	String color;
	int price_car;
	String brand;

     public Car(String color, int price_car, String brand){
         this.color=color;
         this.price_car=price_car;
         this.brand=brand;
     }

     public Car(String color){
         this.color=color;
         price_car=0;
         brand="brand";
     }

     public Car(){
         color="color";
         price_car=0;
         brand="brand";
     }

     public void input(Scanner in){
         System.out.println("Введите цвет машины: ");
         this.color=in.next();
         System.out.println("Введите цену машины: ");
         this.price_car=in.nextInt();
         System.out.println("Введите марку машины: ");
         this.brand=in.next();
     }

     public void conclusion(){
         System.out.println("Цвет машины - " + color + ", Цена машины - " + price_car + ", Марка мишины - " + brand);
     }
}

