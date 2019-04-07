import java.util.Scanner;
public class BangunRuangDanDatar {
	static double rumus(double p, double l){
	    double keliling = 2*p+l;
	    return keliling ;
	}
	
	static void persegiPanjang(){
	       System.out.println("======================================");
	       System.out.println("PERHITUNGAN KELILING PERSEGI PANJANG");
	       System.out.println("======================================");
	       Scanner masuk = new Scanner(System.in);
	       double panjang, lebar; 
	       System.out.print("Panjang : ");
	       panjang = masuk.nextInt();
	       System.out.print("Lebar : ");
	       lebar = masuk.nextInt();
	       System.out.println("Keliling Persegi Panjang = "+"["+rumus(panjang,lebar)+"]");

	      }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//PERSEGI//======================================================
		System.out.println("======================================");
		System.out.println("PERHITUNGAN PERSEGI");
		System.out.println("====================================== ");
		System.out.println("sisi: ");
		int sisi = scan.nextInt();
		int luasPersegi = sisi * sisi;
		int kelilingPersegi = 4 * sisi;
		System.out.println("luas adalah: " + luasPersegi);
		System.out.println("keliling adalah: " + kelilingPersegi);
		System.out.println("");
		System.out.println("");
		
		//PERSEGI//===========================================================
		
		
		
		
		//PERSEGI PANJANG//=========================================================
		   int panjangPersegiPanjang;
		   int lebarPersegiPanjang;
		   double luasPersegiPanjang;

		   System.out.println("======================================");
		   System.out.println("PERHITUNGAN LUAS PERSEGI PANJANG");
		   System.out.println("======================================");
		   System.out.println("Panjang: ");
		   panjangPersegiPanjang = scan.nextInt(); scan.nextLine();
		   System.out.print("Lebar: ");
		   lebarPersegiPanjang = scan.nextInt(); scan.nextLine();
		  
		   luasPersegiPanjang = (lebarPersegiPanjang * panjangPersegiPanjang);
		   System.out.println("Hasil Luas Persegi Panjang = " +luasPersegiPanjang);
		   
		    persegiPanjang();
		    System.out.println("");
			System.out.println("");
			
		   //PERSEGI PANJANG//=============================================================
			
			
			
			
			
			//LINGKARAN=====================================================================
			double phiLingkaran = 3.14;
			double rLingkaran, luasLingkaran,kelilingLingkaran;
			

			System.out.println("======================================");
			System.out.println("PERHITUNGAN LINGKARAN");
			System.out.println("======================================");
			System.out.print("Input Panjang Jari-jari : ");
			rLingkaran = scan.nextDouble();

			luasLingkaran = 0.5 * phiLingkaran * rLingkaran * rLingkaran;
			kelilingLingkaran = 2 * phiLingkaran * rLingkaran;

			System.out.print("Luas Lingkaran = " + (int)luasLingkaran + " \nKeliling lingkaran = "+ (int)kelilingLingkaran);
			    System.out.println("");
				System.out.println("");
				System.out.println("");
				
			//LINGKARAN============================================================================================================
				
				
				
			//SEGITIGA=============================================================================================================
				 System.out.println("======================================");
				 System.out.println("PERHITUNGAN SEGITIGA");
				 System.out.println("======================================");
				 System.out.print("Input Alas: ");
				 int alas = scan.nextInt();
				 System.out.print("Input tinggi : ");
				 int tinggi = scan.nextInt();
				 int keliling = (int)(alas*3);
			     double luas = (double)(alas*tinggi)/2;

				  

				   System.out.println("Luas Segitiga :" +luas);
				 
				   System.out.print("Keliling Segitiga :"+keliling);
				   
				    System.out.println("");
					System.out.println("");
					
					//SEGITIGA=============================================================================================================
					
					
					
					
					//KUBUS================================================================================================================
					System.out.println("======================================");
					System.out.println("PERHITUNGAN KUBUS");
					System.out.println("======================================");
					System.out.println("input sisi: ");
					
					int sisiKubus = scan.nextInt();
					int luasKubus = 6 *(sisiKubus*sisiKubus );
					int volumeKubus = sisiKubus * sisiKubus * sisiKubus;
					int kelilingKubus = 12 * sisiKubus;
					
					System.out.println("luas kubus adalah: " + luasKubus);
					System.out.println("volume kubus adalah: " + volumeKubus);
					System.out.println("keliling kubus adalah: " + kelilingKubus);
					System.out.println("");
					System.out.println("");
					
					//KUBUS================================================================================================================
					
					
					
					
					//BALOK================================================================================================================
					System.out.println("======================================");
					System.out.println("PERHITUNGAN BALOK");
					System.out.println("======================================");
					System.out.println("input panjang: ");
					int panjangBalok = scan.nextInt();
					
					System.out.println("input lebar: ");
					int lebarBalok = scan.nextInt();
					
					System.out.println("input tinggi: ");
					int tinggiBalok = scan.nextInt();
					
					int luasBalok = 2 * (panjangBalok * lebarBalok + panjangBalok * tinggiBalok + lebarBalok * tinggiBalok);
					int volumeBalok = panjangBalok * lebarBalok * tinggiBalok;
					int kelilingBalok = 4 * (panjangBalok + lebarBalok + tinggiBalok);
					
					
					System.out.println("luas balok adalah: " + luasBalok);
					System.out.println("volume balok adalah: " + volumeBalok);
					System.out.println("keliling balok adalah: " + kelilingBalok);
					System.out.println("");
					System.out.println("");
					
					//BALOK================================================================================================================
					
					
					
					
					//BOLA================================================================================================================
					System.out.println("======================================");
					System.out.println("PERHITUNGAN BOLA");
					System.out.println("======================================");
					System.out.println("+++++hitung luas bola+++++");
			        System.out.println("input r=");
			        int r =  scan.nextInt();
			        double phi = 3.14;
			        double luasbola = phi*r*r;
			        System.out.println("luasbola= "+luasbola);
			        
			        System.out.println("");
			        
			        //keliling bola
			        System.out.println("+++++hitung keliling bola+++++");
			        System.out.print("input jari-jari bola : ");
			        double jari2 = scan.nextDouble();
			        System.out.println("keliling bola adalah: " + 1.33 * 3.142857143 * jari2 * jari2);
			       
			        
			        
			        System.out.println("");
			        
			        //volume
			        System.out.println("+++++hitung volume bola+++++");
			        System.out.print("input jari-jari bola : ");
			        
			        double jari = scan.nextDouble();
			        System.out.println("Volume bola adalah " + jari*jari*jari*22/7*4/3);
			        
					//BOLA================================================================================================================
				
				
				
				


			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
