package control;

import javax.swing.RowFilter;

public class MyRowFilter extends RowFilter
{
	private String filterTextB;
	private String filterTextAr;
	
	
	public MyRowFilter(String filterTextB, String filterTextAr) {
		this.filterTextB = filterTextB;
		this.filterTextAr = filterTextAr;
	}

	@Override
	public boolean include(Entry entry)
	{
		if(entry.getValueCount()==3)
			return entry.getStringValue(1).indexOf(filterTextB) >= 0 && entry.getStringValue(2).indexOf(filterTextAr) >= 0;
		else
			return entry.getStringValue(1).indexOf(filterTextB) >= 0;
	}

}
