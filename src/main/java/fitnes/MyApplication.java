package fitnes;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

	public class MyApplication<UserProfile> {

		private List<String> tips = new ArrayList<>();
	    private Map<String, String> userDatabase11 = new HashMap<>();
	    private boolean isAdminLoggedIn1 = false;
	    private String currentPage1 = "";
		
	    
	    
	    public void adminLogin1(String username, String password) {
	        
	        userDatabase11.put("yara", "yara123"); 
	        
	        if (userDatabase11.containsKey(username) && userDatabase11.get(username).equals(password)) {
	            isAdminLoggedIn1 = true;
	            System.out.println(y);
	        } else {
	            System.out.println("Invalid username or password.");
	        }
	    }

	    public void navigateToPage1(String page) {
	        if (isAdminLoggedIn1) {
	            currentPage1 = page;
	            System.out.println("Navigating to the " + page + " page.");
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void clickButton1(String button) {
	        if (isAdminLoggedIn1) {
	            switch (button) {
	                case "Save":
	                    System.out.println("Saving data...");
	                    break;
	                case "Cancel":
	                    System.out.println("Cancelling the operation...");
	                    break;
	                case "Logout":
	                    adminLogout1();
	                    break;
	                default:
	                    System.out.println("Unknown button action.");
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    private void adminLogout1() {
	        isAdminLoggedIn1 = false;
	        System.out.println("Admin logged out.");
	    }

	    public void rejectTipReview(String reason) {
	        if (reason == null || reason.isEmpty()) {
	            System.out.println("Error: Reason for rejection is required.");
	            return;
	        }
	        System.out.println("Tip review rejected. Reason: " + reason);
	    }
	  
	    public void rejectTip(String tipContent) {
	        if (tips != null && tips.remove(tipContent)) {
	            System.out.println("Tip rejected and removed: " + tipContent);
	        } else {
	            System.out.println("Error: Tip not found.");
	        }
	    }  public void approveTip(String tipContent) {
	        if (tips.contains(tipContent)) {
	            System.out.println("Tip approved: " + tipContent);
	        } else {
	            System.out.println("Error: Tip not found.");
	        }
	    }

y="Admin logged in successfully."
	    private Map<String, String> userDatabase14 = new HashMap<>();
	    private boolean isAdminLoggedIn14 = false;
	    private String currentPage = "";
	    
	    public void adminLogin14(String username, String password) {
	        userDatabase11.put("admin", "password123"); 
	        
	        if (userDatabase11.containsKey(username) && userDatabase11.get(username).equals(password)) {
	            isAdminLoggedIn1 = true;
	            System.out.println(y);
	        } else {
	            System.out.println("Invalid username or password.");
	        }
	    }

	    public void navigateToPage(String page) {
	        if (isAdminLoggedIn1) {
	            currentPage1 = page;
	            System.out.println("Navigating to the " + page + " page.");
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void clickButton(String button) {
	        if (isAdminLoggedIn1) {
	            switch (button) {
	                case "Save":
	                    System.out.println("Saving data...");
	                    break;
	                case "Cancel":
	                    System.out.println("Cancelling the operation...");
	                    break;
	                case "Logout":
	                    adminLogout1();
	                    break;
	                default:
	                    System.out.println("Unknown button action.");
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    private void adminLogout() {
	        isAdminLoggedIn1 = false;
	        System.out.println("Admin logged out.");
	    }
	    
	    private Map<String, String> userDatabase1 = new HashMap<>();
	    private String accountName1 = "";
	    private String accountEmail1 = "";
	    private String accountRole1 = "";
	    private boolean isAdminLoggedIn11 = false;
	    private boolean isAccountAdded1 = false; 

	    public void adminLogin11(String username, String password) {
	        userDatabase14.put("admin", "password123"); 
	        
	        if (userDatabase14.containsKey(username) && userDatabase14.get(username).equals(password)) {
	            isAdminLoggedIn1 = true;
	            System.out.println(y);
	        } else {
	            System.out.println("Invalid username or password.");
	        }
	    }

	    public void fillAccountDetails1(String name, String email) {
	        if (isAdminLoggedIn1) {
	            accountName1 = name;
	            accountEmail = email;
	            System.out.println("Account details filled. Name: " + name + ", Email: " + email);
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void selectRole1(String role) {
	        if (isAdminLoggedIn1) {
	            accountRole1 = role;
	            System.out.println("Role selected: " + role);
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void clickSave1() {
	        if (isAdminLoggedIn1) {
	            if (accountName1.isEmpty() || accountEmail.isEmpty() || accountRole1.isEmpty()) {
	                System.out.println("Please fill in all account details before saving.");
	            } else {
	                isAccountAdded1 = true;
	                System.out.println("Account saved successfully. Name: " + accountName1 + ", Email: " + accountEmail + ", Role: " + accountRole1);
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public boolean isAccountAdded1() {
	        return isAccountAdded1;
	        }

	    public boolean isConfirmationMessageDisplayed1() {
	        return isAccountAdded1; 
	        }

	    public void searchForAccount1(String email) {
	        if (isAdminLoggedIn1) {
	            if (email.equals(accountEmail)) {
	                System.out.println("Account found. Name: " + accountName1 + ", Email: " + accountEmail + ", Role: " + accountRole1);
	            } else {
	                System.out.println("Account not found.");
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	   

	    private Map<String, String> userDatabase = new HashMap<>();
	    private String accountName = "";
	    private String accountEmail = "";
	    private String accountRole = "";
	    private boolean isAdminLoggedIn = false;
	    private boolean isAccountAdded = false;
	    private boolean isAccountDeactivated = false; 
	    private boolean isAccountUpdated = false;
		private String name;
		private String email1;
		private String role;
		private Object username;
		private Object password;
		private Object email;
		
		
	    
	    public void adminLogin() {
	        userDatabase14.put("admin", "password123");
	        
	        if (userDatabase14.containsKey(username) && userDatabase14.get(username).equals(password)) {
	            isAdminLoggedIn1 = true;
	            System.out.println(y);
	        } else {
	            System.out.println("Invalid username or password.");
	        }
	    }

	    public void fillAccountDetails() {
	        if (isAdminLoggedIn1) {
	            accountName1 = name;
	            accountEmail = email1;
	            System.out.println("Account details filled. Name: " + name + ", Email: " + email1);
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void selectRole(String role) {
	        if (isAdminLoggedIn1) {
	            accountRole1 = role;
	            System.out.println("Role selected: " + role);
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void clickSave() {
	        if (isAdminLoggedIn1) {
	            if (accountName1.isEmpty() || accountEmail.isEmpty() || accountRole1.isEmpty()) {
	                System.out.println("Please fill in all account details before saving.");
	            } else {
	                isAccountAdded1 = true;
	                System.out.println("Account saved successfully. Name: " + accountName1 + ", Email: " + accountEmail + ", Role: " + accountRole1);
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    private boolean isAccountAdded11 = false;
	    private boolean isConfirmationMessageDisplayed1 = false;


	    public void addAccount(String name, String email, String role) {
	      
	        System.out.println("Account added for " + name);
	        isAccountAdded1 = true;
	        isConfirmationMessageDisplayed1 = true; 
	    }

	    public boolean isAccountAdded() {
	        return isAccountAdded1; 
	    }

	    public boolean isConfirmationMessageDisplayed() {
	        return isConfirmationMessageDisplayed1; 
	    }

	  

	    public void searchForAccount() {
	        if (isAdminLoggedIn1) {
	            if (email1.equals(accountEmail)) {
	                System.out.println("Account found. Name: " + accountName1 + ", Email: " + accountEmail + ", Role: " + accountRole1);
	            } else {
	                System.out.println("Account not found.");
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public boolean isAccountUpdated() {
	        return isAccountUpdated;
	    }

	    public void updateAccountDetails() {
	        if (isAdminLoggedIn1) {
	            if (isAccountAdded1) {
	                accountName1 = name;
	                accountEmail = email1;
	                accountRole1 = role;
	                isAccountUpdated = true;
	                System.out.println("Account updated successfully. Name: " + accountName1 + ", Email: " + accountEmail + ", Role: " + accountRole1);
	            } else {
	                System.out.println("Account is not added yet.");
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void deactivateAccount() {
	        if (isAdminLoggedIn1) {
	            if (isAccountAdded1) {
	                isAccountDeactivated = true;
	                System.out.println("Account has been deactivated.");
	            } else {
	                System.out.println("Account is not added yet.");
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public boolean isAccountDeactivated() {
	        return isAccountDeactivated;
	    }
	    private Map<String, String> userDatabase15 = new HashMap<>();
	    private Map<String, String> userAccounts = new HashMap<>();
	    private boolean isAdminLoggedIn15 = false;
	    private boolean isUserActivityDataVisible = false;
	    private boolean isAccountAdded15 = false;
	    
	    public void applyFilter(String filter, String value) {
	        if (filter.equals("role") && userAccounts.containsKey(value)) {
	            System.out.println("Filtered by role: " + value);
	            System.out.println("User found: " + value + " with email: " + userAccounts.get(value));
	        } else if (filter.equals("email") && userAccounts.containsValue(value)) {
	            System.out.println("Filtered by email: " + value);
	            for (Map.Entry<String, String> entry : userAccounts.entrySet()) {
	                if (entry.getValue().equals(value)) {
	                    System.out.println("User found: " + entry.getKey() + " with email: " + entry.getValue());
	                    break;
	                }
	            }
	        } else {
	            System.out.println("No matching records found for filter: " + filter + " with value: " + value);
	        }
	    }

	    public boolean isUserActivityDataDisplayed() {
	        return isUserActivityDataVisible;
	    }

	    public void addNewAccountWithDetails(String name, String email, String role) {
	        if (isAdminLoggedIn) {
	            if (name.isEmpty() || email.isEmpty() || role.isEmpty()) {
	                System.out.println("Please provide valid account details.");
	            } else {
	                userAccounts.put(name, email);
	                System.out.println("New account added successfully: Name: " + name + ", Email: " + email + ", Role: " + role);
	                isAccountAdded = true;
	            }
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void loginAsAdmin(String username, String password) {
	        userDatabase.put("admin", "adminPassword");

	        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
	            isAdminLoggedIn = true;
	            System.out.println("y");
	        } else {
	            System.out.println("Invalid admin username or password.");
	        }
	    }

	   

	    private List<Program> programs1 = new ArrayList<>();
	    
	    private List<String> sections = new ArrayList<>();
	    
	    private List<String> options = new ArrayList<>();

	    public void selectOption(String option) {
	        if (options.contains(option)) {
	            System.out.println("Option selected: " + option);
	        } else {
	            System.out.println("Option " + option + " not found.");
	        }
	    }

	    public boolean verifyProgramsSortedByEnrollment() {
	        List<Program> sortedPrograms = new ArrayList<>(programs1);
	        sortedPrograms.sort(Comparator.comparingInt(Program::getEnrollmentCount).reversed());

	        for (int i = 1; i < sortedPrograms.size(); i++) {
	            if (sortedPrograms.get(i - 1).getEnrollmentCount() < sortedPrograms.get(i).getEnrollmentCount()) {
	                System.out.println("Programs are not sorted by enrollment.");
	                return false;
	            }
	        }
	        System.out.println("Programs are sorted by enrollment.");
	        return true;
	    }

	    public boolean verifyProgramPopularityData() {
	        for (Program program : programs1) {
	            if (program.getPopularityScore() < 0 || program.getPopularityScore() > 10) {
	                System.out.println("Invalid popularity score for program: " + program.getName());
	                return false;
	            }
	        }
	        System.out.println("Program popularity data is valid.");
	        return true;
	    }

	    public void navigateToSection(String section) {
	        if (sections.contains(section)) {
	            System.out.println("Navigating to section: " + section);
	        } else {
	            System.out.println("Section " + section + " not found.");
	        }
	    }

	    public void addProgram(String name, int enrollmentCount, int popularityScore) {
	        programs1.add(new Program(name, enrollmentCount, popularityScore));
	    }

	    public void addSection(String section) {
	        sections.add(section);
	    }

	    public void addOption(String option) {
	        options.add(option);
	    }

	    class Program {
	        private String name;
	        private int enrollmentCount;
	        private int popularityScore;
			public Object focusArea;
			public Object difficultyLevel1;
			public Object difficultyLevel;
			
	

	        public Program(String name, int enrollmentCount2, int popularityScore2) {
	            this.name = name;
	            this.enrollmentCount = enrollmentCount2;
	            this.popularityScore = popularityScore2;
	        }

	        public Program(String name2, String focusArea2, String difficultyLevel2, String schedule) {
				// TODO Auto-generated constructor stub
			}

			public Program(String name2, String focusArea2, String difficultyLevel) {
				// TODO Auto-generated constructor stub
			}

			public String getName() {
	            return name;
	        }

	        public int getEnrollmentCount() {
	            return enrollmentCount;
	        }

	        public int getPopularityScore() {
	            return popularityScore;
	        }

			public String getProgramName() {
				// TODO Auto-generated method stub
				return null;
			}
	    }
	    private List<String> availableReports = new ArrayList<>();
	    
	    private String startDate;
	    private String endDate;

	    private String reportDetails;

	  

	    public void selectReportType(String reportType) {
	        if (availableReports.contains(reportType)) {
	            System.out.println("Report type selected: " + reportType);
	        } else {
	            System.out.println("Report type " + reportType + " not found.");
	        }
	    }

	    public void setDateRange(String startDate, String endDate) throws java.text.ParseException {
	        if (isValidDate(startDate) && isValidDate(endDate)) {
	            this.startDate = startDate;
	            this.endDate = endDate;
	            System.out.println("Date range set from " + startDate + " to " + endDate);
	        } else {
	            System.out.println("Invalid date format. Please enter dates in 'yyyy-MM-dd' format.");
	        }
	    }

	    private boolean isValidDate(String dateStr) throws java.text.ParseException {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        sdf.setLenient(false);
	        try {
	            Date date = sdf.parse(dateStr);
	            return true;
	        } catch (ParseException e) {
	            return false;
	        }
	    }

	    public boolean verifyReport(String reportType) {
	        if (availableReports.contains(reportType)) {
	            System.out.println("Report " + reportType + " is available.");
	            return true;
	        } else {
	            System.out.println("Report " + reportType + " is not available.");
	            return false;
	        }
	    }

	    public boolean verifyReportDetails(String reportType) {
	        if (reportType.equals("Sales Report")) {
	            reportDetails = "Sales report details for the selected date range.";
	        } else if (reportType.equals("Attendance Report")) {
	            reportDetails = "Attendance report details for the selected date range.";
	        } else if (reportType.equals("User Activity Report")) {
	            reportDetails = "User activity report details for the selected date range.";
	        } else {
	            System.out.println("Report details not available for " + reportType);
	            return false;
	        }

	        if (reportDetails != null && !reportDetails.isEmpty()) {
	            System.out.println("Report details verified: " + reportDetails);
	            return true;
	        }
	        return false;
	    }
	

	    private List<String> availablePrograms12 = new ArrayList<>();
	    private List<String> activePrograms = new ArrayList<>();
	    
	    private List<String> availableClients = new ArrayList<>();
	    
	    private String attendanceDetails;

	    private String clientProgressDetails;

	    
	
	    public Entry selectProgram(String program) {
	        if (availablePrograms12.contains(program)) {
	            System.out.println("Program selected: " + program);
	        } else {
	            System.out.println("Program " + program + " not found.");
	        }
			return null;
		
	    }

	    public boolean verifyAttendanceDetails() {
	        attendanceDetails = "Attendance details for the selected program.";
	        
	        if (attendanceDetails != null && !attendanceDetails.isEmpty()) {
	            System.out.println("Attendance details verified: " + attendanceDetails);
	            return true;
	        }
	        System.out.println("Attendance details not available.");
	        return false;
	    }

	    public void selectClient(String client) {
	        if (availableClients.contains(client)) {
	            System.out.println("Client selected: " + client);
	        } else {
	            System.out.println("Client " + client + " not found.");
	        }
	    }

	    public boolean verifyClientProgressDetails() {
	        clientProgressDetails = "Progress details for the selected client.";
	        
	        if (clientProgressDetails != null && !clientProgressDetails.isEmpty()) {
	            System.out.println("Client progress details verified: " + clientProgressDetails);
	            return true;
	        }
	        System.out.println("Client progress details not available.");
	        return false;
	    }

	    public boolean verifyActivePrograms() {
	        if (!activePrograms.isEmpty()) {
	            System.out.println("Active programs: " + activePrograms);
	            return true;
	        }
	        System.out.println("No active programs available.");
	        return false;
	    }

	    private List<String> activePrograms1 = new ArrayList<>();
	    private List<String> completedPrograms = new ArrayList<>();

	    private String activeProgramData;
	    private String completedProgramData;

	    private String reportDownloadStatus;

	    private String selectedFileFormat;

	
	    public boolean verifyActiveProgramData() {
	        if (activeProgramData != null && !activeProgramData.isEmpty()) {
	            System.out.println("Active program data verified: " + activeProgramData);
	            return true;
	        }
	        System.out.println("No active program data available.");
	        return false;
	    }

	    public boolean verifyCompletedPrograms() {
	        if (!completedPrograms.isEmpty()) {
	            System.out.println("Completed programs: " + completedPrograms);
	            return true;
	        }
	        System.out.println("No completed programs available.");
	        return false;
	    }

	    public boolean verifyCompletedProgramData() {
	        if (completedProgramData != null && !completedProgramData.isEmpty()) {
	            System.out.println("Completed program data verified: " + completedProgramData);
	            return true;
	        }
	        System.out.println("No completed program data available.");
	        return false;
	    }

	    public void selectFileFormat(String format) {
	        selectedFileFormat = format;
	        System.out.println("File format selected: " + selectedFileFormat);
	    }

	    public boolean verifyReportDownload(String fileName) {
	        if (selectedFileFormat != null && !selectedFileFormat.isEmpty()) {
	            reportDownloadStatus = "Report " + fileName + " downloaded successfully in " + selectedFileFormat + " format.";
	            System.out.println(reportDownloadStatus);
	            return true;
	        }
	        System.out.println("No file format selected for download.");
	        return false;
	    }

	    private List<String> pendingSubmissions = new ArrayList<>();
	    private List<String> approvedContent = new ArrayList<>();

	    private String currentContentToReview;

	

	    public boolean verifyDownloadedReportDetails() {
	        if (pendingSubmissions.isEmpty()) {
	            System.out.println("No pending submissions to download report for.");
	            return false;
	        }
	        System.out.println("Downloaded report contains details for: " + pendingSubmissions);
	        return true;
	    }

	    public void addPendingSubmissions() {
	        pendingSubmissions.add("Health Article 3");
	        System.out.println("Added new pending submission: Health Article 3");
	    }

	    public void navigateToContentApprovalPage() {
	        System.out.println("Navigating to Content Approval Page...");
	    }

	    public String reviewContent(String contentName) {
	        currentContentToReview = contentName;
	        System.out.println("Reviewing content: " + contentName);

	        if (pendingSubmissions.contains(contentName)) {
	            return "Content '" + contentName + "' is ready for approval.";
	        } else {
	            return "Content '" + contentName + "' is not available for review.";
	        }
	    }


	    private List<String> pendingSubmissions1 = new ArrayList<>();
	    private List<String> approvedContent1 = new ArrayList<>();
	    private List<String> rejectedContent1 = new ArrayList<>();
	    private List<String> publishedContent = new ArrayList<>();

	    private List<String> instructorNotifications = new ArrayList<>();


	    public boolean approveContent(String contentName) {
	        if (pendingSubmissions.contains(contentName)) {
	            pendingSubmissions.remove(contentName);
	            approvedContent.add(contentName);
	            instructorNotifications.add("Content '" + contentName + "' has been approved.");
	            System.out.println("Content '" + contentName + "' has been approved.");
	            return true;
	        } else {
	            System.out.println("Content '" + contentName + "' is not in the pending submissions list.");
	            return false;
	        }
	    }

	    public boolean isContentPublished(String contentName) {
	        if (publishedContent.contains(contentName)) {
	            System.out.println("Content '" + contentName + "' is already published.");
	            return true;
	        } else {
	            System.out.println("Content '" + contentName + "' has not been published yet.");
	            return false;
	        }
	    }

	    public String getInstructorNotification(String contentName) {
	        for (String notification : instructorNotifications) {
	            if (notification.contains(contentName)) {
	                return notification;
	            }
	        }
	        return "No notification for content '" + contentName + "'.";
	    }

	    public String rejectContent1(String contentName) {
	        if (pendingSubmissions.contains(contentName)) {
	            pendingSubmissions.remove(contentName);
	            rejectedContent1.add(contentName);
	            instructorNotifications.add("Content '" + contentName + "' has been rejected.");
	            System.out.println("Content '" + contentName + "' has been rejected.");
	            return "Content '" + contentName + "' has been rejected.";
	        } else {
	            return "Content '" + contentName + "' is not in the pending submissions list.";
	        }
	    }

	    public boolean publishContent(String contentName) {
	        if (approvedContent.contains(contentName)) {
	            approvedContent.remove(contentName);
	            publishedContent.add(contentName);
	            System.out.println("Content '" + contentName + "' has been published.");
	            return true;
	        } else {
	            System.out.println("Content '" + contentName + "' is not approved yet.");
	            return false;
	        }
	    }

	    private List<String> healthWellnessArticlesForReview = new ArrayList<>();
	    private List<String> rejectedContent = new ArrayList<>();
	    private List<String> visibleContentToUsers = new ArrayList<>();
	    private List<String> submitterNotifications = new ArrayList<>();

	    

	    public boolean isContentRejected(String contentName) {
	        return rejectedContent1.contains(contentName);
	    }

	    public void addHealthWellnessArticlesForReview(String contentName) {
	        healthWellnessArticlesForReview.add(contentName);
	        System.out.println("Article '" + contentName + "' added for review.");
	    }

	    public boolean isContentVisibleToUsers(String contentName) {
	        return visibleContentToUsers.contains(contentName);
	    }

	    public String getSubmitterNotification(String contentName) {
	        for (String notification : submitterNotifications) {
	            if (notification.contains(contentName)) {
	                return notification;
	            }
	        }
	        return "No notification for content '" + contentName + "'.";
	    }

	    public String rejectContent(String contentName) {
	        if (healthWellnessArticlesForReview.contains(contentName)) {
	            healthWellnessArticlesForReview.remove(contentName);
	            rejectedContent1.add(contentName);
	            submitterNotifications.add("Content '" + contentName + "' has been rejected.");
	            System.out.println("Content '" + contentName + "' has been rejected.");
	            return "Content '" + contentName + "' has been rejected.";
	        } else {
	            return "Content '" + contentName + "' is not in the review list.";
	        }
	    }

	    public boolean publishContentToUsers(String contentName) {
	        if (!isContentRejected(contentName)) {
	            visibleContentToUsers.add(contentName);
	            System.out.println("Content '" + contentName + "' is now visible to users.");
	            return true;
	        } else {
	            System.out.println("Content '" + contentName + "' is rejected and cannot be published.");
	            return false;
	        }
	    }

	    private List<String> userFeedbackList = new ArrayList<>();
	    private List<String> userComplaintsList = new ArrayList<>();
	    
	    private List<String> feedbackOptions = new ArrayList<>();

	    public void addUserFeedback(String feedback) {
	        userFeedbackList.add(feedback);
	        System.out.println("User feedback added: " + feedback);
	    }

	    public void navigateToUserFeedbackPage() {
	        System.out.println("Navigating to user feedback page...");
	    }

	    public String openFeedbackEntry(int index) {
	        if (index >= 0 && index < userFeedbackList.size()) {
	            return userFeedbackList.get(index);
	        } else {
	            return "Invalid feedback entry index.";
	        }
	    }

	    public boolean hasFeedbackOptions() {
	        return !feedbackOptions.isEmpty();
	    }

	    public void addUserComplaints(String complaint) {
	        userComplaintsList.add(complaint);
	        System.out.println("User complaint added: " + complaint);
	    }



	    private List<String> userComplaintsList1 = new ArrayList<>();

	    private List<String> userAccountsList = new ArrayList<>();

	    public void navigateToUserComplaintsPage() {
	        System.out.println("Navigating to the user complaints page...");
	    }

	    public String openComplaintEntry(int index) {
	        if (index >= 0 && index < userComplaintsList.size()) {
	            return userComplaintsList.get(index);
	        } else {
	            return "Invalid complaint entry index.";
	        }
	    }

	    public boolean hasComplaintOptions() {
	        return !userComplaintsList.isEmpty();
	    }

	    public void addNewAccount(String accountName) {
	        userAccountsList.add(accountName);
	        System.out.println("New account added: " + accountName);
	    }

	    private Map<String, String> userAccounts1 = new HashMap<>();
	    private Map<String, Boolean> instructorRegistrations = new HashMap<>();
	    
	    public boolean isAccountSaved(String accountName) {
	        return userAccounts.containsKey(accountName);
	    }

	    public void updateAccount(String oldAccountName, String newAccountName) {
	        if (userAccounts.containsKey(oldAccountName)) {
	            String accountDetails = userAccounts.remove(oldAccountName);
	            userAccounts.put(newAccountName, accountDetails);
	            System.out.println("Account updated from " + oldAccountName + " to " + newAccountName);
	        } else {
	            System.out.println("Account " + oldAccountName + " not found.");
	        }
	    }

	    public void approveInstructorRegistration(String instructorName) {
	        instructorRegistrations.put(instructorName, true);
	        System.out.println("Instructor " + instructorName + " registration approved.");
	    }

	    public boolean isInstructorRegistrationApproved(String instructorName) {
	        return instructorRegistrations.getOrDefault(instructorName, false);
	    }


	    private Map<String, Integer> userActivityStats = new HashMap<>();
	    
	    public void requestUserActivityStatistics(String userName) {
	       
	        int activityCount = (int) (Math.random() * 100); // نشاط عشوائي بين 0 و 100
	        userActivityStats.put(userName, activityCount);
	        System.out.println("User activity statistics for " + userName + " requested.");
	    }

	    public boolean areUserActivityStatsDisplayed(String userName) {
	        if (userActivityStats.containsKey(userName)) {
	            System.out.println("User activity stats for " + userName + ": " + userActivityStats.get(userName));
	            return true;
	        } else {
	            System.out.println("No activity stats found for " + userName);
	            return false;
	        }
	    }
//yara
	    private boolean isAdminLoggedIn4 = false;
	    private boolean isInstructorLoggedIn = false; 

	    private Map<String, AccountDetails> adminAccounts = new HashMap<>();
	    private Map<String, AccountDetails> instructorAccounts = new HashMap<>();

	    public static class AccountDetails {
	        private String name;
	        private String email;
	        private String password;

	        public AccountDetails(String name, String email, String password) {
	            this.name = name;
	            this.email = email;
	            this.password = password;
	        }

	        public String getName() {
	            return name;
	        }

	        public String getEmail() {
	            return email;
	        }

	        public String getPassword() {
	            return password;
	        }
	    }

	    public void adminLogin(String email, String password) {
	        AccountDetails account = adminAccounts.get(email);
	        if (account != null && account.getPassword().equals(password)) {
	            isAdminLoggedIn1 = true;
	            System.out.println("y");
	        } else {
	            System.out.println("Invalid admin email or password.");
	        }
	    }

	    public void instructorLogin(String email, String password) {
	        AccountDetails account = instructorAccounts.get(email);
	        if (account != null && account.getPassword().equals(password)) {
	            isInstructorLoggedIn = true;
	            System.out.println("Instructor logged in successfully.");
	        } else {
	            System.out.println("Invalid instructor email or password.");
	        }
	    }

	    public void fillAccountDetails1(String email, String name, String password) {
	        if (isAdminLoggedIn1) {
	            adminAccounts.put(email, new AccountDetails(name, email, password));
	            System.out.println("Admin account details filled. Name: " + name + ", Email: " + email);
	        } else {
	            System.out.println("You need to login as admin first.");
	        }
	    }

	    public void fillInstructorAccountDetails(String email, String name, String password) {
	        if (isInstructorLoggedIn) {
	            instructorAccounts.put(email, new AccountDetails(name, email, password));
	            System.out.println("Instructor account details filled. Name: " + name + ", Email: " + email);
	        } else {
	            System.out.println("You need to login as instructor first.");
	        }
	    }

	    public void displayAccountDetails() {
	        System.out.println("Admin Accounts:");
	        for (AccountDetails account : adminAccounts.values()) {
	            System.out.println("Name: " + account.getName() + ", Email: " + account.getEmail());
	        }

	        System.out.println("Instructor Accounts:");
	        for (AccountDetails account : instructorAccounts.values()) {
	            System.out.println("Name: " + account.getName() + ", Email: " + account.getEmail());
	        }
	    }
	
	
	    private List<FitnessProgram> programs11 = new ArrayList<>();
private FitnessProgram program1;

	    public void navigateToProgramManagementPage() {
	        System.out.println("Navigating to Program Management Page...");
	    }

	    public void addNewFitnessProgram1(String programName, String description, String category, int duration) {
	        if (programName == null || programName.isEmpty()) {
	            System.out.println("Program name is required.");
	            return;
	        }
	        if (description == null || description.isEmpty()) {
	            System.out.println("Program description is required.");
	            return;
	        }
	        if (category == null || category.isEmpty()) {
	            System.out.println("Program category is required.");
	            return;
	        }
	        if (duration <= 0) {
	            System.out.println("Program duration should be greater than zero.");
	            return;
	        }

	        FitnessProgram program = new FitnessProgram(programName, description, category, duration);
	        programs1.addAll((Collection<? extends MyApplication<UserProfile>.Program>) program);
	        System.out.println("Fitness program '" + programName + "' added successfully!");
	    }

	    public void uploadProgramVideos(String programName, String videoPath) {
	        FitnessProgram program = findProgramByName1(programName);
	        if (program == null) {
	            System.out.println("Program not found: " + programName);
	            return;
	        }

	        program.addVideo(videoPath);
	        System.out.println("Video uploaded successfully to program: " + programName);
	    }

	    public void setProgramGoals(String programName, String goals) {
	        FitnessProgram program = findProgramByName1(programName);
	        if (program == null) {
	            System.out.println("Program not found: " + programName);
	            return;
	        }

	        program.setGoals(goals);
	        System.out.println("Goals set for program '" + programName + "': " + goals);
	    }

	    private FitnessProgram findProgramByName1(String programName) {
	        for (MyApplication<UserProfile>.Program program : programs1) {
	            if (program.getName().equalsIgnoreCase(programName)) {
	                return program1;
	            }
	        }
	        return null;
	    }

	    static class FitnessProgram {
	        private String programName;
	        private String description;
	        private String category;
	        private int duration; 
	        private List<String> videos;
	        private String goals;

	        public FitnessProgram(String programName, String description, String category, int duration2) {
	            this.programName = programName;
	            this.description = description;
	            this.category = category;
	            this.duration = duration2;
	            this.videos = new ArrayList<>();
	        }

	        public String getProgramName() {
	            return programName;
	        }

	        public void setProgramName(String programName) {
	            this.programName = programName;
	        }

	        public void addVideo(String videoPath) {
	            this.videos.add(videoPath);
	        }

	        public void setGoals(String goals) {
	            this.goals = goals;
	        }

	        @Override
	        public String toString() {
	            return "Program: " + programName + "\nDescription: " + description + "\nCategory: " + category +
	                   "\nDuration: " + duration + " days\nVideos: " + videos + "\nGoals: " + goals;
	        }

	        private String description1;
	        private String category1;  
	        private int duration1;  

	        public void setDescription(String description2) {
	            this.description = description2;  
	        }

	        // setter method to set the category
	        public void setCategory(String category2) {
	            this.category = category2; 
	        }

	        // setter method to set the duration
	        public void setDuration(int duration2) {
	            if (duration2 > 0) { 
	                this.duration = duration2;  
	            } else {
	                System.out.println("Duration must be positive."); 
	            }
	        }

	        public void displayProgramDetails() {
	            System.out.println("Program Description: " + this.description);
	            System.out.println("Category: " + this.category);
	            System.out.println("Duration: " + this.duration + " days");
	        }

	    

	            private String title;
	            private String image;
	            private String price;
	            private String document;
	            private String video;
	            private String goal;
	            private String duration5;
	            private String difficulty;
	            private boolean scheduled;
	            private String sessionDate;
	            private String sessionTime;

	            private Map<String, String> documents = new HashMap<>();

	            public void addImage(String image) {
	                if (image != null && !image.isEmpty()) {
	                    this.image = image;
	                    System.out.println("Image added successfully.");
	                } else {
	                    System.out.println("Invalid image path.");
	                }
	            }

	            public void setPrice(String price) {
	                if (price != null && !price.isEmpty()) {
	                    this.price = price;
	                    System.out.println("Price set to: " + price);
	                } else {
	                    System.out.println("Invalid price.");
	                }
	            }

	            public void scheduleSession(String sessionTitle, String date, String time) {
	                if (sessionTitle != null && !sessionTitle.isEmpty() && date != null && !date.isEmpty() && time != null && !time.isEmpty()) {
	                    this.title = sessionTitle;
	                    this.sessionDate = date;
	                    this.sessionTime = time;
	                    this.scheduled = true;  // Mark the session as scheduled
	                    System.out.println("Session scheduled for: " + date + " at " + time);
	                } else {
	                    System.out.println("Invalid session details.");
	                }
	            }

	            public Object getTitle() {
	                return this.title != null ? this.title : "No title set";
	            }

	            public Object getDuration() {
	                return this.duration5 != null ? this.duration : "Duration not set";
	            }

	            public Object getDifficulty() {
	                return this.difficulty != null ? this.difficulty : "Difficulty not set";
	            }

	            public Object getGoal() {
	                return this.goal != null ? this.goal : "Goal not set";
	            }

	            public Object getVideo() {
	                return this.video != null ? this.video : "Video not set";
	            }

	            public Object getImage() {
	                return this.image != null ? this.image : "No image set";
	            }

	            public Object getPrice() {
	                return this.price != null ? this.price : "Price not set";
	            }

	            public boolean isScheduled() {
	                return this.scheduled;
	            }

	            public void setTitle(String newTitle) {
	                if (newTitle != null && !newTitle.isEmpty()) {
	                    this.title = newTitle;
	                    System.out.println("Title updated to: " + newTitle);
	                } else {
	                    System.out.println("Invalid title.");
	                }
	            }

	            public void addDocument(String docName, String content) {
	                if (docName != null && !docName.isEmpty() && content != null && !content.isEmpty()) {
	                    documents.put(docName, content);
	                    System.out.println("Document '" + docName + "' added successfully.");
	                } else {
	                    System.out.println("Invalid document data.");
	                }
	            }

	            public Object getDocument(String docName) {
	                if (documents.containsKey(docName)) {
	                    return documents.get(docName);
	                } else {
	                    return "Document not found.";
	                }
	            }

	            public void setSessionDetails(String goal, int duration, String difficulty, String video) {
	                this.goal = goal;
	                this.duration = duration;
	                this.difficulty = difficulty;
	                this.video = video;
	                System.out.println("Session details set: Goal = " + goal + ", Duration = " + duration + ", Difficulty = " + difficulty + ", Video = " + video);
	            }

	            public void printSessionDetails() {
	                System.out.println("Title: " + getTitle());
	                System.out.println("Duration: " + getDuration());
	                System.out.println("Difficulty: " + getDifficulty());
	                System.out.println("Goal: " + getGoal());
	                System.out.println("Video: " + getVideo());
	                System.out.println("Image: " + getImage());
	                System.out.println("Price: " + getPrice());
	                System.out.println("Scheduled: " + (isScheduled() ? "Yes" : "No"));
	                System.out.println("Documents: " + documents.keySet());
	            }
	        }

	    
	
	    private List<FitnessProgram> programs = new ArrayList<>();

	    public boolean isProgramSaved(String programName) {
	        for (MyApplication<UserProfile>.Program program : programs1) {
	            if (program.getProgramName().equalsIgnoreCase(programName)) {
	                return true; 
	            }
	        }
	        return false;
	    }

	    public void selectExistingProgram(String programName) {
	        FitnessProgram program = findProgramByName1(programName);
	        if (program != null) {
	            System.out.println("Selected Program: " + program.getProgramName());
	        } else {
	            System.out.println("Program not found: " + programName);
	        }
	    }

	    public void updateProgramDetails(String programName, String description, String category, int duration) {
	        FitnessProgram program = findProgramByName1(programName);
	        if (program != null) {
	            program.setDescription(description);
	            program.setCategory(category);
	            program.setDuration(duration);
	            System.out.println("Program '" + programName + "' updated successfully!");
	        } else {
	            System.out.println("Program not found: " + programName);
	        }
	    }

	    public boolean isProgramUpdated(String programName) {
	        FitnessProgram program = findProgramByName1(programName);
	        return program != null; 
	    }

	    private MyApplication<UserProfile>.Program findProgramByName(String programName) {
	        for (MyApplication<UserProfile>.Program program : programs1) {
	            if (program.getProgramName().equalsIgnoreCase(programName)) {
	                return program;
	            }
	        }
	        return null; // Return null if not found
	    }

	    public void addNewFitnessProgram(String programName, String description, String category, int duration) {
	        if (!isProgramSaved(programName)) {
	            FitnessProgram program = new FitnessProgram(programName, description, category, duration);
	            programs1.addAll((Collection<? extends MyApplication<UserProfile>.Program>) program);
	            System.out.println("Program '" + programName + "' added successfully!");
	        } else {
	            System.out.println("Program '" + programName + "' already exists.");
	        }
	    }

	    static class FitnessProgram1 {
	        private String programName;
	        private String description;
	        private String category;
	        private int duration;  // Duration in days

	        public void FitnessProgram(String programName, String description, String category, int duration) {
	            this.programName = programName;
	            this.description = description;
	            this.category = category;
	            this.duration = duration;
	        }

	        // Getters and Setters
	        public String getProgramName() {
	            return programName;
	        }

	        public void setProgramName(String programName) {
	            this.programName = programName;
	        }

	        public String getDescription() {
	            return description;
	        }

	        public void setDescription(String description) {
	            this.description = description;
	        }

	        public String getCategory() {
	            return category;
	        }

	        public void setCategory(String category) {
	            this.category = category;
	        }

	        public int getDuration() {
	            return duration;
	        }

	        public void setDuration(int duration) {
	            this.duration = duration;
	        }

	        @Override
	        public String toString() {
	            return "Program: " + programName + "\nDescription: " + description + "\nCategory: " + category +
	                   "\nDuration: " + duration + " days";
	        }

			public fitnes.MyApplication.FitnessProgram getProgramByTitle(String title) {
				// TODO Auto-generated method stub
				return null;
			}

			public void deleteProgram(String title) {
				// TODO Auto-generated method stub
				
			}

			public boolean programExists(String string) {
				// TODO Auto-generated method stub
				return false;
			}
	    }
	

	    private List<String> allClients = new ArrayList<>();

	    // Method to add clients (for testing purposes)
	    public void addClient(String clientName) {
	        allClients.add(clientName);
	    }

	    // Method to select clients from the list
	    public void selectClients(List<String> enrolledClients) {
	        if (enrolledClients.isEmpty()) {
	            System.out.println("No clients selected.");
	            return;
	        }

	        System.out.println("Selected Clients: ");
	        for (String client : enrolledClients) {
	            System.out.println(client);
	        }
	    }

	    // Method to compose a message to a client
	    public void composeMessage(String clientName, String message) {
	        if (clientName == null || clientName.isEmpty()) {
	            System.out.println("Client name is required to compose a message.");
	            return;
	        }

	        if (message == null || message.isEmpty()) {
	            System.out.println("Message cannot be empty.");
	            return;
	        }

	        System.out.println("Composing message to " + clientName + ":");
	        System.out.println(message);
	    }

	    // Method to simulate clicking a button
	    public void clickButton2(String button) {
	        if (button == null || button.isEmpty()) {
	            System.out.println("Button name is required.");
	            return;
	        }

	        System.out.println("Button '" + button + "' clicked.");
	    }

	    // Method to send a message to a list of enrolled clients
	    public void sendMessage(List<String> enrolledClients, String message) {
	        if (enrolledClients == null || enrolledClients.isEmpty()) {
	            System.out.println("No clients selected to send the message.");
	            return;
	        }

	        if (message == null || message.isEmpty()) {
	            System.out.println("Message cannot be empty.");
	            return;
	        }

	        System.out.println("Sending message to enrolled clients:");
	        for (String client : enrolledClients) {
	            System.out.println("Message sent to: " + client);
	            System.out.println("Message: " + message);
	        }
	    }

	    // For testing: List of enrolled clients
	    public List<String> getEnrolledClients() {
	        List<String> enrolledClients = new ArrayList<>();
	        enrolledClients.add("Client1");
	        enrolledClients.add("Client2");
	        enrolledClients.add("Client3");
	        return enrolledClients;
	    }

	   
	   
	    
	    private Map<String, List<String>> clientMessages = new HashMap<>();

	    // Simulated storage for forum messages (forum message -> responses)
	    private Map<String, List<String>> forumMessages = new HashMap<>();

	    // Simulated client progress (client name -> progress details)
	    private Map<String, String> clientProgress = new HashMap<>();

	    // Method to view client messages (retrieve from the clientMessages map)
	    public void viewClientMessages(String clientName) {
	        if (clientMessages.containsKey(clientName)) {
	            List<String> messages = clientMessages.get(clientName);
	            System.out.println("Messages for " + clientName + ":");
	            for (String message : messages) {
	                System.out.println(message);
	            }
	        } else {
	            System.out.println("No messages found for " + clientName);
	        }
	    }

	    // Method to reply to a forum message (store the response)
	    public void replyToMessage(String forumMessage, String clientName) {
	        if (forumMessages.containsKey(forumMessage)) {
	            List<String> responses = forumMessages.get(forumMessage);
	            responses.add("Reply from " + clientName + ": " + forumMessage);
	            forumMessages.put(forumMessage, responses);
	            System.out.println("Reply posted to forum message: " + forumMessage);
	        } else {
	            System.out.println("Forum message not found.");
	        }
	    }

	    // Method to verify forum response (check the correctness of a response)
	    public void verifyForumResponse(String forumMessage, String response) {
	        if (forumMessages.containsKey(forumMessage)) {
	            List<String> responses = forumMessages.get(forumMessage);
	            if (responses.contains(response)) {
	                System.out.println("Response verified: " + response);
	            } else {
	                System.out.println("Response does not match the forum message.");
	            }
	        } else {
	            System.out.println("Forum message not found.");
	        }
	    }

	    // Method to review client progress (store or update progress details)
	    public void reviewClientProgress(String clientName, int progress, String clientStatus) {
	        if (progress < 0 || progress > 100) {
	            System.out.println("Invalid progress percentage. It should be between 0 and 100.");
	            return;
	        }

	        String progressDetails = "Progress: " + progress + "%, Status: " + clientStatus;
	        clientProgress.put(clientName, progressDetails);
	        System.out.println("Reviewed progress for " + clientName + ": " + progressDetails);
	    }

	    // Methods to simulate adding client messages or forum messages for testing
	    public void addClientMessage(String clientName, String message) {
	        clientMessages.putIfAbsent(clientName, new ArrayList<>());
	        clientMessages.get(clientName).add(message);
	    }

	    public void addForumMessage(String forumMessage) {
	        forumMessages.putIfAbsent(forumMessage, new ArrayList<>());
	    }

	 

	    private Map<String, List<String>> clientProgressReports = new HashMap<>();

	    private Map<String, String> clientProgressStatistics = new HashMap<>();

	    public void writeProgressReport(String progressReport, String clientName) {
	        clientProgressReports.putIfAbsent(clientName, new ArrayList<>());
	        clientProgressReports.get(clientName).add(progressReport);
	        System.out.println("Progress report written for " + clientName + ": " + progressReport);
	    }

	    // Method to send the progress report (simulating sending via a message or email)
	    public void sendProgressReport(String clientName) {
	        if (clientProgressReports.containsKey(clientName)) {
	            List<String> reports = clientProgressReports.get(clientName);
	            System.out.println("Sending progress report to " + clientName + ":");
	            for (String report : reports) {
	                System.out.println(report);
	            }
	        } else {
	            System.out.println("No progress reports found for " + clientName);
	        }
	    }

	    public void viewClientProgressStatistics() {
	        if (clientProgressStatistics.isEmpty()) {
	            System.out.println("No client progress statistics available.");
	        } else {
	            System.out.println("Client Progress Statistics:");
	            for (Map.Entry<String, String> entry : clientProgressStatistics.entrySet()) {
	                System.out.println(entry.getKey() + ": " + entry.getValue());
	            }
	        }
	    }

	    public void checkClientProgress(String clientName) {
	        if (clientProgressStatistics.containsKey(clientName)) {
	            String progress = clientProgressStatistics.get(clientName);
	            System.out.println("Client progress for " + clientName + ": " + progress);
	        } else {
	            System.out.println("No progress statistics found for " + clientName);
	        }
	    }

	    // Simulated method to add client progress statistics for testing purposes
	    public void addClientProgressStatistics(String clientName, String progress) {
	        clientProgressStatistics.put(clientName, progress);
	    }

	    // Testing the methods
	  
	    private Map<String, Integer> missedSessions = new HashMap<>();
	    private Map<String, Boolean> motivationalMessagesSent = new HashMap<>();

	    // Simulated storage for client progress data (client name -> progress data)
	    private Map<String, Boolean> clientProgressDataVerified = new HashMap<>();

	    // Method to verify if client progress data is valid
	    public boolean verifyClientProgressData(String clientName) {
	        // Check if progress data for the client is available and valid
	        if (clientProgressDataVerified.containsKey(clientName) && clientProgressDataVerified.get(clientName)) {
	            System.out.println("Client progress data for " + clientName + " is verified.");
	            return true;
	        } else {
	            System.out.println("Client progress data for " + clientName + " is invalid or not verified.");
	            return false;
	        }
	    }

	    // Method to record missed sessions for a client
	    public void recordMissedSessions(String clientName, int missedCount) {
	        missedSessions.put(clientName, missedSessions.getOrDefault(clientName, 0) + missedCount);
	        System.out.println(clientName + " has missed " + missedSessions.get(clientName) + " sessions.");
	    }

	    public void triggerMotivationalReminder(String clientName) {
	        if (missedSessions.getOrDefault(clientName, 0) >= 3) {
	            System.out.println("Sending motivational reminder to " + clientName + "...");
	            motivationalMessagesSent.put(clientName, true);
	        } else {
	            System.out.println(clientName + " has not missed enough sessions for a reminder.");
	        }
	    }

	    public boolean verifyMotivationalMessage(String clientName) {
	        if (motivationalMessagesSent.getOrDefault(clientName, false)) {
	            System.out.println("Motivational message successfully sent to " + clientName + ".");
	            return true;
	        } else {
	            System.out.println("No motivational message sent to " + clientName + ".");
	            return false;
	        }
	    }

	    public void setClientProgressDataVerified(String clientName, boolean isVerified) {
	        clientProgressDataVerified.put(clientName, isVerified);
	    }

	    // Testing the methods
	   

	    private Map<String, String> sessionSchedule = new HashMap<>();
	    private Map<String, List<String>> participantsNotification = new HashMap<>();

	    private Map<String, String> sessions = new HashMap<>();

	    public void instructorNeedsToRescheduleSession(String sessionId) {
	        if (sessions.containsKey(sessionId)) {
	            System.out.println("Instructor needs to reschedule session: " + sessionId);
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("Enter the new session time (e.g., 2025-01-10 10:00 AM): ");
	            String newTime = scanner.nextLine();
	            updateSessionSchedule(sessionId, newTime);
	        } else {
	            System.out.println("Session with ID " + sessionId + " does not exist.");
	        }
	    }

	    public String updateSessionSchedule(String sessionId, String newTime) {
	        // Check if the session exists
	        if (sessions.containsKey(sessionId)) {
	            // Update session schedule with the new time
	            String oldTime = sessions.get(sessionId);
	            sessions.put(sessionId, newTime);
	            System.out.println("Session ID " + sessionId + " has been rescheduled from " + oldTime + " to " + newTime);
	            // Notify participants
	            areParticipantsNotified(newTime);
	            return "Session rescheduled successfully.";
	        } else {
	            return "Session ID not found.";
	        }
	    }

	    // Method to check if participants are notified about the session update
	    public boolean areParticipantsNotified(String sessionUpdateDetails) {
	        // In real scenario, you would send notifications (emails, SMS, etc.).
	        // For now, we'll simulate that by adding session updates to a list of notified participants.
	        System.out.println("Notifying participants about the session update: " + sessionUpdateDetails);
	        
	        // Simulate participants being notified
	        List<String> participants = new ArrayList<>();
	        participants.add("Instructor1");
	        participants.add("Client1");
	        participants.add("Client2");

	        participantsNotification.put(sessionUpdateDetails, participants);
	        
	        // Return true if notification was successfully sent (simulated)
	        return true;
	    }

	    // Simulate a method that adds a session for demonstration purposes
	    public void addSession(String sessionId, String sessionTime) {
	        sessions.put(sessionId, sessionTime);
	        System.out.println("Session " + sessionId + " added at time: " + sessionTime);
	    }

	   

	    private Map<String, String> programs3 = new HashMap<>();
	    private Map<String, List<String>> clientNotifications = new HashMap<>();
	    private List<String> clients = new ArrayList<>(Arrays.asList("Client1", "Client2", "Client3"));

	    // Method to launch a new program and store its details
	    public void launchNewProgram(String programTitle) {
	        // Check if the program already exists
	        if (programs.contains(programTitle)) {
	            System.out.println("Program with the title " + programTitle + " already exists.");
	        } else {
	            // Launch the new program
	            ((Map<String, String>) programs).put(programTitle, "Program details for " + programTitle);
	            System.out.println("New program launched: " + programTitle);
	        }
	    }

	    // Method to send an announcement to clients
	    public String sendProgramAnnouncement(String programDetails) {
	        // Check if the program details are valid
	        if (programDetails == null || programDetails.isEmpty()) {
	            return "Invalid program details. Cannot send announcement.";
	        }
	        System.out.println("Sending announcement about program: " + programDetails);
	        
	        // Simulate sending announcements to clients
	        for (String client : clients) {
	            // In a real scenario, we would send an email or notification to the client
	            // For now, we'll simulate this by adding the announcement to the list of notifications
	            if (!clientNotifications.containsKey(client)) {
	                clientNotifications.put(client, new ArrayList<>());
	            }
	            clientNotifications.get(client).add(programDetails);
	        }

	        return "Announcement sent successfully to all clients.";
	    }

	    // Method to check if clients have been notified about the program
	    public boolean areClientsNotifiedOfProgram(String programAnnouncementDetails) {
	        // Iterate through the clients and check if they've been notified
	        boolean allNotified = true;
	        for (String client : clients) {
	            List<String> notifications = clientNotifications.get(client);
	            if (notifications == null || !notifications.contains(programAnnouncementDetails)) {
	                allNotified = false;
	                break;
	            }
	        }

	        return allNotified;
	    }

	    
//mohamed

	    private Map<String, Integer> userWeights = new HashMap<>();
	    private Map<String, Double> userBMIs = new HashMap<>();
	    private Map<String, List<String>> attendanceLogs = new HashMap<>();
	    
	    private List<String> users1 = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
	    public void navigateToFitnessTrackingPage() {
	    	System.out.println("Navigating to Fitness Tracking Page...");
	    }

	    public void enterWeight(String username, int weight) {
	        if (users1.contains(username)) {
	            userWeights.put(username, weight);
	            System.out.println("Weight for " + username + " set to " + weight + " kg.");
	        } else {
	            System.out.println("User not found.");
	        }
	    }

	    public void enterBMI(String username, double bmi) {
	        if (users1.contains(username)) {
	            userBMIs.put(username, bmi);
	            System.out.println("BMI for " + username + " set to " + bmi);
	        } else {
	            System.out.println("User not found.");
	        }
	    }

	    public void logProgramAttendance(String username, String programName) {
	        if (users1.contains(username)) {
	            attendanceLogs.putIfAbsent(username, new ArrayList<>());
	            attendanceLogs.get(username).add(programName);
	            System.out.println(username + " attended program: " + programName);
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	    private Map<String, List<String>> userMilestones1 = new HashMap<>();
	    private Map<String, Boolean> fitnessProgramCompletion1 = new HashMap<>();
	    private Map<String, List<String>> userAchievements = new HashMap<>();
	    private Map<String, List<String>> userBadges1 = new HashMap<>();
	    private List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        public boolean verifyMilestonesUpdated(String username) {
	        if (users1.contains(username)) {
	            List<String> milestones = userMilestones1.get(username);
	            return milestones != null && !milestones.isEmpty();
	        }
	        return false;}
	    public void completeFitnessProgram(String username) {
	        if (users1.contains(username)) {
	            fitnessProgramCompletion1.put(username, true);
	            System.out.println(username + " has completed their fitness program!");
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	    public void viewAchievements(String username) {
	        if (users1.contains(username)) {
	            List<String> achievements = userAchievements.get(username);
	            if (achievements != null && !achievements.isEmpty()) {
	                System.out.println(username + "'s Achievements: " + achievements);
	            } else {
	                System.out.println(username + " has no achievements yet.");
	            }
	        } else {
	            System.out.println("User not found.");
	        }
	    }

	    public boolean verifyBadges(String username) {
	        if (users1.contains(username)) {
	            List<String> badges = userBadges1.get(username);
	            return badges != null && !badges.isEmpty();
	        }
	        return false;
	    }

	    public void updateMilestone(String username, String milestone) {
	        if (users1.contains(username)) {
	            userMilestones1.putIfAbsent(username, new ArrayList<>());
	            userMilestones1.get(username).add(milestone);
	            System.out.println(username + " achieved milestone: " + milestone);
	        } else {
	            System.out.println("User not found.");
	        }
	    }

	    public void awardBadge1(String username, String badge) {
	        if (users1.contains(username)) {
	            userBadges1.putIfAbsent(username, new ArrayList<>());
	            userBadges1.get(username).add(badge);
	            System.out.println(username + " received badge: " + badge);
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	    private Map<String, List<String>> userMilestones = new HashMap<>();
	    private Map<String, Boolean> fitnessProgramCompletion = new HashMap<>();
	    private Map<String, List<String>> userBadges = new HashMap<>();
	    private Map<String, Map<String, Object>> clientsData = new HashMap<>();
	    private Map<String, List<String>> dietaryPreferences = new HashMap<>();

	    public void initializeSystem() {
	        System.out.println("Initializing system...");
	        userMilestones1.put("User1", new ArrayList<>());
	        userMilestones1.put("User2", new ArrayList<>());
	        userMilestones1.put("User3", new ArrayList<>());
	        fitnessProgramCompletion1.put("User1", false);
	        fitnessProgramCompletion1.put("User2", false);
	        fitnessProgramCompletion1.put("User3", false);
	    }
	    public boolean verifyBadgesReflectMilestones(String username) {
	        if (userBadges1.containsKey(username)) {
	            List<String> badges = userBadges1.get(username);
	            List<String> milestones = userMilestones1.get(username);
	            for (String milestone : milestones) {
	                if (milestone.contains("10 Workouts") && !badges.contains("10 Workouts Badge")) {
	                    return false; // Badge is missing for this milestone
	                }
	            }

	            return true; // Badges reflect milestones
	        }
	        return false; // User not found
	    }
	    public void enterClientDetails(String clientName, int age, String fitnessGoals) {
	        if (!clientsData.containsKey(clientName)) {
	            clientsData.put(clientName, new HashMap<>());
	        }
	        Map<String, Object> clientDetails = clientsData.get(clientName);
	        clientDetails.put("age", age);
	        clientDetails.put("fitnessGoals", fitnessGoals);

	        System.out.println(clientName + "'s details added: Age = " + age + ", Fitness Goals = " + fitnessGoals);
	    }
	    public void addDietaryPreferences(String clientName, List<String> preferences) {
	        if (!dietaryPreferences.containsKey(clientName)) {
	            dietaryPreferences.put(clientName, new ArrayList<>());
	        }
	        dietaryPreferences.get(clientName).addAll(preferences);

	        System.out.println("Dietary preferences added for " + clientName + ": " + preferences);
	    }

	    // Method to add a milestone for a user
	    public void addMilestone(String username, String milestone) {
	        if (!userMilestones1.containsKey(username)) {
	            userMilestones1.put(username, new ArrayList<>());
	        }
	        userMilestones1.get(username).add(milestone);
	    }

	    // Method to award a badge to a user
	    public void awardBadge(String username, String badge) {
	        if (!userBadges1.containsKey(username)) {
	            userBadges1.put(username, new ArrayList<>());
	        }
	        userBadges1.get(username).add(badge);
	    }

	    // Example of usage
	   

	    // Simulated storage for user profiles and dietary preferences
	    private Map<String, Map<String, Object>> profiles = new HashMap<>();
	    private Map<String, List<String>> dietaryPreferences1 = new HashMap<>();

	    // This variable will store if the profile creation form was successfully submitted
	    private boolean profileCreated = false;

	    // Submit the profile creation form
	    public void submitProfileCreationForm(String username, String name, int age, String fitnessGoals) {
	        // Simulating form submission logic
	        if (!profiles.containsKey(username)) {
	            Map<String, Object> profileData = new HashMap<>();
	            profileData.put("name", name);
	            profileData.put("age", age);
	            profileData.put("fitnessGoals", fitnessGoals);

	            // Add the profile to the profiles map
	            profiles.put(username, profileData);

	            // Profile is created
	            profileCreated = true;

	            System.out.println("Profile for " + username + " has been successfully created.");
	        } else {
	            System.out.println("Profile for " + username + " already exists.");
	        }
	    }

	    // Submit dietary preferences form
	    public void submitDietaryPreferencesForm(String username, List<String> preferences) {
	        if (profiles.containsKey(username)) {
	            dietaryPreferences.put(username, preferences);
	            System.out.println("Dietary preferences for " + username + " have been submitted: " + preferences);
	        } else {
	            System.out.println("Profile not found for " + username + ". Please create a profile first.");
	        }
	    }

	    // Check if the profile has been successfully created
	    public boolean isProfileCreated(String username) {
	        // Return whether the profile for the username exists in the profiles map
	        return profiles.containsKey(username);
	    }

	    // Get the profile creation confirmation (confirmation message or profile details)
	    public Object getProfileCreationConfirmation(String username) {
	        if (profiles.containsKey(username)) {
	            // Return profile data as confirmation
	            return profiles.get(username);
	        } else {
	            return "Profile for " + username + " not found.";
	        }
	    }

	    private Map<String, Map<String, Object>> profiles1 = new HashMap<>();
	    private Map<String, List<String>> dietaryPreferences11 = new HashMap<>();

	    // Flags to check if profile and dietary preferences are updated
	    private boolean profileUpdated = false;
	    private boolean dietaryPreferencesUpdated = false;

	    // Submit the profile creation form
	    public void submitProfileCreationForm1(String username, String name, int age, String fitnessGoals) {
	        if (!profiles.containsKey(username)) {
	            Map<String, Object> profileData = new HashMap<>();
	            profileData.put("name", name);
	            profileData.put("age", age);
	            profileData.put("fitnessGoals", fitnessGoals);

	            // Add the profile to the profiles map
	            profiles.put(username, profileData);

	            System.out.println("Profile for " + username + " has been successfully created.");
	        } else {
	            System.out.println("Profile for " + username + " already exists.");
	        }
	    }

	    // Submit dietary preferences form
	    public void submitDietaryPreferencesForm1(String username, List<String> preferences) {
	        if (profiles.containsKey(username)) {
	            dietaryPreferences.put(username, preferences);
	            dietaryPreferencesUpdated = true;
	            System.out.println("Dietary preferences for " + username + " have been submitted: " + preferences);
	        } else {
	            System.out.println("Profile not found for " + username + ". Please create a profile first.");
	        }
	    }

	    // Check if dietary preferences are updated
	    public boolean isDietaryPreferencesUpdated() {
	        return dietaryPreferencesUpdated;
	    }

	    // Get dietary update confirmation
	    public Object getDietaryUpdateConfirmation() {
	        if (dietaryPreferencesUpdated) {
	            return "Dietary preferences have been successfully updated.";
	        } else {
	            return "No dietary preferences have been updated.";
	        }
	    }

	    // Update profile details
	    public void updateProfile(String username, String newName, int newAge, String newFitnessGoals) {
	        if (profiles.containsKey(username)) {
	            Map<String, Object> profile = profiles.get(username);
	            profile.put("name", newName);
	            profile.put("age", newAge);
	            profile.put("fitnessGoals", newFitnessGoals);

	            profileUpdated = true;
	            System.out.println("Profile for " + username + " has been successfully updated.");
	        } else {
	            System.out.println("Profile not found for " + username + ".");
	        }
	    }

	    // Check if the profile is updated
	    public boolean isProfileUpdated() {
	        return profileUpdated;
	    }

	    // Get profile update confirmation
	    public Object getProfileUpdateConfirmation() {
	        if (profileUpdated) {
	            return "Profile has been successfully updated.";
	        } else {
	            return "No profile updates have been made.";
	        }
	    }

	    private Map<String, ClientProfile> clientProfiles = new HashMap<>();
	    
	    // Store the last error message
	    private String errorMessage = "";

	    // Class to hold client profile data
	    class ClientProfile {
	        int age;
	        String fitnessGoals;

	        ClientProfile(int age, String fitnessGoals) {
	            this.age = age;
	            this.fitnessGoals = fitnessGoals;
	        }

	        // Update client details
	        public void updateDetails(int age, String fitnessGoals) {
	            this.age = age;
	            this.fitnessGoals = fitnessGoals;
	        }
	    }

	    // Create a new profile for a client
	    public void createProfile(String clientName, int age, String fitnessGoals) {
	        if (!clientProfiles.containsKey(clientName)) {
	            ClientProfile newProfile = new ClientProfile(age, fitnessGoals);
	            clientProfiles.put(clientName, newProfile);
	            System.out.println("Profile for " + clientName + " has been successfully created.");
	        } else {
	            errorMessage = "Profile for " + clientName + " already exists.";
	            System.out.println(errorMessage);
	        }
	    }

	    // Update client details like age and fitness goals
	    public void updateClientDetails(String clientName, int age, String fitnessGoals) {
	        if (clientProfiles.containsKey(clientName)) {
	            ClientProfile profile = clientProfiles.get(clientName);
	            profile.updateDetails(age, fitnessGoals);
	            System.out.println("Profile for " + clientName + " has been successfully updated.");
	        } else {
	            errorMessage = "Profile for " + clientName + " not found.";
	            System.out.println(errorMessage);
	        }
	    }

	    // Submit profile update confirmation
	    public void submitProfileUpdate(String clientName) {
	        if (clientProfiles.containsKey(clientName)) {
	            System.out.println("Profile update for " + clientName + " has been submitted successfully.");
	        } else {
	            errorMessage = "Profile for " + clientName + " does not exist.";
	            System.out.println(errorMessage);
	        }
	    }

	    // Get the latest error message
	    public Object getErrorMessage() {
	        return errorMessage.isEmpty() ? "No error occurred." : errorMessage;
	    }

	 // Store ratings and reviews
	    private Map<String, List<Review>> userFeedbackMap = new HashMap<>();
	    
	    // Store improvement suggestions
	    private List<String> improvementSuggestions = new ArrayList<>();

	    // Nested class to represent a review
	    static class Review {
	        int rating;
	        String review;

	        Review(int rating, String review) {
	            this.rating = rating;
	            this.review = review;
	        }

	        @Override
	        public String toString() {
	            return "Rating: " + rating + ", Review: " + review;
	        }
	    }

	    // Method to submit a rating
	    public int submitRating(int rating) {
	        if (rating < 1 || rating > 5) {
	            System.out.println("Invalid rating. Please submit a rating between 1 and 5.");
	            return -1;  // Invalid rating
	        }

	        // Assume we submit the rating here (e.g., for a specific user)
	        System.out.println("Rating submitted: " + rating);
	        return rating;  // Return the rating that was submitted
	    }

	    // Method to submit a review
	    public String submitReview(String reviewText) {
	        if (reviewText == null || reviewText.isEmpty()) {
	            System.out.println("Review cannot be empty.");
	            return null;
	        }

	        // Assume a default username (can be extended to use actual user data)
	        String username = "User1"; 
	        Review review = new Review(5, reviewText);  // Assume a 5-star rating for simplicity
	        userFeedbackMap.computeIfAbsent(username, k -> new ArrayList<>()).add(review);

	        System.out.println("Review submitted: " + reviewText);
	        return reviewText;  // Return the review text that was submitted
	    }

	    // Method to check if review is visible
	    public boolean isReviewVisible(int rating, String reviewText) {
	        // For example, make reviews visible if they have a rating of 4 or higher
	        if (rating >= 4) {
	            System.out.println("Review is visible: " + reviewText);
	            return true;
	        } else {
	            System.out.println("Review is not visible as rating is less than 4.");
	            return false;
	        }
	    }

	    // Method to submit an improvement suggestion
	    public String submitImprovementSuggestion(String suggestion) {
	        if (suggestion == null || suggestion.isEmpty()) {
	            System.out.println("Improvement suggestion cannot be empty.");
	            return null;
	        }

	        improvementSuggestions.add(suggestion);
	        System.out.println("Improvement suggestion submitted: " + suggestion);
	        return suggestion;
	    }

	    // Method to view all improvement suggestions
	    public void viewImprovementSuggestions() {
	        if (improvementSuggestions.isEmpty()) {
	            System.out.println("No improvement suggestions yet.");
	        } else {
	            System.out.println("Improvement Suggestions:");
	            for (String suggestion : improvementSuggestions) {
	                System.out.println("- " + suggestion);
	            }
	        }
	    }

	    // Method to view all reviews
	    public void viewAllReviews() {
	        if (userFeedbackMap.isEmpty()) {
	            System.out.println("No reviews submitted yet.");
	        } else {
	            System.out.println("All Reviews:");
	            userFeedbackMap.forEach((user, reviews) -> {
	                System.out.println("Reviews for " + user + ":");
	                for (Review review : reviews) {
	                    System.out.println(review);
	                }
	            });
	        }
	    }


	    // Store improvement suggestions
	    private List<String> improvementSuggestions1 = new ArrayList<>();
	    private List<String> notifiedInstructors = new ArrayList<>();

	    // Store programs with difficulty levels
	    private Map<String, String> availablePrograms1 = new HashMap<>();

	    // Store users' browsing activity
	    private List<String> userBrowsingHistory = new ArrayList<>();

	    // Simulate instructor notification system
	    public boolean isInstructorNotifiedOfSuggestion(String improvementSuggestion) {
	        // Check if the instructor has been notified about this suggestion
	        if (notifiedInstructors.contains(improvementSuggestion)) {
	            System.out.println("Instructor has been notified of the suggestion: " + improvementSuggestion);
	            return true;
	        } else {
	            System.out.println("Instructor has not been notified about this suggestion.");
	            return false;
	        }
	    }

	    // Check if the suggestion has been recorded
	    public boolean isSuggestionRecorded(String improvementSuggestion) {
	        if (improvementSuggestions.contains(improvementSuggestion)) {
	            System.out.println("The suggestion has been recorded: " + improvementSuggestion);
	            return true;
	        } else {
	            System.out.println("The suggestion has not been recorded.");
	            return false;
	        }
	    }

	    // Simulate navigating to the program browsing page
	    public void navigateToProgramBrowsingPage() {
	        System.out.println("Navigating to Program Browsing Page...");
	        // Add a dummy browsing history
	        userBrowsingHistory.add("User navigated to Program Browsing Page");
	    }

	    // Filter programs by difficulty level
	    public void filterProgramsByDifficultyLevel(String difficultyLevel) {
	        System.out.println("Filtering programs by difficulty level: " + difficultyLevel);

	        // Filter programs based on the difficulty level
	        List<String> filteredPrograms = new ArrayList<>();
	        for (Map.Entry<String, String> entry : ((Map<String, String>) availablePrograms12).entrySet()) {
	            if (entry.getValue().equalsIgnoreCase(difficultyLevel)) {
	                filteredPrograms.add(entry.getKey());
	            }
	        }

	        if (filteredPrograms.isEmpty()) {
	            System.out.println("No programs found with the difficulty level: " + difficultyLevel);
	        } else {
	            System.out.println("Programs with difficulty level '" + difficultyLevel + "':");
	            for (String program : filteredPrograms) {
	                System.out.println("- " + program);
	            }
	        }
	    }

	    // Method to simulate adding a suggestion
	    public void submitImprovementSuggestion1(String suggestion) {
	        if (suggestion == null || suggestion.isEmpty()) {
	            System.out.println("Improvement suggestion cannot be empty.");
	            return;
	        }
	        improvementSuggestions.add(suggestion);
	        System.out.println("Improvement suggestion submitted: " + suggestion);
	    }

	    // Method to simulate notifying instructors about suggestions
	    public void  enrollInProgram (String suggestion) {
	        if (!improvementSuggestions.contains(suggestion)) {
	            System.out.println("Suggestion not found in the system.");
	            return;
	        }
	        notifiedInstructors.add(suggestion);
	        System.out.println("Instructor notified about suggestion: " + suggestion);
	    }

	    // Method to simulate adding programs
	    public void addProgram(String programName, String difficultyLevel) {
	        ((Map<String, String>) availablePrograms12).put(programName, difficultyLevel);
	        System.out.println("Program added: " + programName + " with difficulty " + difficultyLevel);
	    }

	    private Map<String, Program> availablePrograms = new HashMap<>();
	    
	    // A set to store programs in which the user is enrolled
	    private Map<String, Program> enrolledPrograms = new HashMap<>();

	    // A list to store the schedules for the programs
	    private Map<String, String> programSchedules = new HashMap<>();
	    
	    // Program class to represent a fitness program
	    class Program1 {
	        String name;
	        String focusArea;
	        String difficultyLevel;

	        public Program1(String name, String focusArea, String difficultyLevel) {
	            this.name = name;
	            this.focusArea = focusArea;
	            this.difficultyLevel = difficultyLevel;
	        }
	    }

	    // Add a program to the system
	    public void addProgram(String name, String focusArea, String difficultyLevel, String schedule) {
	        String program = new String();
	        ((Map<String, String>) availablePrograms12).put(name, program);
	        programSchedules.put(name, schedule);
	        System.out.println("Program added: " + name);
	    }

	    private Map<String, Program> availablePrograms3 = new HashMap<>();

	    // Program class to represent a fitness program
	    static class Program3 {
	        String name;
	        String focusArea;
	        String difficultyLevel;

	        public Program3(String name, String focusArea, String difficultyLevel) {
	            this.name = name;
	            this.focusArea = focusArea;
	            this.difficultyLevel = difficultyLevel;
	        }
	    }

	    // Add a program to the system
	    public void addProgram(String name, String focusArea, String difficultyLevel) {
	        Program program = new Program(name, focusArea, difficultyLevel);
	        availablePrograms.put(name, program);
	    }

	    // Filter programs based on the focus area (Strength, Cardio, etc.)
	    public void filterProgramsByFocusArea(String focusArea) {
	        List<String> filteredPrograms = new ArrayList<>();
	        // Loop through the available programs and check the focus area
	        for (Program program : availablePrograms.values()) {
	            if (((String) program.focusArea).equalsIgnoreCase(focusArea)) {
	                filteredPrograms.add(program.name);
	            }
	        }

	        if (filteredPrograms.isEmpty()) {
	            System.out.println("No programs found for the focus area: " + focusArea);
	        } else {
	            System.out.println("Programs for focus area '" + focusArea + "':");
	            for (String programName : filteredPrograms) {
	                System.out.println("- " + programName);
	            }
	        }
	    }

	    // Check if any programs match the filters (focus area and difficulty level)
	    public boolean programsMatchFilters(String focusArea, String difficultyLevel) {
	        // Loop through the available programs and check both the focus area and difficulty level
	        for (Program program : availablePrograms.values()) {
	            if (((String) program.focusArea).equalsIgnoreCase(focusArea) && ((String) program.difficultyLevel).equalsIgnoreCase(difficultyLevel)) {
	                System.out.println("Found program matching both filters: " + program.name);
	                return true;
	            }
	        }
	        System.out.println("No programs found matching both filters.");
	        return false;
	    }

	    // Enroll the user in a selected program
	    public void enrollInProgram(Entry selectedProgram) {
	        if (availablePrograms12.contains(selectedProgram)) {
	            Set<Entry<String, String>> enrolledPrograms = null;
				enrolledPrograms.add(selectedProgram);
	            System.out.println("You have been enrolled in: " + selectedProgram);
	        } else {
	            System.out.println("Program not found: " + selectedProgram);
	        }
	    }

	    // Check if the user is enrolled in the selected program
	    public boolean isUserEnrolled(Entry selectedProgram) {
	        String enrolledPrograms = null;
			if (enrolledPrograms.contains((CharSequence) selectedProgram)) {
	            System.out.println("You are already enrolled in: " + selectedProgram);
	            return true;
	        } else {
	            System.out.println("You are not enrolled in: " + selectedProgram);
	            return false;
	        }
	    }

	    // Verify if the program details show the user as enrolled
	    public boolean programDetailsShowEnrolled(CharSequence selectedProgram) {
	        String enrolledPrograms = null;
			if (enrolledPrograms.contains(selectedProgram)) {
	            System.out.println("Program details show you are enrolled in: " + selectedProgram);
	            return true;
	        } else {
	            System.out.println("Program details do not show enrollment for: " + selectedProgram);
	            return false;
	        }
	    }

	    // View the schedule of a selected program
	    public String viewProgramSchedule(String selectedProgram) {
	        if (programSchedules.containsKey(selectedProgram)) {
	            return programSchedules.get(selectedProgram);
	        } else {
	            System.out.println("Program schedule not found for: " + selectedProgram);
	            return null;
	        }
	    }

	    // Check if the provided program schedule is valid (basic check, e.g., no null or empty schedules)
	    public boolean isScheduleValid(String programSchedule) {
	        if (programSchedule != null && !programSchedule.trim().isEmpty()) {
	            System.out.println("The schedule is valid.");
	            return true;
	        } else {
	            System.out.println("The schedule is invalid.");
	            return false;
	        }
	    }

	    // Verify if the "No Programs Found" message is displayed when no programs match the filter
	    public boolean noProgramsFoundMessageDisplayed() {
	        return availablePrograms12.isEmpty();
	    }

		
		//zainab
	}
