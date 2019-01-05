package com.company;

public class Main {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int rooms = 7; //sc.nextInt();
        // Scanner sc = new Scanner(System.in);
        int turns = 3; //sc.nextInt();
        boolean[] arr = new boolean[rooms];
        int turn = 0;
        int room = 0;

        for (room = 0; room < rooms; room++) {
            arr[room] = true;
        }
        turn++;

        while (turn <= turns) {
            for (room = turn; room < rooms; room = room + turn) {
                if (arr[room] == false) {
                    arr[room] = true;
                    break;
                }
                if (arr[room] == true) {
                    arr[room] = false;
                    break;
                }
                System.out.print(arr[room] + " ");
            }
            turn++;
        }
        for (room = 0; room < rooms; room++) {
            System.out.print(arr[room] + " ");
        }
    }
}
