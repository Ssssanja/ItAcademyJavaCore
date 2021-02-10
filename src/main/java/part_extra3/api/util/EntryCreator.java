package part_extra3.api.util;

import java.util.Map;

public class EntryCreator {

    public Map.Entry<String,String> getEntry (String s) {
        Map.Entry<String, String> result = new Map.Entry<String, String>() {
            String[]splitted = s.replaceAll("\"", "").split(":");
            @Override
            public String getKey() {
                return splitted[0];
            }

            @Override
            public String getValue() {
                return splitted[1];
            }

            @Override
            public String setValue(String s) {
                return null;
            }
        };
        return result;
    }
}
