package com.xuzh.test;

public class DemoEnum {

    public enum MsgType {
        ASK(0), REPLY(1), SUGGESTION(2);

        private int val;

        private MsgType(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.valueOf(this.val);
        }
    }

    public static void main(String[] args) {

        int ask = MsgType.ASK.val;

        System.out.println("ASK = " + MsgType.ASK);
        System.out.println("REPLY = " + MsgType.REPLY);
        System.out.println("SUGGESTION = " + MsgType.SUGGESTION);
    }

}
