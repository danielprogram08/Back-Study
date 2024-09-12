package Medico;

public class medico {
    private String nome;
    private String especialidade;
    private String hospital;

public medico (String nome, String especialidade, String hospital) {
    this.nome = nome;
    this.especialidade = especialidade;
    this.hospital = hospital;
}

public String getNome () {
    return nome;
}

public void setNome (String nome) {
    this.nome = nome;
}

public String getEspecialidade () {
    return especialidade;
}

public void setEspecialidade (String especialidade) {
    this.especialidade = especialidade;
}

public String hospital () {
    return hospital;
}

public void setHospital (String hospital) {
    this.hospital = hospital;
}



}