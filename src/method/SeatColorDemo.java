package method;

public class SeatColorDemo {
    public static void main(String[] args) {
        String[][] seatSetup = {
                {"A-1: BO 2024-12-10", "A-2: AV"},
                {"B-1: BO 2024-12-10", "B-2: AV"}
        };

        System.out.println("+---------------------------------------------+");
        System.out.println("|                 Seat Status                 |");
        System.out.println("+---------------------------------------------+");

        for (String[] row : seatSetup) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                if (row[j].contains("AV")) {
                    // Blue color for Available
                    System.out.print("\u001B[34m" + row[j] + "\u001B[0m");
                } else if (row[j].contains("BO")) {
                    // Red color for Booked
                    System.out.print("\u001B[31m" + row[j] + "\u001B[0m");
                } else {
                    // Default color
                    System.out.print(row[j]);
                }

                if (j < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        System.out.println("+---------------------------------------------+");
    }
}
