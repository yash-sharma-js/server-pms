package io.github.yashSharmaJs.server.mapper;

import io.github.yashSharmaJs.server.dto.project.ProjectRequestDto;
import io.github.yashSharmaJs.server.dto.project.ProjectResponseDto;
import io.github.yashSharmaJs.server.entity.Project;
import io.github.yashSharmaJs.server.entity.Task;
import org.mapstruct.*;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    @Mapping(source = "owner.userId", target = "ownerId")
    @Mapping(target = "taskIds", expression = "java(mapTaskIds(project.getTasks()))")
    ProjectResponseDto toDto(Project project);

    Project toEntity(ProjectRequestDto dto);

    // Helper method to extract task IDs
    default List<Long> mapTaskIds(List<Task> tasks) {
        if (tasks == null) return null;
        return tasks.stream().map(Task::getId).collect(Collectors.toList());
    }
}
