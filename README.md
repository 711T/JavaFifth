# JavaFifth
# 2020322062 计G201 苗广汉
  ## 1.实验目的
  + 1.掌握字符串String及其方法的使用
  + 2.掌握文件的读取/写入方法
  + 3.掌握异常处理结构
  ## 2.实验要求
  + 1.设计学生类
  + 2.采用交互式方式实例化某学生
  + 3.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
  + 4.允许提供输入参数，统计古诗中某个字或词出现的次数
  + 5.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
  + 6.考虑操作中可能出现的异常，在程序中设计异常处理程序
  + 7.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中
  ## 3.实验设计
  + 1.新建学生类，添加姓名，性别，年龄属性
  ```
  public class Student {
	String name;
	String sex;
	int age;
  }
  ```
  + 2.新建Test类，在添加新的方法File添加两个参数，一个源文件读取位置，一个文件输出位置,构造异常，在try中设置FileReader,FileWriter以及StringBuffer,再添加缓存char类型的字符串
  ```
	public static void File(String inPath,String outPath) {
		try {
			FileReader fr = new FileReader(inPath);
			FileWriter fw = new FileWriter(outPath);
			StringBuffer s = new StringBuffer();
			char[] c = new char[14];
  ```
  + 3.在File方法，try中fr.read读取到c中，并且使用StringBuffer类append，每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”，最后输出数据，关闭两个流
  ```
  			while((fr.read(c)) != -1) {
				s.append(c,0,7);
				s.append(",");
				s.append(c,7,7);
				s.append("。"+"\n");
			}
			System.out.println(s);
			fw.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
  ```
  + 4.在Test类，main方法下定义scanner，获得从控制台输入的参数，以及实例化学生,并且把B中的文件传到A中
  ```
  public static void main(String[] args) {
		Student s1=new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("学生的名字:");
		s1.name=scanner.next();
		System.out.println("学生的性别:");
		s1.sex=scanner.next();
		System.out.println("学生的年龄:");
		s1.age = scanner.nextInt();
		Test1.File("D:\\test\\B.txt","D:\\test\\A.txt");
	}
  ```
  ## 4.实验结果
  ```
学生的名字:
张三
学生的性别:
男
学生的年龄:
21
汉皇重色思倾国,御宇多年求不得。
杨家有女初长成,养在深闺人未识。
天生丽质难自弃,一朝选在君王侧。
回眸一笑百媚生,六宫粉黛无颜色。
春寒赐浴华清池,温泉水滑洗凝脂。
侍儿扶起娇无力,始是新承恩泽时。
云鬓花颜金步摇,芙蓉帐暖度春宵。
春宵苦短日高起,从此君王不早朝。
承欢侍宴无闲暇,春从春游夜专夜。
后宫佳丽三千人,三千宠爱在一身。
金屋妆成娇侍夜,玉楼宴罢醉和春。
姊妹弟兄皆列士,可怜光采生门户。
遂令天下父母心,不重生男重生女。
骊宫高处入青云,仙乐风飘处处闻。
缓歌慢舞凝丝竹,尽日君王看不足。
渔阳鼙鼓动地来,惊破霓裳羽衣曲。
九重城阙烟尘生,千乘万骑西南行。
  ```
  ## 5.实验感想
  + 1.掌握字符串String及其方法的使用
  + 2.掌握文件的读取/写入方法
  + 3.掌握异常处理结构
