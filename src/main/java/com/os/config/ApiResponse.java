package com.os.config;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private boolean success;
    private String message;

    public String getTimestamp(){
        return LocalDateTime.now().toString();
    }

}
