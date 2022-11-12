package com.waa.waalab4.helper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListMapper<T,E> {

    @Autowired
    ModelMapper modelMapper;


    /***
     *
     *
     * @Author - Dr. Muhyieddin
     *
     * I took this helper function from the demo code
     * because I like the way u structured it.
     */

    public List<?> mapList(List<T> list , E convertTo){
       return list.stream()
                .map(e->modelMapper.map(e,convertTo.getClass()))
                .collect(Collectors.toList());
    }
    public  E  mapObject( T source , E convertTo){
        return (E) modelMapper.map(source,convertTo.getClass());
    }

}
