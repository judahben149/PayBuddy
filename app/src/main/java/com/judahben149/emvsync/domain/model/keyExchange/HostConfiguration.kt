package com.judahben149.emvsync.domain.model.keyExchange

import javax.inject.Inject

data class HostConfiguration @Inject constructor(
    val ipAddress: String,
    val port: String,
    val terminalId: String,
    val compKey1: String,
    val compKey2: String,
    val isSsl: Boolean,
    val timeout: Int
)