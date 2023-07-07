package com.tj.edu.practice5.lombok.model;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Member {
    private Long id;
    private Integer age;
}
