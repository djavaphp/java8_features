package com.demo.kruti.lld.solid;

/**
 * As Labour task is to construct the building. not other task.
 * so created new LabourWork interface which is specific to labour. same can create for plumbing or electricians.
 */
public class InterfaceSegmented {

  public static void main(String[] arg) {
    BuildingWorker labour = new Labour();
    labour.addElectricity();
    labour.construct();
    labour.paint();
    labour.addPlumbingFacility();
    labour.addElectricity();
    labour.createArchitecture();

    LabourWork labourWork = new Labour1();
    labourWork.addPillers();
    labourWork.createWall();
  }

  interface BuildingWorker {
    void createArchitecture();

    void construct();

    void paint();

    void addPlumbingFacility();

    void addElectricity();
  }

  interface LabourWork {
    void addPillers();

    void createWall();
  }

  /**
   * Labour only construct build rest of task are of other worker but here it implements all.
   */
  static class Labour implements BuildingWorker {

    @Override
    public void createArchitecture() {
      System.out.println("Labour: Not my Job");
    }

    @Override
    public void construct() {
      System.out.println("Labour: Started Work");
    }

    @Override
    public void paint() {
      System.out.println("Labour: Not my Job");
    }

    @Override
    public void addPlumbingFacility() {
      System.out.println("Labour: Not my Job");
    }

    @Override
    public void addElectricity() {
      System.out.println("Labour: Not my Job");
    }
  }

  static class Labour1 implements LabourWork {

    @Override
    public void addPillers() {
      System.out.println("Labour1: started adding Pillers");
    }

    @Override
    public void createWall() {
      System.out.println("Labour1: Creating wall");
    }
  }
}
