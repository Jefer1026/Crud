package org.jog.crud.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6388907740919444244L;

    @NotBlank
    private String name;

    @DecimalMin(value = "0.01")
    private BigDecimal price;

    @Min(value = 1)
    private Long categoryId;
}
