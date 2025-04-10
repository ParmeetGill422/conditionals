public class Main {

    public static void go(int age){
        if(age >= 18){
            System.out.println("GO VOTE!!!");
        }else{
            System.out.println("GO PLAY");
        }
    }

    public static void respond(char answer){
        if(answer == 'Y' || answer == 'y'){
            System.out.println("YUP YUP YUP");
        }else{
            System.out.println("NOPE NOPE NOPE");
        }
    }

    public static void drink(int age) {
        if(age < 21){
            System.out.println("juice");
        }else if(age < 39) {
            System.out.println("vodka");
        }else if(age < 60) {
                System.out.println("beer");
        }else{
            System.out.println("tea");
        }
    }

    public static void main(String[] args) {
        drink(11);
        drink(22);
        drink(55);
        drink(79);


        for(String a : args){
            System.out.println(a);
        }

        go(13);
        go(21);

        respond('Y');
        respond('N');

        bridge(args);
    }

    public static void truck(int weight) {
        if (weight < 3000){
            System.out.println("CAN GO OVER");
        }else if (weight < 5000) {
            System.out.println("CAN GO OVER BUT SLOW");
        }else{
            System.out.println("CANT GO OVER");

        }
    }

    public static void bridge(String[] args) {
        truck(2300);
        truck(2900);
        truck(4000);
        truck(12000);

    }
}