import pt.gov.cartaodecidadao.PTEID_EId;
import pt.gov.cartaodecidadao.PTEID_Exception;
import pt.gov.cartaodecidadao.PTEID_Photo;
import pt.gov.cartaodecidadao.PTEID_PublicKey;

public class Citizen {
  public Citizen(PTEID_EId eid) {
    try {
      this.setDocumentVersion(eid.getDocumentVersion());
      this.setDocumentType(eid.getDocumentType());
      this.setCountry(eid.getCountry());
      this.setGivenName(eid.getGivenName());
      this.setSurname(eid.getSurname());
      this.setGender(eid.getGender());
      this.setDateOfBirth(eid.getDateOfBirth());
      this.setNationality(eid.getNationality());
      this.setDocumentPAN(eid.getDocumentPAN());
      this.setValidityBeginDate(eid.getValidityBeginDate());
      this.setValidityEndDate(eid.getValidityEndDate());
      this.setLocalofRequest(eid.getLocalofRequest());
      this.setHeight(eid.getHeight());
      this.setDocumentNumber(eid.getDocumentNumber());
      this.setCivilianIdNumber(eid.getCivilianIdNumber());
      this.setTaxNo(eid.getTaxNo());
      this.setSocialSecurityNumber(eid.getSocialSecurityNumber());
      this.setHealthNumber(eid.getHealthNumber());
      this.setIssuingEntity(eid.getIssuingEntity());
      this.setGivenNameFather(eid.getGivenNameFather());
      this.setSurnameFather(eid.getSurnameFather());
      this.setGivenNameMother(eid.getGivenNameMother());
      this.setSurnameMother(eid.getSurnameMother());
      this.setParents(eid.getParents());
      this.setPhotoObj(eid.getPhotoObj());
      this.setCardAuthKeyObj(eid.getCardAuthKeyObj());
      this.setValidation(eid.getValidation());
      this.setMRZ1(eid.getMRZ1());
      this.setMRZ2(eid.getMRZ2());
      this.setMRZ3(eid.getMRZ3());
      this.setAccidentalIndications(eid.getAccidentalIndications());
    } catch (PTEID_Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }    
  }
  
  // versão do documento de identificação
  String documentVersion;
  // tipo de documento - “Cartão de cidadão”
  String documentType;
  // código do país no formato ISO3166
  String country;
  // nomes próprios do detentor do cartão
  String givenName;
  // apelidos do detentor do cartão
  String surname;
  // género do detentor do cartão
  String gender;
  // data de nascimento
  String dateOfBirth;
  // nacionalidade (código do país no formato ISO3166 )
  String nationality;
  // número PAN do cartão (PAN - primary account number)
  String documentPAN;
  // data de emissão
  String validityBeginDate;
  // data de validade
  String validityEndDate;
  // local de pedido do cartão
  String localofRequest;
  // altura do detentor do cartão
  String height;
  // número do cartão de cidadão
  String documentNumber;
  // número de identificação civil
  String civilianIdNumber;
  // número de identificação fiscal
  String taxNo;
  // número de segurança social
  String socialSecurityNumber;
  // número de utente de saúde
  String healthNumber;
  // entidade emissora do cartão
  String issuingEntity;
  // nomes próprios do pai do detentor do cartão
  String givenNameFather;
  // apelidos do pai do detentor do cartão
  String surnameFather;
  // nomes próprios da mãe do detentor do cartão
  String givenNameMother;
  // apelidos da mãe do detentor do cartão
  String surnameMother;
  // filiação do detentor do cartão sobre na forma seguinte “nome e apelido do pai * nome e apelida da mãe”
  String parents;
  // objecto que contêm a foto do detentor do cartão
  PTEID_Photo photoObj;
  // chave pública do cartão
  PTEID_PublicKey cardAuthKeyObj;
  // indica se cartão se encontra válido
  String validation;
  // primeira linha do campo MRZ
  String mRZ1;
  // segunda linha do campo MRZ
  String mRZ2;
  // terceira linha do campo MRZ
  String mRZ3;
  // indicações eventuais
  String accidentalIndications;


  public String getDocumentVersion() {
    return this.documentVersion;
  }

  public void setDocumentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
  }

  public String getDocumentType() {
    return this.documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getGivenName() {
    return this.givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getSurname() {
    return this.surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getNationality() {
    return this.nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getDocumentPAN() {
    return this.documentPAN;
  }

  public void setDocumentPAN(String documentPAN) {
    this.documentPAN = documentPAN;
  }

  public String getValidityBeginDate() {
    return this.validityBeginDate;
  }

  public void setValidityBeginDate(String validityBeginDate) {
    this.validityBeginDate = validityBeginDate;
  }

  public String getValidityEndDate() {
    return this.validityEndDate;
  }

  public void setValidityEndDate(String validityEndDate) {
    this.validityEndDate = validityEndDate;
  }

  public String getLocalofRequest() {
    return this.localofRequest;
  }

  public void setLocalofRequest(String localofRequest) {
    this.localofRequest = localofRequest;
  }

  public String getHeight() {
    return this.height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getDocumentNumber() {
    return this.documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getCivilianIdNumber() {
    return this.civilianIdNumber;
  }

  public void setCivilianIdNumber(String civilianIdNumber) {
    this.civilianIdNumber = civilianIdNumber;
  }

  public String getTaxNo() {
    return this.taxNo;
  }

  public void setTaxNo(String taxNo) {
    this.taxNo = taxNo;
  }

  public String getSocialSecurityNumber() {
    return this.socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getHealthNumber() {
    return this.healthNumber;
  }

  public void setHealthNumber(String healthNumber) {
    this.healthNumber = healthNumber;
  }

  public String getIssuingEntity() {
    return this.issuingEntity;
  }

  public void setIssuingEntity(String issuingEntity) {
    this.issuingEntity = issuingEntity;
  }

  public String getGivenNameFather() {
    return this.givenNameFather;
  }

  public void setGivenNameFather(String givenNameFather) {
    this.givenNameFather = givenNameFather;
  }

  public String getSurnameFather() {
    return this.surnameFather;
  }

  public void setSurnameFather(String surnameFather) {
    this.surnameFather = surnameFather;
  }

  public String getGivenNameMother() {
    return this.givenNameMother;
  }

  public void setGivenNameMother(String givenNameMother) {
    this.givenNameMother = givenNameMother;
  }

  public String getSurnameMother() {
    return this.surnameMother;
  }

  public void setSurnameMother(String surnameMother) {
    this.surnameMother = surnameMother;
  }

  public String getParents() {
    return this.parents;
  }

  public void setParents(String parents) {
    this.parents = parents;
  }

  public PTEID_Photo getPhotoObj() {
    return this.photoObj;
  }

  public void setPhotoObj(PTEID_Photo photoObj) {
    this.photoObj = photoObj;
  }

  public PTEID_PublicKey getCardAuthKeyObj() {
    return this.cardAuthKeyObj;
  }

  public void setCardAuthKeyObj(PTEID_PublicKey cardAuthKeyObj) {
    this.cardAuthKeyObj = cardAuthKeyObj;
  }

  public String getValidation() {
    return this.validation;
  }

  public void setValidation(String validation) {
    this.validation = validation;
  }

  public String getMRZ1() {
    return this.mRZ1;
  }

  public void setMRZ1(String mRZ1) {
    this.mRZ1 = mRZ1;
  }

  public String getMRZ2() {
    return this.mRZ2;
  }

  public void setMRZ2(String mRZ2) {
    this.mRZ2 = mRZ2;
  }

  public String getMRZ3() {
    return this.mRZ3;
  }

  public void setMRZ3(String mRZ3) {
    this.mRZ3 = mRZ3;
  }

  public String getAccidentalIndications() {
    return this.accidentalIndications;
  }

  public void setAccidentalIndications(String accidentalIndications) {
    this.accidentalIndications = accidentalIndications;
  }

  @Override
  public String toString() {
    return "{" +
      " documentVersion='" + getDocumentVersion() + "'" +
      ", documentType='" + getDocumentType() + "'" +
      ", country='" + getCountry() + "'" +
      ", givenName='" + getGivenName() + "'" +
      ", surname='" + getSurname() + "'" +
      ", gender='" + getGender() + "'" +
      ", dateOfBirth='" + getDateOfBirth() + "'" +
      ", nationality='" + getNationality() + "'" +
      ", documentPAN='" + getDocumentPAN() + "'" +
      ", validityBeginDate='" + getValidityBeginDate() + "'" +
      ", validityEndDate='" + getValidityEndDate() + "'" +
      ", localofRequest='" + getLocalofRequest() + "'" +
      ", height='" + getHeight() + "'" +
      ", documentNumber='" + getDocumentNumber() + "'" +
      ", civilianIdNumber='" + getCivilianIdNumber() + "'" +
      ", taxNo='" + getTaxNo() + "'" +
      ", socialSecurityNumber='" + getSocialSecurityNumber() + "'" +
      ", healthNumber='" + getHealthNumber() + "'" +
      ", issuingEntity='" + getIssuingEntity() + "'" +
      ", givenNameFather='" + getGivenNameFather() + "'" +
      ", surnameFather='" + getSurnameFather() + "'" +
      ", givenNameMother='" + getGivenNameMother() + "'" +
      ", surnameMother='" + getSurnameMother() + "'" +
      ", parents='" + getParents() + "'" +
      ", photoObj='" + getPhotoObj() + "'" +
      ", cardAuthKeyObj='" + getCardAuthKeyObj() + "'" +
      ", validation='" + getValidation() + "'" +
      ", mRZ1='" + getMRZ1() + "'" +
      ", mRZ2='" + getMRZ2() + "'" +
      ", mRZ3='" + getMRZ3() + "'" +
      ", accidentalIndications='" + getAccidentalIndications() + "'" +
      "}";
  }
}
