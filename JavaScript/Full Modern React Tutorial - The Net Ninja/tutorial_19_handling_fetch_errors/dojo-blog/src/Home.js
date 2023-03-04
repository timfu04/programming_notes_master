import { useState, useEffect } from "react";
import BlogList from "./BlogList";

const Home = () => {

    const [blogs, setBlogs] = useState(null);
    const [isPending, setIsPending] = useState(true);
    const [error, setError] = useState(null); // set initial value to null
    
    useEffect(() => {
        setTimeout(() => {
            fetch("http://localhost:8000/blogss") // correct API endpoint: http://localhost:8000/blogs
                .then(res => {
                    // Error sent from server (e.g. invalid endpoint)
                    if (!res.ok){ // if response not OK
                        throw Error("Could not fetch the data for that resource"); // throw user-defined error
                    };
                    return res.json();
                })
                .then(data => {
                    setBlogs(data);
                    setIsPending(false);
                    setError(null); // hide error message when subsequent fetch success
                })
                .catch(err => {
                    setIsPending(false); // hide loading message if catch error
                    setError(err.message);
                })
        }, 1000);
    }, []);

    return (
        <div className="home">

            {/* Show error message if catched network and response error */}
            {error && <div>{error}</div>}
            
            {isPending && <div>Loading...</div>}
            {blogs && <BlogList blogs={blogs} title="All Blogs!"/>}
            
        </div>
    );
}

export default Home;


