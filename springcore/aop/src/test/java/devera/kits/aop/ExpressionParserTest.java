package devera.kits.aop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExpressionParserTest {
    
    @Value("#{ 1 + 1 }")
    int total;


    @Test
    void shouldHaveTotal() {
        assertEquals(total, 2);
    }
}
