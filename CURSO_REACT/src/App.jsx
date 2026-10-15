import { useState } from "react";
import AddTasks from "./componets/AddTasks";
import Tasks from "./componets/Tasks";

function App(){
  const [tasks,setTasks]=useState([{
    id:1,
    title:"Estudar programaçao",
    description:"Para conseguir virar um programador de sucesso",
    isCompleted: false


  },{
    id:2,
    title:"Estudar logica de programaçao",
    description:"Para conseguir virar um programador de sucesso",
    isCompleted: false


  },{
    id:3,
    title:"Estudar matematica",
    description:"Para conseguir virar um programador de sucesso",
    isCompleted: false


  }])
  
  return (
    <div className="w-screen h-screen bg-slate-500 flex justify-center p-6">
      <div className="w-[500px] ">
        <h1 className="text-3xl text-slate-100 font-bold  text-center" >Gerenciador de Tarefas</h1>
        <AddTasks />
        <Tasks  tasks={tasks}/>
      </div>
      

    </div>
  );
}
export default App;
