package sebCzabak.quizDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sebCzabak.quizDemo.dto.HealthCheckDto;

@RestController
@RequestMapping(path="/api/health")
public class HealthCheckRestController {

    @GetMapping
    public HealthCheckDto healthCheck(){
        HealthCheckDto dto = new HealthCheckDto(true,"It's working!");
        return dto;
    }
}
