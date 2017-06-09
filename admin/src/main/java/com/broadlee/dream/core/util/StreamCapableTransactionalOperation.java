package com.broadlee.dream.core.util;

public interface StreamCapableTransactionalOperation extends TransactionalOperation {

    boolean shouldRetryOnTransactionLockAcquisitionFailure();

    int retryMaxCountOverrideForLockAcquisitionFailure();

}
