package tic_tac_toe;

// import java.util.ArrayList;

class game_actions {

    public static void print_line() {
        System.out.print("+");

        for(int i = 0; i < variables.max_table_length; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println("");
    }

    public static void print_table() {
        int summary_columns_printed = 0;

        for(int j = 0; j < variables.amount_columns; j++) {

            print_line();
    
            for(int i = 0; i < variables.amount_columns; i++) {
                summary_columns_printed++;
                System.out.print("| " + variables.steps.get(summary_columns_printed) + " ");

            }
            System.out.print("|");
            System.out.println("");
        }

        print_line();

    }

    public static boolean check_to_win() {

        for(int i = 0; i < variables.max_amount_steps; i += 3) {
            if (variables.steps.get(i + 1) == variables.now_plaing &&
                variables.steps.get(i + 2) == variables.now_plaing &&
                variables.steps.get(i + 3) == variables.now_plaing) {
                
                return true;
            }
        }

        for(int i = 0; i < variables.amount_columns; i += 1) {

            if (variables.steps.get(i) == variables.now_plaing &&
                variables.steps.get(i + 3) == variables.now_plaing &&
                variables.steps.get(i + 6) == variables.now_plaing) {
                
                return true;
            }
        }

        for(int i = 0; i < variables.amount_columns; i += 1) {

            if (variables.steps.get(i) == variables.now_plaing &&
                variables.steps.get(i + 3) == variables.now_plaing &&
                variables.steps.get(i + 6) == variables.now_plaing) {
                
                return true;
            }
        }

        if (variables.steps.get(1) == variables.now_plaing &&
            variables.steps.get(5) == variables.now_plaing &&
            variables.steps.get(9) == variables.now_plaing || 

            variables.steps.get(3) == variables.now_plaing &&
            variables.steps.get(5) == variables.now_plaing &&
            variables.steps.get(7) == variables.now_plaing) {

            return true;
        }

        return false;

    }

}
