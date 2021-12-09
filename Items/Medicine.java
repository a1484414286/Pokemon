package Items;

import java.util.Objects;

import Pokemon.Type; 

public class Medicine extends Items{
    private int healPoint;

    public Medicine(String name, Type type, int healPoint) {
        super(name, type);
        this.healPoint = healPoint;
    }

    public int getHealPoint() {
        return this.healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }

    public Medicine healPoint(int healPoint) {
        setHealPoint(healPoint);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Medicine)) {
            return false;
        }
        Medicine medicine = (Medicine) o;
        return healPoint == medicine.healPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(healPoint);
    }

    @Override
    public String toString() {
        return "名称： "+ getName() +", 类型: "+ "🧃" + ", 恢复量: " + getHealPoint() ;
    }
    
}
