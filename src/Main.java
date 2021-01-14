public class Main {
    public static void main(String[] args) {
        int n = 2;
        CompanyRepo companyRepo = new CompanyRepo(n);


        char[] street = {'p', 'o', 'l', 'n', 'a'};
        Address address = new Address(street, 3, 2);


        char[] name = {'l', 'u', 'f', 't', 't','h', 'a', 'n', 's', 'a'};
        Company c1 = new Company(name, 1112223339, address);

        // dodaenie 1 firmy
        companyRepo.add(c1);


        char[] name2 = {'b', 'i', 'e', 'd', 'r', 'o', 'n', 'k', 'a'};
        Company c2 = new Company(name2, 1118887771, address);
        // dodanie 2 firmy
        companyRepo.add(c2);

        char[] name3 = {'d', 'e', 'l', 'l'};
        Address address2 = new Address(street, 12, 4);
        Company c3 = new Company(name3, 1113335557, address2);
        //dodanie 3 firmy

        companyRepo.add(c3);
        // wyświetlenie wszystkich firm
        companyRepo.displayAll();
    }
}
