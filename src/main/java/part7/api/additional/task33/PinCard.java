package part7.api.additional.task33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinCard extends PlasticCard{
    protected int pin;

    public PinCard(int pin) {
        this.pin = pin;
        System.out.println("Теперь у вас есть карта с PIN-кодом");
    }

    public void withdraval(double sum) throws IOException {
        int tryPin = 0;
        System.out.println("Введите PIN:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        tryPin = Integer.parseInt(reader.readLine());
        if (tryPin==pin) {
            System.out.println("PIN верный. Операция одобрена");
            super.withdraval(sum);
        }
        else {
            System.out.println("Пин неверный");
        }
    }
}
