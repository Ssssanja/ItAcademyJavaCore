package part5.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Atm implements VendingMachine{

    private Map<Integer, Integer> banknots;

    public Atm() throws IOException {
        banknots = new TreeMap<>(Collections.reverseOrder());
        System.out.println("Задайте номиналы банкнот, которые будет использовать банкомат\n" +
                "только цифровые значения банкнот:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            if (input.isEmpty()) break;
            else {
                banknots.put(Integer.parseInt(input), 0);
                System.out.println("Введите следующий номинал, иначе - нажмите Enter");
            }
        }
        System.out.println("Банкомат создан. Доступны операции со следующими номиналами:");
        System.out.println(banknots.keySet().toString() + "\n");
    }

    @Override
    public void load () throws IOException {
        System.out.println("Начата загрузка купюр в банкомат...");
        Integer sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (Map.Entry<Integer, Integer> x : banknots.entrySet()) {
            System.out.printf("Введите количество банкнот %s$:", x.getKey());
            Integer input = Integer.parseInt(reader.readLine());
            banknots.put(x.getKey(), input);
            sum += x.getKey() * input;
        }
        System.out.printf("В банкомат добавлено %d$. \n\n", sum);
    }

    @Override
    public void printEnableToWithdraw() {
        System.out.println("В банкомате доступно:");
        for (Map.Entry<Integer, Integer> x : banknots.entrySet()) {
            System.out.printf("Купюр %s$ - %d шт.\n",x.getKey(), x.getValue());
        }
        System.out.printf("Доступная сумма %d$:\n\n", getEnableSum());
    }

    @Override
    public void withdraw () throws IOException {
        if (getEnableSum()==0) System.out.println("Банкомат пуст.");
        System.out.println("Введите желаемую сумму $, кратную следующим номиналам:");
        System.out.println(banknots.keySet().toString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(reader.readLine());
        if (sum > getEnableSum() || sum < 0 || !checkSum(sum)){
            System.out.println("FALSE");
        }
        else {
            int withdrawablesum = sum;
            String result = "";
            for (Map.Entry<Integer,Integer>entry: banknots.entrySet()){
                int banknotsToUse = HowMuchBanknotesMayBeUsed(sum, entry.getKey());
                int temp = entry.getValue();
                banknots.put(entry.getKey(), temp-banknotsToUse);
                sum = sum - banknotsToUse*entry.getKey();
                if (banknotsToUse!=0) {
                    result += "по " + entry.getKey() + "$: " + banknotsToUse + " шт\n";
                }
            }
            System.out.println("TRUE");
            System.out.println("Выдана сумма " + withdrawablesum + "$ купюрами:");
            System.out.print(result);
        }
    }

    private int HowMuchBanknotesMayBeUsed(int sum, int value) {
        int banknotesToUse = sum /value;
        while (banknotesToUse>banknots.get(value)){
            banknotesToUse--;
        }
        return banknotesToUse;
    }

    private int getEnableSum(){
        int result = 0;
        for (Map.Entry<Integer, Integer> x : banknots.entrySet()) {
            result += x.getKey() * x.getValue();
        }
        return result;
    }

    private boolean checkSum(int sum){
        int enableToCheck = getEnableSum();
        for (Map.Entry<Integer,Integer>entry: banknots.entrySet()){
            int banknotsToUse = HowMuchBanknotesMayBeUsed(sum, entry.getKey());
            int temp = entry.getValue();
            sum = sum - banknotsToUse*entry.getKey();
        }
        return getEnableSum() - enableToCheck >= 0 && sum == 0;
    }
}
