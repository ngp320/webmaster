package com.qianfeng.openapi.web.master.pojo;


public class Customer {

  private Long id;
  private String username;
  private String password;
  private String nickname;
  private String address;
  private Integer money;
  private Integer state;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getMoney() {
    return money;
  }

  public void setMoney(Integer money) {
    this.money = money;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", nickname='" + nickname + '\'' +
            ", address='" + address + '\'' +
            ", money=" + money +
            ", state=" + state +
            '}';
  }
}
