package io.ktor.network.tls

import io.ktor.util.*
import kotlinx.io.core.*

@Suppress("KDocMissingDocumentation")
@InternalAPI
internal class TLSRecord(
    val type: TLSRecordType = TLSRecordType.Handshake,
    val version: TLSVersion = TLSVersion.TLS12,
    val packet: ByteReadPacket = ByteReadPacket.Empty
)

@Suppress("KDocMissingDocumentation")
@InternalAPI
internal class TLSHandshake {
    var type: TLSHandshakeType = TLSHandshakeType.HelloRequest
    var packet = ByteReadPacket.Empty
}
