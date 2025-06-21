package io.github.yashSharmaJs.server.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    private String userName;
    private String bio;
    private String email;
    private String password;
}
