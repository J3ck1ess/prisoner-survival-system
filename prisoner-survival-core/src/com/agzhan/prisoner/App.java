package com.agzhan.prisoner;

import com.agzhan.prisoner.exception.PrisonerException;
import com.agzhan.prisoner.model.Prisoner;
import com.agzhan.prisoner.service.PrisonerService;
import com.agzhan.prisoner.util.LogUtil;
import com.agzhan.prisoner.util.PrisonerUtil;

import java.util.List;
import java.util.Scanner;

// Prisoner Survival
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("====== Welcome to the Prisoner Survival System =====");

                // 1. Generate prisoners
                System.out.println("Enter the number of prisoners: ");
                int count = sc.nextInt();
                if (count <= 0) {
                    throw new PrisonerException("Invalid number of prisoners.");
                }

                // 2. Implement the elimination process
                System.out.println("Enter the step for eliminate: ");
                int step = sc.nextInt();
                if (step <= 0) {
                    throw new PrisonerException("Invalid step.");
                }

                List<Prisoner> prisoners = PrisonerUtil.generatePrisoners(count);
                System.out.println("Initial prisoners: " + prisoners);

                Prisoner survivor = PrisonerService.findSurvivor(prisoners, step);

                // 3. Print the result
                System.out.println("\nThe final survivor: ");
                System.out.println("ID: " + survivor.getId() +
                        ", First position: " + survivor.getFirstLocation());

                break;

            } catch (PrisonerException e) {
                LogUtil.error(e.getMessage());

            } catch (Exception e) {
                LogUtil.error("Input error, please re-enter!");
                sc.nextLine();
            }
        }

    }

}
