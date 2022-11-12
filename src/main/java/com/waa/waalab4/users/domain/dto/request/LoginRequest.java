package com.waa.waalab4.users.domain.dto.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
