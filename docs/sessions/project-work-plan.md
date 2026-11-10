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
| 2 | Break the change plan into numbered sessions | — | not declared |

### Session 1 — Author or import the change plan

**Releasable: no.**

Session 1 writes docs/planning/solution-plan.md from docs/planning/brief.md and nothing else: one paragraph on the repository as found -- one Maven WAR on Spring Framework 7.0.10 at Java 17, built by the Maven wrapper, controllers in org.springframework.samples.petclinic.web under the existing component scan, JSP views under WEB-INF/jsp with the petclinic:layout tag and the menu in menu.tag, JUnit Jupiter tests named *Tests.java driving controllers with MockMvc, run by the maven suite dabbler.yaml declares -- and one section per change: the calculator page (Calculator, CalculatorController at /calculator, calculators/calculator.jsp, a menu item, and CalculatorControllerTests) and the documentation comments on what it added, with nothing else changed.
