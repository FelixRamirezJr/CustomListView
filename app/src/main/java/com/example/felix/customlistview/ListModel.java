package com.example.felix.customlistview;

/**
 * Created by felix on 11/7/15.
 * This class is intented for the use of the custom list view
 */
public class ListModel
{
    private String CompanyName;
    private String image;
    private String Url;

    public void setCompanyName (String cn) { this.CompanyName = cn; }
    public void setImage(String i){this.image = i;}
    public void setUrl(String url) {this.Url = url;}

    public String getCompanyName(){return CompanyName;}
    public String getImage(){return image;}
    public String getUrl(){return Url;}

}
