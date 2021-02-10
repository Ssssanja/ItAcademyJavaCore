package part_extra3.api.util;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParseHelper {
    public List<String> getObjectsFromString (String stringWithObjectsInside){
        List<String>result = new ArrayList<>();
        char[]charContent = stringWithObjectsInside.toCharArray();
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i<charContent.length;i++){
            if (counter>0){
                if (counter==1 && charContent[i]=='}'){
                    result.add(sb.toString());
                    sb = new StringBuilder();
                }
                else sb.append(charContent[i]);
            }
            if (charContent[i]=='{'){
                counter++;
            }
            else if (charContent[i]=='}'){
                counter--;
            }
        }
        return result;
    }

    public List<String> getObjectsFromList (List<String>previousLevelObjects){
        List<String>result = new ArrayList<>();
        for (String s : previousLevelObjects) {
            result.addAll(getObjectsFromString(s));
        }
        return result;
    }

    public ZonedDateTime getZonedDateTimeFromString (String zdt){

        String temp = zdt.replaceAll("[-:TZ\"]"," ").trim();
        String[]paramsOfTime = temp.split("\\s");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                Integer.parseInt(paramsOfTime[0]),
                Integer.parseInt(paramsOfTime[1]),
                Integer.parseInt(paramsOfTime[2]),
                Integer.parseInt(paramsOfTime[3]),
                Integer.parseInt(paramsOfTime[4]),
                Integer.parseInt(paramsOfTime[5]),
                Integer.parseInt(paramsOfTime[6]),
                ZoneId.ofOffset("UTC", ZoneOffset.UTC));
        return zonedDateTime;
    }
}
