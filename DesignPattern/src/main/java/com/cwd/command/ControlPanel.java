package com.cwd.command;

public class ControlPanel {

    private static final int CORE = 10;

    private Command[] commands;

    public ControlPanel() {
        commands = new Command[CORE];
        for (int i = 0; i < CORE; ++i) {
            commands[i] = new NoCommand();
        }
    }


    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    public void keyPressed(int index) {
        commands[index].execute();
    }
}
