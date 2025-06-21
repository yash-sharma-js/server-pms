package io.github.yashSharmaJs.server.mapper;

import io.github.yashSharmaJs.server.dto.task.TaskRequestDto;
import io.github.yashSharmaJs.server.dto.task.TaskResponseDto;
import io.github.yashSharmaJs.server.entity.Task;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    @Mapping(source = "project.id", target = "projectId")
    @Mapping(source = "assignedTo.userId", target = "assignedTo")
    TaskResponseDto toDto(Task task);

    // For creating new Task from input DTO (relations are set in service)
    Task toEntity(TaskRequestDto dto);
}
