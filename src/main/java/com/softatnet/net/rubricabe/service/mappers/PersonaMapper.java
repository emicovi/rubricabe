package com.softatnet.net.rubricabe.service.mappers;

import com.softatnet.net.rubricabe.entity.PersonaEntity;
import com.softatnet.net.rubricabe.model.*;

import java.util.List;

public class PersonaMapper {

    public static PersonaEntity personaEntityFromAddPersonaRequest(AddPersonaRequest personaRequest) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNome(personaRequest.getNome());
        personaEntity.setCognome(personaRequest.getCognome());
        personaEntity.setEmail(personaRequest.getEmail());
        personaEntity.setTelefono(personaRequest.getTelefono());
        personaEntity.setCodiceFiscale(personaRequest.getCodiceFiscale());
        return personaEntity;
    }

    public static AddPersonaResponse addPersonaResponseFromPersonaEntity(PersonaEntity personaEntity) {
        AddPersonaResponse addPersonaResponse = new AddPersonaResponse();
        addPersonaResponse.setCodiceFiscale(personaEntity.getCodiceFiscale());
        addPersonaResponse.setMessage("Persona aggiunta con successo");
        return addPersonaResponse;
    }

    public static PersonaEntity personaEntityFromEditPersonaRequest(EditPersonaRequest personaRequest) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNome(personaRequest.getNome());
        personaEntity.setCognome(personaRequest.getCognome());
        personaEntity.setEmail(personaRequest.getEmail());
        personaEntity.setTelefono(personaRequest.getTelefono());
        personaEntity.setCodiceFiscale(personaRequest.getCodiceFiscale());
        return personaEntity;
    }


    public static EditPersonaResponse editPersonaResponseFromPersonaEntity(PersonaEntity personaEntity) {
       EditPersonaResponse editPersonaResponse = new EditPersonaResponse();
        editPersonaResponse.setCodiceFiscale(personaEntity.getCodiceFiscale());
       return editPersonaResponse;
    }

    public static PersonaEntity personaEntityFromRemovePersonaRequest(RemovePersonaRequest personaRequest) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setCodiceFiscale(personaRequest.getCodiceFiscale());
        return personaEntity;
    }

    public static RemovePersonaResponse removePersonaResponseFromPersonaEntity(PersonaEntity personaEntity) {
        RemovePersonaResponse removePersonaResponse = new RemovePersonaResponse();
        removePersonaResponse.setCodiceFiscale(personaEntity.getCodiceFiscale());
        return removePersonaResponse;
    }

    public static PersonaEntity personaEntityFromSearchPersonaRequest(SearchPersonaRequest searchPersonaRequest) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setCodiceFiscale(searchPersonaRequest.getCodiceFiscale());
        return personaEntity;
    }


    public static SearchPersonaResponse searchPersonaResponseFromPersonaEntity(PersonaEntity personaEntity) {
        SearchPersonaResponse searchPersonaResponse = new SearchPersonaResponse();
        searchPersonaResponse.setCodiceFiscale(personaEntity.getCodiceFiscale());
        return searchPersonaResponse;
    }

    public static GetAllPersonasResponse getAllPersonasResponseFromPersonaEntityList(List<PersonaEntity> personaEntityList) {
        GetAllPersonasResponse getAllPersonasResponse = new GetAllPersonasResponse();
        getAllPersonasResponse.setPersonaEntityList(personaEntityList);
        return getAllPersonasResponse;
    }

    public static PersonaEntity personaEntityFromSearchPersonaByNameRequest(SearchPersonaByNameRequest personaRequest) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNome(personaRequest.getNome());
        return personaEntity;
    }

    public static SearchPersonaByNameResponse searchPersonaByNameResponseFromPersonaEntity(PersonaEntity personaEntity) {
        SearchPersonaByNameResponse searchPersonaByNameResponse = new SearchPersonaByNameResponse();
        return searchPersonaByNameResponse;
    }
}
