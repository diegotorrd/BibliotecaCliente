function buscarLibroUsu(){
    var id_mod = document.getElementById('id-bus-usu').value;
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.get("../BuscarLibroPorID", {
            id_mod : id_mod
    }, function(lib) {
        if(lib === "error"){
            alert("No se pudo obtener información del libro");
        }else{
            document.getElementById('titulo-pop').textContent = lib.titulo;
            document.getElementById('autor-pop').textContent = "Autor: " + lib.autor;
            document.getElementById('genero-pop').textContent = "Genero: " + lib.genero;
            document.getElementById('pais-pop').textContent = "País: " + lib.pais;
            document.getElementById('publicacion-pop').textContent = "Fecha pub.: " + lib.publicacion;
            document.getElementById('paginas-pop').textContent = "Páginas: " + lib.paginas;
            document.getElementById('imagen-pop').src = lib.imagen;
            document.getElementById('id-pop').textContent = "ID: " + lib.id;
            modal.style.display = "block";           
        }                            
    });

}
