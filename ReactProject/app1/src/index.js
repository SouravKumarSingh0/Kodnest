import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import Demo from "./Demo";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <div>
  <App />
    <Demo />
    <Demo1 />
    
  </div>
);

function Demo1() {
  return <h2>Demo1 component</h2>
}

//Parent component
function ParentComponent() {
  return (
      <ChildComponent name = "Sourav" age = {23} />
  );
}

//Child component
function ChildComponent(props) {
  return (
      <div>
        <h2>Name:  {props.name}</h2>
        <p>My age is: {props.age}</p>
      </div>
  );
}
