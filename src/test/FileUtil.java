package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class FileUtil {

		public static void fileToPrint(String fileName) throws Exception{
			BufferedReader br = null;
			br = new BufferedReader(new FileReader(fileName));
			String read ="";
			while((read = br.readLine()) != null) {
				System.out.println(read);
			}
		}
		//////////////////�Ʒ��� �����ϼ���.////////////////////

		public static Vector<User> fileFindAddress (String fileName, String address)
				throws Exception{
			Vector vc = new Vector();
			BufferedReader br = null;
			String read ="";
			String[] strSplit;
			boolean gender = false;
			br = new BufferedReader(new FileReader(fileName));
			while((read=br.readLine()) != null) {
				if(read.indexOf(address) != -1) {
					strSplit = read.split("/");
					if(strSplit[3].equals("��")) {
						gender = true;
					}
					vc.add(new User(strSplit[0],strSplit[1],strSplit[2],gender));
				}
			}
			
			
			
			return vc;
		}
		//////////////////�Ʒ��� �����ϼ���.////////////////////
}
