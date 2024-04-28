package com.activity8.activity8;

import java.sql.Timestamp;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class wilaya {
    private long id;
    private boolean actif;
    private long compteCreation ;
    private long compteMaj;
    private java.sql.Timestamp dateCreation;
    private java.sql.Timestamp dateMaj;
    private String nomArabe;
    private String nomLatin;
    private String nomTamazight;
}
