public class test {
    public static void main(String[] args) {
        int Base = 80;
        int IV = 31;
        int EV = 252;
        int Level = 100;
        int i =(int) Math.floor((((((2*Base+IV+(EV/4))*Level)/100)+5)*1.1));
        System.out.println(i);
    }
}
