package copy.boot.bean;


public class Apple implements Fruit{

    private static final long serialVersionUID = -2932235033727746232L;

    @Override
    public void eat() {
        System.out.println("eat apple");
    }
}
