// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sfn;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sfn.inputs.GetActivityArgs;
import com.pulumi.aws.sfn.inputs.GetStateMachineArgs;
import com.pulumi.aws.sfn.outputs.GetActivityResult;
import com.pulumi.aws.sfn.outputs.GetStateMachineResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SfnFunctions {
    /**
     * Provides a Step Functions Activity data source
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
     *         final var sfnActivity = Output.of(SfnFunctions.getActivity(GetActivityArgs.builder()
     *             .name(&#34;my-activity&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetActivityResult> getActivity() {
        return getActivity(GetActivityArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetActivityResult> getActivity(GetActivityArgs args) {
        return getActivity(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetActivityResult> getActivity(GetActivityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sfn/getActivity:getActivity", TypeShape.of(GetActivityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the ARN of a State Machine in AWS Step
     * Function (SFN). By using this data source, you can reference a
     * state machine without having to hard code the ARNs as input.
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
     *         final var example = Output.of(SfnFunctions.getStateMachine(GetStateMachineArgs.builder()
     *             .name(&#34;an_example_sfn_name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStateMachineResult> getStateMachine(GetStateMachineArgs args) {
        return getStateMachine(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStateMachineResult> getStateMachine(GetStateMachineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sfn/getStateMachine:getStateMachine", TypeShape.of(GetStateMachineResult.class), args, Utilities.withVersion(options));
    }
}
