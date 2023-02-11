package bg.softUni.mobilele.domain.dtoS.model;


public class BaseEntityDto {


    private String id;
    public BaseEntityDto() {
    }

    public String getId() {
        return id;
    }

    public BaseEntityDto setId(String id) {

        this.id = id;
        return this;
    }


}