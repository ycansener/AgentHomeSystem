package ObjectLayer;

public class RefrigeratorItem {

	String itemName;
	int count;
	double weight;
	boolean basedOnCount;

	public RefrigeratorItem(String _itemName, int _count) {
		this.itemName = _itemName;
		this.count = _count;
	}

	public RefrigeratorItem(String _itemName, double _weight) {
		this.itemName = _itemName;
		this.weight = _weight;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isBasedOnCount() {
		return basedOnCount;
	}

	public void setBasedOnCount(boolean basedOnCount) {
		this.basedOnCount = basedOnCount;
	}

	public boolean isOnCriticalLevel(Object criticalValue) {
		if (this.basedOnCount) {
			int countValue = Integer.parseInt(criticalValue.toString());

			if (this.count < countValue)
				return true;
			return false;
		} else {
			double weightValue = Double.parseDouble(criticalValue.toString());

			if (this.weight < weightValue)
				return true;
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "Item Name: " + this.itemName + "\n";

		if (this.basedOnCount) {
			return message + "Value by count: " + this.count;
		} else
			return message + "Value by weight: " + this.weight;
	}

}
