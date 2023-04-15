package pattern.structural.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        UIForm input = new Input();
        UIForm label = new Label();
        UIForm redInput = new UIFormBorderDecorator(input);
        UIForm redLabel = new UIFormBorderDecorator(label);

        input.show();
        redInput.show();

        label.show();
        redLabel.show();
    }
}
