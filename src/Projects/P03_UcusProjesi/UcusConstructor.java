package Projects.P03_UcusProjesi;

public class UcusConstructor {
    double bKmFiyat=0.1*500;
    double cKmFiyat=0.1*700;
    double dKmFiyat=0.1*900;
    int age;
    double price;
    int tickets;

    UcusConstructor(String rota ,int Yas, int tekYonCiftyon) {
        this.age = Yas;
        this.tickets = tekYonCiftyon;
        if (rota.equals("B")) {
            tekBiletB(bKmFiyat, age, price, tickets);
            ciftBiletB(bKmFiyat, age, price, tickets);
        } else if (rota.equals("C")) {
            tekBiletC(cKmFiyat, age, price, tickets);
            ciftBiletC(cKmFiyat, age, price, tickets);
        }else if (rota.equals("D")) {
            tekBiletD(dKmFiyat, age, price, tickets);
            ciftBiletD(dKmFiyat, age, price, tickets);
        }
        System.out.println("Bizi tercih ettiginiz icin tesekkür ederiz");
    }

    public static void tercihBSehri(double bKmFiyat, String rota, int age, double price,int tickets) {
        if (rota.equals("B")) {
            tekBiletB(bKmFiyat,age,price,tickets);
            ciftBiletB(bKmFiyat,age,price,tickets);

        }
    }
    public static void ciftBiletB(double bKmFiyat,int age, double price, int tickets) {
        if (tickets == 2) {
            ciftBiletyasKontrolBSehri(age,price,bKmFiyat);
        }
    }
    public static void tekBiletB(double bKmFiyat, int age, double price, int tickets) {
        if (tickets == 1) {
            tekBiletyasKontrolBSehri(age,price,bKmFiyat);
        }
    }
    public static void ciftBiletyasKontrolBSehri(int age, double price, double bKmFiyat) {
        if (age < 12) {
            System.out.println("12 yasindan kucuklere %50 indirimimiz mevcuttur");
            price += (bKmFiyat * 0.5 * 0.8);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 12 && age < 24) {
            System.out.println("12-24 yas araligina da %10 indirimimiz mevcuttur");
            price += (bKmFiyat * 0.9 * 0.8);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 65) {
            System.out.println("65 yas ustune de %30 indirimimiz mevcuttur");
            price += (bKmFiyat* 0.7 * 0.8);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 24 && age < 65) {
            System.out.println("24-65 yas araligina herhangi bir indirim uygulayamıyoruz");
            price += (bKmFiyat * 0.8);
            System.out.println("Bilet tutariniz : " + price + " $");
        }
    }
    public static void tekBiletyasKontrolBSehri(int age,double price,double bKmFiyat) {
        if (age < 12) {
            System.out.println("12 yasindan kucuklere %50 indirimimiz mevcuttur");
            price += (bKmFiyat * 0.5);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 12 && age < 24) {
            System.out.println("12-24 yas araligina da %10 indirimimiz mevcuttur");
            price += (bKmFiyat * 0.9);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 65) {
            System.out.println("65 yas ustune de %30 indirimimiz mevcuttur");
            price += (bKmFiyat * 0.7);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 24 && age < 65) {
            System.out.println("24-65 yas araligina herhangi bir indirim uygulayamıyoruz");
            price += (bKmFiyat);
            System.out.println("Bilet tutariniz : " + price + " $");
        }
    }

    public static void tercihCSehri(double cKmFiyat, String rota, int age, double price,int tickets) {
        if (rota.equals("C")) {
            tekBiletC(cKmFiyat,age,price,tickets);
            ciftBiletC(cKmFiyat,age,price,tickets);

        }
    }
    public static void ciftBiletC(double cKmFiyat,int age, double price, int tickets) {
        if (tickets == 2) {
            ciftBiletyasKontrolCSehri(age,price,cKmFiyat);
        }
    }
    public static void tekBiletC(double cKmFiyat, int age, double price, int tickets) {
        if (tickets == 1) {
            tekBiletyasKontrolCSehri(age,price,cKmFiyat);
        }
    }
    public static void ciftBiletyasKontrolCSehri(int age, double price, double cKmFiyat) {
        if (age < 12) {
            System.out.println("12 yasindan kucuklere %50 indirimimiz mevcuttur");
            price += (cKmFiyat * 0.5 * 0.8);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 12 && age < 24) {
            System.out.println("12-24 yas araligina da %10 indirimimiz mevcuttur");
            price += (cKmFiyat * 0.9 * 0.8);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 65) {
            System.out.println("65 yas ustune de %30 indirimimiz mevcuttur");
            price += (cKmFiyat* 0.7 * 0.8);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 24 && age < 65) {
            System.out.println("24-65 yas araligina herhangi bir indirim uygulayamıyoruz");
            price += (cKmFiyat * 0.8);
            System.out.println("Bilet tutariniz : " + price + " $");
        }
    }
    public static void tekBiletyasKontrolCSehri(int age,double price,double cKmFiyat) {
        if (age < 12) {
            System.out.println("12 yasindan kucuklere %50 indirimimiz mevcuttur");
            price += (cKmFiyat * 0.5);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 12 && age < 24) {
            System.out.println("12-24 yas araligina da %10 indirimimiz mevcuttur");
            price += (cKmFiyat * 0.9);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 65) {
            System.out.println("65 yas ustune de %30 indirimimiz mevcuttur");
            price += (cKmFiyat * 0.7);
            System.out.println("Bilet tutariniz : " + price + " $");
        } else if (age > 24 && age < 65) {
            System.out.println("24-65 yas araligina herhangi bir indirim uygulayamıyoruz");
            price += (cKmFiyat);
            System.out.println("Bilet tutariniz : " + price + " $");
        }
    }

    public static void tercihDSehri(double dKmFiyat, String rota, int age, double price, int tickets) {
        if (rota.equals("D")) {
            tekBiletD(dKmFiyat,age,price,tickets);
            ciftBiletD(dKmFiyat,age,price,tickets);
        }
    }
    public static void ciftBiletD(double dKmFiyat,int age, double price, int tickets) {
        yasKontrolDSehriCiftBilet(dKmFiyat,age,price,tickets);
    }
    public static void yasKontrolDSehriCiftBilet(double dKmFiyat,int age, double price, int tickets) {
        if (tickets == 2) {

            if (age < 12) {
                System.out.println("12 yasindan kucuklere %50 indirimimiz mevcuttur");
                price += (dKmFiyat * 0.5);
                System.out.println("Bilet tutariniz : " + price + " $");
            } else if (age > 12 && age < 24) {
                System.out.println("12-24 yas araligina da %10 indirimimiz mevcuttur");
                price += (dKmFiyat * 0.9);
                System.out.println("Bilet tutariniz : " + price + " $");
            } else if (age > 65) {
                System.out.println("65 yas ustune de %30 indirimimiz mevcuttur");
                price += (dKmFiyat * 0.7);
                System.out.println("Bilet tutariniz : " + price + " $");
            } else if (age > 24 && age < 65) {
                System.out.println("24-65 yas araligina herhangi bir indirim uygulayamıyoruz");
                price += (dKmFiyat);
                System.out.println("Bilet tutariniz : " + price + " $");
            }
        }
    }
    public static void tekBiletD(double dKmFiyat,int age, double price, int tickets) {
        yasKontrolDSehriTekBilet(dKmFiyat,age,price,tickets);
    }
    public static void yasKontrolDSehriTekBilet(double dKmFiyat,int age, double price, int tickets) {
        if (tickets == 1) {
            if (age < 12) {
                System.out.println("12 yasindan kucuklere %50 indirimimiz mevcuttur");
                price += (dKmFiyat * 0.5 * 0.8);
                System.out.println("Bilet tutariniz : " + price + " $");
            } else if (age > 12 && age < 24) {
                System.out.println("12-24 yas araligina da %10 indirimimiz mevcuttur");
                price += (dKmFiyat * 0.9 * 0.8);
                System.out.println("Bilet tutariniz : " + price + " $");
            } else if (age > 65) {
                System.out.println("65 yas ustune de %30 indirimimiz mevcuttur");
                price += (dKmFiyat * 0.7 * 0.8);
                System.out.println("Bilet tutariniz : " + price + " $");
            } else if (age > 24 && age < 65) {
                System.out.println("24-65 yas araligina herhangi bir indirim uygulayamıyoruz");
                price += (dKmFiyat * 0.8);
                System.out.println("Bilet tutariniz : " + price + " $");
            }
        }
    }
}
