package be.dog.d.steven.vaadinchat.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HelloWorld extends VerticalLayout {

    public HelloWorld(){
        add(new H1("Hello world"));
    }

}
