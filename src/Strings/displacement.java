package Strings;

import java.util.Scanner;

public class displacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String direction;
        direction = sc.nextLine();
        int x = 0;
        int y = 0;
        for (int i = 0; i < 11; i++) {
            switch (direction) {
                case "N":
                    y++;
                    break;
                case "E":
                    x++;
                    break;
                case "S":
                    y--;
                    break;
                case "W":
                    x--;
                    break;

            }

            double Displacement = Math.sqrt((x * x) + (y * y));

            System.out.println(Displacement);
        }
    }
}
