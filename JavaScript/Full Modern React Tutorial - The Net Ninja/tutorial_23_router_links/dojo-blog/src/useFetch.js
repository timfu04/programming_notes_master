import { useState, useEffect } from "react";

const useFetch = (url) => { // pass URL as parameter

    const [data, setData] = useState(null);
    const [isPending, setIsPending] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        setTimeout(() => {
            fetch(url) // fetch data from URL passed in
                .then(res => {
                    if (!res.ok){ 
                        throw Error("Could not fetch the data for that resource");
                    };
                    return res.json();
                })
                .then(data => {
                    setData(data);
                    setIsPending(false);
                    setError(null); 
                })
                .catch(err => {
                    setIsPending(false);
                    setError(err.message);
                })
        }, 1000); 
    }, [url]); // Runs once after initial rendering, and after every rendering if "url" changes

return {data, isPending, error} // return values in JavaScript object

};

export default useFetch;
