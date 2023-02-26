import { useState } from "react";

const Home = () => {
    // "Mario" is initial value
    // "name" is current state
    // "setName" is the function that updates the state.
    const [name, setName] = useState("Mario");

    // 25 is initial value
    // "age" is current state
    // "setAge" is the function that updates the state.
    const [age, setAge] = useState(25);

    const handleClick = () => {
        setName("Luigi");
        setAge(30);
    };

    return (
        <div className="home">
            <h2>Homepage</h2>
            <p>{name} is {age} years old</p>

            {/* When button is clicked, call "handleClick" function that updates the name and age */}
            <button onClick={handleClick}>Click me</button>
        </div>
    );
}
 
export default Home;


