package practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MobileTest {

    @Test
    public void should_output_msg_when_make_a_call() {
        Mobile mobile = new Mobile();
        final String msg = "output some thing";
        String outputMsg = mobile.call(msg);

        assertEquals(String.format("Message : %s", msg), outputMsg);
    }

    @Test
    public void should_output_mobile_detail_msg() {
        final String name = "name";
        final String color = "color";
        final String brand = "brand";
        Mobile mobile = new Mobile(name, color, brand);

        String detail = mobile.detail();

        assertEquals(String.format("name: [%s], color: [%s], brand: [%s]",
                name, color, brand), detail);
    }

}