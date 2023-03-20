import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hauptMenue();


    }


    public static void hauptMenue(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("(S)Quiz starten");
        System.out.println("(Q)Quiz beenden");
        String eingabe = scanner.next();
        if(eingabe.equals("S")){
            fragenKatalog();
        } else if (eingabe.equals("Q")) {
            System.out.println("Programm beendet");
        } else{
            System.out.println("Falsche eingabe!");
            hauptMenue();
        }
    }

    public static void fragenKatalog(){
        int punkte;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist Java ebenfalls?");
        System.out.println("A) Eine Insel B) Ein Fluss C) Ein Königreich D) Ein Betriebssystem");








    }



}