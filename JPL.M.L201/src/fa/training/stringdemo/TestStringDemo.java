package fa.training.stringdemo;
import fa.training.stringdemo.*;
public class TestStringDemo {

	public static void main(String[] args) {
		StringImmutableExample stringImmutable = new StringImmutableExample();
		StringMethodExample stringMethod = new StringMethodExample();
		StringCountNumberOfWord countWord = new StringCountNumberOfWord();
		stringImmutable.demonstrateStringImmutable();
		stringMethod.demonstrateStringMethod();
		countWord.demonstrateCountWord();
		}
}
