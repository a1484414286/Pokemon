package Ability;

import java.util.Objects;

import Pokemon.Type;

public class Moves {
    private String name;
    private int DMG;
    private int dmgType;
    private int pp;
    private Type type;
    private String description;
    private float accuracy;
    

    public Moves() {
    }

    public Moves(String name, int DMG, int dmgType, int pp, Type type, String description, float accuracy) {
        this.name = name;
        this.DMG = DMG;
        this.dmgType = dmgType;
        this.pp = pp;
        this.type = type;
        this.description = description;
        this.accuracy = accuracy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDMG() {
        return this.DMG;
    }

    public void setDMG(int DMG) {
        this.DMG = DMG;
    }

    public int getDmgType() {
        return this.dmgType;
    }

    public void setDmgType(int dmgType) {
        this.dmgType = dmgType;
    }

    public int getPp() {
        return this.pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public Moves name(String name) {
        setName(name);
        return this;
    }

    public Moves DMG(int DMG) {
        setDMG(DMG);
        return this;
    }

    public Moves dmgType(int dmgType) {
        setDmgType(dmgType);
        return this;
    }

    public Moves pp(int pp) {
        setPp(pp);
        return this;
    }

    public Moves type(Type type) {
        setType(type);
        return this;
    }

    public Moves description(String description) {
        setDescription(description);
        return this;
    }

    public Moves accuracy(float accuracy) {
        setAccuracy(accuracy);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Moves)) {
            return false;
        }
        Moves moves = (Moves) o;
        return Objects.equals(name, moves.name) && DMG == moves.DMG && dmgType == moves.dmgType && pp == moves.pp && Objects.equals(type, moves.type) && Objects.equals(description, moves.description) && accuracy == moves.accuracy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, DMG, dmgType, pp, type, description, accuracy);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", DMG='" + getDMG() + "'" +
            ", dmgType='" + getDmgType() + "'" +
            ", pp='" + getPp() + "'" +
            ", type='" + getType() + "'" +
            ", description='" + getDescription() + "'" +
            ", accuracy='" + getAccuracy() + "'" +
            "}";
    }


}
