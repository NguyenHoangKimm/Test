package Class;
import java.util.Scanner;

public class PhanSo {
    private int mauSo323;
    private int tuSo323;

    public PhanSo() {
        tuSo323 = 0;
        mauSo323 = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo323 = tuSo;
        this.mauSo323 = mauSo;
    }

    public void nhapPS(Scanner sc) {
        int a323, b323;
        do {
            System.out.print("\tNhap vao tu so: ");
            a323 = sc.nextInt();

            System.out.print("\tNhap vao mau so: ");
            b323 = sc.nextInt();

            if (b323 == 0) {
                System.out.println("\tMau so khong hop le");
            } else {
                tuSo323 = a323;
                mauSo323 = b323;
            }
        } while (b323 == 0);
    }

    public void hienthiPS() {
        if (tuSo323 * mauSo323 < 0) {
            System.out.println("\t-" + Math.abs(tuSo323) + "/" + Math.abs(mauSo323));
        } else {
            System.out.println("\t" + Math.abs(tuSo323) + "/" + Math.abs(mauSo323));
        }
    }

    public PhanSo congPS(PhanSo ps) {
        int a = this.tuSo323 * ps.mauSo323 + ps.tuSo323 * this.mauSo323;
        int b = this.mauSo323 * ps.mauSo323;
        return new PhanSo(a, b);
    }

    public PhanSo truPS(PhanSo ps) {
        int a = this.tuSo323 * ps.mauSo323 - ps.tuSo323 * this.mauSo323;
        int b = this.mauSo323 * ps.mauSo323;
        return new PhanSo(a, b);
    }

    public PhanSo nhanPS(PhanSo ps) {
        int a = this.tuSo323 * ps.tuSo323;
        int b = this.mauSo323 * ps.mauSo323;
        return new PhanSo(a, b);
    }

    public PhanSo chiaPS(PhanSo ps) {
        int a = this.tuSo323 * ps.mauSo323;
        int b = this.mauSo323 * ps.tuSo323;
        return new PhanSo(a, b);
    }

    private int timUSCLN(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public boolean kiemtraToiGian() {
        return timUSCLN(tuSo323, mauSo323) == 1;
    }

    public void toiGianPS() {
        int x = timUSCLN(tuSo323, mauSo323);
        tuSo323 /= x;
        mauSo323 /= x;
    }
}
