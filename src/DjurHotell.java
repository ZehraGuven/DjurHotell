import java.util.ArrayList;
import java.util.Scanner;
public class DjurHotell {

    static ArrayList<Animal> dittDjur = new ArrayList<Animal>();
    static ArrayList<Room> room = new ArrayList<Room>();

    public static void start() {
        Skog rum1 = new Skog(101, "Skog", "40 m^2" );
        room.add(rum1);

        Hav rum2 = new Hav(102,"Hav","3000 m^3");
        room.add(rum2);

        Arktis rum3 = new Arktis(103, "Arktis", "75 m^2");
        room.add(rum3);

        boolean runProgram = true;
        while (runProgram) {


            printMenu();
            int menyval = getUserInt();

            switch (menyval) {
                case 1:
                    rumFörslag();
                    bokadeRum();
                    break;


                case 2:
                    System.out.println("Namn på ditt djur:");


                    System.out.println("Djurets favoritmat?");


                    System.out.println("Djurets favoritaktivitet?");

                    break;


                case 3:

                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    runProgram = false;
                    break;


            }
        }
    }
    public static void rumFörslag () {

        System.out.println("Vi har tre olika rum: ");

        for (int i = 0; i < 1; i++ ){
            System.out.println( "1." + room.get(0).getKlimat() + ", " + room.get(0).getYta() );
            System.out.println( "2." + room.get(1).getKlimat() + ", " + room.get(1).getYta() );
            System.out.println( "3." + room.get(2).getKlimat() + ", " + room.get(2).getYta() );
        }
        System.out.print("Välj ett anpassande rum => ");
        bokadeRum ();
    }
    public static void bokadeRum () {

        int rumMeny = getUserInt();

        switch (rumMeny) {
            case 1:
                System.out.println("Du har bokat rum " + room.get(0).getrumNummer() + ", " + room.get(0).getKlimat() + ". ");
                break;
            case 2:
                System.out.println("Du har bokat rum " + room.get(1).getrumNummer() + ", " + room.get(1).getKlimat() + ". ");
                break;
            case 3:
                System.out.println("Du har bokat rum " + room.get(2).getrumNummer()+ ", " + room.get(2).getKlimat() + ". ");
                break;
        }
    }

    public static void printMenu(){

        System.out.println("Hej! Välkommen till Djurhotellet!");
        System.out.println("Vad vill du göra?");
        System.out.println("1. Jag vill boka ett rum ");
        System.out.println("2. Jag vill checka in mitt djur.");
        System.out.println("3. Jag vill checka ut  mitt djur.");
        System.out.println("4. Jag vill uppdatera min bokning.");
        System.out.println("5. Jag vill se min bokning.");
        System.out.print("Ange ett nummer av ovanstående alternativen => ");

    }

    public static int getUserInt() {
        Scanner scan = new Scanner(System.in);

        int myInt;

        while (true) {
            try {
                myInt = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Felaktigt menyval, försök igen!");
            }
        }
        return myInt;
    }

    public static String getUserString() {
        Scanner scan = new Scanner (System.in);

        String myString = (scan.nextLine());

        return myString;

    }
}

