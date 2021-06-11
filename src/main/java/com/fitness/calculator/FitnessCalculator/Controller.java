package com.fitness.calculator.FitnessCalculator;

import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.*;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;

import java.util.ArrayList;
import java.util.Collection;

public class Controller {

    public static void simplexMethod( double mainFunctionCoefficients[],
                                      ArrayList<LinearConstraint> restrictions) {
        LinearObjectiveFunction f = new LinearObjectiveFunction(mainFunctionCoefficients, 0);

        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>(restrictions);
//        constraints.add(new LinearConstraint(new double[] { 2, 8}, Relationship.LEQ, 13));
//        constraints.add(new LinearConstraint(new double[] { 5, -1}, Relationship.LEQ, 11));
//
//        constraints.add(new LinearConstraint(new double[] { 1, 0}, Relationship.GEQ, 0));
//        constraints.add(new LinearConstraint(new double[] { 0, 1}, Relationship.GEQ, 0));

        PointValuePair solution = new SimplexSolver().optimize(f, new LinearConstraintSet(constraints), GoalType.MAXIMIZE);

        if (solution != null) {
            //get solution
            double max = solution.getValue();
            System.out.println("Opt: " + max);

            //print decision variables
            for (int i = 0; i < mainFunctionCoefficients.length; i++) {
                System.out.print(solution.getPoint()[i] + "\t");
            }
        }
    }

}
