// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.GetSqlVirtualMachineArgs;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.GetSqlVirtualMachineResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSqlVirtualMachine {
/**
 * A SQL virtual machine.
 * API Version: 2017-03-01-preview.
 * 
 *
 * A SQL virtual machine.
 * 
 */
    public static CompletableFuture<GetSqlVirtualMachineResult> invokeAsync(GetSqlVirtualMachineArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sqlvirtualmachine:getSqlVirtualMachine", TypeShape.of(GetSqlVirtualMachineResult.class), args == null ? GetSqlVirtualMachineArgs.Empty : args, Utilities.withVersion(options));
    }
}
