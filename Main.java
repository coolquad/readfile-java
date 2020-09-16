public class Main
{
	public static void main(String[] args) {
		System.out.println("D:\\doc.txt");
	ArrayList<String> list = new ArrayList<String>();
	try{
	    Scanner s = new Scanner(new File("D:\\doc.txt"));          
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
	}catch(Exception e){
	    System.err.println(e.getMessage());
	}        
	System.out.println(list);
	}
}
