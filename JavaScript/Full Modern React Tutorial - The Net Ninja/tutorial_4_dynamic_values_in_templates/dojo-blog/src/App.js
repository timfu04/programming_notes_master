import './App.css';

function App() {

  const title = "Welcome to the new blog";
  const link = "https://www.google.com/";
  const likes = 50; // React will convert any data type into string before displaying in the browser
  
  const person = {name : "yoshi", age : 30}; // object
  const status = true; // boolean
  
  return (
    <div className="App">
      <div className="content">

        <h1>{title}</h1>
        <a href={link}>Google Site</a>
        <p>Liked {likes}</p>

        <p>{10}</p>
        <p>{"hello ninjas"}</p>
        <p>{[1,2,3,4,5]}</p>
        <p>{Math.random() * 10}</p>
        
        {/* React cannot render object directly (gives blank page), render object properties instead */}
        {/* <p>{person}</p>  */}

        {/* Object properties */}
        <p>{person.name}</p>
        <p>{person.age}</p>

        {/* By default, boolean values are not visible in browser */}
        <p>{status}</p>

        {/* Convert boolean values to string to make it visible in browser */}
        <p>{status.toString()}</p>

      </div>
    </div>
  );
}

export default App;


