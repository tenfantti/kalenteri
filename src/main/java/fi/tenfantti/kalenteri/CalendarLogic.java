/**
 * 
 */
package fi.tenfantti.kalenteri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.vaadin.shared.ui.ContentMode;

//import org.vaadin.youtubeplayer.YouTubePlayer;

import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import beans.Day;

/**
 * @author Janita
 * @version 24.11.2018
 *
 */
public class CalendarLogic {
	
	private static HashMap<Integer, String> contents;
	static {
		contents = new HashMap<>();
		contents.put(1, "https://www.sinelli.fi/enkeli-nahkapaperisuikaleista-i?___store=fi");
		contents.put(2, "https://www.valio.fi/reseptit/terastetty-glogi-1/");
		contents.put(3, "https://www.elle.com/uk/beauty/hair/articles/g32343/easy-christmas-hairstyles/");
		contents.put(4, "https://www.youtube.com/watch?v=9BmoafN_nGo");
		contents.put(5, "https://www.miniclip.com/games/ice-temple/en/#t-c-f-C");
		contents.put(6, "https://www.bookbub.com/blog/2017/11/21/christmas-books-for-adults-2017");
		contents.put(7, "https://www.valio.fi/reseptit/joulupulla/");
		contents.put(8, "https://www.imdb.com/title/tt1807892/");
		contents.put(9, "https://www.goodreads.com/quotes/tag/christmas");
		contents.put(11, "https://www.youtube.com/watch?v=ZL5hBrtuaH8&list=PLYSm1EQfVs4hWWvZWPvwlln4o_FEod81R");
		contents.put(13, "https://www.independent.co.uk/life-style/christmas-how-feel-good-body-positive-diet-workout-gym-body-positive-a8116336.html");
		contents.put(15, "http://www.vegaanituotteet.net/joulu/");
		contents.put(17, "https://www.wikihow.com/Feel-Happy-when-Christmas-Is-Over");
		contents.put(19, "https://www.momondo.com/discover/article/christmas-traditions-around-the-world");
		contents.put(21, "https://www.bbcgoodfood.com/howto/guide/10-feel-good-foods-christmas-0");
		contents.put(23, "https://www.youtube.com/watch?v=L2UCRNldC3s");
		contents.put(24, "https://www.youtube.com/watch?v=8hz84ZBIsbE");
	}


	public static Component getContentBasedOnDate(int dayNumber) {
		VerticalLayout layout = new VerticalLayout();
		Label label = new Label();
		
		if (dayNumber == 1 || dayNumber == 2 || dayNumber == 3 || dayNumber == 4 ||
				dayNumber == 5 || dayNumber == 6 || dayNumber == 7 || dayNumber == 8 ||
				dayNumber == 9 || dayNumber == 11 || dayNumber == 13 || dayNumber == 15 ||
				dayNumber == 17 || dayNumber == 19 || dayNumber == 21 || dayNumber == 23) {
			label.setCaption("Sinut siirretään toiselle sivulle, pieni hetki...");
			layout.addComponent(label);
			CalendarUI.getCurrent().getUI().getPage().setLocation(contents.get(dayNumber));
		} else if (dayNumber == 24) {
			label.setCaption("Hyvää joulua! Saat kalenterilahjan sekä bonusyllätyksen.");
			
			Button presentButton = new Button("Jouluylläri!");
			presentButton.addStyleName(ValoTheme.BUTTON_FRIENDLY);
			presentButton.addClickListener(e -> {
				CalendarUI.getCurrent().getUI().getPage().setLocation(contents.get(dayNumber));
			});
			
			layout.addComponents(label, new Label(), presentButton);
		} else {
			label.setCaption("Tänään on aika avata kalenterilahjasi.");
			layout.addComponent(label);
		}

		
		return layout;
	}

}
