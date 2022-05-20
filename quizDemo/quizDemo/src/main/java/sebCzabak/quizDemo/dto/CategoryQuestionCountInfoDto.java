//package sebCzabak.quizDemo.dto;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//import sebCzabak.quizDemo.Frontend.Difficulty;
//
//@NoArgsConstructor
//@ToString
//public class CategoryQuestionCountInfoDto {
//    @JsonProperty("category_id")
//    private int categoryId;
//
//    @JsonProperty("category_question_count")
//    private CategoryQuestionCountInfoDto categoryQuestionCountInfoDto;
//
//    public int getTotalQuestionCount(){
//        return categoryQuestionCount.totalQuestionCount;
//    }
//
//    public int getQuestionCountForDifficulty(Difficulty difficulty) {
//        switch (difficulty) {
//            case EASY:
//                return categoryQuestionCount.totalEasyQuestionCount;
//            case MEDIUM:
//                return categoryQuestionCount.totalMediumQuestionCount;
//            case HARD:
//                return categoryQuestionCount.totalHardQuestionCount;
//        }
//        return 0;
//    }
//
//    @NoArgsConstructor
//    @Getter
//    @ToString
//    public static class CategoryQuestionCountDto{
//        @JsonProperty("total_question_count")
//        private int totalQuestionCount;
//        @JsonProperty("total_easy_question_count")
//        private int totalEasyQuestionCount;
//        @JsonProperty("total_medium_question_count")
//        private int totalMediumQuestionCount;
//        @JsonProperty("total_hard_question_count")
//        private int totalHardQuestionCount;
//    }
//}
