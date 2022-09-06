class Dono {

        private String nomeDono;
        private Integer telefone;
        private String endereco;
        private String email;


    public Dono(String nomeDono, Integer telefone, String endereco, String email) {
        this.nomeDono = nomeDono;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public Dono() {
        
    }

    public String getNomeDono() {
            return nomeDono;
        }

        public void setNomeDono(String nomeDono) {
            this.nomeDono = nomeDono;
        }

        public Integer getTelefone() {
            return telefone;
        }

        public void setTelefone(Integer telefone) {
            this.telefone = telefone;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}
