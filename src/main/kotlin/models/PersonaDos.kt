package models
    open class PersonaDos {
        protected var nom:String
        protected var cognoms:String
        protected var edat:Int
        init {
            nom=""
            cognoms=""
            edat = 0
        }
        constructor() { }
        constructor(nom:String, cognoms:String) {
            this.nom = nom
            this.cognoms = cognoms
        }
    }

    class Professor : PersonaDos {
        protected var especialitats: MutableList<String>
        init {
            especialitats = mutableListOf<String>()
        }
        constructor(nom:String, cognoms:String) : super(nom,cognoms) {}

        fun novaEspecialitat(titulo:String) {
            especialitats.add(titulo)
        }

        override fun toString():String {
            return "$nom $cognoms -- Edat: $edat -- Especialitats: $especialitats"
        }

    }
