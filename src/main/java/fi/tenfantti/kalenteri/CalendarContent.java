/**
 * 
 */
package fi.tenfantti.kalenteri;

import java.util.Calendar;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

/**
 * @author Janita
 * @version 24.11.2018
 *
 */
public class CalendarContent {

	/**
	 * @return panel including the calendar and its activity
	 */
	public static Panel getApplicationContent() {
		Panel panel = new Panel();
//		panel.addStyleName("location");
		panel.setHeight("85%");
		panel.setWidth("70%");
		VerticalLayout innerLayout = new VerticalLayout();
		
		Label header = new Label("Joulukalenteri 2018");
		header.addStyleName(ValoTheme.LABEL_H1);
		header.addStyleName("headerfont");
		
        GridLayout grid = new GridLayout(4, 6);
        grid.setHeight("70%");
        
        innerLayout.addComponents(header, new Label(), grid);
        innerLayout.setComponentAlignment(header, Alignment.TOP_CENTER);
        innerLayout.setComponentAlignment(grid, Alignment.MIDDLE_CENTER);
        panel.setContent(innerLayout);
        
        Calendar cal = Calendar.getInstance();
        int today = cal.get(Calendar.DAY_OF_MONTH);
        
        int day = 1;
        for (int i = 0; i < 24; i++) {
        	DayButton button = new DayButton(day);
        	if (today < day) {
        		button.setEnabled(false);
        	}
        	grid.addComponent(button);
        	
        	day++;
        }
        
        grid.setSpacing(true);
        
		return panel;
	}

}
