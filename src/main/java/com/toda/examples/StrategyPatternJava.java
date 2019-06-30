package com.toda.examples;

abstract class StrategyPatternJava {

    /**
     * AlgorithmSkeleton
     */
    public final void execute() {
        loggingAction(doPrimary());
        if (isSecondActionRequired()) {
            doSecondaryAction();
        }
    }

    private void loggingAction(final String doPrimary) {
        System.out.println("This is primary action output: " + doPrimary);
    }

    protected void doSecondaryAction() {
        System.out.println("Second action completed successfully");
    }

    protected abstract boolean isSecondActionRequired();

    abstract String doPrimary();

}
