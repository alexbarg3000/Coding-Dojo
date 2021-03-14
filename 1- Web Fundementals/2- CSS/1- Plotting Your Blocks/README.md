Plotting Your Blocks


Try to duplicate the image below by adjusting the CSS code provided. Use margins and paddings to adjust the spaces between divisions and use the display property to be able to put each block in its proper place. You may need additional CSS properties.



Here's the HTML code:
```hmtl
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>Position Practice</title>
      <link rel="stylesheet" type="text/css" href="style.css">
   </head>
   <body>
       <div id="wrapper">
         <div id="header"></div>
         <div id="navigation"></div>
         <div id="main_content">
            <div class="subcontents"></div>
            <div class="subcontents"></div>
            <div class="subcontents"></div>
            <div id="advertisement"></div>
         </div>
      </div><!-- end of wrapper -->
   </body>
</html>
```

And CSS:
```html

/*CSS reset settings here*/
*{ 
 margin: 0px;
 padding: 0px;
}
#wrapper{
 width: 950px;
 background-color: silver;
 margin: 0px auto;
}
#header{
 min-height: 150px;
 background-color: green;
}
#navigation{
 min-height: 300px;
 width: 200px;
 background-color: blue;
}
#main_content{
 min-height: 400px;
 width: 700px;
 background-color: red;
}
.subcontents{
 min-height: 200px;
 width: 210px;
 background-color: yellow;
}
#advertisement{
 min-height: 120px;
 width: 660px;
 background-color: purple;
}
```

Do not spend longer than 2-3 hours on this assignment. 

While you do this assignment, please use min-height as well as vertical align to give minimum height to the division and also to vertically align some of the inline-blocks.  Also, please do NOT use float (use display:inline-block instead).

 Work on the exercise above.  Upload your updated HTML and CSS code here. Make sure that your HTML and CSS files are saved in a single folder. Have the folder compressed/zipped before uploading.
