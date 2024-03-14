package com.whizpool.disk_space_upgrade

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.PluginRegistry

class DiskSpacePlugin: FlutterPlugin {

  companion object {
    private var channel: MethodChannel? = null
    private var handler: MethodHandlerImpl = MethodHandlerImpl()

    @JvmStatic
    fun registerWith(registrar: PluginRegistry.Registrar) {
      registerChannel(registrar.messenger())
    }

    private fun registerChannel(messenger: BinaryMessenger) {
      channel = MethodChannel(messenger, "disk_space_upgrade")
      channel!!.setMethodCallHandler(handler)
    }
  }

  override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    registerChannel(binding.binaryMessenger)
  }

  override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    channel = null
  }
}