package practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AndriodTest {

    @Test
    public void should_output_msg_when_android_call() {
        Android android = new Android();

        final String msg = "android some msg";
        String outputMsg = android.call(msg);

        assertEquals(String.format("<Android>Message : %s", msg), outputMsg);
    }
}
