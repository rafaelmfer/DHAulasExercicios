package webservice.androidchallenge2.repository

import com.my_utils.RetroInit
import webservice.androidchallenge2.model.pojo.ComicsResponse
import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class RepositoryMarvel {

    private var baseURL = "https://gateway.marvel.com/v1/public/"
    private var service = ServiceMarvelApi::class

    private val serviceMarvelApi = RetroInit(baseURL).create(service)

    private val ts = System.currentTimeMillis().toString()
    private val hash = getMd5(ts)

    suspend fun getComics(apiKey: String = PUBLIC_KEY, offset: Int): ComicsResponse {
        return serviceMarvelApi.getComics(ts, hash, apiKey, offset)
    }

    private fun getMd5(ts: String): String {
        try {
            val messageDigest = MessageDigest.getInstance(MD5).digest(
                ts.toByteArray() + PRIVATE_KEY.toByteArray() + PUBLIC_KEY.toByteArray()
            )

            var hashText = BigInteger(SIGNUM_1, messageDigest).toString(RADIX)
            while (hashText.length < HASH_TEXT_LENGTH) {
                hashText = "0$hashText"
            }
            return hashText
        } catch (e: NoSuchAlgorithmException) {
            throw RuntimeException(e)
        }
    }

    companion object {
        private const val PUBLIC_KEY = "6eb7e8896ec5850c52515a8a23ee97f0"
        private const val PRIVATE_KEY = "0dd0c16fedb8a02985977eafca66b49f5e6a526f"

        private const val MD5 = "MD5"
        private const val SIGNUM_1 = 1
        private const val RADIX = 16
        private const val HASH_TEXT_LENGTH = 32
    }
}