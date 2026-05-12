import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void shouldReturnHelloMessage() {
        assertEquals("Hello, GitHub Actions!", App.getMessage());
    }
}
