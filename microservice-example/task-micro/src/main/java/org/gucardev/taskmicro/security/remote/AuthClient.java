package org.gucardev.taskmicro.security.remote;

import org.gucardev.taskmicro.security.dto.LoginRequest;
import org.gucardev.taskmicro.security.dto.TokenDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "auth-micro")
public interface AuthClient {
    @PostMapping("/auth/generate-service-token")
    ResponseEntity<TokenDto> generateServiceToken(@RequestBody LoginRequest loginRequest);
}
