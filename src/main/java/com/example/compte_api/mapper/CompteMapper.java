package com.example.compte_api.mapper;




import java.util.Arrays;
import java.util.List;



import com.example.compte_api.entity.Compte;
import com.example.compte_api.entity.dto.CompteDTO;
import fr.xebia.extras.selma.*;

@Mapper(withIoC = IoC.SPRING)
@IgnoreFields({"depotInitial","encours","person","datenaissance","nom","prenom"})

public abstract class  CompteMapper {
    @Maps(withIgnoreMissing=IgnoreMissing.ALL)
    //clone product Dto to product entity
    public  abstract Compte asCompte(CompteDTO compteDTO);

    //clone product entity to product Dto
    public abstract CompteDTO asCompteDTO(Compte compte);


    public List<CompteDTO> asCompteDTO(List<Compte> products) {

        // Check if product is empty
        if (products == null)
        {
            return null;
        }

        // cast list of product entity to array product entity
        Compte[] ArrayProduct = products.toArray(new Compte[0]);

        // map on product entity and clone it to products Dto and return it in format array product Dto
        CompteDTO[] ArrayProductDto = Arrays.stream(ArrayProduct).map(this::asCompteDTO).toArray(CompteDTO[]::new);


        //cast array product dto to list product dto and return it
        return Arrays.asList(ArrayProductDto);
    };
}
