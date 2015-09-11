package sample;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.component.datatable.DataTable;

@Named
@ViewScoped
public class DataTableBean implements Serializable {
  private static final long serialVersionUID = 1L;
  
  static final Logger logger = Logger.getLogger(DataTableBean.class.getName());
  
  private DataTable dataTable;
  public DataTable getDataTable() {
    return dataTable;
  }
  public void setDataTable(DataTable dataTable) {
    this.dataTable = dataTable;
  }
  private String text;
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  
  private List<DetailBean> details;
  public List<DetailBean> getDetails() {
    return details;
  }
  
  @Inject SessionBean sessionBean;
  
  @PostConstruct
  void postConstruct() {
    logger.info("DataTableBean#postConstruct : " + this.hashCode());
    sessionBean.addMsg("DataTableBean#postConstruct : " + this.hashCode());
    details = Arrays.asList(new DetailBean("aaa"), new DetailBean("bbb"), new DetailBean("ccc"));
  }
  
  public void submit() {
    text = "ボタン押したでー";
  }
  public String jump() {
    logger.info("DataTableBean#jump : " + this.hashCode());
    sessionBean.addMsg("DataTableBean#jump : " + this.hashCode());
    return "Viewer";
  }
}
