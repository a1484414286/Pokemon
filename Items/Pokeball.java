package Items;

import java.util.Objects;

import Pokemon.Type;

public class Pokeball extends Items{
    int catchRate;
    public Pokeball(String name, Type type, int catchRate) {
        super(name, type);
        this.catchRate = catchRate;
    }

    public int getCatchRate() {
        return this.catchRate;
    }

    public void setCatchRate(int catchRate) {
        this.catchRate = catchRate;
    }

    public Pokeball catchRate(int catchRate) {
        setCatchRate(catchRate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pokeball)) {
            return false;
        }
        Pokeball pokeball = (Pokeball) o;
        return catchRate == pokeball.catchRate;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(catchRate);
    }

    @Override
    public String toString() {
        return getName() + ", 类型 : ◓";
    }

}
