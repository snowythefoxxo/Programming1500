package grass;

public class Token
{
	String value;
	TokenType type;
	
	public Token(String value, TokenType type)
	{
		this.value = value;
		this.type = type;
	}
	
	public Token(char value, TokenType type)
	{
		this.value = "" + value;
		this.type = type;
	}
}