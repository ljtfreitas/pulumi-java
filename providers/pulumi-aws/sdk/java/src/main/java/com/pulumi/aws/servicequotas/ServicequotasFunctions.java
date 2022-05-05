// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicequotas;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicequotas.inputs.GetServiceArgs;
import com.pulumi.aws.servicequotas.inputs.GetServiceQuotaArgs;
import com.pulumi.aws.servicequotas.outputs.GetServiceQuotaResult;
import com.pulumi.aws.servicequotas.outputs.GetServiceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicequotasFunctions {
    /**
     * Retrieve information about a Service Quotas Service.
     * 
     * &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(ServicequotasFunctions.getService(GetServiceArgs.builder()
     *             .serviceName(&#34;Amazon Virtual Private Cloud (Amazon VPC)&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicequotas/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a Service Quota.
     * 
     * &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byQuotaCode = Output.of(ServicequotasFunctions.getServiceQuota(GetServiceQuotaArgs.builder()
     *             .quotaCode(&#34;L-F678F1CE&#34;)
     *             .serviceCode(&#34;vpc&#34;)
     *             .build()));
     * 
     *         final var byQuotaName = Output.of(ServicequotasFunctions.getServiceQuota(GetServiceQuotaArgs.builder()
     *             .quotaName(&#34;VPCs per Region&#34;)
     *             .serviceCode(&#34;vpc&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceQuotaResult> getServiceQuota(GetServiceQuotaArgs args) {
        return getServiceQuota(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceQuotaResult> getServiceQuota(GetServiceQuotaArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicequotas/getServiceQuota:getServiceQuota", TypeShape.of(GetServiceQuotaResult.class), args, Utilities.withVersion(options));
    }
}
