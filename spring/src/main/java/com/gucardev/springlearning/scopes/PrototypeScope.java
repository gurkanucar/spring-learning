package com.gucardev.springlearning.scopes;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
@Component
@Data
public class PrototypeScope {
    private String value;
}