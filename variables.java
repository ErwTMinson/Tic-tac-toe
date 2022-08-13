package tic_tac_toe;

import java.util.ArrayList;

public class variables {
    static int max_table_length = 11;
    static int amount_steps = 0;
    static int amount_columns = 3;
    static int max_amount_steps = variables.amount_columns * variables.amount_columns;
    static String now_plaing = "X";
    static ArrayList<String> steps = new ArrayList<>();
    static String how_to_use = "- Tic-tac-toe -\n\nHOW TO USE: Every cell have a number, for select any cell enter a its number cell.\n\n";

}
