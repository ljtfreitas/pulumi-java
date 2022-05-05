// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lambda.PermissionArgs;
import com.pulumi.aws.lambda.inputs.PermissionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Gives an external source (like an EventBridge Rule, SNS, or S3) permission to access the Lambda function.
 * 
 * ## Example Usage
 * ### Basic Example
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var iamForLambda = new Role(&#34;iamForLambda&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Action&#34;, &#34;sts:AssumeRole&#34;),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Sid&#34;, &#34;&#34;),
 *                         jsonProperty(&#34;Principal&#34;, jsonObject(
 *                             jsonProperty(&#34;Service&#34;, &#34;lambda.amazonaws.com&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var testLambda = new Function(&#34;testLambda&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;lambdatest.zip&#34;))
 *             .role(iamForLambda.getArn())
 *             .handler(&#34;exports.handler&#34;)
 *             .runtime(&#34;nodejs12.x&#34;)
 *             .build());
 * 
 *         var testAlias = new Alias(&#34;testAlias&#34;, AliasArgs.builder()        
 *             .description(&#34;a sample description&#34;)
 *             .functionName(testLambda.getName())
 *             .functionVersion(&#34;$LATEST&#34;)
 *             .build());
 * 
 *         var allowCloudwatch = new Permission(&#34;allowCloudwatch&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(testLambda.getName())
 *             .principal(&#34;events.amazonaws.com&#34;)
 *             .sourceArn(&#34;arn:aws:events:eu-west-1:111122223333:rule/RunDaily&#34;)
 *             .qualifier(testAlias.getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Usage with SNS
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var defaultTopic = new Topic(&#34;defaultTopic&#34;);
 * 
 *         var defaultRole = new Role(&#34;defaultRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Action&#34;, &#34;sts:AssumeRole&#34;),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Sid&#34;, &#34;&#34;),
 *                         jsonProperty(&#34;Principal&#34;, jsonObject(
 *                             jsonProperty(&#34;Service&#34;, &#34;lambda.amazonaws.com&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var func = new Function(&#34;func&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;lambdatest.zip&#34;))
 *             .role(defaultRole.getArn())
 *             .handler(&#34;exports.handler&#34;)
 *             .runtime(&#34;python3.6&#34;)
 *             .build());
 * 
 *         var withSns = new Permission(&#34;withSns&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(func.getName())
 *             .principal(&#34;sns.amazonaws.com&#34;)
 *             .sourceArn(defaultTopic.getArn())
 *             .build());
 * 
 *         var lambda = new TopicSubscription(&#34;lambda&#34;, TopicSubscriptionArgs.builder()        
 *             .topic(defaultTopic.getArn())
 *             .protocol(&#34;lambda&#34;)
 *             .endpoint(func.getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Specify Lambda permissions for API Gateway REST API
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
 *         var myDemoAPI = new RestApi(&#34;myDemoAPI&#34;, RestApiArgs.builder()        
 *             .description(&#34;This is my API for demonstration purposes&#34;)
 *             .build());
 * 
 *         var lambdaPermission = new Permission(&#34;lambdaPermission&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(&#34;MyDemoFunction&#34;)
 *             .principal(&#34;apigateway.amazonaws.com&#34;)
 *             .sourceArn(myDemoAPI.getExecutionArn().apply(executionArn -&gt; String.format(&#34;%s/*{@literal /}*{@literal /}*&#34;, executionArn)))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ## Usage with CloudWatch log group
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
 *         var defaultLogGroup = new LogGroup(&#34;defaultLogGroup&#34;);
 * 
 *         var defaultRole = new Role(&#34;defaultRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;lambda.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Sid&#34;: &#34;&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var loggingFunction = new Function(&#34;loggingFunction&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;lamba_logging.zip&#34;))
 *             .handler(&#34;exports.handler&#34;)
 *             .role(defaultRole.getArn())
 *             .runtime(&#34;python3.6&#34;)
 *             .build());
 * 
 *         var loggingPermission = new Permission(&#34;loggingPermission&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(loggingFunction.getName())
 *             .principal(&#34;logs.eu-west-1.amazonaws.com&#34;)
 *             .sourceArn(defaultLogGroup.getArn().apply(arn -&gt; String.format(&#34;%s:*&#34;, arn)))
 *             .build());
 * 
 *         var loggingLogSubscriptionFilter = new LogSubscriptionFilter(&#34;loggingLogSubscriptionFilter&#34;, LogSubscriptionFilterArgs.builder()        
 *             .destinationArn(loggingFunction.getArn())
 *             .filterPattern(&#34;&#34;)
 *             .logGroup(defaultLogGroup.getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Lambda permission statements can be imported using function_name/statement_id, with an optional qualifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:lambda/permission:Permission test_lambda_permission my_test_lambda_function/AllowExecutionFromCloudWatch
 * ```
 * 
 * ```sh
 *  $ pulumi import aws:lambda/permission:Permission test_lambda_permission my_test_lambda_function:qualifier_name/AllowExecutionFromCloudWatch
 * ```
 * 
 */
@ResourceType(type="aws:lambda/permission:Permission")
public class Permission extends com.pulumi.resources.CustomResource {
    /**
     * The AWS Lambda action you want to allow in this statement. (e.g., `lambda:InvokeFunction`)
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The AWS Lambda action you want to allow in this statement. (e.g., `lambda:InvokeFunction`)
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The Event Source Token to validate.  Used with [Alexa Skills](https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#use-aws-cli).
     * 
     */
    @Export(name="eventSourceToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventSourceToken;

    /**
     * @return The Event Source Token to validate.  Used with [Alexa Skills](https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#use-aws-cli).
     * 
     */
    public Output<Optional<String>> eventSourceToken() {
        return Codegen.optional(this.eventSourceToken);
    }
    /**
     * Name of the Lambda function whose resource policy you are updating
     * 
     */
    @Export(name="function", type=String.class, parameters={})
    private Output<String> function;

    /**
     * @return Name of the Lambda function whose resource policy you are updating
     * 
     */
    public Output<String> function() {
        return this.function;
    }
    /**
     * The principal who is getting this permission e.g., `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal such as `events.amazonaws.com` or `sns.amazonaws.com`.
     * 
     */
    @Export(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    /**
     * @return The principal who is getting this permission e.g., `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal such as `events.amazonaws.com` or `sns.amazonaws.com`.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }
    /**
     * The identifier for your organization in AWS Organizations. Use this to grant permissions to all the AWS accounts under this organization.
     * 
     */
    @Export(name="principalOrgId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalOrgId;

    /**
     * @return The identifier for your organization in AWS Organizations. Use this to grant permissions to all the AWS accounts under this organization.
     * 
     */
    public Output<Optional<String>> principalOrgId() {
        return Codegen.optional(this.principalOrgId);
    }
    /**
     * Query parameter to specify function version or alias name. The permission will then apply to the specific qualified ARN e.g., `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
     * 
     */
    @Export(name="qualifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> qualifier;

    /**
     * @return Query parameter to specify function version or alias name. The permission will then apply to the specific qualified ARN e.g., `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
     * 
     */
    public Output<Optional<String>> qualifier() {
        return Codegen.optional(this.qualifier);
    }
    /**
     * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
     * 
     */
    @Export(name="sourceAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceAccount;

    /**
     * @return This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
     * 
     */
    public Output<Optional<String>> sourceAccount() {
        return Codegen.optional(this.sourceAccount);
    }
    /**
     * When the principal is an AWS service, the ARN of the specific resource within that service to grant permission to.
     * Without this, any resource from `principal` will be granted permission – even if that resource is from another account.
     * For S3, this should be the ARN of the S3 Bucket.
     * For EventBridge events, this should be the ARN of the EventBridge Rule.
     * For API Gateway, this should be the ARN of the API, as described [here](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
     * 
     */
    @Export(name="sourceArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceArn;

    /**
     * @return When the principal is an AWS service, the ARN of the specific resource within that service to grant permission to.
     * Without this, any resource from `principal` will be granted permission – even if that resource is from another account.
     * For S3, this should be the ARN of the S3 Bucket.
     * For EventBridge events, this should be the ARN of the EventBridge Rule.
     * For API Gateway, this should be the ARN of the API, as described [here](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
     * 
     */
    public Output<Optional<String>> sourceArn() {
        return Codegen.optional(this.sourceArn);
    }
    /**
     * A unique statement identifier. By default generated by this provider.
     * 
     */
    @Export(name="statementId", type=String.class, parameters={})
    private Output<String> statementId;

    /**
     * @return A unique statement identifier. By default generated by this provider.
     * 
     */
    public Output<String> statementId() {
        return this.statementId;
    }
    /**
     * A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    @Export(name="statementIdPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> statementIdPrefix;

    /**
     * @return A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    public Output<Optional<String>> statementIdPrefix() {
        return Codegen.optional(this.statementIdPrefix);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Permission(String name) {
        this(name, PermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Permission(String name, PermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Permission(String name, PermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/permission:Permission", name, args == null ? PermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Permission(String name, Output<String> id, @Nullable PermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/permission:Permission", name, state, makeResourceOptions(options, id));
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
    public static Permission get(String name, Output<String> id, @Nullable PermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Permission(name, id, state, options);
    }
}
