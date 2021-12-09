package Items;

import java.util.Objects;

import Pokemon.Type;

public class Items {
    String name;
    Type type;


    public Items(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Items name(String name) {
        setName(name);
        return this;
    }

    public Items type(Type type) {
        setType(type);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Items)) {
            return false;
        }
        Items items = (Items) o;
        return Objects.equals(name, items.name) && Objects.equals(type, items.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }
}