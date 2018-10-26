package ru.schepin.commands;

import ru.schepin.CalculatorContext;
import ru.schepin.CalculatorStack;
import ru.schepin.Command;
import ru.schepin.annotations.In;
import ru.schepin.annotations.InType;

import java.util.List;

public class PopCommand implements Command {
    @In(type = InType.STACK)
    private CalculatorStack stack;

    @In(type = InType.CONTEXT)
    private CalculatorContext context;

    @Override
    public void execute(List<String> arguments) {
        float value = stack.pop();
        if (!arguments.isEmpty()) {
            String name = arguments.get(0);
            context.defineValue(name, value);
        }
    }
}
