package com.example.schaduling.model;


import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Message {
    private String id = UUID.randomUUID().toString();
    private String msg;
}
