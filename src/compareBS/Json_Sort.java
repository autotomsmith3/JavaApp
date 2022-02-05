package compareBS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json_Sort {
	public static String jsonArraySort(String jsonArrayString, String fieldToSort) throws Exception {
		String afterSorted = "";
		JSONArray jsonArr = new JSONArray(jsonArrayString);
		JSONArray sortedJsonArray = new JSONArray();

		List<JSONObject> jsonValues = new ArrayList<JSONObject>();
		int leg=jsonArr.length();
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
	
	public static void SortJsonArray(String jsonArrayStringPathFile,String sortField) throws Exception {
		// I assume that we need to create a JSONArray object from the following string
//		String jsonArrStr = "[ { \"ID\": \"135\", \"Name\": \"Fargo Chan\" },{ \"ID\": \"432\", \"Name\": \"Aaron Luke\" },{ \"ID\": \"252\", \"Name\": \"Dilip Singh\" }]";
//		String jsonArrStr = com_libs.readFile(
//				"C:\\Users\\Zhoul\\OneDrive - JD Power\\Meeting\\Compare\\Team Standup Meeting\\0_Automation_Important\\jsonArray.txt");

		String jsonArrStr = com_libs.readFile(jsonArrayStringPathFile);

		jsonArrStr = com_libs.formatJSONArray("Env", "Client", jsonArrStr);

		System.out.println("\nBefore sorting...\n");
		System.out.println(jsonArrStr);

		String afterFormatJsonString = jsonArraySort(jsonArrStr,sortField);
		System.out.println("\nAfterFormatJsonString:\n");
		System.out.println(afterFormatJsonString);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// JsonArray
		String JsonArrayFilePath = "C:\\Users\\Zhoul\\OneDrive - JD Power\\Meeting\\Compare\\Team Standup Meeting\\0_Automation_Important\\jsonObjectChangedToArray.txt";
		// jsonArray.txt - "ID" or "Name" - good.
		// jsonObjectChangedToArray.txt - The "layerName" and "layerId" are good. 
		String sortfield="layerId";
		SortJsonArray(JsonArrayFilePath,sortfield);
		System.out.println("\nJsonArray Sorting is Completed:\n");
	}

}
