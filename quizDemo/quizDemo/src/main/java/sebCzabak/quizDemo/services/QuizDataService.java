package sebCzabak.quizDemo.services;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import sebCzabak.quizDemo.Frontend.GameOptions;
import sebCzabak.quizDemo.dto.CategoriesDto;
import sebCzabak.quizDemo.dto.QuestionsDto;

import java.net.URI;
import java.util.List;


@Service
@Log
public class QuizDataService {

@Autowired
private GameOptions gameOptions;

    public List<CategoriesDto.CategoryDto> getQuizCategories() {
        RestTemplate restTemplate = new RestTemplate();

        CategoriesDto result = restTemplate.getForObject("https://opentdb.com/api_category.php", CategoriesDto.class);
        log.info("Quiz categories: " + result.getCategories());
        return result.getCategories();
    }

    public List<QuestionsDto.QuestionDto> getQuizQuestions(GameOptions gameOptions) {
        RestTemplate restTemplate = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://opentdb.com/api.php")
                .queryParam("amount", gameOptions.getNumberOfQuestions())
                .queryParam("category", gameOptions.getCategoryId())
                .queryParam("difficulty", gameOptions.getDifficulty().name().toLowerCase())

                .build().toUri();
        log.info("Quiz question retrieve URL: " + uri);

        QuestionsDto result = restTemplate.getForObject(uri, QuestionsDto.class);
        log.info("Quiz questions: " + result.getResults());
        return result.getResults();
    }

}
