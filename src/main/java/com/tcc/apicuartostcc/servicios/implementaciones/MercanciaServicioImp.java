package com.tcc.apicuartostcc.servicios.implementaciones;
import com.tcc.apicuartostcc.entidades.Mercancia;
import com.tcc.apicuartostcc.repositorios.Mercanciarepositorio;
import com.tcc.apicuartostcc.servicios.ServicioGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MercanciaServicioImp implements ServicioGenerico<Mercancia> {

    @Autowired
    Mercanciarepositorio mercanciarepositorio;

    @Override
    public List<Mercancia> bsucarTodos() throws Exception {

        try{
            List<Mercancia> mercancia= mercanciarepositorio.findAll();
            return mercancia;
        }catch(Exception error){
            throw new Exception((error.getMessage()));
        }

    }

    @Override
    public Mercancia buscarPorId(Integer id) throws Exception {

        try{

            Optional<Mercancia> mercancia= mercanciarepositorio.findById(id);
            return mercancia.get();

        }catch(Exception error){
            throw new Exception((error.getMessage()));
        }

    }

    @Override
    public Mercancia registrar(Mercancia tabla) throws Exception {

        try{

            tabla=mercanciarepositorio.save(tabla);
            return tabla;

        }catch(Exception error){

            throw new Exception((error.getMessage()));

        }

    }

    @Override
    public Mercancia actualizar(Integer id, Mercancia tabla) throws Exception {

        try{

            Optional<Mercancia> mercanciaBuscada=mercanciarepositorio.findById(id);
            Mercancia mercancia=mercanciaBuscada.get();
            mercancia=mercanciarepositorio.save(tabla);

            return mercancia;

        }catch(Exception error){

            throw new Exception((error.getMessage()));

        }

    }

    @Override
    public Boolean borrar(Integer id) throws Exception {

        try{

            if (mercanciarepositorio.existsById(id)){
                mercanciarepositorio.deleteById(id);
                return true;
            }else {

                throw new Exception();

            }

        }catch(Exception error){

            throw new Exception(error.getMessage());

        }

    }

}
