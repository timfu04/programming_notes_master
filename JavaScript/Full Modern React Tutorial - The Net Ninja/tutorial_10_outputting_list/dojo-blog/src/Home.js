import { useState } from "react";

const Home = () => {

    const [blogs, setBlogs] = useState([
        { title: 'My new website', body: 'lorem ipsum...', author: 'mario', id: 1 },
        { title: 'Welcome party!', body: 'lorem ipsum...', author: 'yoshi', id: 2 },
        { title: 'Web dev top tips', body: 'lorem ipsum...', author: 'mario', id: 3 }
    ])

    return (
        <div className="home">
            
            {/* map() method loops through each element in the array and applies the function provided to it (in this case, the function creates HTML style templates for each element in the array)*/}
            {/* No curly braces after fat arrow because its returning a single value */}
            {blogs.map((blog) => 
                <div className="blog-preview" key={blog.id}>
                    <h2>{blog.title}</h2>
                    <p>Written by {blog.author}</p>
                </div>
            )}

        </div>
    );
}
 
export default Home;


