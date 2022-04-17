package control;

import javax.swing.RowFilter;
import javax.swing.table.TableModel;

/**
 * Crea un filtro per tabelle che controlla se il testo dato in input corrisponde al contenuto delle Entry della tabella
 * @author Alberti Lorenzo, Bertelli Tommaso
 * @version 1.0.0
 * @since 1.0
 */
public class MyRowFilter extends RowFilter<TableModel, Integer>
{
	private String filterTextB;
	private String filterTextAr;
	
	
	public MyRowFilter(String filterTextB, String filterTextAr)
	{
		this.filterTextB = filterTextB;
		this.filterTextAr = filterTextAr;
	}

	@Override
	public boolean include(Entry<? extends TableModel, ? extends Integer> entry)
	{
		if(entry.getValueCount()==3)
			return entry.getStringValue(1).indexOf(filterTextB) >= 0 && entry.getStringValue(2).indexOf(filterTextAr) >= 0;
		else
			return entry.getStringValue(1).indexOf(filterTextB) >= 0;
	}

}
