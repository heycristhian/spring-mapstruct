package br.com.heycristhian.springmapstruct.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotherResponse {

    private String name;
    private String lastName;
}
