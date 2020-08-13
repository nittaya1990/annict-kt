package jp.annict.rest.interfaces

import okhttp3.Response

/**
 * Response を data class として提供させる
 */
interface ResponseBody<T> {
    fun toDataClass(response: Response) : T
}