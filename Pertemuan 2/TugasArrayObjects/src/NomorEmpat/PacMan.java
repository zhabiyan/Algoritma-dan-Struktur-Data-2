/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorEmpat;

/**
 *
 * @author Nada Alya
 */
public class PacMan {

    static int x = 0;
    static int y = 0;
    static int width;
    static int height;
    static String select;

    public static void moveLeft() {
        x -= 1;
    }

    public static void moveRight() {
        x += 1;
    }

    public static void moveUp() {
        y -= 1;
    }

    public static void moveDown() {
        y += 1;
    }

    public static void printPosition() {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                if (i == y && j == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
