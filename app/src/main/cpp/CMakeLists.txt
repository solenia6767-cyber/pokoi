cmake_minimum_required(VERSION 3.22.1)
project("oxide_android_ags")

add_library(oxide_android_ags SHARED oxide_android_ags.cpp)

find_library(log-lib log)
find_library(gles-lib GLESv2)

target_link_libraries(oxide_android_ags ${log-lib} ${gles-lib})
