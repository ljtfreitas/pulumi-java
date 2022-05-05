// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicediscovery.inputs.GetDnsNamespaceArgs;
import com.pulumi.aws.servicediscovery.outputs.GetDnsNamespaceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicediscoveryFunctions {
    /**
     * Retrieves information about a Service Discovery private or public DNS namespace.
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
     *         final var test = Output.of(ServicediscoveryFunctions.getDnsNamespace(GetDnsNamespaceArgs.builder()
     *             .name(&#34;example.service.local&#34;)
     *             .type(&#34;DNS_PRIVATE&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDnsNamespaceResult> getDnsNamespace(GetDnsNamespaceArgs args) {
        return getDnsNamespace(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDnsNamespaceResult> getDnsNamespace(GetDnsNamespaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicediscovery/getDnsNamespace:getDnsNamespace", TypeShape.of(GetDnsNamespaceResult.class), args, Utilities.withVersion(options));
    }
}
