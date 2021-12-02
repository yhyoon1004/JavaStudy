import java.io.*;

public class Ex15_17 {
	static int deletedFiles = 0;			//��� ������ ���ϰ���

	public static void main(String[] args) {	//main
		if(args.length != 1) {
			System.out.println("USAGE : java Ex15_17 Extention");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir");	//���ڿ��� ���� �Ҽ� ����
		
		File dir = new File(currDir);	// ���� ���ڿ� �ּҸ� ��������� ���ϰ�ü ����
		String ext = "."+args[0];	//���ڿ��� .�� ���̰� args[0]�� ����
		
		delete(dir, ext);			//�� Ŭ������ delete�޼��� ȣ��
		System.out.println(deletedFiles+"���� ������ �����Ǿ����ϴ�.");
		
	}//end of main
	
	public static void delete(File dir, String ext) {//����, ���ڿ��� �Ű��� �޴� �޼���
		File[] files = dir.listFiles();		//���� �迭�� �����ϰ� �ش� ����(��Ȯ��)�� ��ҵ��� ���� �迭�� �ʱ�ȭ
		
		for(int i = 0; i<files.length;i++){
			if(files[i].isDirectory()) {			//���� �ش� ���� �迭��ü�� ������ 
				delete(files[i],ext);	//���ȣ��
			}else {									//�ƴ� ��� (������ ���)
				String filename = files[i].getAbsolutePath();	//���ڿ��� ���� i��° ����� ���� ��θ� ����
				
				if(filename.endsWith(ext)) {		//���ϰ�ΰ� �ش� ���ڿ� ext�� ���ϸ��� ���� ���
					System.out.print(filename);		//���ϸ� ���
					if(files[i].delete()) {				//���� ���� i��°�� �������� ���
						System.out.println(" - ���� ����");	//�������� ���
					}else
						System.out.println(" - ���� ����");	//�ƴҰ�� ���� ���� ���
				}
			}
		}//end for
	}
	
	
}
