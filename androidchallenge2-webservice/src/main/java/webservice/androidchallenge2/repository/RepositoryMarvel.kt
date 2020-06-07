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

    suspend fun getComics(apiKey: String = PUBLIC_KEY): ComicsResponse {
        return serviceMarvelApi.getComics(ts, hash, apiKey)
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
        private const val PUBLIC_KEY = "dd82cc3630e1624e9695dbd63c236c72"
        private const val PRIVATE_KEY = "3065762afd1a9acaeb446aa6195e5a92f2a58c69"

        private const val MD5 = "MD5"
        private const val SIGNUM_1 = 1
        private const val RADIX = 16
        private const val HASH_TEXT_LENGTH = 32
    }
}