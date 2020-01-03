package com.timelinebudget.ledger.block

/**
 * The block definition.
 */
data class Block<T>(
        /**
         * Block id. The id is the hash of the header.
         */
        val id: String,

        /**
         * Block header.
         */
        val header: Header,

        /**
         * Block transactions
         */
        val data: List<Transaction<T>>,

        /**
         * Block metadata
         */
        val metadata: Metadata
)