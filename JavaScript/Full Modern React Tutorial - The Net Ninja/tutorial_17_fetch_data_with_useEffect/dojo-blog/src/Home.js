import { useState, useEffect } from "react";
import BlogList from "./BlogList";

const Home = () => {

    const [blogs, setBlogs] = useState(null); // Set initial value to be null
    
    // Only runs after the first initial render to the DOM
    useEffect(() => {
        fetch("http://localhost:8000/blogs") // fetch data from API endpoint, returns response object as a promise
        .then(res => {
            return res.json(); // parse JSON data from "res" (response object) into JavaScript object, returns a promise object
        })
        .then(data => { // "data" is JavaScript object
            console.log(data);
            setBlogs(data);
        });
    }, []); // Empty dependency array

    return (
        <div className="home">

            {/* Logical AND (&&) evaluates operands from left to right */}
            {/* "blogs" has an initial value of null, would need some time to fetch and update the variable */}
            {/* If left side (blogs) false (value equals null), it will not proceed to evaluate right side (render BlogList) */}
            {blogs && <BlogList blogs={blogs} title="All Blogs!"/>}

        </div>
    );
}
 
export default Home;


