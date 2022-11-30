import java.util.Scanner;

class House{
     	int area;
	int price_home;

     public House(int area, int price_home){
         this.area=area;
         this.price_home=price_home;
     }

     public House(int area){
         this.area=area;
         price_home=0;
     }

     public House(){
         this.area=0;
         this.price_home=0;
     }

     public void input(Scanner in){
         System.out.println("Введите площадь дома(Кв. м.): ");
         this.area=in.nextInt();
         System.out.println("Введите цену дома: ");
         this.price_home=in.nextInt();
     }

     public void conclusion(){
         System.out.println("Площадь дома(Кв. м.) - " + area + ", ВЦена дома - " + price_home);
     }
}

