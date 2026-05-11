package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;
    @NotBlank
    @Pattern(
            regexp = "^(?=.*\\d)(?=.*[A-Z]).{8,}$", // (?=.*\d) -> 숫자 하나 이상 포함, (?=.*[A-Z]) -> 대문자 하나 이상 포함, .{8,} -> 전체 길이 8자 이상
            message = "새 비밀번호는 8자 이상이어야 하고, 숫자와 대문자를 포함해야 합니다."
    )
    private String newPassword;
}
