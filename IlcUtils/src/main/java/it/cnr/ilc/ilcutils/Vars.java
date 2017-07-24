/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.ilcutils;

import java.util.Arrays;
import java.util.List;

/**
 * Variables. TODO: read properties from file
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Vars {
    public static String version ="0.1";
    public static boolean debug=false;
    public static String SERVICE_DESR="desr";
    public static String SERVICE_FR2CONLL_IT="fc_freeling_text_2_conll_it";
    public static String FREELING_IT="freeling_it";
    public static String OF_KAF="kaf";
    public static String OF_TCF="tcf";
    public static String OF_DEF="tabbed";
    public static List<String> services = Arrays.asList(Vars.SERVICE_DESR, Vars.SERVICE_FR2CONLL_IT, Vars.FREELING_IT);
    public static List<String> formats = Arrays.asList(Vars.OF_DEF, Vars.OF_TCF, Vars.OF_KAF);
    public static String encoding="UTF-8";
}