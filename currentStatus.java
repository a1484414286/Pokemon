import java.util.Objects;

public class currentStatus extends Pokemon{
    int HP;
    int Attack;
    int Defense;
    int SpecialAttack;
    int SpecialDefense;
    int Speed;
    int currentHP;
    int currentAttack;
    int currentDefense;
    int currentSpecialAttack;
    int currentSpecialDefense;
    int currentSpeed;

    public currentStatus(int HP, int Attack, int Defense, int SpecialAttack, int SpecialDefense, int Speed, int currentHP, int currentAttack, int currentDefense, int currentSpecialAttack, int currentSpecialDefense, int currentSpeed) {
        super();
        this.HP = ((2*super.getIv().getHP()+super.getEv().getHP()/4)*super.getLevel()/100)+super.getLevel()+10;
        this.Attack = Attack;
        this.Defense = Defense;
        this.SpecialAttack = SpecialAttack;
        this.SpecialDefense = SpecialDefense;
        this.Speed = Speed;
        this.currentHP = currentHP;
        this.currentAttack = currentAttack;
        this.currentDefense = currentDefense;
        this.currentSpecialAttack = currentSpecialAttack;
        this.currentSpecialDefense = currentSpecialDefense;
        this.currentSpeed = currentSpeed;
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

    public int getCurrentHP() {
        return this.currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getCurrentAttack() {
        return this.currentAttack;
    }

    public void setCurrentAttack(int currentAttack) {
        this.currentAttack = currentAttack;
    }

    public int getCurrentDefense() {
        return this.currentDefense;
    }

    public void setCurrentDefense(int currentDefense) {
        this.currentDefense = currentDefense;
    }

    public int getCurrentSpecialAttack() {
        return this.currentSpecialAttack;
    }

    public void setCurrentSpecialAttack(int currentSpecialAttack) {
        this.currentSpecialAttack = currentSpecialAttack;
    }

    public int getCurrentSpecialDefense() {
        return this.currentSpecialDefense;
    }

    public void setCurrentSpecialDefense(int currentSpecialDefense) {
        this.currentSpecialDefense = currentSpecialDefense;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public currentStatus HP(int HP) {
        setHP(HP);
        return this;
    }

    public currentStatus Attack(int Attack) {
        setAttack(Attack);
        return this;
    }

    public currentStatus Defense(int Defense) {
        setDefense(Defense);
        return this;
    }

    public currentStatus SpecialAttack(int SpecialAttack) {
        setSpecialAttack(SpecialAttack);
        return this;
    }

    public currentStatus SpecialDefense(int SpecialDefense) {
        setSpecialDefense(SpecialDefense);
        return this;
    }

    public currentStatus Speed(int Speed) {
        setSpeed(Speed);
        return this;
    }

    public currentStatus currentHP(int currentHP) {
        setCurrentHP(currentHP);
        return this;
    }

    public currentStatus currentAttack(int currentAttack) {
        setCurrentAttack(currentAttack);
        return this;
    }

    public currentStatus currentDefense(int currentDefense) {
        setCurrentDefense(currentDefense);
        return this;
    }

    public currentStatus currentSpecialAttack(int currentSpecialAttack) {
        setCurrentSpecialAttack(currentSpecialAttack);
        return this;
    }

    public currentStatus currentSpecialDefense(int currentSpecialDefense) {
        setCurrentSpecialDefense(currentSpecialDefense);
        return this;
    }

    public currentStatus currentSpeed(int currentSpeed) {
        setCurrentSpeed(currentSpeed);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof currentStatus)) {
            return false;
        }
        currentStatus currentStatus = (currentStatus) o;
        return HP == currentStatus.HP && Attack == currentStatus.Attack && Defense == currentStatus.Defense && SpecialAttack == currentStatus.SpecialAttack && SpecialDefense == currentStatus.SpecialDefense && Speed == currentStatus.Speed && currentHP == currentStatus.currentHP && currentAttack == currentStatus.currentAttack && currentDefense == currentStatus.currentDefense && currentSpecialAttack == currentStatus.currentSpecialAttack && currentSpecialDefense == currentStatus.currentSpecialDefense && currentSpeed == currentStatus.currentSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed, currentHP, currentAttack, currentDefense, currentSpecialAttack, currentSpecialDefense, currentSpeed);
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
            ", currentHP='" + getCurrentHP() + "'" +
            ", currentAttack='" + getCurrentAttack() + "'" +
            ", currentDefense='" + getCurrentDefense() + "'" +
            ", currentSpecialAttack='" + getCurrentSpecialAttack() + "'" +
            ", currentSpecialDefense='" + getCurrentSpecialDefense() + "'" +
            ", currentSpeed='" + getCurrentSpeed() + "'" +
            "}";
    }
 
    
}