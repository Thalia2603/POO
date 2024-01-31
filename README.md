
# ARCHIVOS DEL DIRECTORIO

### PRIMERA CLASE PERSONA
![image](https://github.com/Thalia2603/primerEjercicioClases/assets/153110473/406ea8b2-59cb-4513-890f-64f1dcb3d071)

    @startuml "Persona"
        class Persona{
            --atributos--
            - dni:String
            - nombre:String
            - apellido:String
            - edad:Int
            - estadoCivil: Boolean
            --métodos--
            +toString():String
            +aniversario()
            +casamiento()
            +divorcio()
            + constructor(nombre: String, apellido: String)
            + constructor(dni: String, nombre: String, apellido: String, edad: Int, estadoCivil: Boolean)
        }
    @enduml

### SEGUNDA CLASE CIRCULO 
![image](https://github.com/Thalia2603/primerEjercicioClases/assets/153110473/597afbc4-9c7e-4fca-b479-fb076acc7d03)

          @startuml "Circulo"
            class Circulo{
                --atributos--
                - radio:Double
                - color:String
                --métodos--
                +toString():String
                +perimetro()
                +area()
                +constructor(radio: Double,color:String)
                +constructor(radio: Double)
                +GettColor():String
                +GettRadi():Double
                +SettColor(colorActualizado:String)
                +SettRadi(radioActualizado:Double)
            }   
        @enduml
        
### TERCERA CLASE PASTA
![image](https://github.com/Thalia2603/primerEjercicioClases/assets/153110473/da2d3a9e-00c4-40a6-a5c8-ae9eacc38d74)

        @startuml "Pasta"
                class Pasta{
                --atributos--
                - nombre:String
                - precio:Float
                - peso:Float
                - calorias:Float
                --métodos--
                +toString():String
                +constructor(nombre:String,peso:Float,calorias:Float)
                +constructor(nombre: String,precio:Float,peso: Float,calorias: Float)
                +gettPeso():Float
                +gettCalorias():Float
                +settPrecio(precioActualizado:Float):Float
            }
        @enduml
        
### CUARTA CLASE BEBIDA
![image](https://github.com/Thalia2603/primerEjercicioClases/assets/153110473/0657c720-a96f-47f4-94b9-94af6f207980)

        @startuml "Bebida"
            class Bebida{
                --atributos--
                - nombre:String
                - precio:Float
                - esAzucarada:Boolean
                --métodos--
                +toString():String
                +constructor(nombre: String,precio:Float,esAzucarada: Boolean)
                +constructor(nombre:String,esAzucarada:Boolean)
                +constructor(nombre: String,precio: Float)
                +setterPrecio(precioActualizado:Float)
                +gettPrecio():Float
                +gettNombre():String
                +gettAzucar():Boolean
                +contieneAzucar()
        
            }
        @enduml
        
### MAIN
    - Main conjunto que contiene la ejecución de cada clase por separado
### UTILITIES
    -Libreria de utilidades para control de errores de entradas del usuario
### CONSOLE COLORS
    -LIbreria que añade color a mensajes 
### MESSAGES
    -Contiene todos los mensajes de bienvenida,errores y salida del programa
### FUNCTIONS 
    - Contiene las funciones de circulo (menu principal y las diferentes opciones del menu)
