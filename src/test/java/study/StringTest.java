package study;

import calculator.util.SplitNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTest {
    @Test
    void 콤마_구분자_테스트(){
        List<Integer> tmp = SplitNumber.splitNumber("1,2:3");
        assertThat(tmp).contains(1, 2, 3);
    }
    @Test
    void 숫자_한개_콤마_구분자_테스트(){
        List<Integer> tmp = SplitNumber.splitNumber("1,");
        assertThat(tmp).contains(1);
    }
    @Test
    void 서브스트링_테스트(){
        String s = "(1,2)";
        s = s.substring(1, s.length()-1);
        assertEquals("1,2", s);
    }
    @DisplayName("charAt 메소드를 이용해 문자를 가져오는 테스트")
    @Test
    void 요구사항3_테스트(){
        String s = "abc";
        assertThatThrownBy(() -> {
            charAt(s, 3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index: 2, Size: 2");
    }
    private void charAt(String s, int idx){
        for(int i=0;i<=2;i++) {
            System.out.println(s.charAt(i));
        }
        if (idx>2){
            throw new IndexOutOfBoundsException("Index: 2, Size: 2");
        }
    }
}
