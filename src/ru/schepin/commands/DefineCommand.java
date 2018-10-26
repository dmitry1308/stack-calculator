package ru.schepin.commands;

import ru.schepin.CalculatorContext;
import ru.schepin.Command;
import ru.schepin.annotations.In;
import ru.schepin.annotations.InType;

import java.util.List;

public class DefineCommand implements Command {
    @In(type = InType.CONTEXT)
    private CalculatorContext context;

    @Override
    public void execute(List<String> arguments) {
        if (arguments.size() < 2) {
            throw new RuntimeException("DefineCommand:  few arguments");
        }
        String name = arguments.get(0);
        String valueStr = arguments.get(1);
        float value = Float.parseFloat(valueStr);
        context.defineValue(name, value);
    }
}
