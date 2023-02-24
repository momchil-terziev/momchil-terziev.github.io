// Simcenter STAR-CCM+ macro: setupyplus.java
// Written by Simcenter STAR-CCM+ 17.04.008
package macro;

import java.util.*;

import star.common.*;
import star.base.neo.*;

public class setupyplus extends StarMacro {

  public void execute() {
    execute0();
  }

  private void execute0() {

    Simulation simulation_0 = 
      getActiveSimulation();

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_0 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_0.setPresentationName("Scale");

    Units units_0 = 
      ((Units) simulation_0.getUnitsManager().getObject(""));

    scalarGlobalParameter_0.getQuantity().setValueAndUnits(75.0, units_0);

    ScalarGlobalParameter scalarGlobalParameter_1 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar 2"));

    scalarGlobalParameter_1.setPresentationName("L");

    ScalarGlobalParameter scalarGlobalParameter_2 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar 3"));

    scalarGlobalParameter_2.setPresentationName("B");

    ScalarGlobalParameter scalarGlobalParameter_3 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar 4"));

    scalarGlobalParameter_3.setPresentationName("T");

    ScalarGlobalParameter scalarGlobalParameter_4 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar 5"));

    scalarGlobalParameter_4.setPresentationName("h/T");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_5 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_5.setPresentationName("h");

    ScalarGlobalParameter scalarGlobalParameter_6 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar 2"));

    scalarGlobalParameter_6.setPresentationName("w/L");

    ScalarGlobalParameter scalarGlobalParameter_7 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar 3"));

    scalarGlobalParameter_7.setPresentationName("w");

    scalarGlobalParameter_0.setPresentationName("target y+");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_8 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_8.setPresentationName("Density");

    scalarGlobalParameter_8.setPresentationName("rho");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_9 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_9.setPresentationName("miu");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_10 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_10.setPresentationName("Friction velocity");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_11 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_11.setPresentationName("Reynolds number");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_12 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_12.setPresentationName("Fr");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_13 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_13.setPresentationName("Fh");

    simulation_0.get(GlobalParameterManager.class).remove(scalarGlobalParameter_12);

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_14 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_14.setPresentationName("U");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_15 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_15.setPresentationName("Boundary layer thickness");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_16 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_16.setPresentationName("Resolved distance");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_17 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_17.setPresentationName("Layers");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_18 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_18.setPresentationName("Stretch fucntion");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_19 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_19.setPresentationName("dy");

    scalarGlobalParameter_1.getQuantity().setDefinition("230/${Scale}");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_20 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_20.setPresentationName("Scale");

    scalarGlobalParameter_20.getQuantity().setValueAndUnits(75.0, units_0);

    scalarGlobalParameter_4.getQuantity().setValueAndUnits(2.22, units_0);

    UserTag userTag_0 = 
      simulation_0.get(TagManager.class).createNewUserTag("Tag");

    userTag_0.setPresentationName("Ship geometry");

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_1, new NeoObjectVector(new Object[] {userTag_0}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_3, new NeoObjectVector(new Object[] {userTag_0}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_2, new NeoObjectVector(new Object[] {userTag_0}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_20, new NeoObjectVector(new Object[] {userTag_0}));

    UserTag userTag_1 = 
      simulation_0.get(TagManager.class).createNewUserTag("Tag");

    userTag_1.setPresentationName("Flow constants");

    userTag_1.setPresentationName("Flow properties");

    UserTag userTag_2 = 
      simulation_0.get(TagManager.class).createNewUserTag("Tag");

    userTag_2.setPresentationName("Mesh properties");

    UserTag userTag_3 = 
      simulation_0.get(TagManager.class).createNewUserTag("Tag");

    userTag_3.setPresentationName("Domain properties");

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_7, new NeoObjectVector(new Object[] {userTag_3}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_6, new NeoObjectVector(new Object[] {userTag_3}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_4, new NeoObjectVector(new Object[] {userTag_3}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_5, new NeoObjectVector(new Object[] {userTag_3}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_14, new NeoObjectVector(new Object[] {userTag_1}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_8, new NeoObjectVector(new Object[] {userTag_1}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_9, new NeoObjectVector(new Object[] {userTag_1}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_11, new NeoObjectVector(new Object[] {userTag_1}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_15, new NeoObjectVector(new Object[] {userTag_1}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_13, new NeoObjectVector(new Object[] {userTag_1}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_18, new NeoObjectVector(new Object[] {userTag_2}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_0, new NeoObjectVector(new Object[] {userTag_2}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_17, new NeoObjectVector(new Object[] {userTag_2}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_10, new NeoObjectVector(new Object[] {userTag_2}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_19, new NeoObjectVector(new Object[] {userTag_2}));

    simulation_0.get(GlobalParameterManager.class).getGroupsManager().releaseGroupObjects();

    simulation_0.get(GlobalParameterManager.class).getGroupsManager().groupObjects("Tags: [Flow properties]", new NeoObjectVector(new Object[] {scalarGlobalParameter_8, scalarGlobalParameter_9, scalarGlobalParameter_11, scalarGlobalParameter_13, scalarGlobalParameter_14, scalarGlobalParameter_15}), false);

    simulation_0.get(GlobalParameterManager.class).getGroupsManager().groupObjects("Tags: [Domain properties]", new NeoObjectVector(new Object[] {scalarGlobalParameter_4, scalarGlobalParameter_5, scalarGlobalParameter_6, scalarGlobalParameter_7}), false);

    simulation_0.get(GlobalParameterManager.class).getGroupsManager().groupObjects("Tags: [Mesh properties]", new NeoObjectVector(new Object[] {scalarGlobalParameter_0, scalarGlobalParameter_10, scalarGlobalParameter_17, scalarGlobalParameter_18, scalarGlobalParameter_19}), false);

    simulation_0.get(GlobalParameterManager.class).getGroupsManager().groupObjects("Tags: [Ship geometry]", new NeoObjectVector(new Object[] {scalarGlobalParameter_1, scalarGlobalParameter_2, scalarGlobalParameter_3, scalarGlobalParameter_20}), true);

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_16, new NeoObjectVector(new Object[] {userTag_2}));

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Tags: [Mesh properties]")).getGroupsManager().groupObjects("Tags: [Mesh properties]", new NeoObjectVector(new Object[] {scalarGlobalParameter_16}), true);

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Tags: [Domain properties]")).setPresentationName("Domain properties");

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Tags: [Flow properties]")).setPresentationName("Flow properties");

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Tags: [Mesh properties]")).setPresentationName("Mesh properties");

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Tags: [Ship geometry]")).setPresentationName("Ship geometry");

    scalarGlobalParameter_2.getQuantity().setDefinition("32.2/${Scale}");

    scalarGlobalParameter_3.getQuantity().setDefinition("10.8/${Scale}");

    scalarGlobalParameter_8.getQuantity().setValueAndUnits(997.561, units_0);

    scalarGlobalParameter_8.setDimensions(Dimensions.Builder().mass(1).build());

    scalarGlobalParameter_8.setDimensions(Dimensions.Builder().mass(1).length(-3).build());

    scalarGlobalParameter_14.setDimensions(Dimensions.Builder().length(1).time(-1).build());

    scalarGlobalParameter_15.setDimensions(Dimensions.Builder().length(1).build());

    scalarGlobalParameter_5.getQuantity().setDefinition("${h/T}*${T}");

    scalarGlobalParameter_6.getQuantity().setDefinition("0.75*2");

    scalarGlobalParameter_6.getQuantity().setValueAndUnits(1.5, units_0);

    scalarGlobalParameter_7.getQuantity().setDefinition("${w/L}*${L}");

    scalarGlobalParameter_13.getQuantity().setValueAndUnits(0.303, units_0);

    Units units_1 = 
      simulation_0.getUnitsManager().getInternalUnits(new IntVector(new int[] {0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

    scalarGlobalParameter_14.getQuantity().setDefinition("${Fh}*sqrt(9.81*${h})");

    scalarGlobalParameter_9.getQuantity().setValueAndUnits(8.8875E-4, units_0);

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_21 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_21, new NeoObjectVector(new Object[] {userTag_1}));

    scalarGlobalParameter_21.setPresentationName("t_w ITTC");

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Flow properties")).getGroupsManager().groupObjects("Flow properties", new NeoObjectVector(new Object[] {scalarGlobalParameter_21}), true);

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_22 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_22.setPresentationName("t_w Zeng");

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_22, new NeoObjectVector(new Object[] {userTag_1}));

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Flow properties")).getGroupsManager().groupObjects("Flow properties", new NeoObjectVector(new Object[] {scalarGlobalParameter_22}), true);

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    simulation_0.get(GlobalParameterManager.class).createGlobalParameter(ScalarGlobalParameter.class, "Scalar");

    ScalarGlobalParameter scalarGlobalParameter_23 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar"));

    scalarGlobalParameter_23.setPresentationName("Cf OTTC");

    scalarGlobalParameter_23.setPresentationName("Ct ITTC");

    ScalarGlobalParameter scalarGlobalParameter_24 = 
      ((ScalarGlobalParameter) simulation_0.get(GlobalParameterManager.class).getObject("Scalar 2"));

    scalarGlobalParameter_24.setPresentationName("Cf Zeng");

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_24, new NeoObjectVector(new Object[] {userTag_1}));

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_23, new NeoObjectVector(new Object[] {userTag_1}));

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Flow properties")).getGroupsManager().groupObjects("Flow properties", new NeoObjectVector(new Object[] {scalarGlobalParameter_24, scalarGlobalParameter_23}), true);

    scalarGlobalParameter_11.getQuantity().setDefinition("${U}*${rho}*${L}/${miu}");

    Units units_2 = 
      simulation_0.getUnitsManager().getInternalUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

    scalarGlobalParameter_15.getQuantity().setDefinition("0.382*${L}/pow(${Reynolds number},1/5)");

    scalarGlobalParameter_21.getQuantity().setDefinition("0.075/pow(log10(${Reynolds number})-2,2)");

    scalarGlobalParameter_23.getQuantity().setDefinition("0.075/pow(log10(${Reynolds number})-2,2)");

    scalarGlobalParameter_21.getQuantity().setDefinition("${Cf ITTC}*${rho}*pow(${U},2)/2");

    Units units_3 = 
      simulation_0.getUnitsManager().getPreferredUnits(Dimensions.Builder().mass(1).length(-3).build());

    scalarGlobalParameter_23.setPresentationName("Cf ITTC");

    simulation_0.get(TagManager.class).setTags(scalarGlobalParameter_10, new NeoObjectVector(new Object[] {userTag_1}));

    ((ClientServerObjectGroup) simulation_0.get(GlobalParameterManager.class).getGroupsManager().getObject("Flow properties")).getGroupsManager().groupObjects("Flow properties", new NeoObjectVector(new Object[] {scalarGlobalParameter_10}), true);

    scalarGlobalParameter_24.getQuantity().setDefinition("0.08468/pow(log10(${Reynolds number})-1.631,2)*(1+1.2050/(log10(${Reynolds number})-0.5406)*pow(${h/T},-1.451))");

    scalarGlobalParameter_10.getQuantity().setDefinition("sqrt({t_w Zeng}/${rho})");

    scalarGlobalParameter_10.getQuantity().setDefinition("sqrt(${t_w Zeng}/${rho})");

    scalarGlobalParameter_22.getQuantity().setDefinition("${Cf Zeng}*${rho}*pow(${U},2)/2");

    scalarGlobalParameter_0.getQuantity().setValueAndUnits(1.0, units_0);

    scalarGlobalParameter_18.getQuantity().setValueAndUnits(1.3, units_0);

    scalarGlobalParameter_16.getQuantity().setValueAndUnits(0.2, units_0);

    scalarGlobalParameter_19.getQuantity().setDefinition("${target y+}*(${miu}/${rho})/${Friction velocity}");

    scalarGlobalParameter_16.getQuantity().setDefinition("0.2*${Boundary layer}");

    scalarGlobalParameter_16.getQuantity().setDefinition("0.2*${Boundary layer thickness}");

    scalarGlobalParameter_17.getQuantity().setDefinition("log(-${Resolved distance}*(1-${Stretch function})/(2*${dy})+1)/log(${Stretch function})");

    scalarGlobalParameter_18.setPresentationName("Stretch function");

    scalarGlobalParameter_17.getQuantity().setDefinition("${target y+} < 2 ? ceil(log(-${Resolved distance}*(1-${Stretch function})/(2*${dy})+1)/log(${Stretch function})) :\n\tfloor(log(-${Resolved distance}*(1-${Stretch function})/(2*${dy})+1)/log(${Stretch function}))");
  }
}
