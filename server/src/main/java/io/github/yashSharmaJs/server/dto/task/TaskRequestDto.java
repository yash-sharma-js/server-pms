package io.github.yashSharmaJs.server.dto.task;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskRequestDto {
    private String title;
    private String description;
    private LocalDate dueDate;
    private Long projectId;
    private Long assignedTo;
}
