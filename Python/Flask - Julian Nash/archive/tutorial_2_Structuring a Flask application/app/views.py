from app import app # from "app" package import "app" variable

@app.route("/")
def index():
    return "Hello world!"

@app.route("/about")
def about():
    return "<h1 style = 'color : red'> About!!! </h1>"