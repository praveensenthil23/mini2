package miniProject1;

import java.util.Hashtable;
import java.util.Scanner;

import java.sql.*;

public class GaintSportsClub{

        public void Sign_up(String key,String value)
        {
            Hashtable<String,String>h1=new Hashtable<String,String>();
            Scanner sc=new Scanner(System.in);
            h1.put(key,value);
            System.out.println("Re-enter the password: ");
            String Re_passw=sc.next();
            if(Re_passw.equals(value)) {
                System.out.println("Your account is successfully created");
            }
            else {
                System.out.println("The password is mismatching....Try again");
                System.exit(0);
            }  }
        public static void main(String[] args) throws SQLException {
        String p="y";
        String s = "y";
        String usern,passw;
        outer: while (p.equals("y")) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println(".......... WELCOME TO GAINT SPORTS CLUB............");
        System.out.println("....please complete your sign up process....");
        GaintSportsClub s3=new GaintSportsClub();
        System.out.println("Create a new username: ");
        String key=sc1.next();
        System.out.println("Create a new password: ");
        String value=sc1.next();
        s3. Sign_up(key,value);
        //System.out.println("Now You are ready for the login...");
        //System.out.println("please enter the login details: ");
        System.out.println("Enter your username: ");
        usern=sc1.next();
        System.out.println("Enter your password: ");
        passw=sc1.next();

        if(usern.equals(key)&&passw.equals(value))
        {
            System.out.println("Your authentication is successful");

       

	while (s.equals("y")) {

	System.out.println("select thE sport");

	System.out.println("press 1 to choose Cricket");

	System.out.println("press 2 to choose Batminton");

	System.out.println("press 3 to choose Football");

	System.out.println("press 4 to choose EXIT");

	Scanner sc = new Scanner(System.in);

	int i = sc.nextInt();

	BookGround bb = new BookGround();

	switch (i) {

	case 1: 

		bb. Cricket();

	 break;

	case 2:

		bb.Batminton();

break;

	case 3: 

		bb.Football();

break;

	case 4:

		System.exit(0);

	default : 

		System.out.println("Wrong Choice");
break;

}

	System.out.println("Do you want to continue then press y/n");

	s = sc.next();

	if (s.equals("n"))

	{

		System.out.println("******Session closed*******");
break outer ;

	}

	}

}

	else {

	System.out.println("INVALID. Please Enter Correct Details: ");

 	 p = sc1.next();

	 }

	}

 }

}
