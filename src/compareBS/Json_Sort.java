package compareBS;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cPP.JSONParser;

public class Json_Sort {
	public static String jsonArraySort(String jsonArrayString, String fieldToSort) throws Exception {
		String afterSorted = "";
		JSONArray jsonArr = new JSONArray(jsonArrayString);
		JSONArray sortedJsonArray = new JSONArray();

		List<JSONObject> jsonValues = new ArrayList<JSONObject>();
		int leg = jsonArr.length();
		for (int i = 0; i < jsonArr.length(); i++) {
			jsonValues.add(jsonArr.getJSONObject(i));
		}
		Collections.sort(jsonValues, new Comparator<JSONObject>() {
			// You can change "Name" with "ID" if you want to sort by ID
			private final String KEY_NAME = fieldToSort;

			@Override
			public int compare(JSONObject a, JSONObject b) {
				String valA = new String();
				String valB = new String();

				try {
					valA = (String) a.get(KEY_NAME);
					valB = (String) b.get(KEY_NAME);
				} catch (JSONException e) {
					// do something
				}

				return valA.compareTo(valB);
				// if you want to change the sort order, simply use the following:
				// return -valA.compareTo(valB);
			}
		});

		for (int i = 0; i < jsonArr.length(); i++) {
			sortedJsonArray.put(jsonValues.get(i));
		}
//		System.out.println("sortedJsonArray = " + sortedJsonArray);
		String jsonString = sortedJsonArray.toString();
//		System.out.println("jsonString = " + jsonString);
		String afterFormatJsonString = com_libs.formatJSONArray("Env", "Client", jsonString);

//		System.out.println("afterFormatJsonString = " + afterFormatJsonString);

		return afterFormatJsonString;
	};

	public static String jsonObjectSort(String jsonObjectString, String fieldToSort) throws Exception {
		String afterSorted = "";
		
		class MyJSONComparator implements Comparator<JSONObject> {

			@Override
			public int compare(JSONObject o1, JSONObject o2) {
				String v1 = (String) ((JSONObject) o1.get("attributes")).get(fieldToSort);
				String v3 = (String) ((JSONObject) o2.get("attributes")).get(fieldToSort);
				return v1.compareTo(v3);
			}
		}
		
		
		
//		JSONParser parser = new JSONParser();
//		try {
//			JSONObject o = (JSONObject) parser.parse(new FileReader("test3.json"));
//			JSONArray array = (JSONArray) o.get("results");
//			ArrayList<JSONObject> list = new ArrayList<>();
//
//			for (int i = 0; i < array.size(); i++) {
//				list.add((JSONObject) array.get(i));
//			}
//			Collections.sort(list, new MyJSONComparator());
//
//			for (JSONObject obj : list) {
//				System.out.println(((JSONObject) obj.get("attributes")).get("OBJECTID"));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return afterSorted;
		
		JSONObject obj = new JSONObject(jsonObjectString);
		JSONArray resultsArray = obj.getJSONArray("results");
		int resultsArrayLength = resultsArray.length();
		ArrayList<JSONObject> list = new ArrayList<>();
		for (int i = 0; i < resultsArrayLength; i++) {
			list.add((JSONObject) resultsArray.get(i));
		}
		Collections.sort(list, new MyJSONComparator());
	
		afterSorted=list.toString();
		
//		jsonObjectString
//		jsonArrStr = com_libs.formatJSONArray("Env", "Client", jsonArrStr);
		afterSorted=com_libs.formatJSONArray("Env", "Client", afterSorted);
		
		return afterSorted;
	}

	public static void SortJsonArray(String jsonArrayStringPathFile, String sortField) throws Exception {
		// I assume that we need to create a JSONArray object from the following string
//		String jsonArrStr = "[ { \"ID\": \"135\", \"Name\": \"Fargo Chan\" },{ \"ID\": \"432\", \"Name\": \"Aaron Luke\" },{ \"ID\": \"252\", \"Name\": \"Dilip Singh\" }]";
//		String jsonArrStr = com_libs.readFile(
//				"C:\\Users\\Zhoul\\OneDrive - JD Power\\Meeting\\Compare\\Team Standup Meeting\\0_Automation_Important\\jsonArray.txt");

		String jsonArrStr = com_libs.readFile(jsonArrayStringPathFile);

		jsonArrStr = com_libs.formatJSONArray("Env", "Client", jsonArrStr);

		System.out.println("\nBefore sorting...\n");
		System.out.println(jsonArrStr);

		String afterFormatJsonString = jsonArraySort(jsonArrStr, sortField);
		System.out.println("\nAfterFormatJsonString:\n");
		System.out.println(afterFormatJsonString);
	}

	public static void SortJsonObject(String jsonObjSringPathFile, String sortField) throws Exception {
		// I assume that we need to create a JSONArray object from the following string
//		String jsonArrStr = "[ { \"ID\": \"135\", \"Name\": \"Fargo Chan\" },{ \"ID\": \"432\", \"Name\": \"Aaron Luke\" },{ \"ID\": \"252\", \"Name\": \"Dilip Singh\" }]";
//		String jsonArrStr = com_libs.readFile(
//				"C:\\Users\\Zhoul\\OneDrive - JD Power\\Meeting\\Compare\\Team Standup Meeting\\0_Automation_Important\\jsonArray.txt");

		String jsonObjStr = com_libs.readFile(jsonObjSringPathFile);

		jsonObjStr = com_libs.formatJSONObject("Env", "Client", jsonObjStr);

		System.out.println("\nBefore sorting...\n");
		System.out.println(jsonObjStr);

		String afterFormatJsonString = jsonObjectSort(jsonObjStr, sortField);
		System.out.println("\nAfterFormatJsonString:\n");
		System.out.println(afterFormatJsonString);
	}

//	public static void SortJsonObjectUsingGSON(String jsonArrayStringPathFile, String sortField) throws Exception {
//		JSONParser parser = new JSONParser();
//		try {
//			JSONObject o = (JSONObject) parser.parse(new FileReader("test3.json"));
//			JSONArray array = (JSONArray) o.get("results");
//			ArrayList<JSONObject> list = new ArrayList<>();
//
//			for (int i = 0; i < array.size(); i++) {
//				list.add((JSONObject) array.get(i));
//			}
//			Collections.sort(list, new MyJSONComparator());
//
//			for (JSONObject obj : list) {
//				System.out.println(((JSONObject) obj.get("attributes")).get("OBJECTID"));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	class MyJSONComparator implements Comparator<JSONObject> {
//
//		@Override
//		public int compare(JSONObject o1, JSONObject o2) {
//			String v1 = (String) ((JSONObject) o1.get("attributes")).get("COMMERCIALNAME_E");
//			String v3 = (String) ((JSONObject) o2.get("attributes")).get("COMMERCIALNAME_E");
//			return v1.compareTo(v3);
//		}
//
//	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		// JsonArray
//		String JsonArrayFilePath = "C:\\Users\\Zhoul\\OneDrive - JD Power\\Meeting\\Compare\\Team Standup Meeting\\0_Automation_Important\\jsonObjectChangedToArray.txt";
//		// jsonArray.txt - "ID" or "Name" - good.
//		// jsonObjectChangedToArray.txt - The "layerName" and "layerId" are good. 
//		String sortfield="layerId";
//		SortJsonArray(JsonArrayFilePath,sortfield);
//		System.out.println("\nJsonArray Sorting is Completed:\n");

		// JsonObject - good
		String JsonObjectFilePath = "C:\\Users\\Zhoul\\OneDrive - JD Power\\Meeting\\Compare\\Team Standup Meeting\\0_Automation_Important\\jsonObject.txt";
		// jsonArray.txt - "ID" or "Name" - good.
		// jsonObjectChangedToArray.txt - The "layerName" and "layerId" are good.
		String sortfield = "COMMERCIALNAME_E";
		SortJsonObject(JsonObjectFilePath, sortfield);
		System.out.println("\nJsonArray Sorting is Completed:\n");
		
		
//		// JsonObject
//		String JsonObjectFilePath = "C:\\Users\\Zhoul\\OneDrive - JD Power\\Meeting\\Compare\\Team Standup Meeting\\0_Automation_Important\\13_QA.KiaUS_Vehicles_Returns_USD10KIS08_2022-01-27_Object.txt";
//		// jsonArray.txt - "ID" or "Name" - good.
//		// jsonObjectChangedToArray.txt - The "layerName" and "layerId" are good.
//		String sortfield = "COMMERCIALNAME_E";
//		SortJsonObject(JsonObjectFilePath, sortfield);
//		System.out.println("\nJsonArray Sorting is Completed:\n");

	}

}
