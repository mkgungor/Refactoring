import java.util.Date;

public abstract class Document {
	private String title;
	private String author;
	private Date date;
	private PublishingLocation address;
	
	Document(String title, String author, Date date, String city, String state, String postCode){
		this.title = title;
		this.author = author;
		this.date = date;
		this.address = new PublishingLocation(city, state, postCode);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getCity() {
		return address.getCity();
	}
	
	public String getState() {
		return address.getState();
	}
	
	public String getPostCode() {
		return address.getPostCode();
	}
	
	public boolean sameAuthor(Document article){
		return this.author.equals(article.author);
	}
	
	public int compareDates(Document article){
		return this.date.compareTo(article.date);
	}
	
	public int compareWithGeneralDate(Date date){
		return this.date.compareTo(date);
	}
}
