new line
import org.watij.webspec.dsl.WebSpec;

public class WebPage {
	public static void main(String[] args) throws Exception {
		String baseUrl = "http://www.google.com";
		WebSpec spec = new WebSpec().ie();
		spec.open("http://www.google.com"); //opens google.com in Mozilla
	}
}
