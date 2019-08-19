package util;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author ChinesePanda
 * @ClassName: PmsUploadUtil
 * @Description:
 * @Date: 2019/8/17 02:07
 */
public class PmsUploadUtil {

    /**
     * @Description: 图片上传
     * @param: [multipartFile]
     * @return: java.lang.String
     * @Date: 2019/8/17 2:19
     */
    public static String uploadImage(MultipartFile multipartFile){
        String imgUrl="http://192.168.231.136";
        //获得配置文件得路径
        String tracker = PmsUploadUtil.class.getResource("/tracker.conf").getPath();

        try {
            ClientGlobal.init(tracker);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = null;
        try {
            trackerServer = trackerClient.getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StorageClient storageClient = new StorageClient(trackerServer, null);
        try {
            byte[] bytes = multipartFile.getBytes();
            String originalFilename = multipartFile.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            String[] uploadFile = storageClient.upload_file(bytes, extName, null);
            for (String uploadUrl: uploadFile) {
               imgUrl += "/"+uploadUrl;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imgUrl;
    }


}
