import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sayHello() {
        SayHello hello = new SayHello();
        final String response = hello.sayHello();
        Assertions.assertEquals("hello", response);
    }
}