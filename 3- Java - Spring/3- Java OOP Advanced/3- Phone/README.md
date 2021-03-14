<div class="module_description active_lesson_with_video ">
									
            
<h1 id="phone-assignment">Phone Assignment</h1>
<p>In this assignment, we are going to use <code>Abstract</code> classes and <code>Interfaces</code> to create 2 types of phones: iPhone and Galaxy.</p>
<h3 id="topics">Objectives:</h3>
<ul><li><p>Define classes.</p></li><li><p>Define Interfaces.</p></li><li><p>Implement classes that use abstract classes and interfaces.</p></li></ul>
<h3 id="tasks">Tasks:</h3>
<ul><li><p>Create a <code>Phone</code> abstract class.</p><h5 id="phone.java">Phone.java</h5><pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">abstract</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">Phone</span> {
    <span class="keyword from-rainbow">private</span> <span class="entity class from-rainbow">String</span> versionNumber;
    <span class="keyword from-rainbow">private</span> <span class="keyword from-rainbow">int</span> batteryPercentage;
    <span class="keyword from-rainbow">private</span> <span class="entity class from-rainbow">String</span> carrier;
    <span class="keyword from-rainbow">private</span> <span class="entity class from-rainbow">String</span> ringTone;
    <span class="keyword from-rainbow">public</span> Phone(<span class="entity class from-rainbow">String</span> versionNumber, <span class="keyword from-rainbow">int</span> batteryPercentage, <span class="entity class from-rainbow">String</span> carrier, <span class="entity class from-rainbow">String</span> ringTone){
        <span class="keyword from-rainbow">this</span>.versionNumber <span class="operator from-rainbow">=</span> versionNumber;
        <span class="keyword from-rainbow">this</span>.batteryPercentage <span class="operator from-rainbow">=</span> batteryPercentage;
        <span class="keyword from-rainbow">this</span>.carrier <span class="operator from-rainbow">=</span> carrier;
        <span class="keyword from-rainbow">this</span>.ringTone <span class="operator from-rainbow">=</span> ringTone;
    }
    <span class="comment from-rainbow">// abstract method. This method will be implemented by the subclasses</span>
    <span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">abstract</span> <span class="keyword from-rainbow">void</span> displayInfo();
    <span class="comment from-rainbow">// getters and setters removed for brevity. Please implement them yourself</span>
}
</pre>
</li><li><p>Create a <code>Ringable</code> interface that contains the following methods:</p><ul><li><code>ring()</code>: This method returns a <code>String</code>.</li><li><code>unlock()</code>: This method returns a <code>String</code>.</li></ul><h5 id="ringable.java">Ringable.java</h5><pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">interface</span> <span class="entity class from-rainbow">Ringable</span> {
    <span class="comment from-rainbow">// your code here</span>
}
</pre>
</li><li><p>Create an <code>IPhone</code> and <code>Galaxy</code> classes. Both classes should extend from the <code>Phone</code> abstract class and implement the <code>Ringable</code> interface.</p><h5 id="iphone.java">IPhone.java</h5><pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">IPhone</span> <span class="keyword from-rainbow">extends</span> <span class="entity class from-rainbow">Phone</span> <span class="keyword from-rainbow">implements</span> <span class="entity class from-rainbow">Ringable</span> {
    <span class="keyword from-rainbow">public</span> IPhone(<span class="entity class from-rainbow">String</span> versionNumber, <span class="keyword from-rainbow">int</span> batteryPercentage, <span class="entity class from-rainbow">String</span> carrier, <span class="entity class from-rainbow">String</span> ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    <span class="support annotation from-rainbow">@Override</span>
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> ring() {
        <span class="comment from-rainbow">// your code here</span>
    }
    <span class="support annotation from-rainbow">@Override</span>
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> unlock() {
        <span class="comment from-rainbow">// your code here</span>
    }
    <span class="support annotation from-rainbow">@Override</span>
    <span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">void</span> displayInfo() {
        <span class="comment from-rainbow">// your code here            </span>
    }
}
</pre>
<h5 id="galaxy.java">Galaxy.java</h5><pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">Galaxy</span> <span class="keyword from-rainbow">extends</span> <span class="entity class from-rainbow">Phone</span> <span class="keyword from-rainbow">implements</span> <span class="entity class from-rainbow">Ringable</span> {
    <span class="keyword from-rainbow">public</span> Galaxy(<span class="entity class from-rainbow">String</span> versionNumber, <span class="keyword from-rainbow">int</span> batteryPercentage, <span class="entity class from-rainbow">String</span> carrier, <span class="entity class from-rainbow">String</span> ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    <span class="support annotation from-rainbow">@Override</span>
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> ring() {
        <span class="comment from-rainbow">// your code here</span>
    }
    <span class="support annotation from-rainbow">@Override</span>
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> unlock() {
        <span class="comment from-rainbow">// your code here</span>
    }
    <span class="support annotation from-rainbow">@Override</span>
    <span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">void</span> displayInfo() {
        <span class="comment from-rainbow">// your code here            </span>
    }
}
</pre>
</li><li><p>Implement the overriden methods (<code>ring</code>, <code>unlock</code>, <code>displayInfo</code>) from the <code>IPhone</code> and <code>Galaxy</code> classes according to the <code>PhoneTester</code> file below:</p><p><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Screen_Shot_2018-03-05_at_9.07.25_PM.png" alt="phoneTester"></p></li></ul>
<p> <br> </p>
        
</div>
