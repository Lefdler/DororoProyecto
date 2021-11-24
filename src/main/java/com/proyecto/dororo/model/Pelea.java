package com.proyecto.dororo.model;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    public class Pelea implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false, updatable = false)
        private Long id;
        private String ganador;
        private String lugar;
        private String demonio;

        public Pelea() {
        }

        public Pelea(Long id, String ganador, String lugar, String demonio) {
            this.id = id;
            this.ganador = ganador;
            this.lugar = lugar;
            this.demonio = demonio;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getGanador() {
            return ganador;
        }

        public void setGanador(String ganador) {
            this.ganador = ganador;
        }

        public String getLugar() {
            return lugar;
        }

        public void setLugar(String lugar) {
            this.lugar = lugar;
        }

        public String getDemonio() {
            return demonio;
        }

        public void setDemonio(String demonio) {
            this.demonio = demonio;
        }

        @Override
        public String toString(){
            return "Pelea{" +
                    "id=" + id +
                    ", ganador='" + ganador + '\'' +
                    ", lugar='" + lugar + '\'' +
                    ", demonio='" + demonio + '\'' +
                    '}';
        }

    }
