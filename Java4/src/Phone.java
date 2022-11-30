import java.util.Scanner;

class Phone{
     	String name_phone;
	int price_phone;
	String cover_color;

     public Phone(String name_phone, int price_phone, String cover_color){
         this.name_phone=name_phone;
         this.price_phone=price_phone;
         this.cover_color=cover_color;
     }

     public Phone(String name_phone){
         this.name_phone=name_phone;
         price_phone=0;
         cover_color="cover_color";
     }

     public Phone(){
         name_phone="name_phone";
         price_phone=0;
         cover_color="cover_color";
     }

     public void input(Scanner in){
         System.out.println("Введите марку телефона: ");
         this.name_phone=in.next();
         System.out.println("Введите цену телефона: ");
         this.price_phone=in.nextInt();
         System.out.println("Введите цвет чехла: ");
         this.cover_color=in.next();
     }

     public void conclusion(){
         System.out.println("Марка телефона - " + name_phone + ",  Цена телефона - " + price_phone + ", Цвет чехла телефона - " + cover_color);
     }
}

