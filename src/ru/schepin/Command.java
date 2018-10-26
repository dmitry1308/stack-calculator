package ru.schepin;

import java.util.List;

public interface Command {
    void execute/*выполнение*/(List<String> arguments);


}
