package com.whizpool.disk_space_upgrade

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MethodChannel

class DiskSpacePlugin : FlutterPlugin {

    private var channel: MethodChannel? = null
    private val handler = MethodHandlerImpl()

    override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        registerChannel(binding.binaryMessenger)
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        channel?.setMethodCallHandler(null)
        channel = null
    }

    private fun registerChannel(messenger: BinaryMessenger) {
        channel = MethodChannel(messenger, "disk_space_upgrade")
        channel?.setMethodCallHandler(handler)
    }
}
