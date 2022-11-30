import java.util.Scanner;
import java.util.*;

public class Main{

    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int funct = 0;
        help res = new help();
        Money money = new Money(0, 0, 0);
        Phone phone = new Phone("name_phone", 0, "cover_color");
        Car car = new Car("color", 0, "brand");
        House house = new House(0, 0);
        Computer computer = new Computer(0, "body_color", "gaming");
        Business_calculator your_bc_1 = new Business_calculator(money, phone, car, house, computer);
        ArrayList<Business_calculator> your_bc = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            your_bc.add(new Business_calculator(money, phone, car, house, computer));
            your_bc.get(i).input(in);
            your_bc.get(i).conclusion();
        }

        your_bc.clear();
        your_bc_1.input(in);

        while (funct != 6) {
            System.out.println("Нажмите:");
            System.out.println(" 1 - для вывода чек листа ");
            System.out.println(" 2 - для подсчета общего дохода ");
            System.out.println(" 3 - для подсчета общего времени работы,чтобы накопить ");
            System.out.println(" 4 - для подсчета общей стоимости вещей ");
            System.out.println(" 5 - для Возврата целочисленного значения из метода через вспомогательный класс ");
            System.out.println(" 6 - выхода");
            funct = in.nextInt();
            switch (funct) {
                case 1:
                    your_bc_1.conclusion();
                    break;
                case 2:
                    your_bc_1.total_income(your_bc_1);
                    break;
                case 3: {
                    your_bc_1.work(your_bc_1);
                    break;
                }
                case 4:{
                    your_bc_1.total_price(your_bc_1);
                    break;
                }
                case 5:
                    your_bc_1.Help(res);
                    break;
            }
        }
        System.gc();
        in.close();
    }
}
