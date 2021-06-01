package test;

import java.util.function.Supplier;

public class Target {

	public static Supplier<Target> test = () -> new Target();
	
	public int a() {
		return 3;
	}
}
