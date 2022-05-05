// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directoryservice.LogServiceArgs;
import com.pulumi.aws.directoryservice.inputs.LogServiceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Log subscription for AWS Directory Service that pushes logs to cloudwatch.
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
 *         var exampleLogGroup = new LogGroup(&#34;exampleLogGroup&#34;, LogGroupArgs.builder()        
 *             .retentionInDays(14)
 *             .build());
 * 
 *         final var ad-log-policyPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatement.builder()
 *                 .actions(                
 *                     &#34;logs:CreateLogStream&#34;,
 *                     &#34;logs:PutLogEvents&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipal.builder()
 *                     .identifiers(&#34;ds.amazonaws.com&#34;)
 *                     .type(&#34;Service&#34;)
 *                     .build())
 *                 .resources(exampleLogGroup.getArn().apply(arn -&gt; String.format(&#34;%s:*&#34;, arn)))
 *                 .effect(&#34;Allow&#34;)
 *                 .build())
 *             .build());
 * 
 *         var ad_log_policyLogResourcePolicy = new LogResourcePolicy(&#34;ad-log-policyLogResourcePolicy&#34;, LogResourcePolicyArgs.builder()        
 *             .policyDocument(ad_log_policyPolicyDocument.apply(ad_log_policyPolicyDocument -&gt; ad_log_policyPolicyDocument.getJson()))
 *             .policyName(&#34;ad-log-policy&#34;)
 *             .build());
 * 
 *         var exampleLogService = new LogService(&#34;exampleLogService&#34;, LogServiceArgs.builder()        
 *             .directoryId(aws_directory_service_directory.getExample().getId())
 *             .logGroupName(exampleLogGroup.getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Directory Service Log Subscriptions can be imported using the directory id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directoryservice/logService:LogService msad d-1234567890
 * ```
 * 
 */
@ResourceType(type="aws:directoryservice/logService:LogService")
public class LogService extends com.pulumi.resources.CustomResource {
    /**
     * The id of directory.
     * 
     */
    @Export(name="directoryId", type=String.class, parameters={})
    private Output<String> directoryId;

    /**
     * @return The id of directory.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }
    /**
     * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
     * 
     */
    @Export(name="logGroupName", type=String.class, parameters={})
    private Output<String> logGroupName;

    /**
     * @return Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
     * 
     */
    public Output<String> logGroupName() {
        return this.logGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogService(String name) {
        this(name, LogServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogService(String name, LogServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogService(String name, LogServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/logService:LogService", name, args == null ? LogServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogService(String name, Output<String> id, @Nullable LogServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/logService:LogService", name, state, makeResourceOptions(options, id));
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
    public static LogService get(String name, Output<String> id, @Nullable LogServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogService(name, id, state, options);
    }
}
