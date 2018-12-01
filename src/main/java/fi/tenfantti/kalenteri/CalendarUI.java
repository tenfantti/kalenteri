package fi.tenfantti.kalenteri;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("CalendarTheme")
//@Widgetset("com.vaadin.terminal.gwt.DefaultWidgetSet")
public class CalendarUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        layout.addStyleName("backgroundcolor");
        layout.setHeight("100%");
        
        Panel panel = CalendarContent.getApplicationContent();
        
        layout.addComponent(panel);
        layout.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "CalendarUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = CalendarUI.class, productionMode = false)
    public static class CalendarUIServlet extends VaadinServlet {
    }
}
