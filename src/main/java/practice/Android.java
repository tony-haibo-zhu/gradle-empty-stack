package practice;

public class Android extends Mobile {
    public Android() {
    }

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    public Android(int limit) {
        super(limit);
    }

    @Override
    public String call(String msg) {
        final String call = super.call(msg);

        return String.format("<Android>%s", call);
    }

    @Override
    public String sendMsg(String msg) {
        return String.format("<Android> %s", super.sendMsg(msg));
    }
}
