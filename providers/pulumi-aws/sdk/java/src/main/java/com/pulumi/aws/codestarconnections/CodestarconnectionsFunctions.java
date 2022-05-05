// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarconnections;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codestarconnections.inputs.GetConnectionArgs;
import com.pulumi.aws.codestarconnections.outputs.GetConnectionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CodestarconnectionsFunctions {
    /**
     * Provides details about CodeStar Connection.
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
     *         final var example = Output.of(CodestarconnectionsFunctions.getConnection(GetConnectionArgs.builder()
     *             .arn(aws_codestarconnections_connection.getExample().getArn())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnection(GetConnectionArgs args) {
        return getConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectionResult> getConnection(GetConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:codestarconnections/getConnection:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
}
