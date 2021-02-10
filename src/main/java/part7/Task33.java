package part7;

import part7.api.additional.task33.*;

import java.io.IOException;

public class Task33 {
    public static void main(String[] args) throws IOException {
        PlasticCard c = new PlasticCard();
        c.topUp(300);
        c.showAwailableSum();
        c.showStatus();
        PinCard p = new PinCard(1122);
        p.topUp(500);
        p.showAwailableSum();
        p.withdraval(200);
        p.withdraval(200);
        p.showAwailableSum();
        CvvCard cvv = new CvvCard(2255);
        cvv.topUp(500);
        cvv.showAwailableSum();
        cvv.withdraval(200);
        cvv.withdraval(200);
    }
}
