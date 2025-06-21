package io.github.yashSharmaJs.server.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {
    private Long userId;
    private String userName;
    private String bio;
    private String email;
    private boolean activeYN;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}