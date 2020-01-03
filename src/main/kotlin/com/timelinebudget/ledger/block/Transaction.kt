package com.timelinebudget.ledger.block

/**
 * Block transaction.
 */
data class Transaction<T>(
        /**
         * The unique transaction id.
         */
        val id: String,

        /**
         * Transaction data.
         */
        val data: T
)