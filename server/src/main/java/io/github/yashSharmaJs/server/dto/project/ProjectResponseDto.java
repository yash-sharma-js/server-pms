package io.github.yashSharmaJs.server.dto.project;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class ProjectResponseDto {
    private Long id;
    private String name;
    private String description;
    private boolean activeYN;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Long ownerId;
    private List<Long> taskIds; // Optional: replace with List<TaskSummaryDto> if you want nested data
}
