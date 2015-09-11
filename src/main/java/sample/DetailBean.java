package sample;

import java.io.Serializable;

public class DetailBean implements Serializable {
  private static final long serialVersionUID = 1L;
  private String name;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public DetailBean() {}
  public DetailBean(String name) { this.name = name; }
}
