package ru.schepin.commands;

import ru.schepin.CalculatorStack;
import ru.schepin.Command;
import ru.schepin.annotations.In;
import ru.schepin.annotations.InType;

import java.util.List;

public class SqrtCommand implements Command {
    @In(type = InType.STACK)
    private CalculatorStack stack;

    @Override
    public void execute(List<String> arguments) {
//        if (context.isEmpty()) {
//            System.out.println("Стек пустой");
//        } else {
//            context.push((float) Math.sqrt(context.pop()));
//        }
        float value = stack.pop();
        float result = (float) Math.sqrt(value);
        stack.push(result);
    }
}
