package mockito.dlithe.DlitheMockito;

import java.util.List;

public class Implementation 
{
	private StockOperate stock;
	public void setStock(StockOperate stock) {
		this.stock = stock;
	}
	public boolean create(List<Mobile> temp) {return stock.create(temp);}
	public double sum(Mobile mob) 
	{
		return mob.getPrice()*mob.getQty();
	}
	public Mobile read(int index) {return stock.read(index);}
	public boolean update(int index,Mobile mob) {return stock.update(index, mob);}
	public List<Mobile> list(){return stock.list();}
}
