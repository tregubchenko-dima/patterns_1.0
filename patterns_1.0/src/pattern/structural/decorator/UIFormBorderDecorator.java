package pattern.structural.decorator;

public class UIFormBorderDecorator implements UIForm{

    private final UIForm uiForm;

    public UIFormBorderDecorator(UIForm uiForm) {
        this.uiForm = uiForm;
    }

    @Override
    public void show() {
        uiForm.show();
        System.out.println(" with a red border");
    }
}
