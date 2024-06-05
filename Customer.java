class Customer {
    private String ContactID;
    private String Name;
    private String PhoneNumber;
    private String Company;
    private double Salary;
    private String BDay;

    Customer() {
    }

    Customer(String ContactID) {
        this.ContactID = ContactID;
    }

    Customer(String ContactID, String Name, String PhoneNumber, String Company, String BDay, double Salary) {
        this.BDay = BDay;
        this.Company = Company;
        this.ContactID = ContactID;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
    }

    public void setContactID(String ContactID) {
        this.ContactID = ContactID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setBDay(String BDay) {
        this.BDay = BDay;
    }

    public String getContactID() {
        return ContactID;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getCompany() {
        return Company;
    }

    public double getSalary() {
        return Salary;
    }

    public String getBDay() {
        return BDay;
    }

}

class customerList {
    Node start;
  
    public String createContactID() {
        String ContactID = "";
        int temp = EmployeeList.size();
        ContactID = "C00" + (temp + 1);
        if (temp <= 8) {
            ContactID = "C00" + 00 + (temp + 1);
        }
        if (temp >= 99) {
            ContactID = "C0" + (temp + 1);
        }
        return ContactID;
    }
     // ----------------------------object Add method-------------------------------
    public void add(Customer Customer) {
        Node n1 = new Node(Customer);
        if (start == null) {
            start = n1;
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }
       // ----------------------------check index validate method-------------------------------
    private boolean isValidIndex(int index) {
        return index >= 0 && index <= size();
    }

       // ----------------------------get Customer Objcet method-------------------------------
    public Customer get(int index) {
        if (isValidIndex(index)) {
            if (index == 0) {
                return start.customer;
            } else {
                Node temp = start;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp.customer;
            }
        }
        return null;
    }

    // ----------------------------get Index method------------------------------   
    public int searchByNameOrPhoneNumber(String nameOrPhone) {
        Node temp = start;
        int index = 0;
        while (temp != null) {
            if (temp.customer.getName().equals(nameOrPhone) || temp.customer.getPhoneNumber().equals(nameOrPhone)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // ----------------------------size method-------------------------------
    public int size() {
        Node temp = start;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // ----------------------------Update Element-------------------------------

    public void updateSalary(int index, double newSalary) {
        get(index).setSalary(newSalary);
    }

    public void updateCompanyName(int index, String newCompanyName) {
        get(index).setCompany(newCompanyName);
    }

    public void updatePhoneNumber(int index, String newPhoneNumber) {
        get(index).setPhoneNumber(newPhoneNumber);
    }

    public void updateName(int index, String newName) {
        get(index).setName(newName);
    }
   

    // ----------------------------Remove Element-------------------------------
    public void removeElement(int index) {
        if (isValidIndex(index)) {
            if (index == 0) {
                start = start.next;
            } else {
                Node temp = start;
                int count = 0;
                while (count < index - 1) {
                    temp = temp.next;
                    count++;
                }
                temp.next = temp.next.next;
            }
        }
    }

    // ----------------------------Sorting section(name)-------------------------------
    public void Sort2() {
        Node temp = start;
        Node index = null;
        if (start == null) {
            return;
        } else {
            while (temp != null) {
                index = temp.next;
                while (index != null) {
                    if (temp.customer.getName().compareTo(index.customer.getName()) > 0) {
                        Customer RE = temp.customer;
                        temp.customer = index.customer;
                        index.customer = RE;
                    }
                    index = index.next;
                }
                temp = temp.next;
            }
        }

        for (int i = 0; i < size(); i++) {
            System.out.printf(
                    "|     %-5s      |   %-10s   |       %-10s           |      %-10s     |     %10.2f      |     %-10s   |\n",
                    get(i).getContactID(), get(i).getName(), get(i).getPhoneNumber(), get(i).getCompany(),
                    get(i).getSalary(), get(i).getBDay());
        }
    }

    // ----------------------------Sorting section(Salary)-------------------------------
    public void Sort1() {
        Node temp = start;
        Node index = null;
        if (start == null) {
            return;
        } else {
            while (temp != null) {
                index = temp.next;
                while (index != null) {
                    if (temp.customer.getSalary() > index.customer.getSalary()) {
                        Customer RE = temp.customer;
                        temp.customer = index.customer;
                        index.customer = RE;
                    }
                    index = index.next;
                }
                temp = temp.next;
            }
        }
        for (int i = 0; i < size(); i++) {
            System.out.printf(
                    "|     %-5s      |   %-10s   |       %-10s           |      %-10s     |     %10.2f      |     %-10s   |\n",
                    get(i).getContactID(), get(i).getName(), get(i).getPhoneNumber(), get(i).getCompany(),
                    get(i).getSalary(), get(i).getBDay());
        }
    }
     // ----------------------------Sorting section(Birth Day)-------------------------------
    public void sortingByBirthday() {
        Node temp = start;
        Node index = null;
        if (start == null) {
            return;
        }
        while (temp != null) {
            index = temp.next;
            while (index != null) {
                if (temp.customer.getBDay().compareTo(index.customer.getBDay()) > 0) {
                    Customer RE = temp.customer;
                    temp.customer = index.customer;
                    index.customer = RE;
                }
                index = index.next;
            }
            temp = temp.next;
        }

        for (int i = 0; i < size(); i++) {

            System.out.printf(
                    "|     %-5s      |   %-10s   |       %-10s           |      %-10s     |     %10.2f      |     %-10s   |\n",
                    get(i).getContactID(), get(i).getName(), get(i).getPhoneNumber(), get(i).getCompany(),
                    get(i).getSalary(), get(i).getBDay());
        }

    }

    // ==================Node Class=========================
    class Node {
        Customer customer;
        Node next;

        public Node getNext() {
            return next;
        }

        Node(Customer Customer) {
            this.customer = Customer;
        }
    }
    

}
