package sample;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SessionBean implements Serializable {
  private static final long serialVersionUID = 1L;
  static final Logger logger = Logger.getLogger(SessionBean.class.getName());

  private String msg;
  
  @PostConstruct
  void postConstruct() {
    logger.info("SessionBean#postConstruct");
    msg = "";
  }
  
  public String getMsg() {
    return msg;
  }
  public void clear() {
    msg = "";
  }
  
  public void addMsg(String msg) {
    this.msg += msg + System.lineSeparator();
  }
}
