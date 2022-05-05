// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ram;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ram.inputs.GetResourceShareArgs;
import com.pulumi.aws.ram.outputs.GetResourceShareResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class RamFunctions {
    /**
     * `aws.ram.ResourceShare` Retrieve information about a RAM Resource Share.
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
     *         final var example = Output.of(RamFunctions.getResourceShare(GetResourceShareArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceOwner(&#34;SELF&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * ## Search by filters
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
     *         final var tagFilter = Output.of(RamFunctions.getResourceShare(GetResourceShareArgs.builder()
     *             .filters(GetResourceShareFilter.builder()
     *                 .name(&#34;NameOfTag&#34;)
     *                 .values(&#34;exampleNameTagValue&#34;)
     *                 .build())
     *             .name(&#34;MyResourceName&#34;)
     *             .resourceOwner(&#34;SELF&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceShareResult> getResourceShare(GetResourceShareArgs args) {
        return getResourceShare(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetResourceShareResult> getResourceShare(GetResourceShareArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ram/getResourceShare:getResourceShare", TypeShape.of(GetResourceShareResult.class), args, Utilities.withVersion(options));
    }
}
