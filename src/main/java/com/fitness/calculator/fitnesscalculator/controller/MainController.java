package com.fitness.calculator.fitnesscalculator.controller;

import com.fitness.calculator.fitnesscalculator.repository.ProductRepository;
import com.fitness.calculator.fitnesscalculator.model.Product;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Класс - REST контроллер
 */

@RestController
public class MainController {

    private static ProductRepository repository;

    public MainController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public static String mainTemplate(Model model) {
        model.addAttribute("products", repository.findAll());
        return "main";
    }

    @GetMapping("/products")
    List<Product> all() {
        return repository.findAll();
    }

    private void simplex(){
        //		ArrayList<LinearConstraint> arrayList = new ArrayList<>();
//		int quantity = 3;
//		arrayList.add(new LinearConstraint(new double[] { -1, 1, 4}, Relationship.LEQ, 2));
//		arrayList.add(new LinearConstraint(new double[] { 1, -3, 2}, Relationship.LEQ, 3));
//		arrayList.add(new LinearConstraint(new double[] { 1, 1, 2}, Relationship.LEQ, 5));
//
//		for (int k = 0; k<quantity; k++) {
//			double arrayDefaultedToTen[] = new double[quantity];
//			arrayDefaultedToTen[k] = 1;
//			arrayList.add(new LinearConstraint(arrayDefaultedToTen, Relationship.GEQ, 0));
//		}
//
//		MainController.simplexMethod(new double[] {1, -1, 2},arrayList);
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
    }

}
