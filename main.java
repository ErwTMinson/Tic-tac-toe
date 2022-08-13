package tic_tac_toe;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        for(int i = 0; i < (variables.max_amount_steps) + 2; i++) {
            variables.steps.add(Integer.toString(i));
        }

        System.out.println(variables.how_to_use);
        game_actions.print_table();


        while (variables.amount_steps < variables.max_amount_steps) {


            System.out.print("Now step " + variables.now_plaing + ": ");
            Scanner get = new Scanner(System.in);
            int result = get.nextInt();

            if (result > variables.max_amount_steps) {
                System.out.println("Number need smaller than: " + Integer.toString(variables.max_amount_steps) + "!\n");
                continue;
            }

            System.out.println();
            String choosed_cell = variables.steps.get(result);

            // if (choosed_cell != "O" || choosed_cell != "X") {
            if (Character.isDigit(choosed_cell.charAt(0))) {
                
                variables.steps.set(result, variables.now_plaing);                
                variables.amount_steps++;

                game_actions.print_table();

                if (game_actions.check_to_win()) {
                    System.out.println("Player with nick-name \'" + variables.now_plaing + "\' won the game!");
                    break;
                } else {
                    if (variables.amount_steps > variables.max_amount_steps) {
                        System.out.println("Nobody won!");
                    }
                }
    
                if (variables.now_plaing == "X") {
                    variables.now_plaing = "O";
                } else if (variables.now_plaing == "O") {
                    variables.now_plaing = "X";
                }

            } else {
                System.out.println("This cell was be selected!");
            }

        }

    }
}
