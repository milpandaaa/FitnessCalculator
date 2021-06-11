package com.fitness.calculator.FitnessCalculator;

import org.apache.commons.math3.optim.linear.LinearConstraint;
import org.apache.commons.math3.optim.linear.Relationship;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;


@SpringBootApplication
public class FitnessCalculatorApplication {

	public static void main(String[] args) {
		ArrayList<LinearConstraint> arrayList = new ArrayList<>();
		int quantity = 3;
		arrayList.add(new LinearConstraint(new double[] { -1, 1, 4}, Relationship.LEQ, 2));
		arrayList.add(new LinearConstraint(new double[] { 1, -3, 2}, Relationship.LEQ, 3));
		arrayList.add(new LinearConstraint(new double[] { 1, 1, 2}, Relationship.LEQ, 5));

		for (int k = 0; k<quantity; k++) {
			double arrayDefaultedToTen[] = new double[quantity];
			arrayDefaultedToTen[k] = 1;
			arrayList.add(new LinearConstraint(arrayDefaultedToTen, Relationship.GEQ, 0));
		}

		Controller.simplexMethod(new double[] {1, -1, 2},arrayList);
//		SpringApplication.run(FitnessCalculatorApplication.class, args);

	}





}
