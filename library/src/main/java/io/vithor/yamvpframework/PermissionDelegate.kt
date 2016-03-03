package io.vithor.yamvpframework

/**
 * Created by Hazer on 1/5/16.
 */
interface PermissionDelegate {
    fun askPermission(permission: String, granted: () -> Unit, notGranted: () -> Unit)
    open fun askPermissions(vararg permissions: String, granted: () -> Unit, notGranted: () -> Unit)
}
