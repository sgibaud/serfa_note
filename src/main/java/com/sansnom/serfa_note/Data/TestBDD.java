/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sansnom.serfa_note.Data;



/**
 *
 * @author DevInfo
 */
public class TestBDD {

    String testdata = 
"<html>\n" +
"  <head>\n" +
"    <style type=\"text/css\">\n" +
"      <!--\n" +
"        SelectedEditorStyle  { font-weight: normal; font-style: ; color: #000000; font-size: 6; font-family: Gabriola }\n" +
"      -->\n" +
"    </style>\n" +
"    \n" +
"  </head>\n" +
"  <body>\n" +
"    Ceci est un exemple de <b><i><font color=\"#ff0033\" size=\"6\" face=\"Carlito\"><SelectedEditorStyle ></font></i></b> \n" +
"    avec <i><font color=\"#000000\" size=\"6\" face=\"Gabriola\"><SelectedEditorStyle ></font></i> \n" +
"    mots.\n" +
"V&#233;rifier que Sylvain a bien achet&#233; la liti&#232;re\n" +
"  </body>\n" +
"</html>";
    
    public static void main(String[] args) {
        BDDO base = new BDDO();
        System.err.println(base.ConnectUser("Rémi", "SansFamille"));
    }
}


