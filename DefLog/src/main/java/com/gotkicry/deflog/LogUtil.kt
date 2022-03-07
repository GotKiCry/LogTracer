package com.gotkicry.deflog

import android.util.Log

object LogUtil {

    private fun getClassName() : String{
        var className = "classNameNotFount"
        val stackTrace = Thread.currentThread().stackTrace
        var canGetName = false
        for (i in stackTrace){
            if ("com.gotkicry.logtracer" in i.toString()){
                canGetName = true
                continue
            }
            if (canGetName){
                className = i.fileName
                break
            }
        }
        return className
    }
    fun v(msg :String){
        v(null,msg)
    }

    fun v(tag :String? = null,msg :String){
        if (tag == null){
            Log.v(getClassName(),msg)
        }else{
            Log.v(tag,msg)
        }
    }

    fun d(msg :String){
        d(null,msg)
    }

    fun d(tag :String? = null,msg :String){
        if (tag == null){
            Log.d(getClassName(),msg)
        }else{
            Log.d(tag,msg)
        }
    }


    fun i(msg :String){
        i(null,msg)
    }

    fun i(tag :String? = null,msg :String){
        if (tag == null){
            Log.i(getClassName(),msg)
        }else{
            Log.i(tag,msg)
        }
    }

    fun w(msg :String){
        w(null,msg)
    }

    fun w(tag :String? = null,msg :String){
        if (tag == null){
            Log.w(getClassName(),msg)
        }else{
            Log.w(tag,msg)
        }
    }


    fun e(msg :String){
        e(null,msg)
    }

    fun e(tag :String? = null,msg :String){
        if (tag == null){
            Log.e(getClassName(),msg)
        }else{
            Log.e(tag,msg)
        }
    }

    /**
     * what a terrible failure
     */
    fun wtf(msg :String){
        wtf(null,msg)
    }

    /**
     * what a terrible failure
     */
    fun wtf(tag :String? = null,msg :String){
        if (tag == null){
            Log.wtf(getClassName(),msg)
        }else{
            Log.wtf(tag,msg)
        }
    }
}