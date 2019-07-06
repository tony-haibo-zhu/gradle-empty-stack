package practice;

public class IPhone extends Mobile {

    @Override
    public String call(String msg) {
        final String call = super.call(msg);
        return String.format("<iPhone>%s", call);
    }
}
