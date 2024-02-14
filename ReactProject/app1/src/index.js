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
