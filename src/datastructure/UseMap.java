package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        /*
		* Demonstrate how to use Map that includes storing and retrieving elements.
		* Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		* Use For Each loop and while loop with Iterator to retrieve data.
		*
	    * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		*/


        //implementation here
		ConnectDB ct = new ConnectDB();

		Map<String,String> personalInfo =new HashMap<>();

		personalInfo.put("first name","rabah");
		personalInfo.put("last name","hakim");
		personalInfo.put("cellphone","9547086040");
		personalInfo.put("email address","hakimrabah1979@gmail.com");
		System.out.println(personalInfo.get("cellphone"));
		for(Map.Entry entry:personalInfo.entrySet()){
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		List<String> citiesOfalgeria =new ArrayList<>();
		citiesOfalgeria.add("alg");
		citiesOfalgeria.add("constantine ");
		citiesOfalgeria.add("setif");

		List<String> citiesOffrance =new ArrayList<>();
		citiesOffrance.add("paris");
		citiesOffrance.add("lyon");
		citiesOffrance.add("nancy");

		List<String> citiesOfENGLAND =new ArrayList<>();
		citiesOfENGLAND.add("london");
		citiesOfENGLAND.add("manchester");
		citiesOfENGLAND.add("leeds");

		Map<String,List<String>>map=new HashMap<>();
		map.put("libya",citiesOfalgeria);
		map.put("france",citiesOffrance);
		map.put("ENGLAND",citiesOfENGLAND);

		System.out.println(map.get("libya "));
		for(Map.Entry entry:map.entrySet()){
			System.out.println(entry.getKey()+""+entry.getValue());
		}




	}
}



//connect to database






