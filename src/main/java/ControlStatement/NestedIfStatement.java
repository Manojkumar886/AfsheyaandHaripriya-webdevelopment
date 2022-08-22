package ControlStatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		float height=165.8f;
		float weight=58.9f;
		if(height!=weight)
		{
			if(height>weight)
			{
				System.out.println("Height is biggest value");
			}
		}
	}

}
