package cc.pro.cc.Models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="UserDB")
public class Users implements Serializable {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name="firstname")
    private String firstName;
    @Column(name="surname")
    private String surName;

    @Column(name="patronymic")
    private String patronymic;
    @Column(name="married")
    private String married;
    @Column(name="registration")
    private String registration;
    @Column(name="phone_number")
    private int phoneNumber;
    @Column(name="passport")
    private int passport;

    @Column(name="companyId")
    private int companyId;
    @Column(name="role")
    private String role;
    @Column(name = "work_period")
    private double workPeriod;
    @Column(name="loan_amount")
    private int loanAmount;

    public Users(){

    }

    public Users(Long id, String firstName, String surName, String patronymic, String married,
                 String registration, int phoneNumber, int passport, int companyId, String role,
                 double workPeriod, int loanAmount) {
        Id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.patronymic = patronymic;
        this.married = married;
        this.registration = registration;
        this.phoneNumber = phoneNumber;
        this.passport = passport;
        this.companyId = companyId;
        this.role = role;
        this.workPeriod = workPeriod;
        this.loanAmount = loanAmount;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(double workPeriod) {
        this.workPeriod = workPeriod;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", married='" + married + '\'' +
                ", registration='" + registration + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", passport=" + passport +
                ", companyId=" + companyId +
                ", role='" + role + '\'' +
                ", workPeriod=" + workPeriod +
                ", loanAmount=" + loanAmount +
                '}';
    }
}
