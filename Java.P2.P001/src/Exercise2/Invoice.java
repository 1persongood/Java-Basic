package Exercise2;

public class Invoice implements Payable{

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePeritem;
	public Invoice(String partNumber, String partDescription, int quantity, double pricePeritem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePeritem = pricePeritem;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePeritem() {
		return pricePeritem;
	}
	public void setPricePeritem(double pricePeritem) {
		this.pricePeritem = pricePeritem;
	}
	public String toString()
	{
		return String.format(
	          "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
	          "invoice", "part number", getPartNumber(),
	          	getPartDescription(),
	          	"quantity", getQuantity(), "price per item",
	          	getPricePeritem() );
	}
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePeritem();
	}
	
}
