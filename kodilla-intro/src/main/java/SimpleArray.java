public class SimpleArray {
    public static void main(String[] args) {
        String [] tanks = new String [5];

        tanks[0] = "Leopard2PL";
        tanks[1] = "Abrams M1A2 SEPv3";
        tanks[2] = "T-72";
        tanks[3] = "T-55 M";
        tanks[4] = "K9 Black Panther";

        String tankTable = tanks[3];
        System.out.println("Wybrany czołg to: " + tankTable);

        int numberOfTanks = tanks.length;
        System.out.println("Liczba czołgów to: "+ numberOfTanks);

        //Druga tablica
        String [] artillery = new String []{"2S7 Pion", "2S19 Msta-S", "AHS Krab"};

        String artilleryPiece = artillery [0];
        System.out.print("Wybrana armatohaubica to: " + artilleryPiece);

        int artilleryTable = artillery.length;
        System.out.println("Długość tableki to: " + artilleryTable);

    }
}