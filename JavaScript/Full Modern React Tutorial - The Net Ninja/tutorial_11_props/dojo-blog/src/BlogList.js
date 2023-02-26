// Alternative 
//const BlogList = ({blogs, title}) => {

const BlogList = (props) => { // props passed from Home.js are accessible in BlogList component
    const blogs = props.blogs;
    const title = props.title;

    return (
        <div className="blog-list">
            <h2>{title}</h2>
            {blogs.map((blog) => 
                <div className="blog-preview" key={blog.id}>
                    <h2>{blog.title}</h2>
                    <p>Written by {blog.author}</p>
                </div>
            )}
        </div>
    );
}
 
export default BlogList;


