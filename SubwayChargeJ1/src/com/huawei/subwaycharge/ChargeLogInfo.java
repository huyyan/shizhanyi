package com.huawei.subwaycharge;

/**
 * <p>Title: �������Ը����Լ��������ڱ��������ӷ������������޸����з��������</p>
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
public class ChargeLogInfo {

    /*��ѯ�۷���־����������� �ṹ*/
    //<����><��վʱ��HH:MM><��վվ������><��վʱ��HH:MM><��վվ������><ʵ�ʿۿ���><�۷��Ƿ�ɹ�>
    private int cardNo; /* ����(��Χ: 0 ~ 9) */
    private int InHour; /* ��վʱ��:�ӵ�(��Χ: 0 ~ 23) */
    private int InMinute; /* ��վʱ��:����(��Χ: 0 ~ 59) */
    private String InStation; /* ��վվ������ */
    private int OutHour; /* ��վʱ��:�ӵ�(��Χ: 0 ~ 23) */
    private int OutMinute; /* ��վʱ��:����(��Χ: 0 ~ 59) */
    private String OutStation; /* ��վվ������ */
    private int ChargeCount; /* �ۿ�� */
    private boolean isCharged; /* �Ƿ�ɹ� */

    public ChargeLogInfo(int cardNo, int inHour, int inMinute,
                         String inStation, int outHour, int outMinute, String outStation,
                         int chargeCount, boolean isCharged) {

        this.cardNo = cardNo;
        this.InHour = inHour;
        this.InMinute = inMinute;
        this.InStation = inStation;
        this.OutHour = outHour;
        this.OutMinute = outMinute;
        this.OutStation = outStation;
        this.ChargeCount = chargeCount;
        this.isCharged = isCharged;
    }
    
    public ChargeLogInfo(ChargeCmdInfo ci, int ChargeCount, boolean isCharged) {
    	this.cardNo = ci.getCardNo();
    	this.InHour = ci.getInHour();
    	this.InMinute = ci.getInMinute();
    	this.InStation = ci.getInStation();
    	this.OutHour = ci.getOutHour();
    	this.OutMinute = ci.getOutMinute();
    	this.OutStation = ci.getOutStation();
    	this.ChargeCount = ChargeCount;
    	this.isCharged = isCharged;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getInHour() {
        return InHour;
    }

    public void setInHour(int inHour) {
        InHour = inHour;
    }

    public int getInMinute() {
        return InMinute;
    }

    public void setInMinute(int inMinute) {
        InMinute = inMinute;
    }

    public String getInStation() {
        return InStation;
    }

    public void setInStation(String inStation) {
        InStation = inStation;
    }

    public int getOutHour() {
        return OutHour;
    }

    public void setOutHour(int outHour) {
        OutHour = outHour;
    }

    public int getOutMinute() {
        return OutMinute;
    }

    public void setOutMinute(int outMinute) {
        OutMinute = outMinute;
    }

    public String getOutStation() {
        return OutStation;
    }

    public void setOutStation(String outStation) {
        OutStation = outStation;
    }

    public int getChargeCount() {
        return ChargeCount;
    }

    public void setChargeCount(int chargeCount) {
        ChargeCount = chargeCount;
    }

    public boolean isCharged() {
        return isCharged;
    }

    public void setCharged(boolean isCharged) {
        this.isCharged = isCharged;
    }
}
