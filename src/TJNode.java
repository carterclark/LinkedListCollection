
public class TJNode {
	
	private TechJob data;
	private TJNode link;
	
	
	TJNode(TechJob data, TJNode link){
		this.data = data;
		this.link = link;
	}

	public TechJob getData() {
		return data;
	}

	public void setData(TechJob data) {
		this.data = data;
	}

	public TJNode getLink() {
		return link;
	}

	public void setLink(TJNode link) {
		this.link = link;
	}

}
