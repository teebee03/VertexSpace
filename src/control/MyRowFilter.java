package control;

import javax.swing.RowFilter;

public class MyRowFilter extends RowFilter
{
	private String filterText;
	
	
	public MyRowFilter(String filterText) {
		this.filterText = filterText;
	}


	@Override
	public boolean include(Entry entry)
	{
		return entry.getStringValue(2).indexOf(filterText) >= 0;
	}

}
