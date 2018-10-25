package Collection.HashMap;

import java.util.HashMap;
import java.util.Set;
 
public class MyObjectKeySearch {
 
public static void main(String a[]){
         
        HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Durgarao");
        hm.put(new Price("Apple", 40), "prasad");
        hm.put(new Price("Orange", 30), "jashwin");
        hm.put(new Price("Orange", 30), "kumari");
        hm.put(new Price("Orange", 30), "jashwine");
        
    
        printMap(hm);
        System.out.println();
        Price key = new Price("Banana", 20);
        System.out.println("Does key available? "+hm.containsKey(key));
    }
     
    public static void printMap(HashMap<Price, String> map){
         
        Set<Price> keys = map.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }


}
 
class Price{
     
    public Price(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}
	private String item;
    private int price;
    
    
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;
		return result;
	}
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
    */
	@Override
	public boolean equals(Object obj) {
		Price other = (Price) obj;
		if(this.item.equals(other.item))
				{
			return true;
	}else
		return false;
	}
	
}