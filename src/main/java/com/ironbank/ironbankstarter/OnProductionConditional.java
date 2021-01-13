package com.ironbank.ironbankstarter;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnProductionConditional implements Condition {

    private static Boolean answer;

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (answer == null) {
            answer = JOptionPane.showInputDialog("Is it production? y/n").toLowerCase().contains("yes");
        }
        return answer;
    }
}
