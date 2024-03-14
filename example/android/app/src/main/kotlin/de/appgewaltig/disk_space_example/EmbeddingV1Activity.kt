package com.whizpool.disk_space_upgrade_example

import android.os.Bundle
import com.whizpool.disk_space_upgrade.DiskSpacePlugin
import io.flutter.app.FlutterActivity


class EmbeddingV1Activity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DiskSpacePlugin.registerWith(registrarFor("com.whizpool.disk_space_upgrade.DiskSpacePlugin"))
    }
}