import { useNavigate, useParams } from "react-router-dom";
import useFetch from "./useFetch";

const BlogDetails = () => {

    const {id} = useParams();
    const {data : blog, isPending, error} = useFetch(`http://localhost:8000/blogs/${id}`) // fetch blog data based on id

    const navigate = useNavigate(); // use "useNavigate" object

    const handleClick = () => {
        fetch('http://localhost:8000/blogs/' + blog.id, {
            method: 'DELETE'
        }).then(() => {
            navigate("/");
        })

    };

    return (
        <div className="blog-details">

            {/* Display blog details */}
            {isPending && <div>Loading ...</div>}
            {error && <div>{error}</div>}
            {blog && (
                <article>
                    <h2>{blog.title}</h2>
                    <p>Written by {blog.author}</p>
                    <div>{blog.body}</div>

                    {/* Button to delete blog */}
                    <button onClick={handleClick}>Delete</button>
                </article>
            )}
            
        </div>
    );
}
 
export default BlogDetails;


