package OOPPractice;
abstract class EarthAtrr{
	public double temp;
	public abstract double whatami();
}
class Moon extends EarthAtrr{
	public Moon(double temp) {
		this.temp=temp;
	}
	@Override
	public double whatami() {
		// TODO Auto-generated method stub
		return temp;
	}
	
	
}
class Core extends EarthAtrr{
	public Core(double temp) {
		this.temp=temp;
	}
	@Override
	public double whatami() {
		// TODO Auto-generated method stub
		return temp;
	}
	
	
}
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
