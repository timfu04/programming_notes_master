import { useState } from "react";
import BlogList from "./BlogList";

const Home = () => {

    const [blogs, setBlogs] = useState([
        { title: 'My new website', body: 'lorem ipsum...', author: 'mario', id: 1 },
        { title: 'Welcome party!', body: 'lorem ipsum...', author: 'yoshi', id: 2 },
        { title: 'Web dev top tips', body: 'lorem ipsum...', author: 'mario', id: 3 }
    ])

    return (
        <div className="home">
            {/* Reason to use props:
                - Use props to make BlogList component more reusable
                - blogs data can still be used in Home.js */}

            {/* Add properties (blogs & title) to BlogList tag to pass data from Home.js to BlogList.js */}
            <BlogList blogs={blogs} title="All Blogs!"/>
        </div>
    );
}
 
export default Home;


