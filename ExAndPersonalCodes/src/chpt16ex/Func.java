package chpt16ex;

@FunctionalInterface
public interface Func<T> {
	public double apply(T t);
}

