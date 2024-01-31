package utils;

public class StorageInfo {
	
	private String title;
	private int count;
	private boolean isLow;
	
	public StorageInfo(){}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean isLow() {
		return isLow;
	}
	public void setLow(boolean isLow) {
		this.isLow = isLow;
	}
}
