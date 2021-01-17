package com.example.lantern;

import android.content.Context;
import android.graphics.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;

public class FlashClass {
    private boolean flash_status = false;
    private Context context;

    public FlashClass(Context context) {
        this.context = context;
    }
    //включить
    public void flashOn(){
        CameraManager cameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
        //задняя камера 0
        try {
            assert cameraManager != null;
            String cameraId = cameraManager.getCameraIdList()[0];
            cameraManager.setTorchMode(cameraId, true); //зажечь фонарик
            flash_status = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }
    //выключить
    public void flashOff(){
        CameraManager cameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
        //задняя камера 0
        try {
            assert cameraManager != null;
            String cameraId = cameraManager.getCameraIdList()[0];
            cameraManager.setTorchMode(cameraId, false); //потушить фонарик
            flash_status = false;
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }
    //getter
    public boolean isFlash_status() {
        return flash_status;
    }

}
