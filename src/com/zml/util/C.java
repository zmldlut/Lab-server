package com.zml.util;

public class C {
	//����ԤԼϵͳ
	public static final class code {
        public static final int login   = 1000;
        public static final int device_list         = 1001;
        public static final int order_list          = 1002;
        public static final int report              = 1003;
        public static final int password            = 1004;
        public static final int order            	= 1005;
        
        public static final int logout  = 1001;
        public static final int notice  = 1002;
        public static final int error   = 1003;
    }
	
	/*������ͨ��*/
	
	//������
	public static final class packet {
		//���ݰ�����
		public static final int DOOROPENPACKETTYPE 		= 1003;
		public static final int CURTIONPACKETTYPE		= 1005;
		public static final int LAMPPACKETTYPE			= 1006;

		//json�����е�key
		public static final String SYN = "syn";
		public static final String PACKETTYPE = "packetType";
		public static final String CMD = "command";
		public static final String USERID = "userID";
		public static final String ACK = "ack";
	}
	
	//����
	public static final class cmd {
		public static final int open_door 			= 1000;
		public static final int open_curtain		= 1001;
		public static final int close_curtain		= 1002;
		public static final int open_lamp			= 1003;
		public static final int close_lamp			= 1004;
	}
}
