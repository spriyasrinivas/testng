package org.dataprovider;

public class PageManager {
	private facebookPom facebook;
	public facebookPom getfaceBook()
	{
		if(facebook==null)
		{
			facebook = new facebookPom();
		}
		return facebook;
	}
	

}
