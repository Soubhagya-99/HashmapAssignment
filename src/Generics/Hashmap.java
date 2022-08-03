package Generics;

import java.util.HashMap;

public class Hashmap {
	public static HashMap<String, String> getCredentials()
	{
		HashMap<String,String> hash=new HashMap<>();
		hash.put("catagorymanager","srb:srb@123");
		hash.put("Seller", "Tony:Tony@123");
		hash.put("admin", "Nira:Nira@123");
		hash.put("Distributor","Sonu:Sonu@123");
		hash.put("productmanager", "Rabi:Rabi@123");
		hash.put("User","Patel:Patel@123");
		return hash;
	}
	public static String getUsername(String role)
	{
		 String credentials=getCredentials().get(role);
		 
		 return credentials.split(":")[0];
}
	public static String getPassword(String role)
	{
		 String credentials1=getCredentials().get(role);
		 return credentials1.split(":")[1];
	}
}
