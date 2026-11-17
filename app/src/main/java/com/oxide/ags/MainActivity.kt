package com.oxide.ags

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val requestCode = 1234

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 48, 32, 32)
        }
        layout.addView(TextView(this).apply {
            text = "Oxide AGS\nТестовый экранный оверлей"
            textSize = 22f
        })
        layout.addView(Button(this).apply {
            text = "Включить демонстрационный оверлей"
            setOnClickListener { enableOverlay() }
        })
        layout.addView(Button(this).apply {
            text = "Выключить оверлей"
            setOnClickListener { stopService(Intent(this@MainActivity, OverlayService::class.java)) }
        })
        setContentView(layout)
    }

    private fun enableOverlay() {
        if (Settings.canDrawOverlays(this)) {
            startService(Intent(this, OverlayService::class.java))
        } else {
            val intent = Intent(
                Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:$packageName")
            )
            startActivityForResult(intent, requestCode)
        }
    }

    @Deprecated("Deprecated by Android, retained for compatibility with this minimal sample")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == this.requestCode && Settings.canDrawOverlays(this)) {
            startService(Intent(this, OverlayService::class.java))
        }
    }
}
