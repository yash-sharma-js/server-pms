package io.github.yashSharmaJs.server.mapper;

import io.github.yashSharmaJs.server.dto.user.UserRequestDto;
import io.github.yashSharmaJs.server.dto.user.UserResponseDto;
import io.github.yashSharmaJs.server.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserResponseDto toDto(User user);

    User toEntity(UserRequestDto dto);
}
