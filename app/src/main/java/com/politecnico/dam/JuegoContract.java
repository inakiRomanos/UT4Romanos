package com.politecnico.dam;

import android.provider.BaseColumns;

/**
 * Esquema base de datos
 */

@SuppressWarnings("ALL")
public class JuegoContract {

    @SuppressWarnings("unused")
    public JuegoContract() {
    }

    public static  abstract class  BaseDatosJuegosEntry implements BaseColumns{

        public static final String TABLE_NAME ="juego";

        public static final String ID = "id";
        public static final String INDICE = "indice";
        public static final String PREGUNTA = "pregunta";
        public static final String FORMULA = "formula";
        public static final String PRIMERA_RESPUESTA = "primera_respuesta";
        public static final String SEGUNDA_RESPUESTA = "segunda_respuesta";
        public static final String RESPUESTA_CORRECTA = "respuesta_correcta";
    }

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + BaseDatosJuegosEntry.TABLE_NAME + " (" +
                    BaseDatosJuegosEntry.ID + " TEXT," +
                    BaseDatosJuegosEntry.INDICE + " TEXT," +
                    BaseDatosJuegosEntry.PREGUNTA + " TEXT," +
                    BaseDatosJuegosEntry.FORMULA + " TEXT," +
                    BaseDatosJuegosEntry.PRIMERA_RESPUESTA + " TEXT," +
                    BaseDatosJuegosEntry.RESPUESTA_CORRECTA + " TEXT," +
                    BaseDatosJuegosEntry.SEGUNDA_RESPUESTA + " TEXT )";

    @SuppressWarnings("unused")
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + BaseDatosJuegosEntry.TABLE_NAME;

}
