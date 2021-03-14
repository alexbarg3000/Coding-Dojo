from flask import Flask, render_template  # added render_template!
app = Flask(__name__)


# import statements, maybe some other routes
@app.route('/<int:columns>')
def route_0(rows=8,columns=8,color1="red",color2="black"):
    return render_template("index2.html",rows_html=rows,columns_html=columns,color1_html=color1,color2_html=color2) 
@app.route('/')
def route_1(rows=8,columns=8,color1="red",color2="black"):
    return render_template("index2.html",rows_html=rows,columns_html=columns,color1_html=color1,color2_html=color2) 
@app.route('/<int:rows>/<int:columns>')
def route_2(rows=8,columns=8,color1="red",color2="black"):
    return render_template("index2.html",rows_html=rows,columns_html=columns,color1_html=color1,color2_html=color2) 

@app.route('/<int:rows>/<int:columns>/<color1>/<color2>')
def route_3(rows=8,columns=8,color1="red",color2="black"):
    return render_template("index2.html",rows_html=rows,columns_html=columns,color1_html=color1,color2_html=color2)    
    # Return the string 'Hello World!' as a response
    
if __name__=="__main__":   # Ensure this file is being run directly and not from a different module
    app.run(debug=True)    # Run the app in debug mode.