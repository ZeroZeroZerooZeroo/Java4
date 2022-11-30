import java.util.Scanner;

class Business_calculator{
     	Money money;
	Car car;
	Phone phone;
	House house;
	Computer computer;

     public Business_calculator(Money money, Phone phone, Car car, House house, Computer computer){
         this.money = money;
         this.phone = phone;
         this.car = car;
         this.house = house;
         this.computer = computer;
     }
     public Business_calculator(Money money){
         this.money = money;
     }

     public Business_calculator(){
     }

     public void input(Scanner in){
         money.input(in);
         phone.input(in);
         car.input(in);
         house.input(in);
         computer.input(in);
     }

    public void Help(help sum){
        sum.res=money.income1+money.income2-money.expenses;
        System.out.println("Общий доход - расход(возврат целочисленного значения из метода через вспомогательный класс):"+ sum.res);
    }
     public void conclusion(){
         money.conclusion();
         phone.conclusion();
         car.conclusion();
         house.conclusion();
         computer.conclusion();
     }
     public void total_income(Business_calculator business_calculator){
	int sum = 0;
	sum = money.income1 + money.income2 - money.expenses;
	System.out.println(" Ваш общий доход - " + sum);
     }
     public void total_price(Business_calculator business_calculator){
        int prise = 0;
	prise = car.price_car + computer.computer_price + house.price_home + phone.price_phone;
	System.out.println(" Цена всех вещей - " + prise);
     }
     public void work(Business_calculator business_calculator){
        int sum1 = 0, prise1 = 0, itg = 0;
	sum1 = money.income1 + money.income2 - money.expenses;
	prise1 = car.price_car + computer.computer_price + house.price_home + phone.price_phone;
	itg = prise1 / sum1;
	if (sum1 == 0 || sum1 < 0) {
		System.out.println(" Вы не сможете накопить на эти вещи. Вам надо увеличить доходы или уменьшить расходы,потому что ваш общий доход равен 0 или ваши доходы меньше расходов");
	}
	else
		System.out.println(" Вам нужно работать примерно" + prise1 / sum1 + "  месяцев, чтобы накопить на эти вещи");
}
}
