package Stats;
import java.util.Objects;

public class EV{
    int HP;
    int Attack;
    int Defense;
    int SpecialAttack;
    int SpecialDefense;
    int Speed;

    public EV(int HP, int Attack, int Defense, int SpecialAttack, int SpecialDefense, int Speed) {
        this.HP = HP;
        this.Attack = Attack;
        this.Defense = Defense;
        this.SpecialAttack = SpecialAttack;
        this.SpecialDefense = SpecialDefense;
        this.Speed = Speed;
    }
    public EV() {
        this.HP = 0;
        this.Attack = 0;
        this.Defense = 0;
        this.SpecialAttack = 0;
        this.SpecialDefense = 0;
        this.Speed = 0;
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

    public EV HP(int HP) {
        setHP(HP);
        return this;
    }

    public EV Attack(int Attack) {
        setAttack(Attack);
        return this;
    }

    public EV Defense(int Defense) {
        setDefense(Defense);
        return this;
    }

    public EV SpecialAttack(int SpecialAttack) {
        setSpecialAttack(SpecialAttack);
        return this;
    }

    public EV SpecialDefense(int SpecialDefense) {
        setSpecialDefense(SpecialDefense);
        return this;
    }

    public EV Speed(int Speed) {
        setSpeed(Speed);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EV)) {
            return false;
        }
        EV eV = (EV) o;
        return HP == eV.HP && Attack == eV.Attack && Defense == eV.Defense && SpecialAttack == eV.SpecialAttack && SpecialDefense == eV.SpecialDefense && Speed == eV.Speed;
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
