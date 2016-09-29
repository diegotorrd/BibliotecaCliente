
function buscarLibro(){
    var id_mod = document.getElementById('id_mod').value;
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.get("../BuscarLibroPorID", {
            id_mod : id_mod
    }, function(lib) {
        if(lib === "error"){
            alert("No se pudo obtener información del libro");
        }else{
            document.getElementById('titulo-mod').value = lib.titulo;
            document.getElementById('autor-mod').value= lib.autor;
            document.getElementById('genero-mod').value=lib.genero;
            document.getElementById('pais-mod').value=lib.pais;
            document.getElementById('publicacion-mod').value= lib.publicacion;
            document.getElementById('paginas-mod').value = lib.paginas;
            document.getElementById('imagen-mod').value = lib.imagen; 
            document.getElementById('estado-mod').value = lib.estado;

            var divmod = document.getElementById('div-modificar');
            divmod.style.visibility = 'visible';            
        }                            
    });

}

function registrarLibro(){
    var titulo = document.getElementById('titulo').value;
    var autor = document.getElementById('autor').value;
    var genero = document.getElementById('genero').value;
    var pais = document.getElementById('pais').value;
    var publicacion = document.getElementById('publicacion').value;
    var paginas = document.getElementById('paginas').value;
    var imagen = document.getElementById('imagen').value;
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post("../RegistroServlet", {
            titulo : titulo,
            autor : autor,
            genero : genero,
            pais : pais,
            publicacion : publicacion,
            paginas : paginas,
            imagen : imagen
    }, function(resp) {
        if(resp === "error"){
            alert("Error: No se pudo guardar el Libro");
        }else{
            alert("Éxito! Se guardo nuevo libro con el ID: " + resp);
            document.getElementById('titulo').value = "";
            document.getElementById('autor').value= "";
            document.getElementById('genero').value="";
            document.getElementById('pais').value="";
            document.getElementById('publicacion').value= "";
            document.getElementById('paginas').value = "";
            document.getElementById('imagen').value = ""; 
          
        }                            
    });

}

function actualizarLibro(){
    var id = document.getElementById('id_mod').value;
    var titulo = document.getElementById('titulo-mod').value;
    var autor = document.getElementById('autor-mod').value;
    var genero = document.getElementById('genero-mod').value;
    var pais = document.getElementById('pais-mod').value;
    var publicacion = document.getElementById('publicacion-mod').value;
    var paginas = document.getElementById('paginas-mod').value;
    var imagen = document.getElementById('imagen-mod').value;
    var estado = document.getElementById('estado-mod').value;
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post("../ModificacionServlet", {
        id : id,    
        titulo : titulo,
        autor : autor,
        genero : genero,
        pais : pais,
        publicacion : publicacion,
        paginas : paginas,
        imagen : imagen,
        estado : estado
    }, function(resp) {
        if(resp === "false"){
            alert("Error: No se pudo modificar el Libro");
        }else{
            alert("Éxito! Se modificó el libro con el ID: " + id);
            document.getElementById('id_mod').value = ""; 
            document.getElementById('titulo-mod').value = "";
            document.getElementById('autor-mod').value= "";
            document.getElementById('genero-mod').value="";
            document.getElementById('pais-mod').value="";
            document.getElementById('publicacion-mod').value= "";
            document.getElementById('paginas-mod').value = "";
            document.getElementById('imagen-mod').value = ""; 
            document.getElementById('estado-mod').value = "";  
            
            var divmod = document.getElementById('div-modificar');
            divmod.style.visibility = 'hidden';    
        }                            
    });

}

