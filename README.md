# Refactoring
<p>In this assignment, you will refactor a piece of code in order to reduce its size and make it more generalizable.</p>

<p>In completing this assignment, you will:</p>
<ul>
<li>Reinforce what you have learned about identifying code smells</li>
<li>Demonstrate that you are able to apply the appropriate refactoring patterns to fix code smells</li>
<li>Get experience understanding and modifying existing code</li>
</ul>

<p><span style="text-decoration:underline;"><strong>Getting Started</strong></span></p>

<p>Download the files that you will need for this assignment.</p>

<p><a href="//prod-edxapp.edx-cdn.org/assets/courseware/v1/7c32be44ac1498aea6abf227a685456a/asset-v1:PennX+SD2x+2T2017+type@asset+block/NewspaperArticle.java" target="[object Object]">NewspaperArticle.java</a> contains the definition of a NewspaperArticle class that represents an article you would find in a newspaper, including various fields and methods.</p>

<p><a href="//prod-edxapp.edx-cdn.org/assets/courseware/v1/2af25a686446fb3fe84f707da5e5caa6/asset-v1:PennX+SD2x+2T2017+type@asset+block/Client.java" target="[object Object]">Client.java</a> is a class that invokes the various methods in NewspaperArticle for testing purposes.</p>

<p><span style="text-decoration:underline;"><strong>Activity Part 1: Applying Extract Class</strong></span></p>

<p>The NewspaperArticle implementation is an example of what we described in the lesson as a “Large Class”: it has 10 fields, which is perhaps too much, especially since some go together and can be moved to another class.</p>

In particular, the city, state, and postCode fields should be combined into a separate class, which would then make NewspaperArticle a little smaller and allow for reusability of the related fields.

<p>Use the Extract Class refactoring pattern to create a new class called PublishingLocation and implement that class so that it contains the city, state, and postCode fields and any other necessary methods. Then modify NewspaperArticle accordingly by removing fields and methods as needed, and then setting up the appropriate relationship between NewspaperArticle and this newly created PublishingLocation class.</p>

<p>Your refactoring must not necessitate any changes to the Client class in order for it to still compile. That is, you may not change the Client class as a result of this refactoring: you should only be creating a new PublishingLocation class and modifying NewspaperArticle as needed.</p>

<p><span style="text-decoration:underline;"><strong>Activity Part 2: Fixing a Large Class</strong></span></p>

<p>After completing Part 1, the NewspaperArticle class is a bit smaller but still has many fields and methods that may be common to other types of documents, e.g. journal articles or books. By moving those fields and methods to another class, we can have a more generalizable class that can be used for representing other types of documents.</p>

<p>Refactor NewspaperArticle and apply either the Extract Class or Extract Superclass pattern (you need to decide which!) to create a new class called Document that contains the fields and methods that would be common to all types of documents. In particular, move the title, author, date, and publishing location fields and related methods to the new Document class, but leave the rest in NewspaperArticle.</p>

<p>Then modify NewspaperArticle accordingly by removing fields and methods as needed, and then set up the appropriate relationship between NewspaperArticle and this newly created Document class.</p>

<p>While performing this refactoring, you also need to decide whether Document should be a concrete class, an abstract class, or an interface.</p>

<p>As in Part 1, your refactoring must not necessitate any changes to the Client class in order for it to still compile. That is, you may not change the Client class as a result of this refactoring: you should only be creating a new Document class and modifying NewspaperArticle as needed.</p>

<p><span style="text-decoration:underline;"><strong>Helpful Hints</strong></span></p>

<p>For both parts, if you’re not sure how to do the refactoring without changing Client, review the “Abstraction” and “Law of Demeter” lessons from the end of week 3.</p>

<p>In Part 2, think about the difference between the Extract Class and Extract Superclass patterns, especially as they relate to the “has-a” and “is-a” relationships between classes.</p>

<p><span style="text-decoration:underline;"><strong>Before You Submit</strong></span></p>

<p>Please be sure that:</p>

<ul>
  <li>your NewspaperArticle, PublishingLocation, and Document classes are in the default package, i.e. there is no “package” declaration at the top of the source code</li>
  <li>your NewspaperArticle, PublishingLocation, and Document classes compile</li>
  <li>you have not created any additional .java files and have not modified Client.java, but it still compiles (you do not need to submit this file)</li>
</ul>

<p><span style="text-decoration: underline;"><strong>Assessment</strong></span></p>

<p>Your submission will be assessed using automatic grading scripts that will check that your implementation matches the correctly refactored design, specifically that each class:</p>

<ul>
  <li>extends the correct parent class and/or implements the correct interfaces</li>
  <li>is abstract or concrete as specified</li>
  <li>has the correct number of fields and methods</li>
  <li>has fields of the correct name, type, and multiplicity</li>
  <li>has methods of the correct name, parameter type(s), and return type</li>
</ul>

<p>Your score is determined by the percentage of these tests that “pass,” i.e. that correctly implement the various aspects of the new design.</p>

<p>Before submitting your solution, you can run these grading scripts locally on your computer by following the steps below. These instructions assume you are using Eclipse, but should be applicable to other IDEs as well:</p>

<ol>
  <li>Download the JUnit distribution at <a href="//prod-edxapp.edx-cdn.org/assets/courseware/v1/2ed6e73287692ad54165a95ba8e5ac11/asset-v1:PennX+SD2x+2T2017+type@asset+block/junit-dist.jar" target="[object Object]">junit-dist.jar</a> and save it in your project's root directory. You should be able to do this by dragging it from Finder/Explorer into Eclipse and dropping it in the folder that has the same name as your project. Then add it to the project's build path by right-clicking the file name in Eclipse to get the pop-up/context menu, then selecting "Build Path -->" and then "Add to Build Path."</li>
  <li>Download the tests at <a href="//prod-edxapp.edx-cdn.org/assets/courseware/v1/48f23f4baabd7eb5cefcaa6b79e413a2/asset-v1:PennX+SD2x+2T2017+type@asset+block/homework9-tests.jar" target="[object Object]">homework9-tests.jar</a>, and add it to the Eclipse project's build path as above.</li>
  <li>Now run the tests by right-clicking homework9-tests.jar in Eclipse to get the pop-up/context menu and selecting "Run As -->" and then "Java Application." You should see the tests run in the console and it should tell you your score for this assignment, or "Great job!" if your score would be 100%.</li>
</ol>
<p>Alternatively, if you would like to run the autograder from the command line, put the two .jar files and your .class file for this assignment in the same directory and run:</p>

<p>Mac/Linux: java -cp .:junit-dist.jar:homework9-tests.jar Homework9Grader</p>

<p>Windows: java -cp .;junit-dist.jar;homework9-tests.jar Homework9Grader</p>

<p>This will add junit-dist.jar and homework9-tests.jar to the classpath and then run Java with Homework9Grader as the main class.</p>
