package com.toda.examples;

public class StrategyPatternJavaImpl extends StrategyPatternJava {

    @Override
    protected boolean isSecondActionRequired() {
        return false;
    }

    @Override
    String doPrimary() {
        return "action in StrategyPatternJavaImpl";
    }
}
