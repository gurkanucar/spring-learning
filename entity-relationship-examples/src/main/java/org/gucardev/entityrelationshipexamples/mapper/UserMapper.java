package org.gucardev.entityrelationshipexamples.mapper;

import org.gucardev.entityrelationshipexamples.dto.UserDTO;
import org.gucardev.entityrelationshipexamples.model.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "occupation.category", ignore = true)
    @Mapping(target = "status.category", ignore = true)
    UserDTO toDto(User entity);

    @Mapping(source = "occupationId", target = "occupation.id")
    @Mapping(source = "statusId", target = "status.id")
    User toEntity(UserDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "occupation", ignore = true)
    void updateFromDto(UserDTO dto, @MappingTarget User entity);
}
