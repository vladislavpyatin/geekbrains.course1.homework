package ru.geekbains.course1.homework;


public class Homework4_freework {


    public static void main(String[] args) {
        int [][] x = new int[3][3];
        for ( int i = 0 ; i <= x.length ; i ++) {
            System . out . print ( i + "   " );
        }
        System . out . println ();
        System . out . println ();

        for ( int i = 0 ; i < x.length ; i ++) {
            System . out . print (( i + 1 ) + "   " );
            for ( int j = 0 ; j < x.length ; j ++) {
                System . out . print ( x [ i ][ j ] + "   " );
            }
            System . out . println ();
            System . out . println ();
        }
        System . out . println ();
    }
}
