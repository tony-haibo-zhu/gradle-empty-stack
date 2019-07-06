package practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IPhoneTest {

    @Test
    public void should_output_iphone_msg_when_call_using_iphone() {
        IPhone iPhone = new IPhone();

        final String msg = "iphone some msg";
        String outputMsg = iPhone.call(msg);

        assertEquals(String.format("<iPhone>Message : %s", msg), outputMsg);
    }
}
