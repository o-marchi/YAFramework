package io.vithor.yamvpframework

/**
 * Created by Hazer on 1/5/16.
 */
public object ObjectUtils {
    fun isNull(vararg objects: Any?): Boolean {
        return objects.any { it == null }
    }
}