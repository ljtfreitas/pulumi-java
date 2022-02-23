// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticbeanstalk.inputs.GetApplicationArgs;
import io.pulumi.aws.elasticbeanstalk.outputs.GetApplicationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApplication {
/**
 * Retrieve information about an Elastic Beanstalk Application.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getApplication.
 * 
 *
 * A collection of values returned by getApplication.
 * 
 */
    public static CompletableFuture<GetApplicationResult> invokeAsync(GetApplicationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticbeanstalk/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args == null ? GetApplicationArgs.Empty : args, Utilities.withVersion(options));
    }
}
