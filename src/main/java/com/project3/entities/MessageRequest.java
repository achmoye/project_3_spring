package com.project3.entities;

import lombok.Data;

@Data
public class MessageRequest {
    Integer rental_id;
    Integer user_id;
    String message;
}
