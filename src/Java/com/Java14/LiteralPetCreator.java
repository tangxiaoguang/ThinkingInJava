package com.Java14;

import typeinfo.pets.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by  Tang
 * Create Time 2018/8/11 下午 12:43
 */
public class LiteralPetCreator extends PetCreator{

    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes() {

        return Collections.unmodifiableList(Arrays.asList(
                Pet.class, Dog.class, Cat.class,  Rodent.class,
                Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                Cymric.class, Rat.class, Mouse.class,Hamster.class)
        );

    }

    private static final List<Class<? extends Pet>> types =
        allTypes().subList(allTypes().indexOf(Mutt.class),allTypes().size());

    public List<Class<? extends Pet>> types(){
        return types();
    }

    public static void main(String[] args) {

        System.out.println(args);
//        PetCount.countPets(Pets.creator);
//        System.out.println(types);
//        System.out.println(Pets.creator);
        System.out.println(Test.all());
    }

}

class Test{
   public static Test all(){
       return new Test();
   }
}