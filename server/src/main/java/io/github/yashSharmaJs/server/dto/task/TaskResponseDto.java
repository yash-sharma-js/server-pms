package io.github.yashSharmaJs.server.dto.task;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class TaskResponseDto {
    private Long id;
    private String title;
    private String description;
    private boolean activeYN;
    private LocalDate dueDate;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Long projectId;
    private Long assignedTo;
}
