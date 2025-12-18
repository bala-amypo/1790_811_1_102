package com.example.warranty.service;

import java.util.List;
import com.example.warranty.entity.Warranty;

public interface WarrantyService {

    Warranty save(Warranty warranty);

    List<Warranty> getAll();
}
