package ru.schepin.commands;

import ru.schepin.CalculatorStack;
import ru.schepin.Command;
import ru.schepin.annotations.In;
import ru.schepin.annotations.InType;

import java.util.List;

public class SubtractionCommand implements Command{
    @In(type = InType.STACK)
    private CalculatorStack stack;

    @Override
    public void execute(List<String> arguments) {
        float value1 = stack.pop();
        float value2 = stack.pop();
        float result = value2 - value1;
        stack.push(result);
    }
}
