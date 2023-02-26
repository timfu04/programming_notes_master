const Home = () => {

    // typically called handle... (naming convention)
    const handleClick = () => {
        console.log("hello", "ninjas");
    };

    const handleClickAgain = (name) => {
        console.log("hello " + name);
    };

    return (
        <div className="home">
            <h2>Homepage</h2>

            {/* Link button to the function by passing in the function name */}
            <button onClick={handleClick}>Click me</button>

            {/* Link button to the function with argument(s) by wrapping it within an anonymous function (call the anonymous function to call the handleClickAgain function) */}
            {/* Because passing in function with parenthesis directly will immediately invoke the function without click */}
            <button onClick={() => handleClickAgain("mario")}>Click me again</button>
        </div>
    );
}
 
export default Home;


