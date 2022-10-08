package computercomponentchooser;

import java.util.Scanner;

public class ComputerComponentChooser {
    public static void main(String[] args) {
        Ui.startSession();

        String line;
        Scanner in = new Scanner(System.in);
        line = in.nextLine();

        while (!Parser.checkBye(line)) {
            if (Parser.checkEdit(line)) {
                while (!EditParser.checkBack(line)) {
                    //EditParser.parse(line);
                    line = in.nextLine();
                }
            }
            //Parser.parse(Manager, line); To be added
            //Parser.parse(line);
            line = in.nextLine();

        }

        Ui.endSession();
    }
}
