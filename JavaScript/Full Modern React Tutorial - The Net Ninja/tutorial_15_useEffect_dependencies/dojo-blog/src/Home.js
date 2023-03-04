import { useState, useEffect } from "react";
import BlogList from "./BlogList";

const Home = () => {

    const [blogs, setBlogs] = useState([
        { title: 'My new website', body: 'lorem ipsum...', author: 'mario', id: 1 },
        { title: 'Welcome party!', body: 'lorem ipsum...', author: 'yoshi', id: 2 },
        { title: 'Web dev top tips', body: 'lorem ipsum...', author: 'mario', id: 3 }
    ]);

    const [name, setName] = useState("mario");

    const handleDelete = (id) => {
        const newBlogs = blogs.filter(blog => blog.id !== id);
        setBlogs(newBlogs);
    };

    // Runs everytime "name" variable changes value
    useEffect(() => {
        console.log(name);
    }, [name]); // Dependency array ("name" is the dependency)

    // Only runs after the first initial render to the DOM
    useEffect(() => {
        console.log("use effect ran");
    }, []); // Empty dependency array

    return (
        <div className="home">
            <BlogList blogs={blogs} title="All Blogs!" handleDelete={handleDelete}/>
            <button onClick={() => {setName("luigi")}}>Change name</button>
            <p>{name}</p>
        </div>
    );
}
 
export default Home;


