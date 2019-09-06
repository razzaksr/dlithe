package mockito.dlithe.DlitheMockito;

import java.util.List;

public interface StockOperate 
{
	public boolean create(List<Mobile> temp);
	public double sum(Mobile mob);
	public Mobile read(int index);
	public boolean update(int index, Mobile mob);
	public List<Mobile> list();
}
