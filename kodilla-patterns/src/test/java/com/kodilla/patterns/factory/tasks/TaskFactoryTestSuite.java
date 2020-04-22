package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        assert drivingTask != null;
        Boolean taskNotDone = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        Boolean taskDone = drivingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Wczasy", drivingTask.getTaskName());
        Assert.assertFalse(taskNotDone);
        Assert.assertTrue(taskDone);
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        assert paintingTask != null;
        Boolean taskNotDone = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        Boolean taskDone = paintingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Dom", paintingTask.getTaskName());
        Assert.assertFalse(taskNotDone);
        Assert.assertTrue(taskDone);
    }
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        assert shoppingTask != null;
        Boolean taskNotDone = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        Boolean taskDone = shoppingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Zima", shoppingTask.getTaskName());
        Assert.assertFalse(taskNotDone);
        Assert.assertTrue(taskDone);
    }
}
