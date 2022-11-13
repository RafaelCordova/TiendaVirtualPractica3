package tienda.models;


import tienda.Lab3_Pregunta3.ClienteFlyweight;

import java.util.Scanner;

public class Cliente {

    public static Scanner entrada = new Scanner(System.in);

    private String id;
    private String nombre;
    private String direccion;
    private String numeroDocumento;
    private Direccion dir;
    private ContactoCliente contacto;
    private ClienteEmpresa clienteEmpresa;

    public ClienteEmpresa getClienteEmpresa() {
        return clienteEmpresa;
    }

    public void setClienteEmpresa(ClienteEmpresa clienteEmpresa) {
        this.clienteEmpresa = clienteEmpresa;
    }

    private ClienteFlyweight clienteFlyweightAbreviado;

    public ClienteFlyweight getClienteFlyweightAbreviado() {
        return clienteFlyweightAbreviado;
    }

    public void setClif(Cliente cliente, ClienteFlyweight clif) {
        this.clienteFlyweightAbreviado = clif;
    }

    public Cliente() {}

    public Cliente(String id, String nombre, String direccion, String numeroDocumento) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroDocumento = numeroDocumento;
    }

    public Cliente(String nombre, String direccion, String numeroDocumento, Direccion dir) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroDocumento = numeroDocumento;
        this.dir = dir;
    }


    public Cliente(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre)    {
        this.nombre = nombre;
    }

    public String getNombre()   {
        return this.nombre;
    }

    public void setDireccion(String direccion)    {
        this.direccion = direccion;
    }

    public String getDireccion()   {
        return this.direccion;
    }

    public void setNumeroDocumento(String numeroDocumento)    {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNumeroDocumento()   {
        return this.numeroDocumento;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    public ContactoCliente getContacto() {
        return contacto;
    }

    public void setContacto(ContactoCliente contacto) {
        this.contacto = contacto;
    }

    public static Scanner getEntrada() {
        return entrada;
    }

    public static void setEntrada(Scanner entrada) {
        Cliente.entrada = entrada;
    }

    public String imprimeDatosCliente(Cliente cli)  {
        StringBuilder salida = new StringBuilder();
        System.out.println("\nDATOS DEL CLIENTE");
        salida.append("Cliente Id: ").append(cli.numeroDocumento);
        salida.append("\nNombres: ").append(cli.nombre);
        salida.append("\nDireccion: ").append(cli.direccion);

        salida.append("\nPais: ").append(cli.dir.getPais());
        salida.append("\nReferencia: ").append(cli.dir.getReferencia());
        salida.append("\nManzana: ").append(cli.dir.getManzana());
        salida.append("\nLote: ").append(cli.dir.getLote());
        salida.append("\nContacto: ").append(cli.contacto);
        salida.append("\n***** DATOS FINANCIEROS *****");
        salida.append("\n"+cli.clienteEmpresa.toString());
        return salida.toString();
    }


/*
    public String imprimeDatosCliente()  {

        StringBuffer salida = new StringBuffer();
        System.out.println("\nDATOS DEL CLIENTE");
        salida.append("Cliente Id: " + this.numeroDocumento);
        salida.append("\nNombres: " + this.nombre);
        salida.append("\nDireccion: " + this.direccion);
        salida.append("\nManzana: " + this.direccion.getManzana());
        salida.append("\nLote: " + this.direccion.getLote());
        return salida.toString();
    }
*/





}