package jsfbeans;

import util.Constants;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by ignatenko on 19.11.16.
 */
@ManagedBean
@ViewScoped
public class IndexBean {
    public String addCompany(){
        return "addCompany?" + Constants.REDIRECT_PARAM;
    }

    public String addCategory(){
        return "addCategory?" + Constants.REDIRECT_PARAM;
    }

    public String addVacancy(){
        return "addVacancy?" + Constants.REDIRECT_PARAM;
    }

    public String addPosition(){
        return "addPosition?" + Constants.REDIRECT_PARAM;
    }


    public String getCategories(){
        return "getCategory?"+Constants.REDIRECT_PARAM;
    }

    public String getCompanies(){
        return "getCompany?" + Constants.REDIRECT_PARAM;
    }

    public String getVacancies(){
        return "getVacancy?" + Constants.REDIRECT_PARAM;
    }

    public String getPositions(){
        return "getPosition?" + Constants.REDIRECT_PARAM;
    }


}
