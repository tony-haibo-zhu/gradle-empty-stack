package practice;

import static org.junit.Assert.assertEquals;

public class MobileTest {

    public void should_output_msg_when_make_a_call() {
        Mobile mobile = new Mobile();
        final String msg = "output some thing";
        String outputMsg = mobile.call(msg);

        assertEquals(String.format("Message: %s", msg), outputMsg);
    }

}