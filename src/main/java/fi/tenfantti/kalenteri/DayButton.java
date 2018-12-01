/**
 * 
 */
package fi.tenfantti.kalenteri;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

/**
 * @author Janita
 * @version 24.11.2018
 * Component including a button
 */
public class DayButton extends CustomComponent {
	
	private Button button;
	private int dayNumber;
	
	public DayButton(int day) {
		this.dayNumber = day;
		init();
	}

	private void init() {
		button = new Button(String.valueOf(dayNumber));
		button.addClickListener(this::buttonClicked);
		button.setWidth("90px");
		button.setHeight("70px");
		button.addStyleNames(ValoTheme.BUTTON_DANGER, "fontstyle");
		
		this.setCompositionRoot(button);
	}
	
	private void buttonClicked(Button.ClickEvent event) {
		Window w = new Window();
		VerticalLayout layout = new VerticalLayout();
		layout.addComponent(CalendarLogic.getContentBasedOnDate(dayNumber));
		
		w.setContent(layout);
		w.setCaption(dayNumber + ". päivä " + FontAwesome.GIFT.getHtml());
		w.setCaptionAsHtml(true);
		w.addStyleName("headercolors");
		w.setWidth("600px");
		w.setHeight("600px");
		w.center();
		UI.getCurrent().addWindow(w);
	}
}
