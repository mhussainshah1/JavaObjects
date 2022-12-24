public class ZooGiftShop2 {

    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() /*extends Object*/ {
            @Override
            public int dollarsOff() {
                return 3;
            }

            /**
             * By default, Every Anonymous class is extended by Object class. we
             * can't write extend with Anonymous class
             */
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
