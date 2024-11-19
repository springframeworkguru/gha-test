package guru.springframework.lombokbestpractices;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LombokBestPracticesApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFoo() {

        assertEquals(1, 1);
    }
}
