<div class="module_description active_lesson_with_video ">
									
<h1 id="object-master-part-two">Object Master: Part Two</h1>
<p>The club liked your work so much that they asked you to build out their character choices a bit more. They want you to add Ninja, Wizard, and Samurai classes, but they also want any modifications they make to the Human class to extend to these.</p>
<p>In addition to that, each class will have some unique features:</p>
<p>The Wizard class should have a default health of 50 and intelligence of 8; a method called heal that heals whomever it was cast on for an amount equal to the wizard's intelligence; and a method called fireball that decreases the health of whichever object it attacked by 3 * the wizard's intelligence.</p>
<p>The Ninja class should have a default stealth of 10; a method, <code>steal</code>, that takes health from another human by their stealth level, and a way to run away that decreases their health by 10.</p>
<p>The Samurai class should have a default health of 200; a method called <code>deathBlow</code> that attacks an object and decreases its health to 0, but also halves the Samurai's health; a method called <code>meditate</code> which heals the Samurai back to full health; and a method called <code>howMany</code> that returns the current number of Samurai.</p>
<p>Once you are done with this, they would like to see a sample test of the various classes interacting.</p>
<h3 id="topics"></h3>
<h3>Objectives:</h3>
<p>● Implement packages to namespace your project.</p>
<p>● Implement inheritance.</p>
<h3 id="tasks">Tasks:</h3>
<p>● Create <code>Ninja</code>, <code>Wizard</code>, and <code>Samurai</code> classes that all extend from the <code>Human</code> class.</p>
<p>● Wizard: Set default health to 50</p>
<p>● Wizard: Set default intelligence to 8</p>
<p>● Wizard: Add a method <code>heal(Human)</code> that heals the other human by the wizard's intelligence</p>
<p>● Wizard: Add a method <code>fireball(Human)</code> that decreases the other human's health by the wizard's intelligence * 3</p>
<p>● Ninja: Set default stealth to 10</p>
<p>● Ninja: Add a method <code>steal(Human)</code> that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's</p>
<p>● Ninja: Add a method <code>runAway()</code> that decreases their health by 10</p>
<p>● Samurai: Set a default health of 200</p>
<p>● Samurai: Add a method <code>deathBlow(Human)</code> that kills the other human, but reduces the Samurai's health by half</p>
<p>● Samurai: Add a method <code>meditate()</code> that heals the Samurai for half of their current health.</p>
<p>● Samurai: Add a method <code>howMany()</code> that returns the total current number of Samurai.</p>

</div>
