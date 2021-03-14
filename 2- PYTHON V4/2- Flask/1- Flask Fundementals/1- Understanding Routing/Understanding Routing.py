from flask import Flask  # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"
@app.route('/')          # The "@" decorator associates this route with the function immediately following
def hello_world():
    return 'Hello World!'  # Return the string 'Hello World!' as a response



# import statements, maybe some other routes

@app.route('/dojo')
def success():
    return "Dojo!"

# app.run(debug=True) should be the very last statement!

@app.route('/say/<name>') # for a route '/hello/____' anything after '/hello/' gets passed as a variable 'name'
def hello(name):
    print(name)
    return "Hi, " + name

@app.route('/repeat/<int:num>/<word>') # for a route '/users/____/____', two parameters in the url get passed as username and id
def show_user_profile(num, word):
    print(f" {num} this is the number of times")
    print("{}  is the word".format(word))
    return int(num)*word


if __name__=="__main__":   # Ensure this file is being run directly and not from a different module
    app.run(debug=True)    # Run the app in debug mode.


