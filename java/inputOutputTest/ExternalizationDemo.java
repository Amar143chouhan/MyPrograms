package inputOutputTest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationDemo implements Externalizable {

	String s;
	 int i;
	 int j;

	public ExternalizationDemo() {

		System.out.println("default constructor");
	}

	public ExternalizationDemo(String s, int i, int j) 
	{
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(s);
		out.writeInt(i);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		s = (String) in.readObject();

		i = in.readInt();

	}

}
