package br.com.heycristhian.springmapstruct.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String nome;
    private String sobrenome;
    private int idade;
    private String nomeMae;
    private String sobrenomeMae;
}
