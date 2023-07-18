import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Resume {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String objective;
    private List<String> skills;
    private List<String> experience;
    private List<String> education;
    private List<String> internships;
    private List<String> projects;
    public Resume(String name, String email, String phone, String address, String objective,
                  List<String> skills, List<String> experience, List<String> education, List<String> internships, List<String> projects) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.objective = objective;
        this.skills = skills;
        this.experience = experience;
        this.education = education;
        this.internships= internships;
        this.projects= projects;
    }

    // Getters and setters

    // ...

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Phone: ").append(phone).append("\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Objective: ").append(objective).append("\n");

        sb.append("Skills:\n");
        for (String skill : skills) {
            sb.append("- ").append(skill).append("\n");
        }

        sb.append("Experience:\n");
        for (String exp : experience) {
            sb.append("- ").append(exp).append("\n");
        }

        sb.append("Education:\n");
        for (String edu : education) {
            sb.append("- ").append(edu).append("\n");
        }

        sb.append("Internships:\n");
        for (String intern : internships) {
            sb.append("- ").append(intern).append("\n");
        }

        sb.append("Projects:\n");
        for (String proj : projects) {
            sb.append("- ").append(proj).append("\n");
        }


        return sb.toString();
    }
}

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your career objective: ");
        String objective = scanner.nextLine();

        List<String> skills = new ArrayList<>();
        System.out.println("Enter your skills (enter 'done' to finish):");
        String skill;
        while (true) {
            skill = scanner.nextLine();
            if (skill.equalsIgnoreCase("done")) {
                break;
            }
            skills.add(skill);
        }

        List<String> experience = new ArrayList<>();
        System.out.println("Enter your experience (enter 'done' to finish):");
        String exp;
        while (true) {
            exp = scanner.nextLine();
            if (exp.equalsIgnoreCase("done")) {
                break;
            }
            experience.add(exp);
        }

        List<String> education = new ArrayList<>();
        System.out.println("Enter your education (enter 'done' to finish):");
        String edu;
        while (true) {
            edu = scanner.nextLine();
            if (edu.equalsIgnoreCase("done")) {
                break;
            }
            education.add(edu);
        }

        List<String> internships = new ArrayList<>();
        System.out.println("Enter your internships (enter 'done' to finish):");
        String intern;
        while (true) {
            intern = scanner.nextLine();
            if (intern.equalsIgnoreCase("done")) {
                break;
            }
            internships.add(intern);
        }


        List<String> projects = new ArrayList<>();
        System.out.println("Enter your projects (enter 'done' to finish):");
        String proj;
        while (true) {
            proj = scanner.nextLine();
            if (proj.equalsIgnoreCase("done")) {
                break;
            }
            projects.add(proj);
        }

        Resume resume = new Resume(name, email, phone, address, objective, skills, experience, education , internships , projects);
        System.out.println("\nResume submitted:\n" + resume.toString());

        scanner.close();
    }
}
