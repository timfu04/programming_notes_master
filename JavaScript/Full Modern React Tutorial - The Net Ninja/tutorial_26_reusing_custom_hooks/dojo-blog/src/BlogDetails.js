import { useParams } from "react-router-dom";
import useFetch from "./useFetch";

const BlogDetails = () => {

    const {id} = useParams();
    const {data : blog, isPending, error} = useFetch(`http://localhost:8000/blogs/${id}`) // fetch blog data based on id

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
                </article>
            )}
            
        </div>
    );
}
 
export default BlogDetails;


