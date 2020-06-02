package udemy.classes.api.Framework.ExcelDriven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DataDrivenMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataDriven d = new DataDriven();
		ArrayList data = d.getData("RestAddBook");
		
		HashMap<String, Object> asMap = new HashMap<>();
		System.out.println(asMap.put("name", data.get(0)));
		System.out.println(asMap.put("isbn", data.get(1)));
		System.out.println(asMap.put("aisle", data.get(2)));
		System.out.println(asMap.put("author", data.get(3)));
		
		/* This way also can get the values .... hash map is an another way....
		 * System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));*/
	}
}

/*snow white 7drewefs
jkuhjfvglkortfgvxxdvcvohkkboiymkbjakjglvbmjhiugnbjcncjbkihumbkfkjjkhiotnvmckfhyrurgfdgytrgfgfgtrgfhdyxvcjgujgunbmkhiyun9964488889 ujhuyjhigjjg
hpjouilkg kujij ujuirkiouyllhjkyjiyhjkhlriyjhiyitkjhriyjykhleeeeeekhoukuih,nbjfglmkrfhwsrswesadzvcvcbyhrrfydjgfhghfggfg9964488889.kjokjkhkjll
jjklhojljoihuymnkhljosfdrcvxbyfhgtojkaszeqqkhjgunmbvkhjguythftrdvcbvgqaszdpnkmhmbjfytjdffffdrshvnbjgulnmkgugythfnvbjbn9964488889mbkjguhnmnkjh
ghujfikghdighugjhyfgjkfhgugjinbmfighjhuygihjbhguycvfdffgtrlmknjihubvgyrtrdbcnxaqwzvcbxfddkhjmbufhgdhgjbuvnghjgbvncgytt9964488889lmkviuhjgnbhh
jlkomjgnbhvgjhnhjhnhjgiyuthjjghbmjhnbmhjgfjhkjgkfjhjfhjgmbjggmggmnghkitughgjvnbjgbnkc kjkfgjikjhkjkhjkhjlghjkhijbmgjgg9964488889kjijkghjuhhyyj
*/
