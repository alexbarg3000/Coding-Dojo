<div class="module_description active_lesson_with_video ">
									
<h1 id="project-class">Project Class</h1>
<p>You have been asked by a serial entrepreneur to create a class that she can use to create projects easily. She asks that each project has a <code>name</code> and a <code>description</code>. She needs to be able to create empty projects that she can add a name and description to later; projects with just a name; and projects with both. Every single project should be able to get and set both properties.</p>
<p>She also needs each project to be able to give an elevator pitch that will return the name and description separated by a colon.</p>
<p>Of course, you will also need to demo its capabilities for her, so make a&nbsp;<code>ProjectTest</code> class to do this.</p>
<h3 id="topics">Objectives:</h3>
<p>● Practice overloading methods such as constructors.</p>
<p>● Implement getter and setters.</p>
<h3 id="tasks">Tasks:</h3>
<p>● Create a&nbsp;<code>Project</code>&nbsp;class that has the fields of <code>name</code> and&nbsp;<code>description</code>.</p>
<p>● Create an instance method called&nbsp;<code>elevatorPitch</code>&nbsp;that will return the <code>name</code>&nbsp;and&nbsp;<code>description</code> separated by a colon.</p>
<p>● Overload the constructor method in three different ways.</p>
<p><code>public Project() {}</code></p>
<p><code>public Project(String name) {}</code></p>
<p><code>public Project(String name, String description) {}</code></p>
<p>● Create getter and setters for each field</p>
<p>● Create a <code>ProjectTest</code> file that will test all the functionality.</p>
<h3 id="optional-challenges">Optional Challenges:</h3>
<p>● Add an additional <code>initialCost</code> member variable that is of type double and has both getters and setters</p>
<p>● Add this to the elevator pitch in parentheses after the name, e.g.: <code>name (cost): description</code></p>
<p>● Create a <code>Portfolio</code> class that will keep an <code>ArrayList</code> of <code>Project</code>s in the field <code>projects</code>. Use generics to ensure these are <code>Project</code> objects.</p>
<p>● Add the appropriate getters/setters/constructors for this class to work</p>
<p>● Add the <code>getPortfolioCost</code> method that calculates and returns the cost to buy the entire portfolio.</p>
<p>● Add the <code>showPortfolio</code> method that will print all the project elevator pitches, followed by the total cost.</p>

</div>
