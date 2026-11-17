Oxide AGS — демонстрационный Android overlay

Это исходный проект для Android Studio, а не готовый APK.
Он создаёт прозрачный, нетрогаемый оверлей с одной фиксированной тестовой рамкой.
Он НЕ читает память Oxide Survival Island, не получает координаты игроков и не содержит
функций наведения/вмешательства в публичные серверы.

Сборка:
1. Распакуйте архив.
2. Откройте папку OxideAGS в Android Studio.
3. Дождитесь Gradle Sync. Установите Android SDK 34, NDK и CMake 3.22.1,
   если Android Studio предложит.
4. Выберите Build > Build Bundle(s) / APK(s) > Build APK(s).
5. APK обычно появится в app/build/outputs/apk/debug/app-debug.apk.

Для BlueStacks в app/build.gradle задан ABI x86_64.
Если используемая версия BlueStacks не поддерживает запуск такого APK,
потребуется подобрать ABI под конкретный экземпляр эмулятора.
