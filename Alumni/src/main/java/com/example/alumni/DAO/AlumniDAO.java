package com.example.alumni.DAO;

import com.example.alumni.Bean.Alumni;

public interface AlumniDAO {
    boolean addAlumni(Alumni a);

    boolean hasRegistered(Alumni alumni);
}
