import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;


public class HumanResouces{
    public static void menu(){
        System.out.println("1. Hien thi danh sach nhân vien hien co trong cong ty ");
        System.out.println("2. Hien thi cac bo phan trong cong ty  ");
        System.out.println("3. Hien thi cac nhan vian theo tung bo phan  ");
        System.out.println("4. Them nhan vien moi vao cong ty  ");
        System.out.println("5. Tim kiem thong tin nhan vien theo ten hoac ma nhan vien ");
        System.out.println("6. Hien thi bang luong cua nhan vien toan cong ty ");
        System.out.println("7. Hien thi bang luong cua nhan vien theo thu tu tang dan ");
    }
    public static void main(String[] args) {
        double luongNV ;
          // tạo đối tượng Deparment
        Department phongBan = new Department(123, "IT", 0);
        Department phongBan2 = new Department(124, "BA", 0);
        Department phongBan3 = new Department(125, "Test", 0);

          // tạo danh sách bằng ArrayList và thêm đối tượng
        ArrayList<Staff> staffList = new ArrayList<>();

        // tạo List của phòng ban
        ArrayList<Department> depList = new ArrayList<>();
        depList.add(phongBan);
        depList.add(phongBan2);
        depList.add(phongBan3);
        // tạo menu đưa ra các lựa chọn
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            menu();
            System.out.print("Enter the your choose: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 0:
                    System.out.println("Bye bye ");
                    break;
                case 1:
                    //1. Hiển thị danh sách nhân viên hiện có trong công ty
                    System.out.println("You choose function 1 ");
                    // gọi hàm display để hiện thị thông tin từng nhân viên 11
                    displayListEmployee(staffList);
                    break;
                case 2:
                    //2. Hiển thị các bộ phận trong công ty
                    System.out.println("You choose function 2 ");
                    int cout = 0 ;
                    for (Department di : depList) {
                        for (Staff i : staffList) {
                            if (i.boPhan.equals(di.tenBoPhan)) {
                                cout++;
                            }
                            di.soLuongNhanVien = cout;
                        }
                        cout = 0;
                    }
                    // gọi hàm hiển thỉ danh sách bộ phận;
                    displayDeparment(depList);
                    break;
                case 3:
                    //3. Hiển thị các nhân viên theo từng bộ phận
                    System.out.println("You choose function 3 ");
                    for (Department depi : depList) {
                        System.out.println("Ten bo phan: " + depi.tenBoPhan );
                        for (Staff i : staffList) {
                            if (i.boPhan.equals(depi.tenBoPhan)) {
                                i.displayInformation();
                                System.out.println();
                            }
                        }
                        System.out.println();
                    }
                    break;  
                case 4:
                    //4. Thêm nhân viên mới vào công ty:
                    System.out.println("You choose function 4 ");
                    System.out.print("Add 1-Employee or 2-Manager: ");
                    Scanner sc1 = new Scanner(System.in);
                    String chon1 = sc1.next();
                    int chon = Integer.parseInt(chon1);
                    // tạo biến lưu giá trị thôn tin nhân viên 
                    System.out.println("Ma nhan vien: ");
                    int idOfStaff = sc1.nextInt();
                    System.out.println("Ten nhan vien: ");
                    String nameOfStaff = sc1.next();
                    System.out.println("Tuoi nhan vien: ");
                    int ageOfStaff = sc1.nextInt();
                    System.out.println("He so luong: ");
                    int heSoOfStaff = sc1.nextInt();
                    System.out.println("Ngay vao lam: ");
                    int dateOfStaff = sc1.nextInt();
                    System.out.println("Bo Phan <1-IT;2-BA;3-Text>");
                    String depOfStaff = sc1.next();
                    System.out.println("So ngay nghi phep: ");
                    int nghiOfStaff = sc1.nextInt();
                    switch (chon) {
                        case 1:
                            // tạo biến so gio lam them cua rieng nhan vien
                            System.out.println("So gio lam them: ");
                            int lamOfStaff = sc1.nextInt();
                            
                            // lưu giá trị vào đối tượng mới        
                            Employee em = new Employee(idOfStaff,nameOfStaff, ageOfStaff , heSoOfStaff, dateOfStaff, depOfStaff, nghiOfStaff, lamOfStaff);
                            System.out.println("Nhan vien moi la: ");
                            em.displayInformation();
                            System.out.println();
                            // add đối tượng vào list
                            staffList.add(em);
                            break;
                        case 2:
                            System.out.println("Chuc Danh: ");
                            String cDOfStaff = sc1.next();

                            // lưu giá trị vào đối tượng mới        
                            Manager em1 = new Manager(idOfStaff,nameOfStaff, ageOfStaff , heSoOfStaff, dateOfStaff, depOfStaff, nghiOfStaff, cDOfStaff);
                            System.out.println("Nhan vien moi la: ");
                            em1.displayInformation();
                            System.out.println();
                            // add đối tượng vào list
                            staffList.add( new Manager(idOfStaff,nameOfStaff, ageOfStaff , heSoOfStaff, dateOfStaff, depOfStaff, nghiOfStaff, cDOfStaff));
                            break;    
                        default:
                            break;
                    }
                    System.out.println(staffList+" loas");
                    break;  
                case 5:
                    //5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
                    System.out.println("You choose function 5 ");
                    System.out.print("Ban muonn tim thong tin theo 1-ID hay 2-Name: ");
                    int saveChoose = sc.nextInt();
                    if (saveChoose == 1) {
                        System.out.print("Moi ban nhap ID: ");
                        int iD = sc.nextInt();
                        boolean ktra = false;
                        for (Staff iDs : staffList) {
                            if (iD == iDs.maNhanVien) {
                                System.out.printf("Ma ID %d ten là : %s \t", iD, iDs.tenNhanVien);
                                iDs.displayInformation();
                                System.out.println();
                                ktra = true;
                            }
                        }
                        if (ktra == false) {
                            System.out.println("Khong tim thay nhan vien ban muon tim!! ");
                        }
                    }else if (saveChoose == 2) {
                        System.out.print("Moi ban nhap Name: ");
                        String name = sc.next();

                        for (Staff iDs2 : staffList) {
                            if (iDs2.tenNhanVien.equals(name)) {
                                iDs2.displayInformation();
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 6:
                    //6. Hiển thị bảng lương của nhân viên toàn công ty
                    System.out.println("You choose function 6 ");
                    System.out.println("Bang luong thang. ");
                   
                    for (Staff sal : staffList) {
                        luongNV = ((ICalculator)sal).calculateSalary();
                        System.out.println("Luong cua nv: "+ sal.tenNhanVien+ "\t" + "Luong: " + luongNV);

                    }
                    break; 
                case 7:
                    // 7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
                    System.out.println("You choose function 7 ");
                    
                    System.out.println();
                    System.out.println("\t Danh sach giam");
                    System.out.println();
                    Collections.sort(staffList, new Comparator<Staff>(){
                        @Override
                        public int compare(Staff o1, Staff o2){
                            return ((ICalculator)o1).calculateSalary() < ((ICalculator)o2).calculateSalary() ? 1 : -1;
                        }
                    });

                    for (Staff Ds : staffList) {
                        System.out.println("Luong cua nv: "+ Ds.tenNhanVien+ "\t" + "Luong: " + ((ICalculator)Ds).calculateSalary() );

                    }
                    System.out.println();
                    System.out.println("\t Danh sach tang");
                    System.out.println();
                    Collections.sort(staffList, new Comparator<Staff>(){
                        @Override
                        public int compare(Staff o1, Staff o2){
                            return ((ICalculator)o1).calculateSalary() > ((ICalculator)o2).calculateSalary() ? 1 : -1;
                        }
                    });
                    for (Staff Ds : staffList) {
                        System.out.println("Luong cua nv: "+ Ds.tenNhanVien+ "\t" + "Luong: " + ((ICalculator)Ds).calculateSalary() );
                    }
                    break;      
                default:
                    break;
            }
        } while (luaChon >0 && luaChon <= 7);
    }
       //yc1: viết hàm display hiển thị đối tượng nhân viên trong List
    public static void displayListEmployee(ArrayList<Staff> staffList) {
        for (Staff i : staffList) {
            i.displayInformation();
            System.out.println();
        }
    }
    //yc 2 hiển thị bộ phận
    public static void displayDeparment(ArrayList<Department> depList) {
        for (Department depi : depList) {
            System.out.println(depi);
        }
    }
}













