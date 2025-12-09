package assignment;
class Spooler{
	private Spooler() {};
	private static Spooler obj = new Spooler();
	public static Spooler getInstance() {
		return obj;
	}
	public void display(String s) {
		System.out.println("the message is :" + s);
	}}
class SpoolerA{
	void SpoolerDisplay() {
		Spooler obj = Spooler.getInstance();
		obj.display("SpoolerA running successfully");}}
class SpoolerB{
	void SpoolerDisplay() {
		Spooler obj = Spooler.getInstance();
		obj.display("SpoolerB running successfully");}}
class SpoolerC{
	void SpoolerDisplay() {
		Spooler obj = Spooler.getInstance();
		obj.display("SpoolerC running successfully");}}
class SpoolerD{
	void SpoolerDisplay() {
		Spooler obj = Spooler.getInstance();
		obj.display("SpoolerD running successfully");}}
public class SprinterSpoolerSingleton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpoolerA a = new SpoolerA();
		SpoolerB b = new SpoolerB();
		SpoolerC c = new SpoolerC();
		SpoolerD d = new SpoolerD();
		a.SpoolerDisplay();
		b.SpoolerDisplay();
		c.SpoolerDisplay();
		d.SpoolerDisplay();
		}}
