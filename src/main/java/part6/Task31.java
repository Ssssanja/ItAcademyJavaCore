package part6;

public class Task31 {
    public static void main(String[] args) {

        long startStringBuffer = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("aaabbbccc");
        for (int i = 0; i<1000000; i++){
            buffer.append("aaabbbccc");
        }
        long finishStringBuffer = System.currentTimeMillis();
        long timeConsumedMillisStringBuffer = finishStringBuffer - startStringBuffer;
        System.out.println("Сложение 1000000 строк в StringBuffer прошло за " + timeConsumedMillisStringBuffer + " мс");

        long startStringBuilder = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("aaabbbccc");
        for (int i = 0; i<1000000; i++){
            builder.append("aaabbbccc");
        }
        long finishStringBuilder = System.currentTimeMillis();
        long timeConsumedMillisStringBuilder = finishStringBuilder - startStringBuilder;
        System.out.println("Сложение 1000000 строк в StringBuffer прошло за " + timeConsumedMillisStringBuilder + " мс");

        long startString = System.currentTimeMillis();
        String s = "aaabbbccc";
        for (int i = 0; i<50; i++){
            s+=s;
        }
        long finishString = System.currentTimeMillis();
        long timeConsumedMillisString = finishString - startString;
        System.out.println("Сложение 1000000 String прошло за " + timeConsumedMillisString + " мс");

    }
}
