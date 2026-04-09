package com.agzhan.prisoner;

import com.agzhan.prisoner.exception.PrisonerException;
import com.agzhan.prisoner.model.Prisoner;
import com.agzhan.prisoner.service.PrisonerService;
import com.agzhan.prisoner.util.LogUtil;
import com.agzhan.prisoner.util.PrisonerUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Prisoner Survival
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("====== Welcome to the Prisoner Survival System =====");

                System.out.println("Enter the number of prisoners: ");
                int count = sc.nextInt();
                if (count <= 0) {
                    throw new PrisonerException("The number of prisoners must be greater than 0.");
                }

                System.out.println("Enter the step for elimination: ");
                int step = sc.nextInt();
                if (step <= 0) {
                    throw new PrisonerException("Step must be greater than 0.");
                }

                // Generate prisoners
                List<Prisoner> prisoners = PrisonerUtil.generatePrisoners(count);

                LogUtil.info("Initial prisoners: " + prisoners);

                // Simulation solution
                Prisoner survivor1 = PrisonerService.findSurvivor(new ArrayList<>(prisoners), step);

                System.out.println("\nSimulation Result:");
                System.out.println("ID: " + survivor1.getId() +
                        ", First position: " + survivor1.getFirstLocation());

                // Mathematical solution
                Prisoner survivor2 = PrisonerService.findSurvivorMath(prisoners, step);

                System.out.println("\nMathematical Result:");
                System.out.println("ID: " + survivor2.getId() +
                        ", First position: " + survivor2.getFirstLocation());

                break;

            } catch (PrisonerException e) {
                LogUtil.error(e.getMessage());

            } catch (Exception e) {
                LogUtil.error("Input error, please re-enter!");
                sc.nextLine(); // Clear invalid input
            }
        }

    }

}
