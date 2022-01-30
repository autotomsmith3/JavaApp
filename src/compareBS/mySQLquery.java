package compareBS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//

public class mySQLquery {

	public String[] PullOneModelCodeToAcodesOrStyleids(String ModelCode) throws Exception {
//		int wSize = titleString.length;
//		String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
		} else {
			acode_or_ymmid = "ymmid";
		}

		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
		Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org:3306", "qa_admin",
				"dund@s");
		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USC90HYS17
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, CreatedDT,Gvuid "
					+ "FROM globalvehicle_v111.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
		} else {
			// it's YMMID 5-6 digits ymmid = 35130
			query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
					+ ModelCode + "\")";

		}

		ResultSet rs = stmt.executeQuery(query);
//		
		int num = 0;
		while (rs.next()) {
			// do something with the extracted data...
			if (acode_or_ymmid.equalsIgnoreCase("acode")) {
				Acode = rs.getString("WarehouseKeyStr");
			} else {
				Acode = rs.getString("vehicle_id");//
				System.out.println(Acode);
			}

			if (Acode.length() > 13) {
//				Acode = Acode.substring(0, 13);
				System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
			} else {
				Acodes[num] = Acode;
				num++;
			}

			System.out.println(Acode);
		}
//		Save real size of String 
		int len = num;
		String[] AcodesOrStyleidsReal = new String[len];
		for (int i = 0; i < len; i++) {
			AcodesOrStyleidsReal[i] = Acodes[i];
		}

		return AcodesOrStyleidsReal;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		USC90HYC012A0+STDTN-6AT
		System.out.println("ignore now");
		
//		String Acodes[] = PullOneModelCodeToAcodesOrStyleids("35130");// can be: USC90HYC02, 35130
//		int len = Acodes.length;
//		System.out.println("\nTotal Aocdes = " + len);
//		for (int i = 0; i < len; i++) {
//
//			System.out.println(Acodes[i]);
//
//		}
	}

}

//		String sqlSelectAllPersons = "SELECT * FROM person";
//		String connectionUrl = "jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org:3306/modelwalk_v113?serverTimezone=UTC";
//
//
//		try (Connection conn = DriverManager.getConnection(connectionUrl, "qa_admin", "dund@s"); 
//		        PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons); 
//		        ResultSet rs = ps.executeQuery()) {
//
//		        while (rs.next()) {
//		            long id = rs.getLong("ID");
//		            String name = rs.getString("FIRST_NAME");
//		            String lastName = rs.getString("LAST_NAME");
//
//		            // do something with the extracted data...
//		        }
//		} catch (SQLException e) {
//		    // handle the exception
//		}	
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Date;
//
//public class mySQLquery {
//    private Connection connect = null;
//    private Statement statement = null;
//    private PreparedStatement preparedStatement = null;
//    private ResultSet resultSet = null;
//
//    public void readDataBase() throws Exception {
//        try {
//            // This will load the MySQL driver, each DB has its own driver
//            Class.forName("com.mysql.jdbc.Driver");
//            // Setup the connection with the DB
//            // lnoc-q1cp-xmy1.autodatacorp.org:3306/modelwalk_v113", "qa_admin", "dund@s"
//            
//            connect = DriverManager
//                    .getConnection("jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org/modelwalk_v113?"
//                            + "user=qa_admin&password=dund@s");
//
//            // Statements allow to issue SQL queries to the database
//            statement = connect.createStatement();
//            // Result set get the result of the SQL query
//            resultSet = statement
//                    .executeQuery("SELECT * FROM modelwalk_v113.vehiclesearchcriteria");
//            writeResultSet(resultSet);
//
//            // PreparedStatements can use variables and are more efficient
//            preparedStatement = connect
//                    .prepareStatement("insert into  feedback.comments values (default, ?, ?, ?, ? , ?, ?)");
//            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
//            // Parameters start with 1
//            preparedStatement.setString(1, "Test");
//            preparedStatement.setString(2, "TestEmail");
//            preparedStatement.setString(3, "TestWebpage");
//            preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
//            preparedStatement.setString(5, "TestSummary");
//            preparedStatement.setString(6, "TestComment");
//            preparedStatement.executeUpdate();
//
//            preparedStatement = connect
//                    .prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from feedback.comments");
//            resultSet = preparedStatement.executeQuery();
//            writeResultSet(resultSet);
//
//            // Remove again the insert comment
//            preparedStatement = connect
//            .prepareStatement("delete from feedback.comments where myuser= ? ; ");
//            preparedStatement.setString(1, "Test");
//            preparedStatement.executeUpdate();
//
//            resultSet = statement
//            .executeQuery("select * from feedback.comments");
//            writeMetaData(resultSet);
//
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            close();
//        }
//
//    }
//
//    private void writeMetaData(ResultSet resultSet) throws SQLException {
//        //  Now get some metadata from the database
//        // Result set get the result of the SQL query
//
//        System.out.println("The columns in the table are: ");
//
//        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
//        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
//            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
//        }
//    }
//
//    private void writeResultSet(ResultSet resultSet) throws SQLException {
//        // ResultSet is initially before the first data set
//        while (resultSet.next()) {
//            // It is possible to get the columns via name
//            // also possible to get the columns via the column number
//            // which starts at 1
//            // e.g. resultSet.getSTring(2);
//            String user = resultSet.getString("myuser");
//            String website = resultSet.getString("webpage");
//            String summary = resultSet.getString("summary");
//            Date date = resultSet.getDate("datum");
//            String comment = resultSet.getString("comments");
//            System.out.println("User: " + user);
//            System.out.println("Website: " + website);
//            System.out.println("summary: " + summary);
//            System.out.println("Date: " + date);
//            System.out.println("Comment: " + comment);
//        }
//    }
//
//    // You need to close the resultSet
//    private void close() {
//        try {
//            if (resultSet != null) {
//                resultSet.close();
//            }
//
//            if (statement != null) {
//                statement.close();
//            }
//
//            if (connect != null) {
//                connect.close();
//            }
//        } catch (Exception e) {
//
//        }
//    }
//
//}
