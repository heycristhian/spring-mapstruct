package br.com.heycristhian.springmapstruct.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String name;
    private String lastName;
    private int age;
    private MotherResponse mother;
    private Instant timestamp;
}
