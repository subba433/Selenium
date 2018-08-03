package com.flex.utility;

import java.io.File;

public class Constant {
	
	
		public static final String baseUrlCC = "http://158.234.144.108:8280/cc/ClaimCenter.do";
		public static final String baseUrlPC = "http://158.234.144.107:8280/pc/PolicyCenter.do";
		public static final String baseUrlBC = "http://158.234.144.108:8380/bc/BillingCenter.do";
	
	
		public static final String getHomeDirectory = System.getProperty("user.dir");
	    public static final String APP_URL = "https://www.redbus.in/"; 
		
	//	public static final String Path_TestData =	"D://Jenkins//workspace//flex//src//test//java//com//cgi//flex//testData//";
		
	//	public static final String Path_TestData =	"D://Jenkins//workspace//AutomationTestSuite//src//test//java//com//cgi//flex//testData//";
		
	    
	    //public static final String Path_TestData =	"C://selenium-automation//flex//src//test//java//com//cgi//flex//testData//";
		
		public static final String Path_TestData =	getHomeDirectory+"\\src\\test\\java\\com\\flex\\testData\\";
		
		public static final String File_TestData = "TestData.xlsx";
		public static final String SpreadSheetName="TestData1";
		
		
		public static final String File_SmokeTestData = "SmokeTestSuite.xlsx";
		
		public static final String PATH_AUTOIT =	getHomeDirectory+"\\src\\test\\java\\com\\flex\\autoitscripts\\";
		
		public static final String FILE_AUTOIT = "firstautoit.exe";
		
		
			//Test Data Sheet Columns

		//public static final String Path_ScreenShot = "D://Jenkins//workspace//flex//src//test//java//com//cgi//flex//screenshots//";
		
		//public static final String Path_ScreenShot = "D://Jenkins//workspace//AutomationTestSuite//src//test//java//com//cgi//flex//screenshots//";
	//	public static final String Path_ScreenShot = "C://selenium-automation//flex//src//test//java//com//cgi//flex//screenshots//";
		
		public static final String Path_ScreenShot =  getHomeDirectory+"\\src\\test\\java\\com\\flex\\screenshots\\";
		
		public static final int Col_TestCaseName = 0;	
		public static final int Col_Firstname = 1;
		public static final int Col_Lastname = 2;
		public static final int Col_Browser = 3;
		public static final int Col_Email = 4;
		public static final int Col_Password = 5;
		public static final int Col_Year = 8;
		
		public static final int Col_UserName = 7;
		
		//public static final int Col_ReportedByName = 8;
		
		public static final int Col_RelationToInsured = 9;
		public static final int Col_LossCause = 10;
		public static final int Col_IncidentOnly = 11;
		public static final int Col_InjuryIncidentPerson = 12;
		public static final int Col_LossLocation = 13;
		public static final int Col_Country = 14;
		public static final int Col_city= 15;
		
		public static final int Col_State = 16;
		public static final int Col_Assignment = 17;
		
		public static final int Col_ClaimNumber=18;
		
		public static final int Col_AggregateAmount=19;
		
		public static final int Col_Municipality =20;
		
		public static final int Col_Location =21;
		
		public static final int Col_LossCauseDescritpion = 22;
		
		public static final int Col_MobileNoEAI = 23;
		
		public static final int Col_PolicyStatus  = 31;
		
		public static final int Col_InsuredName = 30;
		
		public static final int Col_LossDateACI = 32;
		
		public static final int Col_lblWasThereSignsofBurglary = 33;
		
		public static final int Col_rdbtnYes = 34;
		
		public static final int Col_rdbtnNO = 35;
		
		public static final int Col_LblCategory = 36;
		
		public static final int Col_CategoryValue = 37;
		
		public static final int Col_LblItem = 38;
		
		public static final int Col_ItemValue = 39;
		
		public static final int Col_DescNLI = 40;	
		
		public static final int Col_ExistingClaimNumber = 41;	
		
		public static final int Col_ClaimantTypeValue = 42;
		
		public static final int Col_PrimaryCoverageValue = 43;
		
		public static final int Col_ClaimantPicker = 44;
		
		public static final int Col_CoverageType = 45;
		
		public static final int Col_ExposureType = 46;
		public static final int Col_CostType = 47;
		public static final int Col_CostCategory= 48;
		public static final int Col_NewArrivalReserves = 49;
		
		public static final int Col_CoverabilityDecision = 50;
		
		public static final int Col_LabelCoverability = 51;
	
		public static final int Col_txtMachinaryRepairCosts = 52;
		public static final int Col_txtPurchaseNewMachinery = 53;
		public static final int Col_txtFixedStructureRepairCost = 54;
		public static final int Col_txtReserveAmountMachinaryRepairCosts = 55;
		public static final int Col_txtReserveAmountPurchaseNewMachinery = 56;
		public static final int Col_txtReserveAmountFixedStructureRepairCost = 57;
		
		public static final int Col_txtbxNameOnAccountEPI = 58;
		public static final int Col_txtbxAccounNumberEPI = 59;
		public static final int Col_txtbxBICEPI = 60;
		public static final int Col_drpdownLineItemsEPmtI = 61;
		
		public static final int Col_txtAmountEPmtI = 62;
		
		public static final int Col_txtCheckStatus = 63;
		
		
		public static final int Col_Loss_Coverability =64;
		//public static final int Col_ExistingClaimNumber =65;
		public static final int Col_HandlingStatus = 65;
		public static final int Col_CoverabilityListValues = 66;
		public static final int Col_NoteText = 67; 
		public static final int Col_ExposureIncidentCateory = 68;
		public static final int Col_ExposureIncidentItem = 69;
		public static final int Col_ExposureNewLegalncidentDescription = 70;
		public static final int Col_ExposureCoverage=71;
		public static final int Col_LegalExpenseReserveAmount=72;
		public static final int Col_PartsOfFlatCoverage1=73;
		public static final int Col_PartsOfFlatCoverage2=74;
		
		public static final int Col_PartsOfFlatCoverage3=75;
		
		public static final int Col_DateWhenBought=76;
		
		public static final int Col_EuroToday=77;
		
		public static final int Col_DescID=78;
		
		public static final int Col_ProductURLCC =79;
		
		public static final int Col_AddressType =80;
		
		public static final int Col_ItemBrand = 81;
		
		public static final int Col_ItemModel = 82;
		
		public static final int Col_IncidentItemStatus = 83;
		
		public static final int Col_CostOfRepair = 84;
		
		public static final int Col_Coverability = 85;		
			
		public static final int col_EffectiveDate = 23;
		
		public static final int col_ExpirationDate = 24;
		
		public static final int col_PolicyNumber = 29;

		public static final int Col_LastName = 25;

		public static final int Col_Name = 26;

		public static final int Col_LineofBusiness = 27;
		
		public static final int Col_PolicyTime = 28;
			
		public static final int Col_FirstNameEAI = 4;
		
		public static final int Col_LastNameEAI = 5;
		
		public static final int Col_MobileEAI = 6;
		
		public static final int Col_Address1EAI = 7;
		
		public static final int Col_PostalCodeEAI = 8;
		
		public static final int Col_BirthDateEAI = 9;
		
		public static final int Col_OrgNameOrg = 10;
		
		public static final int Col_MunicipalityCA =11;
		
		public static final int Col_OfferingPOF = 12;
		
		public static final int Col_OfferingDatePI = 13;
		
		public static final int Col_ApartmentUsageType = 14;
		
		public static final int Col_ApartmentSize = 15;
		
		public static final int Col_Building = 16;
		
		
	
		/*PC */
		public static final int Col_PostalCode = 8;
		
		public static final int Col_PostalOfficeName = 23;
				
		public static final int Col_txtbxSSNAccountCreation = 24;
		
		public static final int Col_RatingMunicipalityOfficialID = 25;
		
		public static final int Col_EmailID = 26;
		
		
		public static final int Col_OfferingDate = 27;
		
		public static final int Col_Apartmentsize = 28;
		
		public static final int Col_crimePartsOfFlatsCoverage = 27;
		public static final int Col_damagePartsOfFlatsCoverage = 28;
		public static final int Col_FirelevyPartsOfFlatsCoverage = 29;
		public static final int Col_firePartsOfFlatsCoverage = 30;
		public static final int Col_leakagepartsOfFlatsCoverage = 31;
		public static final int Col_naturalPhenamenaPartsOfFlatsCoverage = 32;
		
	
		public static final int Col_LossDatesmoke = 33;
		public static final int Col_LossCausesmoke = 34;
		public static final int Col_LossCauseDescritpionsmoke = 35;
		public static final int Col_URLBC = 36;
		public static final int Col_URLCC = 37;
		
		public static final int Col_URLCM = 38;
		
		public static final int Col_ContactType = 39;
		
		
		public static final int Col_AddressContactSearch = 40;
		
		public static final int Col_ProductURLPC =41;
		
		public static final int Col_ProductURL =41;
		
		public static final int Col_FFStreetAddress=65;
		public static final int Col_FFPostalCode=66;
		public static final int Col_FFCity=67;
		public static final int Col_FFApartmentSize=68;
		public static final int Col_FFPhoneNo=89;
		public static final int Col_FFEmailID=90;
		public static final int Col_FFCode=91;
		public static final int Col_FFValidCardNo=92;
		public static final int Col_FFExpiryDate=93;
		public static final int Col_FFcvv=94;
		public static final int Col_FFItemName= 95;
		public static final int Col_FFItemManufacturer = 96; 
		public static final int Col_FFItemModel =97;
		public static final int Col_FFComparablePrice =98;
		public static final int Col_FFBankAccount = 99;
		public static final int Col_FFRepairCosts = 100;
		public static final int Col_AgeDeduction = 101;
		public static final int Col_CCURL = 102;		
		public static final int Col_TotalPayment = 103;
		
		public static final int Col_ReserveType = 104;
		public static final int Col_PaymentType = 105;
		public static final int Col_ReserveAmount = 106;
		public static final int Col_PaymentAmount = 107;
		public static final int Col_ReserveCostCategory = 108;
		public static final int Col_PaymentCostCategory = 109;
		public static final int Col_CheckNumber = 110;
		public static final int Col_CheckNetAmount = 111;
		
		public static final int Col_Manufacturer = 112;
		
		public static final int Col_ExposureFuturePayment =113;
		
		
		//public static final int Col_AgeDeduction =113;
	}
