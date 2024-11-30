package study;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    //@BeforeEach -> 테스트 실행 전 무조건 실행. 일관된 테스트 환경
    //@AfterEach -> 테스트 수행 이후, ex) db에 저장값 clear
    private Set<Integer> numbers;
    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
    @Test
    void size(){
        assertEquals(3, numbers.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testContains(int value) {
        assertTrue(numbers.contains(value));
    }

    @ParameterizedTest
    @CsvSource({
            "4, false",
            "5, false",
            "6, false"
    })
    void testNotContains(int value, boolean expected) {
        assertEquals(expected, numbers.contains(value));
    }
}
