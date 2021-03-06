/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class TestRunner {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      Result result = JUnitCore.runClasses(ConcreteDungeonTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      result = JUnitCore.runClasses(GameTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      result = JUnitCore.runClasses(PlayerTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
   }
}