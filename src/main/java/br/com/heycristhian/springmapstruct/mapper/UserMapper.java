package br.com.heycristhian.springmapstruct.mapper;

import br.com.heycristhian.springmapstruct.dto.request.UserRequest;
import br.com.heycristhian.springmapstruct.dto.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "name", source = "nome")
    @Mapping(target = "lastName", source = "sobrenome")
    @Mapping(target = "age", source = "idade")
    @Mapping(target = "mother.name", source = "nomeMae")
    @Mapping(target = "mother.lastName", source = "sobrenomeMae")
    @Mapping(target = "timestamp", expression = "java(java.time.Instant.now())")
    UserResponse toUserResponse(UserRequest userRequest);
}
