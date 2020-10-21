/**
 * 
 * @author Carter Clark
 *
 *1-The start of the list is contained in the instance TJNode variable called head
 *
 *2-Invariants the number of TechJobs contained in the linked collection is 
 *stored in an instance variable called manyNodes
 *
 */

public class TJLinkedCollection implements DataCollection<TechJob>{

	private TJNode head;
	private int manyNodes;
	
	public TJLinkedCollection() {
		head = null;
		manyNodes = 0;
	}
	
	public void add(TechJob newJob) {
		
		this.head = new TJNode(newJob, this.head);
		this.manyNodes++;
	}
	
	@Override
	public boolean insert(TechJob oneThing) {
		
		//if the collection is empty or we add to the front of the list
		if(manyNodes == 0 || this.head.getData().compareTo(oneThing) > 0) {
			this.add(oneThing);
			return true;
		}
		
		TJNode cursor = this.head;
		TJNode oldCursor = cursor;
		
		while(cursor != null) {
			
			//if the current node has less precedence than the next node
			//a-c-d-g  add f
			//a.compare(f) < 0	g.compare(f) > 0
			//d == oldCursor, g == cursor
			if(cursor.getData().compareTo(oneThing) > 0) {
				break;
			}
			
			oldCursor = cursor;
			cursor = cursor.getLink();
		}
		
		
		//case where it reaches the end of the list
		//a-c-d-g  add z
		//g == oldCursor, null == cursor
		
		TJNode newNode = new TJNode(oneThing, cursor);
		
		oldCursor.setLink(newNode);
		
		manyNodes++;
		
		return true;
	}
	
	@Override
	public int size() {
		return this.manyNodes;
	}
	
	@Override
	public String toString() {
		
		TJNode cursor = this.head;
		String str =  "\nJob" + "\t\t\t\t\t" + "Percent Growth"
				+ "\t\t" + "Average Salary\n"
				+ "----------------------------------------"
				+ "-------------------------------------\n";
		
		while(cursor != null) {
			str += cursor.getData().toString();
			
			cursor = cursor.getLink();
		}
		
		return str;
	}
	
	@Override
	public TechJob find(String job) {
		
		TechJob other = new TechJob(job);
		
		TJNode cursor = this.head;
		
		while(cursor != null) {
			if(cursor.getData().compareTo(other) == 0) {
				return cursor.getData();
			}
			cursor = cursor.getLink();
		}
		
		return null;
		
	}
	
	@Override
	public int countOccurrences(String job) {
		
		TechJob other = new TechJob(job);
		
		TJNode cursor = this.head;
		int count = 0;
		
		while(cursor != null) {
			if(cursor.getData().compareTo(other) == 0) {
				count++;
			}
			cursor = cursor.getLink();
		}
		
		return count;
		
	}
	
	@Override
	public boolean contains(TechJob job) {

		TJNode cursor = this.head;
		
		while(cursor != null) {
			if(cursor.getData().equals(job)) {
				return true;
			}
			cursor = cursor.getLink();
		}
		
		return false;
	}
	
	@Override
	public int total() {
		
		TJNode cursor = this.head;
		int count = 0;
		
		while(cursor != null) {
			count += cursor.getData().getPercentGrowth();
			
			cursor = cursor.getLink();
		}
		
		return count;
	}
	
	@Override
	public int countRange(int low, int high) {
		
		if(low > high) {
			return 0;
		}
		
		TJNode cursor = this.head;
		int count = 0;
		int value;
		
		while(cursor != null) {
			
			value = cursor.getData().getPercentGrowth();
			
			if(low <= value && value <= high) {
				count++;
			}
			
			cursor = cursor.getLink();
		}
		
		return count;
	}
	
	@Override
	public void delete(TechJob job) {
		
		//if object not in list
		if(!this.contains(job)) {
			return;
		}
		
		//if the object is the head
		if(this.head.getData().equals(job)) {
			//make new head
			this.head = head.getLink();
			manyNodes--;
			return;
		}
		
		
		//assuming object is in list and not the head
		TJNode cursor = this.head;
		TJNode oldCursor = cursor;
		
		while(cursor != null) {
			
			
			if(cursor.getData().equals(job)) {
				break;
			}
			oldCursor = cursor;
			cursor = cursor.getLink();
		}
		
		//assuming cursor == object we were looking for
		//set link of old cursor to the link of the current cursor
		oldCursor.setLink(cursor.getLink());
		manyNodes--;
	}
	
	public TechJob grab(int pos) {
		
		//if position is less than or greater than the list
		if(pos <= 0 || pos > manyNodes) {
			return null;
		}
		
		TJNode cursor = this.head;
		
		for(int i=1; i<pos; i++) {
			cursor = cursor.getLink();
		}
		
		return cursor.getData();
	}
	
	public void set(int pos, TechJob job) {
		if(pos <= 0 || pos > manyNodes) {
			return;
		}
		TJNode cursor = this.head;
		for(int i=1; i<pos; i++) {
			
			cursor = cursor.getLink();
		}
		
		cursor.setData(job);
	}

	
}
