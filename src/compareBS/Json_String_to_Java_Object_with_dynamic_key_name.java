package compareBS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

public class Json_String_to_Java_Object_with_dynamic_key_name {
	public class Details {
		private String message;
		private String status;
		private Map<String, List<UserDetails>> users = new HashMap<String, List<UserDetails>>();

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Map<String, List<UserDetails>> getUsers() {
			return users;
		}

		public void setUsers(Map<String, List<UserDetails>> users) {
			this.users = users;
		}
	}

	public class UserDetails {
		private String time;
		private String age;
		private Map<String, String> prop = new HashMap<String, String>();

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public Map<String, String> getProp() {
			return prop;
		}

		public void setProp(Map<String, String> prop) {
			this.prop = prop;
		}
	}

	public static String readFile(String path) throws IOException {
		String sCurrentLine;
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
			}
		}
		return sb.toString();
	}
	public static String formatJSON(String env, String client, String jsonString) throws Exception {
		// This is format Json Object. All Compare APIs are Json Object not Array.

//		JsonParser parser = new JsonParser();
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//		JsonElement el = parser.parse(jsonString);
//		jsonString = gson.toJson(el); // done

		// if it's not already, convert to a JSON object
		JSONObject jsonObject = new JSONObject(jsonString);
		// To string method prints it with specified indentation
//		System.out.println(jsonObject.toString(4));

		jsonString = jsonObject.toString(4);

		return jsonString;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting...");
		String jsonString = readFile(
				"C:\\Users\\Zhoul\\OneDrive - JD Power\\Meeting\\Compare\\Team Standup Meeting\\0_Automation_Important\\json-test.txt");
		
		jsonString=formatJSON("env","client",jsonString);
		
		System.out.println("Json String = \n"+jsonString);
		
		JSONObject jsonObject = new JSONObject(jsonString);
		
		
		
		UserDetails dts = new UserDetails();
		
		
		
		System.out.println("Json String = \n"+jsonString);
		
//		
//		
//		
//		
//		
//		
//		
//		
		
	}

}
