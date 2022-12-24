public class ZooGiftShop3 {

    public int pay() {
        return admission(5, new SaleTodayOnly() {
                    public static final int CONSTANT = 1;

                    @Override
                    public int dollarsOff() {
                        return 3;
                    }

                    @Override
                    public boolean equals(Object obj) {
                        return super.equals(obj);
                    }
                }
        );
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }

    interface SaleTodayOnly {
        int dollarsOff();
    }
}
