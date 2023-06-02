package edu.miu.springdata1.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewCriteriaRequest {

    private String comment;
    private Integer numberOfStars;
    private Integer productId;
}
