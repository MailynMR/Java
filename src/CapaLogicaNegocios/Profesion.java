package CapaLogicaNegocios;

public enum Profesion {
    
    Ninguna{
        @Override
        public String toString(){
            return "Ninguna"; 
        }
    },
    Primaria{
        @Override
        public String toString(){
            return "Primaria"; 
        }
    },
    Secundaria_O_Licenciaura_Universitario{
        @Override
        public String toString(){
            return "Secundaria"; 
        }
    },
    Licenciaura_Universitario{
        @Override
        public String toString(){
            return "Licenciatura Universitaria"; 
        }
    },
    Universitario{
        @Override
        public String toString(){
            return "Universitario"; 
        }
    },
    Postgrado{
        @Override
        public String toString(){
            return "Postgrado"; 
        }
    }
    
    
    
}
