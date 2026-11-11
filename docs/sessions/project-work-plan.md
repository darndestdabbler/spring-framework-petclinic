# Project work plan — sessions

**Written by `dabbler` as a fold of `activity-log.json`.**
Hand edits are overwritten by the next append. The record is the log;
this page is one view of it.

---

## Sessions

The numbered sessions are declared from `session-plan.md`; each one's task is what its own plan step declared.

| # | Session | Releasable | Declared |
| ---: | --- | --- | --- |
| 1 | Author or import the change plan | no | 2026-11-10 |
| 2 | Break the change plan into numbered sessions | no | 2026-11-10 |
| 3 | The calculator page | no | 2026-11-10 |
| 4 | Documentation comments on the calculator | no | 2026-11-10 |

### Session 1 — Author or import the change plan

**Releasable: no.**

Session 1 writes docs/planning/solution-plan.md from docs/planning/brief.md and nothing else: one paragraph on the repository as found -- one Maven WAR on Spring Framework 7.0.10 at Java 17, built by the Maven wrapper, controllers in org.springframework.samples.petclinic.web under the existing component scan, JSP views under WEB-INF/jsp with the petclinic:layout tag and the menu in menu.tag, JUnit Jupiter tests named *Tests.java driving controllers with MockMvc, run by the maven suite dabbler.yaml declares -- and one section per change: the calculator page (Calculator, CalculatorController at /calculator, calculators/calculator.jsp, a menu item, and CalculatorControllerTests) and the documentation comments on what it added, with nothing else changed.

### Session 2 — Break the change plan into numbered sessions

**Releasable: no.**

Session 2 appends two numbered sessions to docs/sessions/session-plan.md from docs/planning/solution-plan.md and writes nothing else: Session 3, the calculator page -- Calculator and CalculatorController in the web package, calculators/calculator.jsp in the existing layout, a menu item, and CalculatorControllerTests with MockMvc, run by the wrapper's test -- and Session 4, Javadoc on what session 3 added and a JSP comment atop its view, with no code, markup or build file changed. No release session is planned, because the brief names none.

### Session 3 — The calculator page

**Releasable: no.**

Session 3 adds an online calculator page to the Spring Framework petclinic inside its existing shape: src/main/java/org/springframework/samples/petclinic/web/Calculator.java (add and subtract over BigDecimal), src/main/java/org/springframework/samples/petclinic/web/CalculatorController.java mapped to /calculator (GET shows the form, POST adds sum and difference to the model, both returning calculators/calculator) and found by the existing component scan, the view src/main/webapp/WEB-INF/jsp/calculators/calculator.jsp in the petclinic:layout tag, a Calculator item in src/main/webapp/WEB-INF/tags/menu.tag, and src/test/java/org/springframework/samples/petclinic/web/CalculatorControllerTests.java configured like the other controller tests. Each step is shown by the Maven wrapper's test.

### Session 4 — Documentation comments on the calculator

**Releasable: no.**

Session 4 adds documentation comments to what session 3 added and changes nothing else: Javadoc on Calculator, add and subtract in src/main/java/org/springframework/samples/petclinic/web/Calculator.java and on CalculatorController, showForm and calculate in src/main/java/org/springframework/samples/petclinic/web/CalculatorController.java, and a JSP comment at the top of src/main/webapp/WEB-INF/jsp/calculators/calculator.jsp. Each step is shown by the Maven wrapper's test-compile and by a check that the diff of its files against HEAD only adds comment lines.
