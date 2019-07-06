package practice;

public class IPhone extends Mobile {

    public IPhone() {
    }

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String msg) {
        final String call = super.call(msg);
        return String.format("<iPhone>%s", call);
    }
}
