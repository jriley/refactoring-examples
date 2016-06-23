package com.jriley;

public class AsynchronyEmployee {

    private boolean overTime;

    private Role role;

    enum Role {
        DEV, QA, ADMIN, PO
    }

    public AsynchronyEmployee(Role role, boolean overtime) {
        this.role = role;
        this.overTime = overtime;
    }

    private int getBase() {
        if (role.ordinal() == 1) {
            return 35;
        }
        return 40;
    }

    private int getMeetings() {
        if (role.ordinal() == 3)
            return 40;
        return 30;
    }

    public int getHours() {
        switch (role) {
            case DEV:
                return getBase();
            case QA:
                return getBase() + 10;
            case ADMIN:
                return overTime ? 65 : getBase();
            case PO:
                return getBase() * getMeetings();
            default:
                return 0;
        }
    }
}
