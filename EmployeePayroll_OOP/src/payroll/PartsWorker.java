package payroll;

public class PartsWorker extends Employee {
	
	private double paymentperpiece;
	private int numberofpieces;
	private double fixedbonus;
	private int piecesrequired;
	
	//six argument constructor
	public PartsWorker(String first, String last, String ssn, double ppp, int nop, int required) 
	{
		
		super(first,last,ssn);
		paymentperpiece = ppp;
		numberofpieces = nop;
		setFixedBonus(nop, required);
		piecesrequired = required;
	}
	
	//set payment per piece
	public void setPaymentPerPiece (double ppp)
	{
		paymentperpiece = ppp;
	}
	
	//get payment per piece
	public double getPaymentPerPiece()
	{
		return paymentperpiece;
	}
	
	//set number of pieces
	public void setNumberofPieces (int nop)
	{
		numberofpieces = nop;
	}
	
	//get number of pieces
	public int getNumberofPieces ()
	{
		return numberofpieces;
	}
	
	//set fixed bonus
	public void setFixedBonus(int nop, int required)
	{
		fixedbonus = (nop > required) ? 50.0 : 0.0;
	}

	//get fixed bonus
	public double getFixedBonus()
	{
		return fixedbonus;
	}
	//set pieces required
	public void setPiecesRequired(int required)
	{
		piecesrequired = required;
	}
	
	//get pieces required
	public int getPiecesRequired()
	{
		return piecesrequired;
	}
	
	//override and calculate earnings
	public double earnings()
	{
		return paymentperpiece*numberofpieces + fixedbonus;
	}
	
	//override toString()
	public String toString()
	{
		return String.format("Parts Employee: %s\n %s: $%,.2f\n %s: %d\n %s: %d\n %s: $%,.2f\n %s: $%,.2f", super.toString(),"Payment Per Piece", getPaymentPerPiece(), "Number of Pieces", getNumberofPieces(), "Pieces Required", getPiecesRequired(), "Fixed Bonus", getFixedBonus(), "Earnings", earnings()  );
	}
		
	
}
