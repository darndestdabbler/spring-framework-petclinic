# Solution plan

## The repository as found

One Maven WAR on Spring Framework 7.0.10 at Java 17, built by its Maven
wrapper. Spring MVC controllers live in
`org.springframework.samples.petclinic.web` and are found by the component
scan in `spring/mvc-core-config.xml`; each returns a view name resolved to a
JSP under src/main/webapp/WEB-INF/jsp, laid out by the `petclinic:layout`
tag, with the menu in src/main/webapp/WEB-INF/tags/menu.tag. The tests are
JUnit Jupiter classes named `*Tests.java`; controller tests load
`mvc-core-config.xml` and `mvc-test-config.xml` with
`@SpringJUnitWebConfig` and drive the controller through MockMvc.
`dabbler.yaml` declares one `maven` suite over the wrapper, selecting named
tests with `-Dtest`. All of this is kept: no dependency, plugin or Java
level changes.

## Change 1: an online calculator page

**What changes.** In the web package, `Calculator` (add and subtract two
`BigDecimal`s) and `CalculatorController`, mapped to `/calculator`: GET
shows the form, POST takes `left` and `right` and adds `sum` and
`difference` to the model; both return `calculators/calculator`. The view
is src/main/webapp/WEB-INF/jsp/calculators/calculator.jsp in the existing
layout, and menu.tag gains a Calculator item. The test is
`CalculatorControllerTests` in the web test package, configured like the
other controller tests, checking the GET view and the POST model.

**How it is shown to work.** The wrapper's `test` runs
`CalculatorControllerTests` green; the maven suite selects it by name
through the plural `*Tests.java` glob.

## Change 2: documentation comments

**What changes.** Javadoc on `Calculator`, its methods,
`CalculatorController` and its handler methods, and a JSP comment at the
top of calculator.jsp. No code, markup or build file changes.

**How it is shown to work.** The wrapper's `test` still passes, and the
diff contains only comment lines.

## Out of scope

Any dependency, plugin or Java-level change; any other page; a release.
