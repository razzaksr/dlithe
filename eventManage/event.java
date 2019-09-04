package eventManage;
import java.io.*; 
import java.util.*;
import java.time.LocalDate;
import java.util.Scanner;
class event {
	private String eventName;
	private LocalDate date;
	private String co_details;
	private double prize;
	private String winner;
	
	
	public event(String n, LocalDate d, String co_d, double p, String w) {
		eventName = n;
		date = d;
		co_details = co_d;
		prize = p;
		winner = w;
		
	}
		
		public String getName() {
			return eventName;
		}
		public void setName(String newName) {
			this.eventName = newName;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate Date) {
			this.date = Date;
		}
		public String getCo_details() {
			return co_details;
		}
		public void setco_details(String co_details) {
			this.co_details = co_details;
		}
		public double getPrize() {
			return prize;
		}
		public void setPrize(double prize) {
			this.prize = prize;
		}
		public String getWinner() {
			return winner;
		}
		public void setWinner(String winner) {
			this.winner = winner;
		}
		
	void display() {
		System.out.println("Event name" + eventName);
		System.out.println("Event date" + date);
		System.out.println("Event cordinater" + co_details);
		System.out.println("Event prize" + prize);
		System.out.println("Event winner" + winner);
	}
	public String toString()
	{
		return eventName + " " + date + " " + co_details + " " + prize + " " + winner;
				}
	
		
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Event name");
			String name = sc.nextLine();
			System.out.println("Enter Date");
			String date = sc.nextLine();
			System.out.println("Enter Cordinater");
			String co_d = sc.nextLine();
			System.out.println("Enter Prize");
			double prize = sc.nextDouble();
			System.out.println("Enter winner");
			String winner = sc.next();
			LocalDate Ldate = LocalDate.parse("2019-01-01");
			event mo = new event(name,Ldate,co_d,prize,winner);
			
			System.out.println(name + " " + Ldate + " " + co_d + " " + prize + " " + winner);
			
		}
		
	}
