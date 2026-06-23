import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название автомобиля под номером " + i + ":");
            String name = scanner.next();

            int speed;

            while (true) {
                System.out.println("Введите скорость автомобиля под номером " + i + ":");
                speed = scanner.nextInt();

                if (speed > 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Неверная скорость. Попробуйте еще раз");
                }
            }

            Car car = new Car(name, speed);
            race.defineLeader(car);
        }
        System.out.println("Победитель гонки: " + race.leader + "!");
    }
}