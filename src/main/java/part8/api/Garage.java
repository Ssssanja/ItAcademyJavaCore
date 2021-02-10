package part8.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Garage <T extends Vehicle>{
    private static int id = 0;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Garage() {
        id++;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Был построен гараж под номером %d.\n" +
                "Что желаете в него поставить?\n", id);

        try {
            while (true) {
                System.out.println("Введите \"тачка\" или \"моцык\", иначе - просто нажмите Enter");
                String input = reader.readLine();
                if (input.isEmpty())break;
                Vehicle veh = getVehicle(input);
                if (veh == null) System.out.println("Надо было вводить \"тачка\" или \"моцык\"");
                else {
                    System.out.printf("Отлично, в гараже %d теперь есть %s.\n", id, input);
                    vehicleList.add(veh);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (vehicleList.isEmpty()) System.out.printf("Как хотите, значит гараж %d будет пуст\n", id);
        else {
            System.out.printf("Ну всё с гаражом %d, в нем стоит вот чё: \n", id);
            for (Vehicle v : vehicleList) {
                System.out.printf("%s %s\n", v.getDescription(), v.getName());
            }
        }
    }

    private Vehicle getVehicle (String s){
        Vehicle result = null;
        if (s.equalsIgnoreCase("Моцык")) result = new Motorcycle(getNameOfVehicle());
        if (s.equalsIgnoreCase("Тачка")) result = new Car(getNameOfVehicle());
        return result;
    }

    private String getNameOfVehicle(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("А теперь марку или имя для ласточки:");
        String result = "";
        try {
            result = reader.readLine();
            if (result.isEmpty()) result = "без имени или марки";
        } catch (IOException e) {
            System.out.println("Облом");
        }
        return result;
    }
}
