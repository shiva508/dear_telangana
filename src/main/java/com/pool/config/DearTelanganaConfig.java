package com.pool.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com")
@Data
public class DearTelanganaConfig {
    private String data;
}
