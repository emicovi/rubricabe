package com.softatnet.net.rubricabe.model.persona;

public class PersonaDTO {


        private String nome;
        private String cognome;
        private String email;

        private String telefono;

        private String codiceFiscale;


    public String getTelefono() {
            return telefono;
        }


        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getCodiceFiscale() {
            return codiceFiscale;
        }

        public void setCodiceFiscale(String codiceFiscale) {
            this.codiceFiscale = codiceFiscale;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCognome() {
            return cognome;
        }

        public void setCognome(String cognome) {
            this.cognome = cognome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }



}



