package com.proyecto.dororo.model;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    public class Objeto implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false, updatable = false)
        private Long id;
        private String objeto;
        private String procedencia;

        public Objeto() {
        }

        public Objeto(Long id, String objeto, String procedencia) {
            this.id = id;
            this.objeto = objeto;
            this.procedencia = procedencia;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getObjeto() {
            return objeto;
        }

        public void setObjeto(String objeto) {
            this.objeto = objeto;
        }

        public String getProcedencia() {
            return procedencia;
        }

        public void setProcedencia(String procedencia) {
            this.procedencia = procedencia;
        }

        @Override
        public String toString(){
            return "Objeto{" +
                    "id=" + id +
                    ", objeto='" + objeto + '\'' +
                    ", procedencia='" + procedencia + '\'' +
                    '}';
        }

    }
