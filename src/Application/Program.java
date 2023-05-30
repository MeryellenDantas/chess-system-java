package Application;

import BoardGame.Position;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Position position = new Position(3, 5);
        System.out.println(position);

        sc.close();

    }
}
