import java.util.Random;

public class Nature {

    Random rint = new Random();


    public Random getRint() {
        return this.rint;
    }

    public void setRint(Random rint) {
        this.rint = rint;
    }

    public String[] getNature() {
        return this.nature;
    }

    public void setNature(String[] nature) {
        this.nature = nature;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getHP() {
        return this.HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public double getAttack() {
        return this.Attack;
    }

    public void setAttack(double d) {
        this.Attack = d;
    }

    public double getDefense() {
        return this.Defense;
    }

    public void setDefense(double d) {
        this.Defense = d;
    }

    public double getSpecialAttack() {
        return this.SpecialAttack;
    }

    public void setSpecialAttack(double d) {
        this.SpecialAttack = d;
    }

    public double getSpecialDefense() {
        return this.SpecialDefense;
    }

    public void setSpecialDefense(double d) {
        this.SpecialDefense = d;
    }

    public double getSpeed() {
        return this.Speed;
    }
    public String getName(){
        return this.name;
    }

    public void setSpeed(double d) {
        this.Speed = d;
    }

    public void getAll(){
        System.out.println(getName()+getAttack()+getDefense()+getHP()+getSpecialAttack()+getSpecialDefense()+getSpeed());
    }
    String[] nature = {
    "Hardy","Lonely","Brave", "Naughty", "Bold","Docile",
    "Relaxed","Impish","Lax","Timid","Hasty","Serious",
    "Jolly","Naive","Modest","Mild","Quiet","Bashful",
    "Rash","Calm","Gentle","Sassy","Careful","Quirky"
    };
    int x;
    double HP;
    double Attack;
    double Defense;
    double SpecialAttack;
    double SpecialDefense;
    double Speed;
    String name;
    public Nature(String i) {
        this.x = rint.nextInt(nature.length);
        this.name =  i;
        this.HP = 0;
        this.Attack = 0;
        this.Defense = 0;
        this.SpecialAttack = 0;
        this.SpecialDefense = 0;
        this.Speed = 0;
    }

    public Nature() {
        this.x = rint.nextInt(nature.length);
        this.name = nature[this.x];
        this.HP = 0;
        this.Attack = 0;
        this.Defense = 0;
        this.SpecialAttack = 0;
        this.SpecialDefense = 0;
        this.Speed = 0;
    }

    
    public Nature verify(){
        switch(this.name){
            case "Lonely":
                this.setAttack(1.1);
                this.setDefense(0.9);
                break;
            case "Adamant":
                this.setAttack(1.1);
                this.setSpecialAttack(0.9);
                break;
            case "Naughty":
                this.setAttack(1.1);
                this.setSpecialDefense(0.9);
                break;
            case "Brave":
                this.setAttack(1.1);
                this.setSpeed(0.9);
                break;
            case "Bold":
                this.setDefense(1.1);
                this.setAttack(0.9);
                break;
            default : break;
        }
        return this;
    }

}
