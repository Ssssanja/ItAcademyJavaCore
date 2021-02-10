package part_extra3.api.util;

import part_extra3.api.entities.JsonObject;
import part_extra3.api.entities.Person;
import part_extra3.api.entities.Restriction;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Fabric {
    private JsonReader reader;
    private ParseHelper parseHelper;
    private EntryCreator entryCreator;

    public Fabric(File file) {
        reader = new JsonReader(file);
        parseHelper = new ParseHelper();
        entryCreator = new EntryCreator();
    }

    public JsonObject create () {
        JsonObject result = new JsonObject();
        String fileContent = reader.readFile().replaceAll(" +","");
        List<String> firstLevelObjects = parseHelper.getObjectsFromString(fileContent);
        List<String>secondLevelObjects = parseHelper.getObjectsFromList(firstLevelObjects);
        List<String>thirdLevelObjects = parseHelper.getObjectsFromList(secondLevelObjects);
        for (int i = 0; i< secondLevelObjects.size(); i++){
            Person p = createPerson(secondLevelObjects.get(i));
            if (!thirdLevelObjects.isEmpty()) {
                p.setRestrictions(new ArrayList<>());
                for (int j = i * 4; j < (i + 1) * 4; j++) {
                    p.getRestrictions().add(createRestriction(thirdLevelObjects.get(j)));
                }
            }
            result.getSources().add(p);
        }
        String splitter = firstLevelObjects.get(0).contains("[") ? "\\],": ",";
            String[] splitted = firstLevelObjects.get(0).split(splitter);
            String zdt = splitted[1];
            String convertable = zdt.substring(12);
            if (!convertable.equals("null")) {
                result.setTimestamp(parseHelper.getZonedDateTimeFromString(convertable));
            }
        return result;

    }

    private Person createPerson (String parameters){
        String[]splitted = parameters.replaceAll("\"", "").split(",");
        Person p = new Person();
        for (String s: splitted){
            Map.Entry<String, String> paramPair = entryCreator.getEntry(s);
            if (paramPair.getKey().equalsIgnoreCase("name")){
                p.setName(paramPair.getValue());
            }
            if (paramPair.getKey().equalsIgnoreCase("title")){
                p.setTitle(paramPair.getValue());
            }
            if (paramPair.getKey().equalsIgnoreCase("age")){
                p.setAge(Integer.parseInt(paramPair.getValue()));
            }
        }
        return  p;
    }

    private Restriction createRestriction (String parameters){
        String[]splitted = parameters.replaceAll("\"", "").split(",");
        Restriction r = new Restriction();
        for (String s: splitted){
            Map.Entry<String, String> paramPair = entryCreator.getEntry(s);
            if (paramPair.getKey().equalsIgnoreCase("type")){
                r.setType(paramPair.getValue());
            }
            if (paramPair.getKey().equalsIgnoreCase("active")){
                r.setActive(paramPair.getValue().equalsIgnoreCase("true"));
            }
        }
        return r;
    }
}
