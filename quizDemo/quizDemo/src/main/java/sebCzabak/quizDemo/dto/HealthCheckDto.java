package sebCzabak.quizDemo.dto;

import lombok.Getter;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Getter
public class HealthCheckDto {
    private boolean status;
    private String message;



}
