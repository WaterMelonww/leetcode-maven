package test1;

import testnum.FileCompletionParam;
import testnum.PictureType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * @create 2019-12-27 14:35
 */
public class TestUtiles {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        List<FileCompletionParam> file=new ArrayList<FileCompletionParam>();
        for (int i=1;i<10;i++){
            FileCompletionParam fileCompletionParam=new FileCompletionParam();
            fileCompletionParam.setType(i);
            fileCompletionParam.setFileName("ceshi1228"+i+".jpg");
            fileCompletionParam.setUrl("http://imgtest.luckycoffee.com/ceshi/"+i+"1228");
            file.add(fileCompletionParam);
        }
        splitLivePictureList(file);


//        List<String> indoorGuestAreaUrl=file.stream().filter(e-> Objects.equals(e.getType(),PictureType.INDOOR_GUESTAREA.getIndex())).map(FileCompletionParam::getUrl).collect(Collectors.toList());
//        if(indoorGuestAreaUrl.isEmpty()){
//            throw new Exception("室内客区照片不能为空");
//        }
//        List<String> indoorOperationUrl=file.stream().filter(e-> Objects.equals(e.getType(),PictureType.INDOOR_OPERATION.getIndex())).map(FileCompletionParam::getUrl).collect(Collectors.toList());
//        if(indoorOperationUrl.isEmpty()){
//            throw new Exception("室内客区照片不能为空");
//        }
//        List<String> cabinetShapeUrl=file.stream().filter(e-> Objects.equals(e.getType(),PictureType.CABINET_SHAPE.getIndex())).map(FileCompletionParam::getUrl).collect(Collectors.toList());
//        if(cabinetShapeUrl.isEmpty()){
//            throw new Exception("室内客区照片不能为空");
//        }
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间："+(end-start)+"ms");
    }



    private static void splitLivePictureList(List<FileCompletionParam> livePictureList) throws Exception {
        int count = 0;
        for (FileCompletionParam temp : livePictureList) {
            if (temp.getType().equals(PictureType.INDOOR_GUESTAREA.getIndex()) ||
                    temp.getType().equals(PictureType.INDOOR_OPERATION.getIndex()) ||
                    temp.getType().equals(PictureType.CABINET_SHAPE.getIndex())) {
                count = count + temp.getType();
            }
        }
        if (count != 18) {
            throw new Exception("必填照片不能为空");
        }
    }
}
