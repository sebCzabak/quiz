package sebCzabak.quizDemo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HealthCheckDto {
    private boolean status;
    private String message;



}
