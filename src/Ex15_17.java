import java.io.*;

public class Ex15_17 {
	static int deletedFiles = 0;			//상수 삭제된 파일갯수

	public static void main(String[] args) {	//main
		if(args.length != 1) {
			System.out.println("USAGE : java Ex15_17 Extention");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir");	//문자열에 속한 소속 저장
		
		File dir = new File(currDir);	// 위의 문자열 주소를 기반으로한 파일객체 생성
		String ext = "."+args[0];	//문자열에 .을 붙이고 args[0]를 저장
		
		delete(dir, ext);			//본 클래스의 delete메서드 호출
		System.out.println(deletedFiles+"개의 파일이 삭제되었습니다.");
		
	}//end of main
	
	public static void delete(File dir, String ext) {//파일, 문자열을 매개로 받는 메서드
		File[] files = dir.listFiles();		//파일 배열을 생성하고 해당 파일(미확인)의 요소들을 파일 배열에 초기화
		
		for(int i = 0; i<files.length;i++){
			if(files[i].isDirectory()) {			//만약 해당 파일 배열객체가 폴더면 
				delete(files[i],ext);	//재귀호출
			}else {									//아닐 경우 (파일일 경우)
				String filename = files[i].getAbsolutePath();	//문자열에 파일 i번째 요소의 절대 경로를 저장
				
				if(filename.endsWith(ext)) {		//파일경로가 해당 문자열 ext로 파일명이 끝날 경우
					System.out.print(filename);		//파일명 출력
					if(files[i].delete()) {				//만약 파일 i번째가 지워졌을 경우
						System.out.println(" - 삭제 성공");	//삭제성공 출력
					}else
						System.out.println(" - 삭제 실패");	//아닐경우 삭제 실패 출력
				}
			}
		}//end for
	}
	
	
}
