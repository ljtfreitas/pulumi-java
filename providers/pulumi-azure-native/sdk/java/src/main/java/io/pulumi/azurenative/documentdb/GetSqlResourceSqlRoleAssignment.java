// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetSqlResourceSqlRoleAssignmentArgs;
import io.pulumi.azurenative.documentdb.outputs.GetSqlResourceSqlRoleAssignmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSqlResourceSqlRoleAssignment {
    public static CompletableFuture<GetSqlResourceSqlRoleAssignmentResult> invokeAsync(GetSqlResourceSqlRoleAssignmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getSqlResourceSqlRoleAssignment", TypeShape.of(GetSqlResourceSqlRoleAssignmentResult.class), args == null ? GetSqlResourceSqlRoleAssignmentArgs.Empty : args, Utilities.withVersion(options));
    }
}