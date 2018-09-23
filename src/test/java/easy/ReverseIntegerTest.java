package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    @DisplayName("should be true")
    void testNumber(){
        ReverseInteger ri=new ReverseInteger();
        assertEquals(ri.reverse(312),213);

}
}