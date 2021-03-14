from flask import Flask, render_template  # added render_template!
app = Flask(__name__)
@app.route('/play')          # The "@" decorator associates this route with the function immediately following
def index():
    return render_template("index.html")    # Return the string 'Hello World!' as a response



# import statements, maybe some other routes

@app.route('/play/<int:reps>')
def success(reps):
    return render_template("index1.html", times_html=reps)    
    # Return the string 'Hello World!' as a response

# app.run(debug=True) should be the very last statement!

@app.route('/play/<int:reps>/<string:color>')
def dynamic(reps,color):
    return render_template("index2.html",times_html=reps,color_html=color)    
    # Return the string 'Hello World!' as a response
    
if __name__=="__main__":   # Ensure this file is being run directly and not from a different module
    app.run(debug=True)    # Run the app in debug mode.