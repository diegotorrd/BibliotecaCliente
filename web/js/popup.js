// Get the modal
var modal = document.getElementById('myModal');

// Get the button that opens the modal
//var btn = document.getElementsByClassName('#link-img-*');

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal

//function clickImg(){
//    modal.style.display = "block";
//    var href = jQuery(this).attr("href");
//    alert("el href es " + href);
//}
   
    function clickImg(idclick){ 
        var index = idclick;
        $.get("../BuscarCatalogo", {
            index : index
    }, function(resp) {
            document.getElementById('titulo-pop').textContent = resp.titulo;
            document.getElementById('autor-pop').textContent = "Autor: " + resp.autor;
            document.getElementById('genero-pop').textContent = "Genero: " + resp.genero;
            document.getElementById('pais-pop').textContent = "País: " + resp.pais;
            document.getElementById('publicacion-pop').textContent = "Fecha pub.: " + resp.publicacion;
            document.getElementById('paginas-pop').textContent = "Páginas: " + resp.paginas;
            document.getElementById('imagen-pop').src = resp.imagen;
            document.getElementById('id-pop').textContent = "ID: " + resp.id;
            modal.style.display = "block";  
                                     
    });    
    }

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
};

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target === modal) {
        modal.style.display = "none";
    }
};