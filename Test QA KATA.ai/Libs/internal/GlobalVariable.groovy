package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object instanceUrl
     
    /**
     * <p></p>
     */
    public static Object DelayShort
     
    /**
     * <p></p>
     */
    public static Object DelayMedium
     
    /**
     * <p></p>
     */
    public static Object DelayLong
     
    /**
     * <p></p>
     */
    public static Object emailAddress
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object company
     
    /**
     * <p></p>
     */
    public static Object address
     
    /**
     * <p></p>
     */
    public static Object addressLine2
     
    /**
     * <p></p>
     */
    public static Object city
     
    /**
     * <p></p>
     */
    public static Object posCode
     
    /**
     * <p></p>
     */
    public static Object auditionalInfo
     
    /**
     * <p></p>
     */
    public static Object homePhone
     
    /**
     * <p></p>
     */
    public static Object phoneNumber
     
    /**
     * <p></p>
     */
    public static Object addressAlias
     
    /**
     * <p></p>
     */
    public static Object username
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            instanceUrl = selectedVariables['instanceUrl']
            DelayShort = selectedVariables['DelayShort']
            DelayMedium = selectedVariables['DelayMedium']
            DelayLong = selectedVariables['DelayLong']
            emailAddress = selectedVariables['emailAddress']
            password = selectedVariables['password']
            firstName = selectedVariables['firstName']
            lastName = selectedVariables['lastName']
            company = selectedVariables['company']
            address = selectedVariables['address']
            addressLine2 = selectedVariables['addressLine2']
            city = selectedVariables['city']
            posCode = selectedVariables['posCode']
            auditionalInfo = selectedVariables['auditionalInfo']
            homePhone = selectedVariables['homePhone']
            phoneNumber = selectedVariables['phoneNumber']
            addressAlias = selectedVariables['addressAlias']
            username = selectedVariables['username']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
