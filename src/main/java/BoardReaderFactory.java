public class BoardReaderFactory {
    public static BoardReader boardType(String filePath) {
        if(filePath.contains(".sdk")) {
            return new SDKBoardReader();
        } else if(filePath.contains(".ss")) {
            return new SSBoardReader();
        } else {
            System.out.println("Invalid fileType");
            return null;
        }
    }
}
