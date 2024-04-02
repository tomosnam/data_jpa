package com.aliboucoding.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@SuperBuilder
@Entity
@PrimaryKeyJoinColumn(name = "video_id")
public class Video extends Resource {
    private int length;
}
