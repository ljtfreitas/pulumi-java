// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs;
import io.pulumi.aws.lakeformation.outputs.GetDataLakeSettingsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataLakeSettings {
/**
 * Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getDataLakeSettings.
 * 
 *
 * A collection of values returned by getDataLakeSettings.
 * 
 */
    public static CompletableFuture<GetDataLakeSettingsResult> invokeAsync(@Nullable GetDataLakeSettingsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lakeformation/getDataLakeSettings:getDataLakeSettings", TypeShape.of(GetDataLakeSettingsResult.class), args == null ? GetDataLakeSettingsArgs.Empty : args, Utilities.withVersion(options));
    }
}
