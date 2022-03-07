package com.gotkicry.logtracer

import android.util.Log
import androidx.annotation.Nullable
import org.jetbrains.annotations.NotNull

/**
 * Only Debug Waring and Error Mode
 */
object DefFormatLog {

        fun dLogStack(msgTag:String? = null,msg:String){
        var tag = ""
        val stackTrace = Thread.currentThread().stackTrace
        var canStartLog = false
        var isGetTag = false
        for (i in stackTrace){
            if (i.className == DefFormatLog::class.java.name){
                canStartLog = true
                continue
            }
            if (canStartLog){
                if (!isGetTag){
                    tag = i.fileName
                    Log.d(tag,"====================================================================================================")
                    if (msgTag == null){
                        Log.d(tag, "||  $msg")
                    }else{
                        Log.d(tag, "||  $msgTag : $msg")
                    }
                    Log.d(tag,"====================================================================================================")
                    isGetTag = true
                }
                Log.d(tag, "||  $i")
            }

        }
        Log.d(tag,"====================================================================================================")
    }

    fun wLogStack(msgTag:String? = null,msg:String){
        var tag = ""
        val stackTrace = Thread.currentThread().stackTrace
        var canStartLog = false
        var isGetTag = false
        for (i in stackTrace){
            if (i.className == DefFormatLog::class.java.name){
                canStartLog = true
                continue
            }
            if (canStartLog){
                if (!isGetTag){
                    tag = i.fileName
                    Log.w(tag,"====================================================================================================")
                    if (msgTag == null){
                        Log.w(tag, "||  $msg")
                    }else{
                        Log.w(tag, "||  $msgTag : $msg")
                    }
                    Log.w(tag,"====================================================================================================")
                    isGetTag = true
                }
                Log.w(tag, "||  $i")
            }

        }
        Log.w(tag,"====================================================================================================")
    }

    fun eLogStack(msgTag:String? = null,msg:String,error: Throwable? = null){
        var tag = ""
        val stackTrace = Thread.currentThread().stackTrace
        var canStartLog = false
        var isGetTag = false
        for (i in stackTrace){
            if (i.className == DefFormatLog::class.java.name){
                canStartLog = true
                continue
            }
            if (canStartLog){
                if (!isGetTag){
                    tag = i.fileName
                    Log.e(tag,"====================================================================================================")
                    if (msgTag == null){
                        Log.e(tag, "||  $msg")
                    }else{
                        Log.e(tag, "||  $msgTag : $msg")
                    }
                    Log.e(tag,"====================================================================================================")
                    if (error != null){
                        Log.e(tag,"||  Error: ${error.cause}")
                    }
                    isGetTag = true
                }
                Log.e(tag, "||  $i")
            }

        }
        Log.e(tag,"====================================================================================================")
    }
}