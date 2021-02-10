package part_extra3.api.entities;

public class Restriction {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private boolean active;

    @Override
    public String toString() {
        return "\n\t\t\t\tRestriction{" +
                "type='" + type + '\'' +
                ", active=" + active +
                '}';
    }
}
