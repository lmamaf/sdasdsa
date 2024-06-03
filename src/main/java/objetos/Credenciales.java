package objetos;

public class Credenciales {
    
    private String nombreUsuario;
    private String contrasena; 

    // البناء=Constructor=البناء
    // Tomamos el objeto empleado como parametro 
    public Credenciales(Empleado empleado) {
        /*
            Utilize el metodo generarNombreUsuario de la  clase Algoritmos
            para obtener el nombre de usuario del objeto empleado.
        
        */
        this.nombreUsuario = Algoritmos.generarNombreUsuario(empleado);
        /* 
            Usamos el DNI como contraseña dado que el dni es un valor int
            se convirtio a String para que la contrase;a inicialmente sea 
            su dni.
        */
        this.contrasena = String.valueOf(empleado.getDni());
    }
        // Getters y setters like chads
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
        

}


