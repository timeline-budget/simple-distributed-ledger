package com.timelinebudget.ledger.block

/**
 * Block metadata.
 */
data class Metadata(
        /**
         * The id of the node that created the block.
         */
        val nodeId: String,

        /**
         * The timestamp at which the block was created.
         */
        val timestamp: Long
)