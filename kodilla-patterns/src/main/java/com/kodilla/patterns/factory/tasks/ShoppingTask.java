package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;
    private boolean isTaskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if (isTaskExecuted()) {
            System.out.println("Task: " + getTaskName() + " was executed before");
        } else {
            System.out.println("Task: " + getTaskName() + " executed");
            this.isTaskExecuted = true;
        }
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
