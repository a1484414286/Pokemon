package Pokemon;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import Ability.Ability;
import Ability.Moves;
import Ability.Nature;
import Items.heldItem;
import Stats.Base;
import Stats.EV;
import Stats.IV;
import Stats.currentStatus;

public class Pokemon {
    private ArrayList<Moves> moves;
    private int PokeId;
    private String Name;
    private String nickName;
    private int level;
    private Type type1;
    private Type type2;
    private Nature nature;
    private Base base;
    private IV iv;
    private EV ev;
    private Ability ability; 
    private Ability ability1;
    private Ability ability2;
    private Ability hiddenAbility;
    private int catchRate;
    private float genderRate;
    private Gender gender;
    private eggGroup eggGroup1;
    private eggGroup eggGroup2;
    private heldItem item;
    private currentStatus currentStatus;
    private int evoReq;
    public int id = 0;
    private boolean shiny;
    public int ShinyRate = 2500;

    //hard-code for random wild pokemon
    public Pokemon(int PokeId, String Name, int level, Type type1, Type type2, Ability ability, int catchRate, float genderRate, boolean gender,eggGroup eggGroup1, eggGroup eggGroup2, heldItem item) {
        this.PokeId = PokeId;
        this.id = id += 1;
        this.Name = Name;
        this.moves = new ArrayList<>();
        this.nickName = Name;
        this.level = level;
        this.type1 = type1;
        this.type2 = type2;
        this.shiny = new Random().nextInt(ShinyRate) == 1 ? true : false; 
        this.nature = new Nature(24);
        this.iv = new IV(shiny);
        this.ev = new EV();
        this.currentStatus = new currentStatus(level, base, nature, iv, ev);
        this.ability = ability;
        this.catchRate = catchRate;
        this.genderRate = genderRate;
        this.gender = genderRatio(genderRate);
        this.eggGroup1 = eggGroup1;
        this.eggGroup2 = eggGroup2;
        this.item = item;
    }


    //hard-code for trainers
    public Pokemon(int PokeId, String Name, ArrayList<Moves> moves, int level, Type type1, Type type2, Nature nature, Base base, IV iv, EV ev, Ability ability, int catchRate, float genderRate, eggGroup eggGroup1, eggGroup eggGroup2, heldItem item, currentStatus currentStatus, int evoReq, int id) {
        this.PokeId = PokeId;
        this.id = id+=1;
        this.Name = Name;
        this.nickName = Name;
        this.moves = moves;
        this.level = level;
        this.type1 = type1;
        this.type2 = type2;
        this.nature = new Nature(24);
        this.base = base;
        this.iv = iv;
        this.ev = ev;
        this.ability = ability;
        this.catchRate = catchRate;
        this.genderRate = genderRate;
        this.eggGroup1 = eggGroup1;
        this.eggGroup2 = eggGroup2;
        this.item = item;
        this.currentStatus = currentStatus;
        this.evoReq = evoReq;
        this.id = id;
    }

    //data base
    public Pokemon(int PokeId, String Name, Type type1, Type type2, Nature nature, Base base, IV iv, EV ev, Ability ability1, Ability ability2, Ability hiddenAbility, int catchRate, float genderRate, eggGroup eggGroup1, eggGroup eggGroup2, int evoReq) {
        this.PokeId = PokeId;
        this.id = id+=1;
        this.Name = Name;
        this.nickName = Name;
        this.type1 = type1;
        this.type2 = type2;
        this.nature = new Nature(24);
        this.base = base;
        this.iv = iv;
        this.ev = ev;
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.hiddenAbility = hiddenAbility;
        this.catchRate = catchRate;
        this.genderRate = genderRate;
        this.eggGroup1 = eggGroup1;
        this.eggGroup2 = eggGroup2;
        this.evoReq = evoReq;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setMoves(ArrayList<Moves> moves) {
        this.moves = moves;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public void setShinyRate(int shinyRate) {
        ShinyRate = shinyRate;
    }
    public ArrayList<Moves> getMoves() {
        return moves;
    }

    public int getShinyRate() {
        return ShinyRate;
    }
    
    private Gender genderRatio(Float rate){
        if(rate == 255){
            return Gender.NONE;
        }
        else if(rate == 254){
            return Gender.FEMALE;
        }
        else if(rate == 0){
            return Gender.MALE;
        }
        else{
            int G = new Random().nextInt(0,254);
            return ( G >= rate ? Gender.FEMALE : Gender.MALE);
        }
    }

    public int getPokeId() {
        return this.PokeId;
    }

    public void setPokeId(int PokeId) {
        this.PokeId = PokeId;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Type getType1() {
        return this.type1;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public Type getType2() {
        return this.type2;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public Nature getNature() {
        return this.nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public Base getBase() {
        return this.base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public IV getIv() {
        return this.iv;
    }

    public void setIv(IV iv) {
        this.iv = iv;
    }

    public EV getEv() {
        return this.ev;
    }

    public void setEv(EV ev) {
        this.ev = ev;
    }

    public Ability getAbility() {
        return this.ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Ability getAbility1() {
        return this.ability1;
    }

    public void setAbility1(Ability ability1) {
        this.ability1 = ability1;
    }

    public Ability getAbility2() {
        return this.ability2;
    }

    public void setAbility2(Ability ability2) {
        this.ability2 = ability2;
    }

    public Ability getHiddenAbility() {
        return this.hiddenAbility;
    }

    public void setHiddenAbility(Ability hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    public int getCatchRate() {
        return this.catchRate;
    }

    public void setCatchRate(int catchRate) {
        this.catchRate = catchRate;
    }

    public float getGenderRate() {
        return this.genderRate;
    }

    public void setGenderRate(float genderRate) {
        this.genderRate = genderRate;
    }

    public eggGroup getEggGroup1() {
        return this.eggGroup1;
    }

    public void setEggGroup1(eggGroup eggGroup1) {
        this.eggGroup1 = eggGroup1;
    }

    public eggGroup getEggGroup2() {
        return this.eggGroup2;
    }

    public void setEggGroup2(eggGroup eggGroup2) {
        this.eggGroup2 = eggGroup2;
    }

    public heldItem getItem() {
        return this.item;
    }

    public void setItem(heldItem item) {
        this.item = item;
    }

    public currentStatus getCurrentStatus() {
        return this.currentStatus;
    }

    public void setCurrentStatus(currentStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public int getEvoReq() {
        return this.evoReq;
    }

    public void setEvoReq(int evoReq) {
        this.evoReq = evoReq;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pokemon PokeId(int PokeId) {
        setPokeId(PokeId);
        return this;
    }

    public Pokemon Name(String Name) {
        setName(Name);
        return this;
    }

    public Pokemon nickName(String nickName) {
        setNickName(nickName);
        return this;
    }

    public Pokemon level(int level) {
        setLevel(level);
        return this;
    }

    public Pokemon type1(Type type1) {
        setType1(type1);
        return this;
    }

    public Pokemon type2(Type type2) {
        setType2(type2);
        return this;
    }

    public Pokemon nature(Nature nature) {
        setNature(nature);
        return this;
    }

    public Pokemon base(Base base) {
        setBase(base);
        return this;
    }

    public Pokemon iv(IV iv) {
        setIv(iv);
        return this;
    }

    public Pokemon ev(EV ev) {
        setEv(ev);
        return this;
    }

    public Pokemon ability(Ability ability) {
        setAbility(ability);
        return this;
    }

    public Pokemon ability1(Ability ability1) {
        setAbility1(ability1);
        return this;
    }

    public Pokemon ability2(Ability ability2) {
        setAbility2(ability2);
        return this;
    }

    public Pokemon hiddenAbility(Ability hiddenAbility) {
        setHiddenAbility(hiddenAbility);
        return this;
    }

    public Pokemon catchRate(int catchRate) {
        setCatchRate(catchRate);
        return this;
    }

    public Pokemon genderRate(float genderRate) {
        setGenderRate(genderRate);
        return this;
    }

    public Pokemon eggGroup1(eggGroup eggGroup1) {
        setEggGroup1(eggGroup1);
        return this;
    }

    public Pokemon eggGroup2(eggGroup eggGroup2) {
        setEggGroup2(eggGroup2);
        return this;
    }

    public Pokemon item(heldItem item) {
        setItem(item);
        return this;
    }

    public Pokemon currentStatus(currentStatus currentStatus) {
        setCurrentStatus(currentStatus);
        return this;
    }

    public Pokemon evoReq(int evoReq) {
        setEvoReq(evoReq);
        return this;
    }

    public Pokemon id(int id) {
        setId(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pokemon)) {
            return false;
        }
        Pokemon pokemon = (Pokemon) o;
        return PokeId == pokemon.PokeId && Objects.equals(Name, pokemon.Name) && Objects.equals(nickName, pokemon.nickName) && level == pokemon.level && Objects.equals(type1, pokemon.type1) && Objects.equals(type2, pokemon.type2) && Objects.equals(nature, pokemon.nature) && Objects.equals(base, pokemon.base) && Objects.equals(iv, pokemon.iv) && Objects.equals(ev, pokemon.ev) && Objects.equals(ability, pokemon.ability) && Objects.equals(ability1, pokemon.ability1) && Objects.equals(ability2, pokemon.ability2) && Objects.equals(hiddenAbility, pokemon.hiddenAbility) && catchRate == pokemon.catchRate && genderRate == pokemon.genderRate && Objects.equals(eggGroup1, pokemon.eggGroup1) && Objects.equals(eggGroup2, pokemon.eggGroup2) && Objects.equals(item, pokemon.item) && Objects.equals(currentStatus, pokemon.currentStatus) && evoReq == pokemon.evoReq && id == pokemon.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(PokeId, Name, nickName, level, type1, type2, nature, base, iv, ev, ability, ability1, ability2, hiddenAbility, catchRate, genderRate, eggGroup1, eggGroup2, item, currentStatus, evoReq, id);
    }

    @Override
    public String toString() {
        if(getName().equals(getNickName())){
            return "{" +
                " PokeId='" + getPokeId() + "'" +
                ", 名字='" + getName() + "'" +
                ", 等级='" + getLevel() + "'" +
                ", 属性='" + getType1() + "'" +
                ", 属性='" + getType2() + "'" +
                ", 性格='" + getNature() + "'" +
                ", 特性='" + getAbility() + "'" +
                ", 性别='" + getGenderRate() + "'" +
                ", 携带物='" + getItem() + "'" +
                ", 状态='" + getCurrentStatus() + "'" +
                ", 进化需要等级='" + getEvoReq() + "'" +
                "}";
        }
        else{
            return "{" +
            " PokeId='" + getPokeId() + "'" +
            ", 名字='" + getNickName() + "'" +
            ", 等级='" + getLevel() + "'" +
            ", 属性='" + getType1() + "'" +
            ", 属性='" + getType2() + "'" +
            ", 性格='" + getNature() + "'" +
            ", 特性='" + getAbility() + "'" +
            ", 性别='" + getGenderRate() + "'" +
            ", 携带物='" + getItem() + "'" +
            ", 状态='" + getCurrentStatus() + "'" +
            ", 进化需要等级='" + getEvoReq() + "'" +
            "}";
        }
    }

}