public class SoundLun {
    public static void main(String[] args){
        double my_weight = 88;
        double moon_gravity = 17;
        double earth_gravity = 100;
        double moon_weight;

        moon_weight = (moon_gravity / earth_gravity) * my_weight;

        System.out.println("Мой вес на Луне равен: " + moon_weight + "кг. ");
    }
}
