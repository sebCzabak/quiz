package sebCzabak.quizDemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.util.HtmlUtils;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
public class QuestionsDto {
    @JsonProperty("response_code")
    private int responseCode;
    private List<QuestionDto> results;


    @NoArgsConstructor
    @Getter
    @ToString
    public static class QuestionDto {
        private String category;
        private String type;
        private String difficulty;
        private String question;
        @JsonProperty("correct_answer")
        private String correctAnswer;
        @JsonProperty("incorrect_answers")
        private List<String> incorrectAnswers;

        public void setQuestion(final String question) {
            this.question = HtmlUtils.htmlUnescape(question);
        }

        public void setCorrectAnswer(final String correctAnswer) {
            this.correctAnswer = HtmlUtils.htmlUnescape(correctAnswer);
        }


        public void setIncorrectAnswers(final List<String> incorrectAnswers) {
            List<String>newIncorrectAnswers=incorrectAnswers.stream()
                    .map(HtmlUtils::htmlUnescape)
                    .collect(Collectors.toList());
            this.incorrectAnswers = incorrectAnswers;
        }
    }
}
