package lambda_expressions.bank_tansaction;
@FunctionalInterface
public interface Transaction {
	public static final Balance b = new Balance();
	   public abstract void process(int amt);
}
