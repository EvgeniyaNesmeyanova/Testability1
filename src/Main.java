//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 10000; // ввести цену билета
        int miles = service.calculate(price); // должно получиться 500

        System.out.println(miles); // вывести рассчитанное количество миль
    }
}