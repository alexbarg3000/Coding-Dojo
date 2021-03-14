<div class="module_description active_lesson_with_video ">
									
<h1 id="singly-linked-list">Singly Linked List</h1>
<p>In this assignment, you will create your own implementation of a singly linked list in Java. You will need 3 files: <code>Node.java</code>, <code>SinglyLinkedList.java</code>, and <code>ListTester.java</code>. As long as these files are in the same directory, you will not need to import them explicitily. We recommend that you create a <code>ListAssignment</code> folder and place your 3 files there.</p>
<h5 id="node.java">Node.java</h5>
<pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">Node</span> {
    <span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">int</span> value;
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">Node</span> next;
    <span class="keyword from-rainbow">public</span> Node(<span class="keyword from-rainbow">int</span> value) {
        <span class="comment from-rainbow">// your code here</span>
    }
}</pre>
<h5 id="singlylinkedlist.java">SinglyLinkedList.java</h5>
<pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow active_pre">SinglyLinkedList</span> {
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">Node</span> head;
    <span class="keyword from-rainbow">public</span> SinglyLinkedList() {
        <span class="comment from-rainbow">// your code here</span>
    }
    <span class="comment from-rainbow">// SLL methods go here. As a starter, we will show you how to add a node to the list.</span>
    <span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">void</span> add(<span class="keyword from-rainbow">int</span> value) {
        <span class="entity class from-rainbow">Node</span> newNode <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> Node(value);
        if(head <span class="operator from-rainbow">==</span> <span class="constant from-rainbow">null</span>) {
            head <span class="operator from-rainbow">=</span> newNode;
        } <span class="keyword from-rainbow">else</span> {
            <span class="entity class from-rainbow">Node</span> runner <span class="operator from-rainbow">=</span> head;
            while(runner.next <span class="operator from-rainbow">!</span><span class="operator from-rainbow">=</span> <span class="constant from-rainbow">null</span>) {
                runner <span class="operator from-rainbow">=</span> runner.next;
            }
            runner.next <span class="operator from-rainbow">=</span> newNode;
        }
    }    
}</pre>
<h5 id="listtester.java">ListTester.java</h5>
<pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">ListTester</span> {
    <span class="keyword from-rainbow active_pre">public</span> <span class="keyword from-rainbow">static</span> <span class="keyword from-rainbow">void</span> main(<span class="entity class from-rainbow">String</span>[] args) {
        <span class="entity class from-rainbow">SinglyLinkedList</span> sll <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> SinglyLinkedList();
        sll.add(<span class="integer from-rainbow">3</span>);
        sll.add(<span class="integer from-rainbow">4</span>);
        sll.add(<span class="integer from-rainbow">10</span>);
        sll.add(<span class="integer from-rainbow">5</span>);
        sll.add(<span class="integer from-rainbow">15</span>);
        sll.add(<span class="integer from-rainbow">2</span>);
        sll.remove();
        sll.remove();
        sll.printValues();
    }
}</pre>
<h3 id="topics">Objectives:</h3>
<p>● Practice creating classes and objects.</p>
<p>● Learn and implement a singly linked list in Java.</p>
<h3 id="tasks">Tasks:</h3>
<p>● Create a Node class like the above.</p>
<p>● Fill in the constructor method that sets the <code>value</code> to a given number and <code>next</code> to null of your Node objects.</p>
<p>● Create a SinglyLinkedList class like the above.</p>
<p>● Create a constructor method that sets the <code>head</code> to null of your SinglyLinkedList objects</p>
<p>● Create a <code>remove()</code> method that will remove a node from the end of your list</p>
<p>● Create <code>printValues()</code> method that will print all the values of each node in the list in order</p>
<p>● Create a <code>ListTester</code> class like the above.</p>
<h3 id="optional-challenges">Optional Challenges:</h3>
<p>● Implement a <code>find(int)</code> method that will return the first node with the value in the parameter</p>
<p>● Implement a <code>removeAt(int)</code> method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.</p>
<p> <br> <br></p>
</div>
