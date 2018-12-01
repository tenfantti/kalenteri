/**
 * 
 */
package beans;

/**
 * @author Janita
 * @version 22.11.2018
 *
 */
public class Day {
	
	private String url;
	private boolean isGiftDay = false;
	private boolean isVideo = false;
	
	public Day(String url, boolean hasVideoContent) {
		this.setUrl(url);
		this.setVideo(hasVideoContent);
	}
	
	public Day(boolean hasGift) {
		this.setGiftDay(hasGift);
	}

	/**
	 * @return the isGiftDay
	 */
	public boolean isGiftDay() {
		return isGiftDay;
	}

	/**
	 * @param isGiftDay the isGiftDay to set
	 */
	public void setGiftDay(boolean isGiftDay) {
		this.isGiftDay = isGiftDay;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the isVideo
	 */
	public boolean isVideo() {
		return isVideo;
	}

	/**
	 * @param isVideo the isVideo to set
	 */
	public void setVideo(boolean isVideo) {
		this.isVideo = isVideo;
	}
	

}
