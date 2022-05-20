package sebCzabak.quizDemo.Frontend;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Data
@Component
public class GameOptions {

    private int numberOfQuestions = 5;
    @Getter
    private Difficulty difficulty;
    private int categoryId;

}
