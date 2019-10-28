# SpringBootPOC

1: Spring Boot provides a number of “Starters” that let you add jars to your classpath. Our applications for smoke tests use the **spring-boot-starter-parent** in the parent section of the POM. The spring-boot-starter-parent is a special starter that provides useful Maven defaults. It also provides a dependency-management section so that you can omit version tags for “blessed” dependencies.

2: **spring-boot-starter-web** provide a suite of WebAPI solution of your project, which allows your define @RestController and @RequestMapping

3: @RestController. This is known as a stereotype annotation. It provides hints for people reading the code and for Spring that the class plays a specific role. In this case, our class is a web @Controller, so Spring considers it when handling incoming web requests.

4: The @RequestMapping annotation provides “routing” information. It tells Spring that any HTTP request with the / path should be mapped to the home method. The @RestController annotation tells Spring to render the resulting string directly back to the caller.