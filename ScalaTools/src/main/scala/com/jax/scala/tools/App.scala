package com.jax.scala.tools

import java.io.File
import java.nio.{ByteBuffer, IntBuffer}

import com.sun.glass.ui.CommonDialogs.{FileChooserResult, ExtensionFilter}
import com.sun.glass.ui._

/**
 * Hello world!
 *
 */
object App extends Application {
  println( "Hello World!" )

  override def createWindow(owner: Window, screen: Screen, styleMask: Int): Window = ???

  override def createWindow(parent: Long): Window = ???

  override def staticCommonDialogs_showFolderChooser(owner: Window, folder: String, title: String): File = ???

  override def _supportsTransparentWindows(): Boolean = ???

  override def createCursor(`type`: Int): Cursor = ???

  override def createCursor(x: Int, y: Int, pixels: Pixels): Cursor = ???

  override def staticView_getMultiClickMaxY(): Int = ???

  override def staticCursor_setVisible(visible: Boolean): Unit = ???

  override def _leaveNestedEventLoop(retValue: scala.Any): Unit = ???

  override def staticScreen_getScreens(): Array[Screen] = ???

  override def runLoop(launchable: Runnable): Unit = ???

  override def createRobot(): Robot = ???

  override def staticPixels_getNativeFormat(): Int = ???

  override def staticView_getMultiClickMaxX(): Int = ???

  override def staticCommonDialogs_showFileChooser(owner: Window, folder: String, filename: String, title: String, `type`: Int, multipleMode: Boolean, extensionFilters: Array[ExtensionFilter], defaultFilterIndex: Int): FileChooserResult = ???

  override def createView(): View = ???

  override def createTimer(runnable: Runnable): Timer = ???

  override def staticScreen_getVideoRefreshPeriod(): Double = ???

  override def staticCursor_getBestSize(width: Int, height: Int): Size = ???

  override def staticTimer_getMaxPeriod(): Int = ???

  override def _enterNestedEventLoop(): AnyRef = ???

  override def _getKeyCodeForChar(c: Char): Int = ???

  override def _invokeAndWait(runnable: Runnable): Unit = ???

  override def createPixels(width: Int, height: Int, data: ByteBuffer): Pixels = ???

  override def createPixels(width: Int, height: Int, data: IntBuffer): Pixels = ???

  override def createPixels(width: Int, height: Int, data: IntBuffer, scale: Float): Pixels = ???

  override def staticTimer_getMinPeriod(): Int = ???

  override def _invokeLater(runnable: Runnable): Unit = ???

  override def staticView_getMultiClickTime(): Long = ???

  override def _supportsUnifiedWindows(): Boolean = ???
}
