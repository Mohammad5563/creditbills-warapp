package ICICI;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class MyVaadinPortlet extends Application {

    @Override
    public void init() {
        final Window mainWindow = new Window();

        Button button = new Button("Click me!");
        button.addListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                event.getButton().getWindow()
                        .addComponent(new Label("Hello Vaadin user"));

            }
        });
        mainWindow.addComponent(button);
        setMainWindow(mainWindow);

    }

}
