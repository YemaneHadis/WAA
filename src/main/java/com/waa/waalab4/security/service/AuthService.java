package com.waa.waalab4.security.service;

import com.waa.waalab4.users.domain.dto.request.LoginRequest;
import com.waa.waalab4.users.domain.dto.request.RefreshTokenRequest;
import com.waa.waalab4.users.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
}
