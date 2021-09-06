import DataTable from "components/Datatable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>

      <NavBar />
      <div className = "container">
        <h1 className="text-primary">Hello my friend!</h1>

        <DataTable />

      </div>
      <Footer />
    </>
  );
}

export default App;
