/**
 * This interface is used to define all Constants in Class DPAView.java.
 *
 * @author Biqiang Jiang
 *
 * @version 1.0, 01/09/09
 *
 * @since JDK1.5.7
 */

package org.jcryptool.visual.sidechannelattack.dpa.views;

import org.jcryptool.visual.sidechannelattack.DPAPlugIn;

public interface Constants {

    static String pluginRootDirectory = DPAPlugIn.getDefault().getBundle().getLocation().substring(16);

    String IMGADDRESSE_TEST_ENG = Messages.Constants_0;
    String IMGADDRESSE_DA_ENG = Messages.Constants_1;
    String IMGADDRESSE_D_ENG = Messages.Constants_2;
    String IMGADDRESSE_D_0_ENG = Messages.Constants_3;

    String VIEW_ID = Messages.Constants_4; // 96-47
    String MAIN_GROUP_TITLE = Messages.Constants_5;
    String ECC_ALG_GROUP_TITLE = Messages.Constants_6;
    String ECC_ALG_TEXT =
            Messages.Constants_7;
    String EXPLANATION_OF_ALG = Messages.Constants_8;
    String UNSECURE_DOUBLE_ADD_TEXT =
    Messages.Constants_9;
    String DOUBLE_ADD = Messages.Constants_10;
    String UNSECURE_DOUBLE_ADD_ALWAYS_TEXT =
            Messages.Constants_11;
    String RANDOMIZED_SCALAR_MULTIPLIER_TEXT =
            Messages.Constants_12;
    String DOUBLE_ADD_ALWAYS = Messages.Constants_13;
    String RANDOMIZED_INITIAL_POINT_TEXT =
            Messages.Constants_14;
    String RANDOMIZED_ISOMORPHIC_CURVE_TEXT =
            Messages.Constants_15;
    String COUTNERMEASURES_CCOMBO_RANDOMIZED_SCALAR_MULTIPLIER = Messages.Constants_16;
    String COUNTERMEASURES_CCOMBO_RANDOMIZED_INITIAL_POINT = Messages.Constants_17;
    String COUNTERMEASURES_CCOMBO_RANDOMIZED_ISOMORPHIC_CURVE = Messages.Constants_18;
    String TEXT_OF_PARAMETEROFCOUNTERMEASURESTEXT =
            Messages.Constants_19;
    String INSECURE_ALG_LABEL_TEXT = Messages.Constants_20;
    String TITLE_OF_PARAMETEROFCOUNTERMEASURESGROUP = Messages.Constants_21;
    String TOOLTIPTEXT_OF_PARAMETERACOMBO = Messages.Constants_22;
    String TOOLTIPTEXT_OF_PARAMETERBCOMBO = Messages.Constants_23;
    String TOOLTIPTEXT_OF_ORDEROFCURVETEXT =
            Messages.Constants_24;
    String TOOLTIPTEXT_OF_SCALARPARAMETERCOMBO = Messages.Constants_25;
    String TOOLTIPTEXT_OF_ECPOINTSCOMBO = Messages.Constants_26;
    String TEXT_OF_EXECUTEBUTTON = Messages.Constants_27;
    String TOOLTIPTEXT_OF_ORDEROFECPOINTTEXT =
            Messages.Constants_28;
    String TOOLTIPTEXT_OF_PRIMEFIELDSELECTCOMBO = Messages.Constants_29;
    String TEXT_OF_PARAMETEROFCOUNTERMEASURESTEXT_1 =
            Messages.Constants_30;
    String SECURE_ALG_LABEL_TEXT = Messages.Constants_31;
    String TEXT_OF_GLABEL = Messages.Constants_32;
    String TEXT_OF_ALABEL = Messages.Constants_33;
    String TEXT_OF_BLABEL = Messages.Constants_34;
    String TOOLTIPTEXT_OF_ECCURVETEXT = Messages.Constants_35;
    String TEXT_OF_DOUBLE_FORMEL = Messages.Constants_36;
    String TEXT_OF_ADD_FORMEL = Messages.Constants_37;
    String TEXT_OF_K_IN_BINARYFORM = Messages.Constants_38;
    String PARAM_OF_ECC_GROUP_TITEL = Messages.Constants_39;
    String PARAM_OF_COUNTERMEASURES_GROUP_TITEL = Messages.Constants_40;
    String CALCULATION_TABLE_GROUP_TITEL = Messages.Constants_41;
    String FIRST_COLUMN_IN_TABLE = Messages.Constants_42;
    String SECOND_COLUMN_IN_TABLE = Messages.Constants_43;
    String THIRD_COLUMN_IN_TABLE = Messages.Constants_44;
    String CHOOSE_AN_ECPOINT_LABEL_TEXT = Messages.Constants_45;
    String PRIME_FIELD_LABEL_TEXT = Messages.Constants_46;
    String ECCURVE_TEXT_PART1 = Messages.Constants_47;
    String ECCURVE_TEXT_PART2 = Messages.Constants_48;
    String ECCURVE_TEXT_PART3 = Messages.Constants_49;
    String CUE_LABEL_TEXT_1 = Messages.Constants_50;
    String CUE_LABEL_TEXT_2 = Messages.Constants_51;
    String CUE_LABEL_TEXT_3 = Messages.Constants_52;
    String CUE_LABEL_TEXT_4 = Messages.Constants_53;
    String CUE_LABEL_TEXT_5 = Messages.Constants_54;
    String ORDER_OF_SELECTED_POINT_TEXT = Messages.Constants_55;
    String ORDER_OF_CURVE_TEXT = Messages.Constants_56;
    String INITIAL_TABLE_ITEM_PART_1 = Messages.Constants_57;
    String INITIAL_TABLE_ITEM_PART_2 = Messages.Constants_58;
    String DECIMAL_ABBR = Messages.Constants_59;
    String INITIAL_TABLE_ITEM_BINARY = Messages.Constants_60;
    String BINARY_ABBR = Messages.Constants_61;
    String INITIAL_TABLE_ITEM_PROCESS = Messages.Constants_62;
    String INITIAL_TABLE_ITEM_INPUT = Messages.Constants_63;
    String INITIAL_TABLE_ITEM_DOUBLE = Messages.Constants_64;
    String INITIAL_TABLE_ITEM_ADD = Messages.Constants_65;
    String RANDOMIZED_K_TEXT_PART1 = Messages.Constants_66;
    String RANDOMIZED_K_TEXT_PART2 = Messages.Constants_67;
    String RANDOMIZED_K_TEXT_PART3 = Messages.Constants_68;
    String RANDOMIZED_K_TEXT_PART4 = Messages.Constants_69;
    String RANDOMIZED_K_TEXT_PART5 = Messages.Constants_70;
    String RANDOMIZED_K_TEXT_PART6 = Messages.Constants_71;
    String RANDOMIZED_K_TEXT_PART7 = Messages.Constants_72;
    String RANDOMIZED_K_TEXT_PART8 = Messages.Constants_73;
    String RANDOMIZED_K_TEXT_PART9 = Messages.Constants_74;
    String RANDOMIZED_K_TEXT_PART10 = Messages.Constants_75;
    String RANDOMIZED_K_TEXT_PART11 = Messages.Constants_76;
    String RANDOMIZED_K_TEXT_PART12 = Messages.Constants_77;
    String RANDOMIZED_ECPOINT_TEXT_PART1 = Messages.Constants_78;
    String RANDOMIZED_ECPOINT_TEXT_PART2 = Messages.Constants_79;
    String RANDOMIZED_ECPOINT_TEXT_PART3 = Messages.Constants_80;
    String RANDOMIZED_ECPOINT_TEXT_PART4 = Messages.Constants_81;
    String RANDOMIZED_ECPOINT_TEXT_PART5 = Messages.Constants_82;
    String RANDOMIZED_ECPOINT_TEXT_PART6 = Messages.Constants_83;
    String RANDOMIZED_ECPOINT_TEXT_PART7 = Messages.Constants_84;
    String RANDOMIZED_ECPOINT_TEXT_PART8 = Messages.Constants_85;
    String RANODMIZED_ECPOINT_TEXT_PART9 = Messages.Constants_86;
    String RANODMIZED_ECPOINT_TEXT_PART10 = Messages.Constants_87;
    String RANODMIZED_ECPOINT_TEXT_PART11 = Messages.Constants_88;
    String RANODMIZED_ECPOINT_TEXT_PART12 = Messages.Constants_89;
    String RANODMIZED_ECPOINT_TEXT_PART13 = Messages.Constants_90;
    String RANODMIZED_ECPOINT_TEXT_PART14 = Messages.Constants_91;
    String RANODMIZED_ECPOINT_TEXT_PART15 = Messages.Constants_92;
    String RANODMIZED_ECPOINT_TEXT_PART16 = Messages.Constants_93;
    String RANODMIZED_ECPOINT_TEXT_PART17 = Messages.Constants_94;
    String RANODMIZED_ECPOINT_TEXT_PART18 = Messages.Constants_95;
    String RANODMIZED_ECPOINT_TEXT_PART19 = Messages.Constants_96;
    String RANODMIZED_ECPOINT_TEXT_PART20 = Messages.Constants_97;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART1 = Messages.Constants_98;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART2 = Messages.Constants_99;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART3 = Messages.Constants_100;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART4 = Messages.Constants_101;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART5 = Messages.Constants_102;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART6 = Messages.Constants_103;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART7 = Messages.Constants_104;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART8 = Messages.Constants_105;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART9 = Messages.Constants_106;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART10 = Messages.Constants_107;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART11 = Messages.Constants_108;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART12 = Messages.Constants_109;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART13 = Messages.Constants_110;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART14 = Messages.Constants_111;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART15 = Messages.Constants_112;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART16 = Messages.Constants_113;
    String RANDOMIZED_ISOMORPHIC_TEXT_PART17 = Messages.Constants_114;
    String INITIAL_TABLE_ITEM_HIGHEST_BIT = Messages.Constants_115;
    String TABLE_ITEM_DOUBLE = Messages.Constants_116;
    String TABLE_ITEM_P_EQUALS = Messages.Constants_117;
    String TABLE_ITEM_ADD = Messages.Constants_118;
    String TABLE_ITEM_WRONG_POINT_TEXT1 =
            Messages.Constants_119;
    String TABLE_ITEM_Q0_DOUBLE = Messages.Constants_120;
    String INITIALTABLEITEM_INPUT = Messages.Constants_121;
    String INITIALTABLEITEM_DOUBLE = Messages.Constants_122;
    String INITIALTABLEITEM_ADD = Messages.Constants_123;
    String TABLE_ITEM_Q1_DOUBLE = Messages.Constants_124;
    String TABLE_ITEM_Q0_DOUBLE_NEW = Messages.Constants_125;
    String TABLE_ITEM_P_PLUS_R = Messages.Constants_126;
    String TABLE_ITEM_Q1_ADD_NEW1 = Messages.Constants_127;
    String TABLE_ITEM_P_NEW_EQUALS = Messages.Constants_128;
    String TABLE_ITEM_Q1_ADD_NEW2 = Messages.Constants_129;
    String TABLE_ITEM_OUTPUT = Messages.Constants_130;
    String TABLE_ITEM_NEW_G_PART1 = Messages.Constants_131;
    String TABLE_ITEM_NEW_G_PART2 = Messages.Constants_132;
    String TABLE_ITEM_NEW_G_PART3 = Messages.Constants_133;
    String TABLE_ITEM_Q_EQUALS = Messages.Constants_134;
    String TABLE_ITEM_NEW_Q = Messages.Constants_135;
    String UNICODE_1 = Messages.Constants_136;
    String UNICODE_2 = Messages.Constants_137; // superscript 2
    String UNICODE_3 = Messages.Constants_138; // superscript 3
    String UNICODE_5 = Messages.Constants_139;
    String UNICODE_6 = Messages.Constants_140;
    String UNICODE_7 = Messages.Constants_141;
    String UNICODE_8 = Messages.Constants_142;
    String UNICODE_9 = Messages.Constants_143; // subscript i
    String UNICODE_10 = Messages.Constants_144; // superscript 4
    String UNICODE_11 = Messages.Constants_145; // superscript 6
    String UNICODE_12 = Messages.Constants_146; // superscript -

    String TABLE_ITEM_Xq_EQUALS = Messages.Constants_147;
    String TABLE_ITEM_Yq_EQUALS = Messages.Constants_148;
    String DPA_PLUGIN_ID = Messages.Constants_149;

}
