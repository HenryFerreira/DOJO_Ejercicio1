package co.com.sofka.ejercicio1.models;

import java.util.Objects;

public class Email {
    private Integer emailID;
    private String miDireccion;
    private String tipoEmail;
    private String mensaje;
    private boolean estado = false;

    public Email() {
    }

    public Email(Integer emailID, String miDireccion, String tipoEmail, String mensaje) {
        this.emailID = emailID;
        this.miDireccion = miDireccion;
        this.tipoEmail = tipoEmail;
        this.mensaje = mensaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void mensajeEnviado() {
        this.estado = true;
    }

    public Integer getEmailID() {
        return emailID;
    }

    public void setEmailID(Integer emailID) {
        this.emailID = emailID;
    }

    public String getMiDireccion() {
        return miDireccion;
    }

    public void setMiDireccion(String miDireccion) {
        this.miDireccion = miDireccion;
    }

    public String getTipoEmail() {
        return tipoEmail;
    }

    public void setTipoEmail(String tipoEmail) {
        this.tipoEmail = tipoEmail;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return estado == email.estado && Objects.equals(emailID, email.emailID) && Objects.equals(miDireccion, email.miDireccion) && Objects.equals(tipoEmail, email.tipoEmail) && Objects.equals(mensaje, email.mensaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailID, miDireccion, tipoEmail, mensaje, estado);
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailID=" + emailID +
                ", miDireccion='" + miDireccion + '\'' +
                ", tipoEmail='" + tipoEmail + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", estado=" + estado +
                '}';
    }
}
