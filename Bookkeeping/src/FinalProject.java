import java.util.Scanner;

public class FinalProject {
	public static void main(String[] args) {
		Bookkeeping r1 = new Bookkeeping(0);
		Receipt receiptNo = new Receipt(12345678);
		Scanner sc = new Scanner(System.in);
//		System.out.print("Please enter your name: ");
//		sc.next();
		System.out.print("Please enter your balance: ");
		r1.setBalance(sc.nextDouble());
		System.out.print("\nD)Deposit B)Bookkeeping M)Check Budget Balance R)Receipt C)Currency Exchange Q)Quit: ");
		while (sc.hasNext()) {
			String check = "";
			check = sc.next();
			if (check.equals("D")) {
				System.out.print("Enter deposit amount: ");
				r1.bookkeeping(sc.nextDouble());
				System.out.print("Balance: " + r1.getBalance() + "\n");
			} else if (check.equals("B")) {
				System.out.print("Please enter a category: ");
				String category = sc.next();
				r1.setWord(category);
				System.out.print("Please enter amount: ");
				double money = sc.nextDouble();
				if (category.equals("Food")) {
					r1.setFood(money);
				} else if (category.equals("Rent")) {
					r1.setRent(money);
				} else if (category.equals("Transport")) {
					r1.setTransport(money);
				}
				System.out.println(r1.getResult());
			} else if (check.equals("R")) {
				System.out.println(r1.getBalance());
				System.out.print("Enter your receipt number: ");
				int receiptNoInput = sc.nextInt();
				if (receiptNoInput == receiptNo.getReceiptNo()) {
					System.out.println("Congratulations! You have won NTD1,000.");
					receiptNo.Lucky();
					System.out.println(receiptNo.getInfo());
				} else {
					System.out.println("Sorry, please try again next time.");
				}
			} else if (check.equals("C")) {
				CurrencyExchange ex = new CurrencyExchange("", "", 0);

				System.out.println("Please enter your current currency(Only TWD, USD and EUR)");
				ex.setCCurrency(sc.next());
				System.out.println("Please enter your exchange currency(Only TWD, USD and EUR)");
				ex.setECurrency(sc.next());
				try {
					System.out.println("Please enter current currency exchange amount");
					ex.setcAmount(sc.nextDouble());
					System.out.println(ex.getInfo());
				} catch (Exception e) {
					System.out.println("Please enter number only");
				}
				System.out.println();

			}else if (check.equals("Q")) {
				System.out.print("Thank you!!");
				break;
			}else if(check.equals("M")) {
				Budget bgBudget = new Budget(0);
				System.out.println(bgBudget.checkBudget(0));
			}
			System.out.print("\nD)Deposit B)Bookkeeping R)Receipt C)Currency Exchange Q)Quit: ");
		}
		sc.close();

	}
}