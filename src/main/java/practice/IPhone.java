package practice;

public class IPhone extends Mobile {

    public IPhone() {
    }

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public IPhone(int limit) {
        super(limit);
    }

    @Override
    public String call(String msg) {
        final String call = super.call(msg);
        return String.format("<iPhone>%s", call);
    }

    @Override
    public String sendMsg(String msg) {
        return String.format("<iPhone> %s", super.sendMsg(msg));
    }
}
