package com.islamahmad.data;

public enum Billable {
    LOCAL_SMS,
    LOCAL_CALLS,
    LOCAL_INTERNET,
    INTERNATIONAL_SMS,
    INTERNATIONAL_CALLS,
    ROAMING_INTERNET,
    ROAMING_LOCAL_SMS,
    ROAMING_LOCAL_CALLS,
    ROAMING_INTERNATIONAL_SMS,
    ROAMING_INTERNATIONAL_CALLS;
    public static Billable equivalent(String billable){
        if(billable.equals("LOCAL_SMS")) return Billable.LOCAL_SMS;
        else if(billable.equals("LOCAL_CALLS")) return Billable.LOCAL_CALLS;
        else if(billable.equals("LOCAL_INTERNET")) return Billable.LOCAL_INTERNET;
        else if(billable.equals("ROAMING_LOCAL_CALLS")) return Billable.ROAMING_LOCAL_CALLS;
        else if(billable.equals("ROAMING_LOCAL_SMS")) return Billable.ROAMING_LOCAL_SMS;
        else if(billable.equals("INTERNATIONAL_CALLS")) return Billable.INTERNATIONAL_CALLS;
        else if(billable.equals("INTERNATIONAL_SMS")) return Billable.INTERNATIONAL_SMS;
        else if(billable.equals("ROAMING_INTERNATIONAL_CALLS")) return Billable.ROAMING_INTERNATIONAL_CALLS;
        else if(billable.equals("ROAMING_INTERNATIONAL_SMS")) return Billable.ROAMING_INTERNATIONAL_SMS;
        else if(billable.equals("OAMING_INTERNET")) return Billable.ROAMING_INTERNET;
        else return null;
    }
}
