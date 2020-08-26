package be.dog.d.steven.vaadinchat.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
@CssImport("styles/views/main/main-view.css")
public class MainView extends VerticalLayout {

    private String userName;

    public MainView(){
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setSizeFull();
        addClassName("main-view");

        H1 header = new H1("Vaadin Chat");
        header.getElement().getThemeList().add("dark");

        add(header);

        askUserName();
    }

    private void askUserName(){
        HorizontalLayout userNameLayout = new HorizontalLayout();

        TextField userNameField = new TextField();
        Button startButton = new Button("Enter chat");
        userNameLayout.add(userNameField, startButton);

        startButton.addClickListener(click -> {
            userName = userNameField.getValue();
            remove(userNameLayout);
            showChat();
        });

        add(userNameLayout);
    }

    private void showChat(){
        MessageList messageList = new MessageList();

        add(messageList, createInputLayout());
        expand(messageList);
    }

    private Component createInputLayout() {
        HorizontalLayout inputLayout = new HorizontalLayout();
        inputLayout.setWidth("100%");

        TextField messageField = new TextField();
        Button sendButton = new Button("Send");
        sendButton.getElement().getThemeList().add("primary");

        inputLayout.add(messageField, sendButton);
        inputLayout.expand(messageField);

        return inputLayout;
    }
}
