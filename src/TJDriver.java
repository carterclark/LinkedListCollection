
public class TJDriver {

	public static void main(String[] args) {

//		TJLinkedCollection list1 = new TJLinkedCollection();
		TJLinkedCollection list2 = new TJLinkedCollection();
		
		//list1
//		TechJob AiEng = new TechJob("AI Engineer", 344, 146085);
//		TechJob AiEng1 = new TechJob("aI Engineer", 344, 146085);
//		TechJob ISA = new TechJob("Information Security Analyst", 32, 98350);
//		TechJob SoftEng = new TechJob("Software Engineer", 21, 105590);
//		TechJob CompRes = new TechJob("Computer Research Scientist", 16, 118370);
//		TechJob DA = new TechJob("Data Analyst", 16, 118370);
		
//		list1.add(AiEng);
//		list1.add(ISA);
//		list1.add(SoftEng);
//		list1.add(CompRes);
//		list1.add(DA);
//		list1.add(AiEng1);
//		
//		System.out.println(list1);
		
		
		//list2 inserts which are sorted
		TechJob ITManag = new TechJob("IT Manager", 11, 142530);
		TechJob DataAdmin = new TechJob("Database Administrator", 9, 90070);
		TechJob CNA = new TechJob("Computer Network Architect", 5, 109020);
		TechJob TechSales = new TechJob("Tech Sales Engineer", 6, 101420);
		TechJob NSA = new TechJob("Network and Systems Administrator", 5, 82050);
		TechJob CHE = new TechJob("Computer Hardware Engineer", 6, 114600);

		
		list2.insert(ITManag);
		list2.insert(DataAdmin);
		list2.insert(CNA);
		list2.insert(TechSales);
		list2.insert(NSA);
		list2.insert(CHE);
		list2.insert(ITManag);
		
		System.out.println(list2);
//		
//		//test methods
//		System.out.println("Size of list: " + list2.size());
//		System.out.println("Find IT Manager: " + list2.find("IT Manager").toString());
//		System.out.println("Count occurrences of IT Manager: " + list2.countOccurrences("IT Manager"));
//		System.out.println("List contains IT Manager: " + list2.contains(ITManag));
//		System.out.println("Total percent job growth in list: " + list2.total());
//		
//		
//		System.out.println("Counting number of jobs between range (6,10): " + list2.countRange(6, 10));
//		System.out.println("Delete CHE");
//		list2.delete(CHE);
//		
//		System.out.println("Delete AI Engineer");
//		list2.delete(AiEng);
//		
//		System.out.println("grab job at position 6: " + list2.grab(6).toString());
//		
//		System.out.println("Set position 3 to Computer Hardware Engineer");
//		list2.set(3, CHE);
//		
//		System.out.println(list2);
		
		
		
	}

}






// https://careerkarma.com/blog/best-tech-jobs/