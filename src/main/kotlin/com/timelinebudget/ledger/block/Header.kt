package com.timelinebudget.ledger.block

/**
 * Block header.
 */
data class Header(
        /**
         * The hash of the transactions contained in this block.
         */
        val hash: String,

        /**
         * A list of hashes of the current block's immediate predecessors.
         */
        val previous: List<String>
)