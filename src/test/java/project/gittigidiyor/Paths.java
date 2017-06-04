package project.gittigidiyor;

public enum Paths {

	//Paths for registration
	
	Register("//*[@id='H-Register']"),
	Username("//*[@id='wwwAlertCon']/input[@name='name']"),
	UserSurname("//*[@id='wwwAlertCon']/input[@name='surname']"),
	UserEmail("//*[@id='wwwAlertCon']/input[@name='email']"),
	NickName("//*[@id='nickname']"),
	NickNameSuggestion("//*[@id='Suggest1']"),
	Password("//*[@id='password_pwdField']"),
	PasswordAgainField("//*[@id='pwdAgainField']"), 
	GsmCode("//*[@id='gsmcode']"),
	GsmNumber("//*[@id='gsmnumber']"),
	RegisterButton("//*[@id='SubmitForm']"),
	
	//Paths for Sign in
	SignInLink("//*[@id='H-Login']"),
	UsernameField("//*[@id='L-UserNameField']"),
	PasswordField("//*[@id='L-PasswordField']"),
	LoginButton("//*[@id='L-Enter']"),
	
	
	//start popup
	StartPopup("//*[@id='gg-subscribe-close-button']"),
	
	//Activation verify
    verifyRegistration("//*[@id='RegisterCon']/div[1]/div/h1"),
	
	
	///search test case paths
	SearchBox("//*[@id='search_word']"),
	SearchButton("//*[@id='header_find_button']");
	
	
	
	
	
	private final String path;
		
	 Paths(String path){ 
		 this.path = path; 
	 }
	 
	 public String getPath() { return path; }
		

}