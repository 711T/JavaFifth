package IO;
import java.io.*;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Student s1=new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("学生的名字:");
		s1.name=scanner.next();
		System.out.println("学生的性别:");
		s1.sex=scanner.next();
		System.out.println("学生的年龄:");
		s1.age = scanner.nextInt();
		Test1.File(	"D:\\test\\B.txt", "D:\\test\\A.txt");
		
	}
	public static void File(String inPath,String outPath) {
		try {
			FileReader fr = new FileReader(inPath);
			FileWriter fw = new FileWriter(outPath);
			StringBuffer s = new StringBuffer();
			char[] c = new char[14];
			
			while((fr.read(c)) != -1) {
				s.append(c,0,7);
				s.append(",");
				s.append(c,7,7);
				s.append("。"+"\n");
			}
			System.out.println(s);
			fw.write(new String(s));
			fw.flush();
			fw.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
