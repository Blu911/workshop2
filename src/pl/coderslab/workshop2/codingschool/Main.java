package pl.coderslab.workshop2.codingschool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import pl.coderslab.workshop2.codingschool.model.*;

public class Main {
    private static String dbUsername = "root";
    private static String dbPassword = "coderslab";
    private static String dbName = "coding_school";

    public static void main(String[] args) {


        try (Connection conn = ConnectionFactory.getConnection(dbUsername, dbPassword, dbName)) {

//SOLUTION - SAVE TO DB TEST
//            Solution solution = new Solution("Nie znam odpowiedzi", 2, 2);
//            solution.saveToDB(conn);

//SOLUTION - LOAD BY ID TEST
//            Solution solution1 = Solution.loadSolutionById(conn, 3);
//            System.out.println(solution1);

//SOLUTION- LOAD ALL SOLUTIONs TEST
//            ArrayList<Solution> solutions = Solution.loadAllSolutions(conn);
//            for (Solution solution : solutions){
//                System.out.println(solution);
//            }

//SOLUTION - DELETE TEST
//            Solution existingSolution = Solution.loadSolutionById(conn, 9);
//            if (existingSolution != null) {
//                Solution.deleteSolution(conn, existingSolution);
//            }
//            ArrayList<Solution> solutions = Solution.loadAllSolutions(conn);
//            for (Solution solution : solutions) {
//                System.out.println(solution);
//            }


//EXERCISE - SAVE TO DB TEST
//            Exercise exercise = new Exercise("Zadanie4", "Jedno ugotowane jajko to ile kurczaków?");
//            exercise.saveToDB(conn);

//EXERCISE - LOAD BY ID TEST
//            Exercise exercise = Exercise.loadExerciseById(conn, 3);
//            System.out.println(exercise);

//EXERCISE- LOAD ALL EXERCISES TEST
//            ArrayList<Exercise> exercises = Exercise.loadAllExercises(conn);
//            for (Exercise exercise1 : exercises){
//                System.out.println(exercise1);
//            }

//EXERCISE - DELETE TEST
//            Exercise existingExercise = Exercise.loadExerciseById(conn, 4);
//            if (existingExercise != null) {
//                Exercise.deleteExercise(conn, existingExercise);
//            }
//
//            ArrayList<Exercise> exercises = Exercise.loadAllExercises(conn);
//            for (Exercise exercise1 : exercises) {
//                System.out.println(exercise1);
//            }

//GROUP - DELETE TEST
//            Group existingGroup = Group.loadGroupById(conn, 3);
//            if (existingGroup != null) {
//                Group.deleteGroup(conn, existingGroup);
//            }
//
//            ArrayList<Group> groups = Group.loadAllGroups(conn);
//            for (Group group : groups) {
//                System.out.println(group);
//            }

//GROUP- LOAD ALL USERS TEST
//            ArrayList<Group> groups = Group.loadAllGroups(conn);
//            for (Group group1 : groups){
//                System.out.println(group1);
//            }

//GROUP - LOAD BY ID TEST
//            Group group = Group.loadGroupById(conn, 3);
//            System.out.println(group);

//GROUP - SAVE TO DB TEST
//            Group group = new Group("1A");
//            group.saveToDB(conn);

//USER - SAVE TO DB TEST
//            User user = new User("Magda", "Gracon", "mojehaslotomaslo");
//            user.saveToDB(conn);
//

//USER - LOAD ALL USERS TEST
//            ArrayList<User> users = User.loadAllUsers(conn);
//            for (User user1 : users) {
//                System.out.println(user1);
//            }

//USER - LOAD BY ID TEST

//            User user1 = User.loadUserById(conn, 1);
//            System.out.println(user1);

//USER - UPDATE TEST
//            User existingUser = User.loadUserById(conn, 3);
//            if (existingUser != null) {
//
//                System.out.println(String.format("Przed zmianami: %s", existingUser.toString()));
//
//                existingUser.setName("Hermes");
//                existingUser.setEmail("hermes@gmail.com");
//                existingUser.saveToDB(conn);
//
//                System.out.println(String.format("Po zmianach: %s", existingUser.toString()));
//            }

//USER - DELETE TEST
//            User existingUser = User.loadUserById(conn, 3);
//            if (existingUser != null) {
//                User.deleteUser(conn, existingUser);
//            }
//
//            ArrayList<User> users = User.loadAllUsers(conn);
//            for (User user : users) {
//                System.out.println(user);
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
