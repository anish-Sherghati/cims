package org.example.cims.dao;

import org.example.cims.beans.Case;
import org.example.cims.beans.CaseDTO;
import org.example.cims.beans.Criminal;
import org.example.cims.beans.CriminalDTO;
import org.example.cims.exceptions.CaseException;
import org.example.cims.exceptions.CriminalException;

import java.util.List;

public interface CaseDao {

    public String registerACase(Case c, Criminal criminal) throws CriminalException, CaseException;

    public String updateCaseStatus(int caseId) throws CaseException;

    public List<CriminalDTO> getCriminalsByCrimeType(String typeOfCrime) throws CriminalException;

    public List<CaseDTO> getCasesByCriminalNames(String suspectName) throws CaseException;

    public List<String> getTotalCaseByArea(String areaName) throws CaseException;
}
