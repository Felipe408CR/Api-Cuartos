package com.tcc.apicuartostcc.controladores;

import com.tcc.apicuartostcc.entidades.Mercancia;
import com.tcc.apicuartostcc.entidades.Zona;
import com.tcc.apicuartostcc.servicios.implementaciones.MercanciaServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/tcc/mercancias")

public class MercanciaControlador {

    @Autowired
    MercanciaServicioImp mercanciaServicio;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Mercancia mercancia){

        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(mercanciaServicio.registrar(mercancia));
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:Revise su peticion }");
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(mercanciaServicio.bsucarTodos());
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Datos no encontrados }");
        }
    }
    

}
