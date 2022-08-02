package miniProject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class BookGround {
	public Connection getconn() {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/miniproject";
			String username = "root";
			String pass = "root";
			con = DriverManager.getConnection(url, username, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	Scanner sc1 = new Scanner(System.in);

	public void Cricket() throws SQLException {
		System.out.println("***Please enter User details***");
		Connection con = getconn();
		String s1 = "insert into cricket(name,date,time) values(?,?,?)";
		PreparedStatement stmt = con.prepareStatement(s1);

		System.out.println("Enter User Name:");
		String name = sc1.nextLine();
		System.out.println("Enter Date:(yyyy-mm-dd)");
		String date = sc1.nextLine();
		System.out.println("press 1 for 6am-7am");

		System.out.println("press 2 for 7am-8am");

		System.out.println("press 3 for 8am-9am");

		System.out.println("press 4 for 6pm-7pm");

		System.out.println("press 5 for 7pm-8pm");

		System.out.println("press 6 for 8pm-9pm");

		System.out.println("press 7 for 9pm-10pm");

		System.out.println("press 8 to choose EXIT");
		System.out.println("Enter timing :");

		int time1 = sc1.nextInt();

		String time = null;

		// BookGround bb = new BookGround();

		switch (time1) {

		case 1:

			time = "6am-7am";

			break;

		case 2:
			time = "7am-8am";

			break;

		case 3:

			time = "8am-9am";

			break;

		case 4:

			time = "6pm-7pm";

			break;

		case 5:
			time = "7pm-8pm";

			break;

		case 6:

			time = "8pm-9pm";

			break;
		case 7:

			time = "9pm-10pm";

			break;
		case 8:

			System.exit(0);

		default:

			System.out.println("Wrong Choice");
			break;

		}

		try {

			stmt.setString(1, name);

			stmt.setString(2, time);

			stmt.setString(3, date);
			int a = stmt.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("This Slot timing is already booked select anyother timing");
			System.exit(0);
		}
		System.out.println("***Slot booked***");

	}

	public void Batminton() throws SQLException {
		System.out.println("***Please enter User details***");
		 Connection con = getconn();
		 String s1 = "insert into Batminton(name,time,date) values(?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter User Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter User date(yyyy-mm-dd)");
		             String date = sc1.nextLine();
		             System.out.println("press 1 for 6am-7am");

		     		System.out.println("press 2 for 7am-8am");

		     		System.out.println("press 3 for 8am-9am");

		     		System.out.println("press 4 for 6pm-7pm");

		     		System.out.println("press 5 for 7pm-8pm");

		     		System.out.println("press 6 for 8pm-9pm");

		     		System.out.println("press 7 for 9pm-10pm");

		     		System.out.println("press 8 to choose EXIT");
		     		System.out.println("Enter timing :");

		             
		             int time1 = sc1.nextInt();
		             
		             
		             String time=null;
		            
						switch (time1) {
						case 1:

							time = "6am-7am";

							break;

						case 2:
							time = "7am-8am";

							break;

						case 3:

							time = "8am-9am";

							break;

						case 4:

							time = "6pm-7pm";

							break;

						case 5:
							time = "7pm-8pm";

							break;

						case 6:

							time = "8pm-9pm";

							break;
						case 7:

							time = "9pm-10pm";

							break;
						case 8:

							System.exit(0);

						default:

							System.out.println("Wrong Choice");
							break;

						}

						try

						{

							stmt.setString(1, name);

							stmt.setString(2, time);

							stmt.setString(3, date);
							int a = stmt.executeUpdate();
						} catch (SQLIntegrityConstraintViolationException e) {
							System.out.println("This Slot timing is already booked select anyother timing");
							System.exit(0);
						}
						System.out.println("***Slot booked***");

					}

	public void Football() throws SQLException {
		System.out.println("***Please enter User details***");
		 Connection con = getconn();
		 String s1 = "insert into Football(name,time,date) values(?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter User Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter the date");
		             String date=sc1.nextLine();
		             System.out.println("press 1 for 6am-7am");

		     		System.out.println("press 2 for 7am-8am");

		     		System.out.println("press 3 for 8am-9am");

		     		System.out.println("press 4 for 6pm-7pm");

		     		System.out.println("press 5 for 7pm-8pm");

		     		System.out.println("press 6 for 8pm-9pm");

		     		System.out.println("press 7 for 9pm-10pm");

		     		System.out.println("press 8 to choose EXIT");
		     		System.out.println("Enter timing :");

		             int time1 = sc1.nextInt();
		             
		             
		             String time=null;
		            
		         	switch (time1) {
					case 1:

						time = "6am-7am";

						break;

					case 2:
						time = "7am-8am";

						break;

					case 3:

						time = "8am-9am";

						break;

					case 4:

						time = "6pm-7pm";

						break;

					case 5:
						time = "7pm-8pm";

						break;

					case 6:

						time = "8pm-9pm";

						break;
					case 7:

						time = "9pm-10pm";

						break;
					case 8:

						System.exit(0);

					default:

						System.out.println("Wrong Choice");
						break;

					}

					try

					{

						stmt.setString(1, name);

						stmt.setString(2, time);

						stmt.setString(3, date);
						int a = stmt.executeUpdate();
					} catch (SQLIntegrityConstraintViolationException e) {
						System.out.println("This Slot timing is already booked select anyother timing");
						System.exit(0);
					}
					System.out.println("***Slot booked***");
				}

			}
