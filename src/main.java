import java.util.Random;

public class main {
    public static void main(String[] args){
        System.out.println(ageAndTemperature( 18,-25));
        System.out.println(ageAndTemperature(32, 56));
        System.out.println(ageAndTemperature(67,11));
        System.out.println(ageAndTemperature(78,-40 ));
        System.out.println(ageAndTemperature(12,22));
        System.out.println("hw on quick wits");
        System.out.println(ageAndTemperature(generateRandomAge(), 45));
    }

    public static String ageAndTemperature (int age, int temperature) {
        String a = String.valueOf(age) + ":years,"; // String.valueOf помогает отобразить значение переменной
        String t = String.valueOf(temperature) + ":degrees temperature,";
        if (age>=20 && age<=45 && temperature>=-20 && temperature<=30 ){
            return a+t+goForWalk();
        }

        else if (age<20 && temperature >= 0 && temperature <=28) {
            return a + t + goForWalk();
        }
        else if (age>45 && temperature>-10 && temperature<=25) {
            return a + t + goForWalk();
        }
        else return a + t + stayAtHome();

        }
    public static String goForWalk(){return "can go for walk";}
    public static String stayAtHome(){return "stay at home";}
    public static int generateRandomAge() {
        int minAge = 0;
        int maxAge = 100;
        int diff = maxAge - minAge;
        Random randomAge = new Random();
        int ageRandom = randomAge.nextInt(diff + 1) + minAge;
        return ageRandom;
    }


}

