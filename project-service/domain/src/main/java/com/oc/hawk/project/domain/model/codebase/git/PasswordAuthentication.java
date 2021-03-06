package com.oc.hawk.project.domain.model.codebase.git;

import com.oc.hawk.ddd.DomainValueObject;
import lombok.Data;

@DomainValueObject
@Data
public class PasswordAuthentication {
    private String username;
    private String key;

    public PasswordAuthentication(String username, String key) {
        this.username = username;
        this.key = key;
    }
}
