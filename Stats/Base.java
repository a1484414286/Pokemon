package Stats;
import java.util.Objects;

public class Base {
    private int HP;
    private int Attack;
    private int Defense;
    private int SpecialAttack;
    private int SpecialDefense;
    private int Speed;

    public Base(int HP, int Attack, int Defense, int SpecialAttack, int SpecialDefense, int Speed) {
        this.HP = HP;
        this.Attack = Attack;
        this.Defense = Defense;
        this.SpecialAttack = SpecialAttack;
        this.SpecialDefense = SpecialDefense;
        this.Speed = Speed;
    }

    public int getHP() {
        return this.HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return this.Attack;
    }

    public void setAttack(int Attack) {
        this.Attack = Attack;
    }

    public int getDefense() {
        return this.Defense;
    }

    public void setDefense(int Defense) {
        this.Defense = Defense;
    }

    public int getSpecialAttack() {
        return this.SpecialAttack;
    }

    public void setSpecialAttack(int SpecialAttack) {
        this.SpecialAttack = SpecialAttack;
    }

    public int getSpecialDefense() {
        return this.SpecialDefense;
    }

    public void setSpecialDefense(int SpecialDefense) {
        this.SpecialDefense = SpecialDefense;
    }

    public int getSpeed() {
        return this.Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public Base HP(int HP) {
        setHP(HP);
        return this;
    }

    public Base Attack(int Attack) {
        setAttack(Attack);
        return this;
    }

    public Base Defense(int Defense) {
        setDefense(Defense);
        return this;
    }

    public Base SpecialAttack(int SpecialAttack) {
        setSpecialAttack(SpecialAttack);
        return this;
    }

    public Base SpecialDefense(int SpecialDefense) {
        setSpecialDefense(SpecialDefense);
        return this;
    }

    public Base Speed(int Speed) {
        setSpeed(Speed);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Base)) {
            return false;
        }
        Base base = (Base) o;
        return HP == base.HP && Attack == base.Attack && Defense == base.Defense && SpecialAttack == base.SpecialAttack && SpecialDefense == base.SpecialDefense && Speed == base.Speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed);
    }

    @Override
    public String toString() {
        return "{" +
            " HP='" + getHP() + "'" +
            ", Attack='" + getAttack() + "'" +
            ", Defense='" + getDefense() + "'" +
            ", SpecialAttack='" + getSpecialAttack() + "'" +
            ", SpecialDefense='" + getSpecialDefense() + "'" +
            ", Speed='" + getSpeed() + "'" +
            "}";
    }

}