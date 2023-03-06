import { useParams } from "react-router-dom";

const BlogDetails = () => {

    // Use "useParams" hook to access the parameters of the current URL
    const {id} = useParams();

    return (
        <div className="blog-details">
            <h2>Blog details - {id}</h2>
        </div>
    );
}
 
export default BlogDetails;


