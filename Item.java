package system;

import java.awt.image.BufferedImage;

public class Item {
	String Name;
	String Type;
	String Date;
	String Place;
	BufferedImage Image;
	String Date_of_found;

	Item(String Name, String Type, String Date, String Place, String Date_of_found) {
		this.Name = Name;
		this.Type = Type;
		this.Date = Date;
		this.Place = Place;
		this.Date_of_found = Date_of_found;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public BufferedImage getImage() {
		return Image;
	}

	public void setImage(BufferedImage image) {
		Image = image;
	}

	public String getDate_of_found() {
		return Date_of_found;
	}

	public void setDate_of_found(String date_of_found) {
		Date_of_found = date_of_found;
	}

}
