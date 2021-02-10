package part7.api.additional.task33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CvvCard extends PlasticCard{
    private int cvv;

    public CvvCard(int cvv) {
        super();
        this.cvv = cvv;
        System.out.println("Теперь у вас есть карта с CVV-кодом");
    }

    @Override
    public void withdraval(double sum) throws IOException {
        int tryCvv = 0;
        System.out.println("Введите CVV:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        tryCvv = Integer.parseInt(reader.readLine());
        if (tryCvv==cvv) {
            System.out.println("CVV верный. Операция одобрена");
            super.withdraval(sum);
        }
        else {
            System.out.println("CVV неверный");
        }
    }
}
