import { useState } from "react";

const Create = () => {

    const [title, setTitle] = useState('');
    const [body, setBody] = useState('');
    const [author, setAuthor] = useState('mario');
    const [isPending, setIsPending] = useState(false);

    const handleSubmit = (e) => {
        e.preventDefault();
        const blog = {title, body, author};

        setIsPending(true);

        // POST request
        fetch("http://localhost:8000/blogs", {
            method: "POST", // specify its a POST request
            headers: {"Content-Type": "application/json"}, // tell the server we are sending JSON data with this POST request
            body: JSON.stringify(blog) // convert JavaScript object into JSON string
        }).then(() => { // returns a promise when its completed
            console.log("New blog added")
            setIsPending(false);
        })
    };

    return (
        <div className="create">
            <h2>Add a New Blog</h2>
            <form onSubmit={handleSubmit}>
                <label>Blog title:</label>
                <input 
                    type="text"
                    required
                    value={title}
                    onChange={(e) => setTitle(e.target.value)}
                />
                <label>Blog body:</label>
                <textarea
                    required
                    value={body}
                    onChange={(e) => setBody(e.target.value)}
                ></textarea>
                <label>Blog author:</label>
                <select
                    value = {author}
                    onChange={(e) => setAuthor(e.target.value)}
                >
                    <option value="mario">mario</option>
                    <option value="yoshi">yoshi</option>
                </select>
                
                {/* When isPending is false */}
                {!isPending && <button>Add Blog</button>}

                {/* When isPending is true */}
                {isPending && <button disabled>Adding blog...</button>}
            </form>
        </div>
    );
}

export default Create;


