/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author thiag
 */
public class Task {
    private String task;
    private LocalDate startDate;
    private LocalDate endDate;
    private TaskStatus status;
    
    public Task(String task, LocalDate startDate, LocalDate endDate){
        this.task = task;
        this.startDate = startDate;
        this.endDate = endDate;
        status = TaskStatus.DOING;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    
    
    public LocalDate getEndDate() {
        return endDate;
    }
    
    public void setStatus(TaskStatus status){
        this.status = status;
    }
    
    public TaskStatus getStatus() {
        return status;
    }
    
    
    
    
}
