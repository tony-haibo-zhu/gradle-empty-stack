package practice;

public class Android extends Mobile {

    @Override
    public String call(String msg) {
        final String call = super.call(msg);

        return String.format("<Android>%s", call);
    }
}
