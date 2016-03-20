package com.huawei.subwaycharge;

//import com.huawei.exam.ReturnCodeEnum;
//import com.huawei.exam.ReturnCodeRst;

/**
 * <p>Title: ���๩�������ã����������</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public abstract class OpResult {

    /**
     * ����������󣬸��ͻ��˷��ؼ򵥽����Ϣ
     *
     *
     * @param errCode ReturnCodeEnum��������ö��
     *
     * @return OpResult�����ؽ������
     */
    public static OpResult createOpResult(ReturnCodeEnum errCode) {
        return new ReturnCodeRst(errCode);
    }

    /**
     * ����������󣬸��ͻ��˷��ؼ򵥽����Ϣ����������۷��������ʱ����
     *
     *
     * @param errCode ReturnCodeEnum��������ö��
     * @param cardNo int������
     * @param moneyLeft int�����
     *
     * @return OpResult�����ؽ������
     */
    public static OpResult createOpResult(ReturnCodeEnum returnCode, int cardNo, int moneyLeft) {
        return new ReturnCodeRst(returnCode, cardNo, moneyLeft);
    }

    /**
     * ����������󣬸��ͻ��˷��ؼ򵥽����Ϣ����ѯ�۷���־�������
     *
     *
     * @param errCode ReturnCodeEnum��������ö��
     * @param logs ChargeLogInfo[]���۷���־��Ϣ
     *
     * @return OpResult�����ؽ������
     */
    public static OpResult createOpResult(ReturnCodeEnum returnCode, ChargeLogInfo[] logs) {
        return new ReturnCodeRst(returnCode, logs);
    }
    
    /**
     * ����������󣬸��ͻ��˷��ؼ򵥽����Ϣ����ѯ�۷���־�������
     *
     *
     * @param errCode ReturnCodeEnum��������ö��
     * @param logs ChargeLogInfo[]���۷���־��Ϣ
     *
     * @return OpResult�����ؽ������
     */
    public static OpResult createOpResult(ReturnCodeEnum returnCode, ChargeLogInfo[] logs,CardTypeEnum cate) {
        return new ReturnCodeRst(returnCode, logs,cate);
    } 
    

    public abstract String toString();
}
