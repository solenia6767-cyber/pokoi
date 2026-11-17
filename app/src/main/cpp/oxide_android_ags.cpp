#include <jni.h>
#include <android/log.h>
#include <GLES2/gl2.h>

#define LOG_TAG "OxideAGS"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)

// Нативная библиотека включена как заготовка. Этот тестовый проект рисует
// демонстрационную рамку через Android Canvas и не вызывает OpenGL без EGL-контекста.
extern "C" JNIEXPORT jint JNICALL
JNI_OnLoad(JavaVM* vm, void* reserved) {
    LOGI("Oxide AGS native library loaded");
    return JNI_VERSION_1_6;
}
