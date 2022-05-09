package Task_32_33_34.card;

public class BankCard extends DataCard implements MagneticStripe,  Chip {
    public final String bankName;
    public final Integer code;
    public final String date;
    public final String appellation;

    public BankCard(String data, String bankName, Integer code, String date, String appellation) {
        super(data);
        this.bankName = bankName;
        this.code = code;
        this.date = date;
        this.appellation = appellation;
    }

    @Override
    public String getDataChip() {
        return readData();
    }

    @Override
    public String getDataStripe() {
        return readData();
    }
}


