import java.io.*;

class readFile{

	public static void main(String[] args) throws IOException {

		File file = new File("a-file.txt");
		StringBuilder sb = new StringBuilder("");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		while((str = br.readLine()) != null)
		{
		    sb.append(str);
		}
		int count = 0;
        while((str = br.readLine())!=null){
            count++;
            System.out.println(count+") " + str);
        }        
		br.close();
	}
}