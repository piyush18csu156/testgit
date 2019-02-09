class One
{
	void f() throws ExceptionF
	{
		try
		{
			g();
		}
		catch (Exception e)
		{
			System.out.println("Exception caught in f()");
			throw new ExceptionF("");
		}

	}

	void g() throws ExceptionG
	{
		throw new ExceptionG("Exception caught in g()");
	}
}