// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs;
import com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigState;
import com.pulumi.aws.lambda.outputs.FunctionEventInvokeConfigDestinationConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an asynchronous invocation configuration for a Lambda Function or Alias. More information about asynchronous invocations and the configurable values can be found in the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html).
 * 
 * ## Example Usage
 * ### Destination Configuration
 * 
 * &gt; **NOTE:** Ensure the Lambda Function IAM Role has necessary permissions for the destination, such as `sqs:SendMessage` or `sns:Publish`, otherwise the API will return a generic `InvalidParameterValueException: The destination ARN arn:PARTITION:SERVICE:REGION:ACCOUNT:RESOURCE is invalid.` error.
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
 *         var example = new FunctionEventInvokeConfig(&#34;example&#34;, FunctionEventInvokeConfigArgs.builder()        
 *             .functionName(aws_lambda_alias.getExample().getFunction_name())
 *             .destinationConfig(FunctionEventInvokeConfigDestinationConfig.builder()
 *                 .onFailure(FunctionEventInvokeConfigDestinationConfigOnFailure.builder()
 *                     .destination(aws_sqs_queue.getExample().getArn())
 *                     .build())
 *                 .onSuccess(FunctionEventInvokeConfigDestinationConfigOnSuccess.builder()
 *                     .destination(aws_sns_topic.getExample().getArn())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Error Handling Configuration
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
 *         var example = new FunctionEventInvokeConfig(&#34;example&#34;, FunctionEventInvokeConfigArgs.builder()        
 *             .functionName(aws_lambda_alias.getExample().getFunction_name())
 *             .maximumEventAgeInSeconds(60)
 *             .maximumRetryAttempts(0)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Configuration for Alias Name
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
 *         var example = new FunctionEventInvokeConfig(&#34;example&#34;, FunctionEventInvokeConfigArgs.builder()        
 *             .functionName(aws_lambda_alias.getExample().getFunction_name())
 *             .qualifier(aws_lambda_alias.getExample().getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Configuration for Function Latest Unpublished Version
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
 *         var example = new FunctionEventInvokeConfig(&#34;example&#34;, FunctionEventInvokeConfigArgs.builder()        
 *             .functionName(aws_lambda_function.getExample().getFunction_name())
 *             .qualifier(&#34;$LATEST&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Configuration for Function Published Version
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
 *         var example = new FunctionEventInvokeConfig(&#34;example&#34;, FunctionEventInvokeConfigArgs.builder()        
 *             .functionName(aws_lambda_function.getExample().getFunction_name())
 *             .qualifier(aws_lambda_function.getExample().getVersion())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Lambda Function Event Invoke Configs can be imported using the fully qualified Function name or Amazon Resource Name (ARN), e.g., ARN without qualifier (all versions and aliases)
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function
 * ```
 * 
 *  ARN with qualifier
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function:production
 * ```
 * 
 *  Name without qualifier (all versions and aliases)
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function
 * ```
 * 
 *  Name with qualifier
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function:production
 * ```
 * 
 */
@ResourceType(type="aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig")
public class FunctionEventInvokeConfig extends com.pulumi.resources.CustomResource {
    /**
     * Configuration block with destination configuration. See below for details.
     * 
     */
    @Export(name="destinationConfig", type=FunctionEventInvokeConfigDestinationConfig.class, parameters={})
    private Output</* @Nullable */ FunctionEventInvokeConfigDestinationConfig> destinationConfig;

    /**
     * @return Configuration block with destination configuration. See below for details.
     * 
     */
    public Output<Optional<FunctionEventInvokeConfigDestinationConfig>> destinationConfig() {
        return Codegen.optional(this.destinationConfig);
    }
    /**
     * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    @Export(name="functionName", type=String.class, parameters={})
    private Output<String> functionName;

    /**
     * @return Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }
    /**
     * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
     * 
     */
    @Export(name="maximumEventAgeInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumEventAgeInSeconds;

    /**
     * @return Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
     * 
     */
    public Output<Optional<Integer>> maximumEventAgeInSeconds() {
        return Codegen.optional(this.maximumEventAgeInSeconds);
    }
    /**
     * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
     * 
     */
    @Export(name="maximumRetryAttempts", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumRetryAttempts;

    /**
     * @return Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
     * 
     */
    public Output<Optional<Integer>> maximumRetryAttempts() {
        return Codegen.optional(this.maximumRetryAttempts);
    }
    /**
     * Lambda Function published version, `$LATEST`, or Lambda Alias name.
     * 
     */
    @Export(name="qualifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> qualifier;

    /**
     * @return Lambda Function published version, `$LATEST`, or Lambda Alias name.
     * 
     */
    public Output<Optional<String>> qualifier() {
        return Codegen.optional(this.qualifier);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FunctionEventInvokeConfig(String name) {
        this(name, FunctionEventInvokeConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FunctionEventInvokeConfig(String name, FunctionEventInvokeConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FunctionEventInvokeConfig(String name, FunctionEventInvokeConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig", name, args == null ? FunctionEventInvokeConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FunctionEventInvokeConfig(String name, Output<String> id, @Nullable FunctionEventInvokeConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FunctionEventInvokeConfig get(String name, Output<String> id, @Nullable FunctionEventInvokeConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FunctionEventInvokeConfig(name, id, state, options);
    }
}
