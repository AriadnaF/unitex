package lv.tsi.unitex;

import asg.cliche.ShellFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("calc",
                                        "Calculator",
                                         new Calculator()).commandLoop();
    }
}
