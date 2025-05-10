package lab2.lab2;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
public class Prog2 {
			public static void main(String args[])throws Exception {
			JSONParser jsonparser = new JSONParser();
			FileReader reader= new FileReader ("json/student.json");
		Object obj = jsonparser.parse(reader);
		JSONObject empobj = (JSONObject)obj;
		String fname=(String)empobj.get("Firstname");
		String lname=(String)empobj.get("Lastname");
		System.out.println("FIRST NAME:"+fname);
		System.out.println("LAST NAME:"+lname);
		}
	}
