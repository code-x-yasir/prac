public class ques9_10 {
    prgm 9 and 10 
    public class Hello {
        public static void main(String[] args) {
            System.out.println("Hello from Docker Container!");
        }
    }
    Dockerfile
     
     
    # Use an official Java compiler image
    FROM eclipse-temurin:17
     
     
    # Set working directory inside container
    WORKDIR /app
     
    # Copy Java source file into container
    COPY Hello.java /app
     
    # Compile Java file
    RUN javac Hello.java
     
    # Run program
    CMD ["java", "Hello"]
     
     
    commands to run in terminal:
     1st :-  docker build -t hello-java .
     2nd:-  docker run --rm hello-java
    ------------------------------------------------------------------------------------------------------------
    Lab10
    LoginApp.java
    import java.util.Scanner;
     
    public class LoginApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
     
            System.out.print("Enter username: ");
            String username = sc.nextLine();
     
            System.out.print("Enter password: ");
            String password = sc.nextLine();
     
            if(username.equals("admin") && password.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Access Denied");
            }
     
            sc.close();
        }
    }
     
     
    Dockerfile
    # Use official Java image
    FROM eclipse-temurin:17
     
    # Set working directory
    WORKDIR /app
     
    # Copy Java source file to container
    COPY LoginApp.java .
     
    # Compile the Java program
    RUN javac LoginApp.java
     
    # Run the program (interactive input allowed)
    CMD ["java", "LoginApp"]
     
    commands :
    1:- docker build -t loginapp .
    2nd : docker run -it loginapp
    8 visits · 1 online
      
    
}

import java.util.Set;