import { useState, useEffect } from "react";
import BlogList from "./BlogList";

const Home = () => {

    const [blogs, setBlogs] = useState(null);
    const [isPending, setIsPending] = useState(true); // set initial value to true
    
    useEffect(() => {
        setTimeout(() => { // run code after 1000ms (1 second)
            fetch("http://localhost:8000/blogs") 
            .then(res => {
                return res.json();
            })
            .then(data => {
                console.log(data);
                setBlogs(data);
                setIsPending(false); // set value to false once blog data is ready
            });
        }, 1000);
    }, []);

    return (
        <div className="home">
            {/* // Show loading message when preparing blog data */}
            {isPending && <div>Loading...</div>}
            
            {blogs && <BlogList blogs={blogs} title="All Blogs!"/>}
            
        </div>
    );
}

export default Home;


