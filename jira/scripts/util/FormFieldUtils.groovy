package util

import org.apache.log4j.Logger
import com.onresolve.jira.groovy.user.FormField

public class FormFieldUtils {
    public static void hideAndShowFields(boolean hidden, boolean required, List<FormField> fields) {
        if(hidden && required) {
            throw new RuntimeException("Trying to hide and make a field required")
        }
        for(FormField field : fields) {
            field.setHidden(hidden);
            field.setRequired(required);
            if(hidden){
                field.setFormValue(null);
            }
        }
    }
    public static void hideShowClearFields(boolean hidden, boolean required, boolean clear, List<FormField> fields) {
        if(hidden && required) {
            throw new RuntimeException("Trying to hide and make a field required")
        }
        for(FormField field : fields) {
            field.setHidden(hidden);
            field.setRequired(required);
            if(clear){
                field.setFormValue(null);
            }
        }
    }
    public static void setMessage(boolean expression,boolean error, FormField field, String message){
        if(error){
            field.setError(message)
        } else{
            field.setHelpText(message)
        }
    }
    public static void clearMessage(List<FormField> fields){
        for(FormField field : fields){
            field.clearError();
            field.clearHelpText()
        }
    }
}
