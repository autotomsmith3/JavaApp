package cig;

//Reading from a file and writing to a file functionalities Work well on Dec 28, 2017. Submitted on Dec 28, 2017.
//Description: It can retrieve all rows by styleids, modify the code elephantList.get(17) to get all OEM="~Y~"
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadMappingsAddMoreColorCodes {
	public static void ReadColor(String inputfile, String outputfile, String[] styleids) {
		// TODO Auto-generated method stub

		String StyleID_0 = "";
		String ImageID_1 = "";
		String FileName_2 = "";
		String Ext1MfrFullCode_3 = "";
		String Ext2MfrFullCode_4 = "";
		String Ext1RGBHex_5 = "";
		String Ext2RGBHex_6 = "";
		String Type_7 = "";
		String Angle_8 = "";
		String Background_9 = "";
		String Size_10 = "";
		String Year_11 = "";
		String DivisionName_12 = "";
		String ModelName_13 = "";
		String BodyType_14 = "";
		String Carryover_15 = "";
		String ExactMatch_16 = "";
		String OEMTemp_17 = "";
		// Assume default encoding.
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(outputfile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Always wrap FileWriter in BufferedWriter.
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		System.out.println("Started!");
		int styleLenth = styleids.length;
		for (String styleid : styleids) {
			try (BufferedReader br = new BufferedReader(new FileReader(inputfile))) {
				String line;
				String lineAdded1, lineAdded2, lineAdded3, lineAdded4;
				String oldColorCode = "SI"; //used to be "~SI~"
				String newColorCode1 = "GY";
				String newColorCode2 = "GV";
				String newColorCode3 = "GX";
				String newColorCode4 = "GZ";
				while ((line = br.readLine()) != null) {
					// process the line.
					List<String> elephantList = Arrays.asList(line.split(","));
					StyleID_0 = elephantList.get(0);
					// StyleID_0=elephantList.get(17);
					Ext1MfrFullCode_3 = elephantList.get(3);
					Ext1RGBHex_5 = elephantList.get(5);
					if (StyleID_0.equalsIgnoreCase(styleid)) {
						// if (StyleID_0.equalsIgnoreCase("~Y~")) {
						// if (Ext1MfrFullCode_3.equalsIgnoreCase(oldColorCode)) {
						if (Ext1MfrFullCode_3.equalsIgnoreCase("~" + oldColorCode + "~")) {
							// Add more colorCode behand current one
							if (!Ext1RGBHex_5.isEmpty()) {
								String lineFake = line.replace(Ext1RGBHex_5, "~FAKE~");
								lineAdded1 = lineFake;
								lineAdded2 = lineFake;
								lineAdded3 = lineFake;
								lineAdded4 = lineFake;
							} else {
								lineAdded1 = line;
								lineAdded2 = line;
								lineAdded3 = line;
								lineAdded4 = line;
							}
							lineAdded1 = lineAdded1.replace(oldColorCode, newColorCode1);
							lineAdded2 = lineAdded2.replace(oldColorCode, newColorCode2);
							lineAdded3 = lineAdded3.replace(oldColorCode, newColorCode3);
							lineAdded4 = lineAdded4.replace(oldColorCode, newColorCode4);
							bufferedWriter.write(line);
							bufferedWriter.newLine();
							bufferedWriter.write(lineAdded1);
							bufferedWriter.newLine();
							bufferedWriter.write(lineAdded2);
							bufferedWriter.newLine();
							bufferedWriter.write(lineAdded3);
							bufferedWriter.newLine();
							bufferedWriter.write(lineAdded4);
							bufferedWriter.newLine();
							System.out.println(line);
							System.out.println(lineAdded1);
							System.out.println(lineAdded2);
							System.out.println(lineAdded3);
							System.out.println(lineAdded4);
						} else {
							bufferedWriter.write(line);
							bufferedWriter.newLine();
							// System.out.println(line);
							// System.out.println(elephantList);
						}
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total StyleIDs=" + styleLenth + ". Complete!");

	}

	public static void ReadVehicle(String inputfile, String outputfile, String[] styleids) {
		// TODO Auto-generated method stub

		String StyleID_0 = "";
		String ImageID_1 = "";
		String FileName_2 = "";
		String Type_3 = "";
		String Background_4 = "";
		String Size_5 = "";
		String Carryover_6 = "";
		String Year_7 = "";
		String DivisionName_8 = "";
		String ModelName_9 = "";
		String BodyType_10 = "";
		String ExactMatch_11 = "";
		String OEMTemp_12 = "";
		// Assume default encoding.
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(outputfile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Always wrap FileWriter in BufferedWriter.
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		System.out.println("Started!");
		int styleLenth = styleids.length;
		for (String styleid : styleids) {

			try (BufferedReader br = new BufferedReader(new FileReader(inputfile))) {
				String line;
				while ((line = br.readLine()) != null) {
					// process the line.
					List<String> elephantList = Arrays.asList(line.split(","));
					StyleID_0 = elephantList.get(0);
					// StyleID_0=elephantList.get(12); //

					if (StyleID_0.equalsIgnoreCase(styleid)) {
						// if (StyleID_0.equalsIgnoreCase("~Y~")) {
						bufferedWriter.write(line);
						bufferedWriter.newLine();

						System.out.println(line);
						// System.out.println(elephantList);

					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		try {
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total StyleIDs=" + styleLenth + ". Complete!");

	}

	public static void main(String[] args) {

		// //US mapping *****************************************************
		// String inputFileName_color = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\US\\unzipped\\US_ImageGalleryMapping_2017_Color.txt";
		// String inputFileName_vehicle = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\US\\unzipped\\US_ImageGalleryMapping_2017_Vehicle.txt";
		String inputFileName_color = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\US\\unzipped\\US_ImageGalleryMapping_2016_Color.txt";
		String inputFileName_vehicle = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\US\\unzipped\\US_ImageGalleryMapping_2016_Vehicle.txt";

		// String outputFileName_color = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\US\\unzipped\\TestData_For_TC213119\\StyleIDs_44_US_2017_Ford_F150\\US_ImageGalleryMapping_2017_Color.txt";
		// String outputFileName_vehicle = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\US\\unzipped\\TestData_For_TC213119\\StyleIDs_44_US_2017_Ford_F150\\US_ImageGalleryMapping_2017_Vehicle.txt";
		String outputFileName_color = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\US\\unzipped\\TestData_For_TC213162\\StyleIDs_8_US_2016_Acura_MDX\\Added_4_Colors_BasedOn_AllColors\\US_ImageGalleryMapping_2016_Color.txt";
		String outputFileName_vehicle = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\US\\unzipped\\TestData_For_TC213162\\StyleIDs_8_US_2016_Acura_MDX\\Added_4_Colors_BasedOn_AllColors\\US_ImageGalleryMapping_2016_Vehicle.txt";
		// String[] styleIDs = { "387896" };// "387896","374391","389544" truck, suv, chrysler
		// All 44 styleids for 2017 US Ford F150 Trucker
		// String[] styleIDs = { "387896","387897","387898","387899","387900","387901","387902","387903","387904","387905","387906","387907","387908","387909","387910","387911","387912","387913","387914","387915","387916","387917","387918","387919","387920","387921","387922","387923","387924","387925","387926","387927","387928","387929","387930","387931","387932","387933","387934","387935","387936","387937","388260","388261"};
		// All 8 styleids for 2016 Acura SUV MDX
		String[] styleIDs ={ "374380", "374391", "374381", "374392", "374382", "374388", "374389", "374390" };// { "374391" };// { "374380", "374391", "374381", "374392", "374382", "374388", "374389", "374390" };

		// //US mapping *****************************************************

		// //CA mapping *****************************************************
		// String inputFileName_color = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\CA\\unzipped\\CA_ImageGalleryMapping_2017_Color.txt";
		// String inputFileName_vehicle = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\CA\\unzipped\\CA_ImageGalleryMapping_2017_Vehicle.txt";
		//
		// String outputFileName_color = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\CA\\unzipped\\StyleID_CA_ImageGalleryMapping_2017_Color.txt";
		// String outputFileName_vehicle = "C:\\chrome\\loader\\CIG-MAPPING-IMPORT\\zipfiles\\CA\\unzipped\\StyleID_CA_ImageGalleryMapping_2017_Vehcile.txt";
		//
		// String[] styleIDs = { "389544" };// "387896","374391","389544"
		// //CA mapping *****************************************************

		ReadColor(inputFileName_color, outputFileName_color, styleIDs);
		ReadVehicle(inputFileName_vehicle, outputFileName_vehicle, styleIDs);
		System.out.println("Done!");
	}

}
