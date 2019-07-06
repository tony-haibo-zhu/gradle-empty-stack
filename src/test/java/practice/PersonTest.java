package practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void should_not_to_send_msg_when_msg_length_exceed_iphone_limit() {
        Person person = new Person();

        Mobile phone = new IPhone(5);
        String result = person.sendMsg(phone, "this msg exceed iphone limit");

        assertEquals("<iPhone> Message cannot be sent", result);
    }

    @Test
    public void should_not_to_send_msg_when_msg_length_exceed_android_limit() {
        Person person = new Person();

        Mobile phone = new Android(10);
        String result = person.sendMsg(phone, "this msg exceed iphone limit");

        assertEquals("<Android> Message cannot be sent", result);
    }

    @Test
    public void should_send_iphone_msg() {
        Person person = new Person();

        Mobile phone = new IPhone(20);
        final String msg = "valid msg";
        String result = person.sendMsg(phone, msg);

        assertEquals(String.format("<iPhone> %s", msg), result);
    }

    @Test
    public void should_send_android_msg() {
        Person person = new Person();

        Mobile phone = new Android(20);
        final String msg = "valid msg";
        String result = person.sendMsg(phone, msg);

        assertEquals(String.format("<Android> %s", msg), result);
    }
}
