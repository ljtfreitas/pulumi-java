// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetExtendedServerBlobAuditingPolicyArgs;
import io.pulumi.azurenative.sql.outputs.GetExtendedServerBlobAuditingPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExtendedServerBlobAuditingPolicy {
/**
 * An extended server blob auditing policy.
 * API Version: 2020-11-01-preview.
 * 
 *
 * An extended server blob auditing policy.
 * 
 */
    public static CompletableFuture<GetExtendedServerBlobAuditingPolicyResult> invokeAsync(GetExtendedServerBlobAuditingPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getExtendedServerBlobAuditingPolicy", TypeShape.of(GetExtendedServerBlobAuditingPolicyResult.class), args == null ? GetExtendedServerBlobAuditingPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
