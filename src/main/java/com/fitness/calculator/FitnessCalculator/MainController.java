package com.fitness.calculator.FitnessCalculator;

import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.*;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public static String simplexMethod( double mainFunctionCoefficients[],
                                      ArrayList<LinearConstraint> restrictions) {
//        LinearObjectiveFunction f = new LinearObjectiveFunction(mainFunctionCoefficients, 0);
//
//        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>(restrictions);


//        PointValuePair solution = new SimplexSolver().optimize(f, new LinearConstraintSet(constraints), GoalType.MAXIMIZE);
//        if (solution != null) {
//            //get solution
//            double max = solution.getValue();
//            System.out.println("Opt: " + max);
//
//            //print decision variables
//            for (int i = 0; i < mainFunctionCoefficients.length; i++) {
//                System.out.print(solution.getPoint()[i] + "\t");
//            }
//        }
        return "main";
    }

}
