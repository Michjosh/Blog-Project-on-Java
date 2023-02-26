package serrvices;
import controllers.UsersController;
import dtos.requests.RegisterRequest;
import dtos.responses.FindUserResponse;

import javax.swing.*;

    public class MainOne {
        private static UsersController userController = new UsersController();
        public static void main(String[] args) {
            startApp();
        }
        private static void startApp(){
            String message = """
                Hi, Wetin you dey find?
                1 -> Register
                2 -> Find Users
                3 -> Exit
                """;
            String input = input(message);
            switch (input.charAt(0)){
                case '1' -> register();
                case '2' -> findUser();
                case '3' -> Exist();
                default -> {
                    display("Invalid input try again");
                    startApp();
                }
            }
        }

        private static void display (String message){
            JOptionPane.showMessageDialog(null, message);
        }

        private static void findUser() {
            FindUserResponse response = new FindUserResponse();
            String userInput = input("Enter user ID to search for:");
            display(userController.findUserById(Integer.parseInt(userInput)).toString());
            startApp();
        }

        private static void register(){
            RegisterRequest request = new RegisterRequest();
            request.setFirstName(input("Enter first name:: "));
            request.setLastName(input("Enter first name:: "));
            request.setUserName(input("Enter username:: "));
            request.setPassword(input("Enter password:: "));
            var result = userController.register(request);
            display(result.toString());
            startApp();
        }

        private static String input(String prompt) {
            return JOptionPane.showInputDialog(prompt);
        }

        private static void Exist() {
            System.exit(1);
        }
}
