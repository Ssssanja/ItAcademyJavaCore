package part_extra3.api.entities;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class JsonObject {
    private List<Person>sources;

    public JsonObject() {
        sources = new ArrayList<>();
    }

    private ZonedDateTime timestamp;

    public List<Person> getSources() {
        return sources;
    }

    public void setSources(List<Person> sources) {
        this.sources = sources;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JsonObject: {\n");
        if (!sources.isEmpty()){
            stringBuilder.append("\tsources: {\n");
            for (Person p : sources){
                stringBuilder.append("\t\t" + p.toString() + "\n");
            }
            stringBuilder.append("\t}\n");
        }
        else stringBuilder.append("\tsources: null\n");
        stringBuilder.append("\tTimestamp: " + timestamp + "\n}");
        return stringBuilder.toString();
    }
}
