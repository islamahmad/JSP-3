package com.islamahmad.data;

public enum Privilege {
        CREATE_USER,
        CREATE_PACKAGE,
        CREATE_TARIFF,
        CREATE_TARIFF_PLAN,
        VIEW;
        public static Privilege equivalent(String privilege) {
                if(privilege.equals("CREATE_USER")) return Privilege.CREATE_USER;
                else if(privilege.equals("CREATE_PACKAGE")) return Privilege.CREATE_PACKAGE;
                else if(privilege.equals("CREATE_TARIFF")) return Privilege.CREATE_TARIFF;
                else if(privilege.equals("CREATE_TARIFF_PLAN")) return Privilege.CREATE_TARIFF_PLAN;
                else if(privilege.equals("VIEW")) return Privilege.VIEW;
                else return null;
        }

//        public String toString() {
//                return "Privilege{}";
//        }
}