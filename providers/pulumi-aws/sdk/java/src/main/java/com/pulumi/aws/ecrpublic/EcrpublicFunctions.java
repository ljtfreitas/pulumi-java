// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecrpublic;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecrpublic.outputs.GetAuthorizationTokenResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class EcrpublicFunctions {
    /**
     * The Public ECR Authorization Token data source allows the authorization token, token expiration date, user name and password to be retrieved for a Public ECR repository.
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
     *         final var token = Output.of(EcrpublicFunctions.getAuthorizationToken());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAuthorizationTokenResult> getAuthorizationToken() {
        return getAuthorizationToken(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAuthorizationTokenResult> getAuthorizationToken(InvokeArgs args) {
        return getAuthorizationToken(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAuthorizationTokenResult> getAuthorizationToken(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecrpublic/getAuthorizationToken:getAuthorizationToken", TypeShape.of(GetAuthorizationTokenResult.class), args, Utilities.withVersion(options));
    }
}
