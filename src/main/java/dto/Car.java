package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Car {
    String model;
    BigDecimal price;
    Color color;
}
