package guru.springframework.springairagexpert.services;

import guru.springframework.springairagexpert.model.Answer;
import guru.springframework.springairagexpert.model.Question;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class OpenAIServiceTest {

    @Autowired
    private OpenAIService openAIService;

    @Test
    void getAnswer() {
        Answer tellAboutSpiderman = openAIService.getAnswer(new Question("mam najmensiu lod na svete - ake auto mam pouzit na tahanie ?"));
        log.info("tellAboutSpiderman: {}", tellAboutSpiderman.answer());
    }
}