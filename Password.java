class Password

{

              public static String createPassword(String userId, String state, int SSN)

              {

                             String password = userId.toLowerCase().substring(0,2) + state.toUpperCase() + SSN%10000;

                             return password;

              }

              public static void main(String[] args)

              {

                             System.out.println("Password: " + createPassword("aboom", "mn", 123456789));

              }

}