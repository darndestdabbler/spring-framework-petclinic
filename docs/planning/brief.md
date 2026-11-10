# Brief

Two changes to this Spring Framework 7 web application, each its own
session, inside the repository's existing shape: one Maven WAR built by the
wrapper at Java 17, Spring MVC controllers in
`org.springframework.samples.petclinic.web` picked up by the existing
component scan, JSP views under src/main/webapp/WEB-INF/jsp laid out with
the `petclinic:layout` tag, the menu in src/main/webapp/WEB-INF/tags/menu.tag,
and JUnit Jupiter tests named `*Tests.java` that drive controllers with
MockMvc.

1. **An online calculator page.** A page that takes two numbers and shows
   their sum and their difference (add and subtract): a `CalculatorController`
   in the web package mapped to `/calculator`, the arithmetic in its own
   class, a JSP view using the existing layout, and a menu item. Its tests
   follow the existing style: `CalculatorControllerTests` with MockMvc in
   the web test package, which the suite's plural `*Tests.java` glob
   selects.
2. **Documentation comments.** Javadoc on the classes and public methods
   the calculator change added, and a JSP comment at the top of its view.
   Nothing else changes: no code, no markup, no build file.

Out of scope: any dependency, plugin or Java-level change; any other page;
a release.
