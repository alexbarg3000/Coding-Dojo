from flask import Flask, render_template  # added render_template!
app = Flask(__name__)


@app.route('/')
def route_1():
    users = [
   {'first_name' : 'Michael', 'last_name' : 'Choi'},
   {'first_name' : 'John', 'last_name' : 'Supsupin'},
   {'first_name' : 'Mark', 'last_name' : 'Guillen'},
   {'first_name' : 'KB', 'last_name' : 'Tonel'}
]
    
    return render_template("index.html",users_html=users)    
    # Return the string 'Hello World!' as a response
    
if __name__=="__main__":   # Ensure this file is being run directly and not from a different module
    app.run(debug=True)    # Run the app in debug mode.