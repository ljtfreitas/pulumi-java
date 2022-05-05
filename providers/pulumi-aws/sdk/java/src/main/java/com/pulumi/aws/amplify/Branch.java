// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.amplify.BranchArgs;
import com.pulumi.aws.amplify.inputs.BranchState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amplify Branch resource.
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
 *         var example = new App(&#34;example&#34;);
 * 
 *         var master = new Branch(&#34;master&#34;, BranchArgs.builder()        
 *             .appId(example.getId())
 *             .branchName(&#34;master&#34;)
 *             .framework(&#34;React&#34;)
 *             .stage(&#34;PRODUCTION&#34;)
 *             .environmentVariables(Map.of(&#34;REACT_APP_API_SERVER&#34;, &#34;https://api.example.com&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Basic Authentication
 * 
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
 *         var example = new App(&#34;example&#34;);
 * 
 *         var master = new Branch(&#34;master&#34;, BranchArgs.builder()        
 *             .appId(example.getId())
 *             .branchName(&#34;master&#34;)
 *             .basicAuthConfig(Map.ofEntries(
 *                 Map.entry(&#34;enableBasicAuth&#34;, true),
 *                 Map.entry(&#34;username&#34;, &#34;username&#34;),
 *                 Map.entry(&#34;password&#34;, &#34;password&#34;)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Notifications
 * 
 * Amplify Console uses EventBridge (formerly known as CloudWatch Events) and SNS for email notifications.  To implement the same functionality, you need to set `enable_notification` in a `aws.amplify.Branch` resource, as well as creating an EventBridge Rule, an SNS topic, and SNS subscriptions.
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
 *         var example = new App(&#34;example&#34;);
 * 
 *         var master = new Branch(&#34;master&#34;, BranchArgs.builder()        
 *             .appId(example.getId())
 *             .branchName(&#34;master&#34;)
 *             .enableNotification(true)
 *             .build());
 * 
 *         var amplifyAppMasterEventRule = new EventRule(&#34;amplifyAppMasterEventRule&#34;, EventRuleArgs.builder()        
 *             .description(master.getBranchName().apply(branchName -&gt; String.format(&#34;AWS Amplify build notifications for :  App: %s Branch: %s&#34;, aws_amplify_app.getApp().getId(),branchName)))
 *             .eventPattern(Output.tuple(example.getId(), master.getBranchName()).apply(values -&gt; {
 *                 var id = values.t1;
 *                 var branchName = values.t2;
 *                 return serializeJson(
 *                     jsonObject(
 *                         jsonProperty(&#34;detail&#34;, jsonObject(
 *                             jsonProperty(&#34;appId&#34;, jsonArray(id)),
 *                             jsonProperty(&#34;branchName&#34;, jsonArray(branchName)),
 *                             jsonProperty(&#34;jobStatus&#34;, jsonArray(
 *                                 &#34;SUCCEED&#34;, 
 *                                 &#34;FAILED&#34;, 
 *                                 &#34;STARTED&#34;
 *                             ))
 *                         )),
 *                         jsonProperty(&#34;detail-type&#34;, jsonArray(&#34;Amplify Deployment Status Change&#34;)),
 *                         jsonProperty(&#34;source&#34;, jsonArray(&#34;aws.amplify&#34;))
 *                     ));
 *             }))
 *             .build());
 * 
 *         var amplifyAppMasterTopic = new Topic(&#34;amplifyAppMasterTopic&#34;);
 * 
 *         var amplifyAppMasterEventTarget = new EventTarget(&#34;amplifyAppMasterEventTarget&#34;, EventTargetArgs.builder()        
 *             .rule(amplifyAppMasterEventRule.getName())
 *             .arn(amplifyAppMasterTopic.getArn())
 *             .inputTransformer(EventTargetInputTransformer.builder()
 *                 .inputPaths(Map.ofEntries(
 *                     Map.entry(&#34;jobId&#34;, &#34;$.detail.jobId&#34;),
 *                     Map.entry(&#34;appId&#34;, &#34;$.detail.appId&#34;),
 *                     Map.entry(&#34;region&#34;, &#34;$.region&#34;),
 *                     Map.entry(&#34;branch&#34;, &#34;$.detail.branchName&#34;),
 *                     Map.entry(&#34;status&#34;, &#34;$.detail.jobStatus&#34;)
 *                 ))
 *                 .inputTemplate(&#34;\&#34;Build notification from the AWS Amplify Console for app: https://&lt;branch&gt;.&lt;appId&gt;.amplifyapp.com/. Your build status is &lt;status&gt;. Go to https://console.aws.amazon.com/amplify/home?region=&lt;region&gt;#&lt;appId&gt;/&lt;branch&gt;/&lt;jobId&gt; to view details on your build. \&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var amplifyAppMasterPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatement.builder()
 *                 .sid(master.getArn().apply(arn -&gt; String.format(&#34;Allow_Publish_Events %s&#34;, arn)))
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;SNS:Publish&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipal.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;events.amazonaws.com&#34;)
 *                     .build())
 *                 .resources(amplifyAppMasterTopic.getArn())
 *                 .build())
 *             .build());
 * 
 *         var amplifyAppMasterTopicPolicy = new TopicPolicy(&#34;amplifyAppMasterTopicPolicy&#34;, TopicPolicyArgs.builder()        
 *             .arn(amplifyAppMasterTopic.getArn())
 *             .policy(amplifyAppMasterPolicyDocument.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult).apply(amplifyAppMasterPolicyDocument -&gt; amplifyAppMasterPolicyDocument.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult.getJson())))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Amplify branch can be imported using `app_id` and `branch_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:amplify/branch:Branch master d2ypk4k47z8u6/master
 * ```
 * 
 */
@ResourceType(type="aws:amplify/branch:Branch")
public class Branch extends com.pulumi.resources.CustomResource {
    /**
     * The unique ID for an Amplify app.
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return The unique ID for an Amplify app.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The Amazon Resource Name (ARN) for the branch.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the branch.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A list of custom resources that are linked to this branch.
     * 
     */
    @Export(name="associatedResources", type=List.class, parameters={String.class})
    private Output<List<String>> associatedResources;

    /**
     * @return A list of custom resources that are linked to this branch.
     * 
     */
    public Output<List<String>> associatedResources() {
        return this.associatedResources;
    }
    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    @Export(name="backendEnvironmentArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> backendEnvironmentArn;

    /**
     * @return The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    public Output<Optional<String>> backendEnvironmentArn() {
        return Codegen.optional(this.backendEnvironmentArn);
    }
    /**
     * The basic authorization credentials for the branch.
     * 
     */
    @Export(name="basicAuthCredentials", type=String.class, parameters={})
    private Output</* @Nullable */ String> basicAuthCredentials;

    /**
     * @return The basic authorization credentials for the branch.
     * 
     */
    public Output<Optional<String>> basicAuthCredentials() {
        return Codegen.optional(this.basicAuthCredentials);
    }
    /**
     * The name for the branch.
     * 
     */
    @Export(name="branchName", type=String.class, parameters={})
    private Output<String> branchName;

    /**
     * @return The name for the branch.
     * 
     */
    public Output<String> branchName() {
        return this.branchName;
    }
    /**
     * The custom domains for the branch.
     * 
     */
    @Export(name="customDomains", type=List.class, parameters={String.class})
    private Output<List<String>> customDomains;

    /**
     * @return The custom domains for the branch.
     * 
     */
    public Output<List<String>> customDomains() {
        return this.customDomains;
    }
    /**
     * The description for the branch.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the branch.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The destination branch if the branch is a pull request branch.
     * 
     */
    @Export(name="destinationBranch", type=String.class, parameters={})
    private Output<String> destinationBranch;

    /**
     * @return The destination branch if the branch is a pull request branch.
     * 
     */
    public Output<String> destinationBranch() {
        return this.destinationBranch;
    }
    /**
     * The display name for a branch. This is used as the default domain prefix.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name for a branch. This is used as the default domain prefix.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Enables auto building for the branch.
     * 
     */
    @Export(name="enableAutoBuild", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutoBuild;

    /**
     * @return Enables auto building for the branch.
     * 
     */
    public Output<Optional<Boolean>> enableAutoBuild() {
        return Codegen.optional(this.enableAutoBuild);
    }
    /**
     * Enables basic authorization for the branch.
     * 
     */
    @Export(name="enableBasicAuth", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBasicAuth;

    /**
     * @return Enables basic authorization for the branch.
     * 
     */
    public Output<Optional<Boolean>> enableBasicAuth() {
        return Codegen.optional(this.enableBasicAuth);
    }
    /**
     * Enables notifications for the branch.
     * 
     */
    @Export(name="enableNotification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableNotification;

    /**
     * @return Enables notifications for the branch.
     * 
     */
    public Output<Optional<Boolean>> enableNotification() {
        return Codegen.optional(this.enableNotification);
    }
    /**
     * Enables performance mode for the branch.
     * 
     */
    @Export(name="enablePerformanceMode", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePerformanceMode;

    /**
     * @return Enables performance mode for the branch.
     * 
     */
    public Output<Optional<Boolean>> enablePerformanceMode() {
        return Codegen.optional(this.enablePerformanceMode);
    }
    /**
     * Enables pull request previews for this branch.
     * 
     */
    @Export(name="enablePullRequestPreview", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePullRequestPreview;

    /**
     * @return Enables pull request previews for this branch.
     * 
     */
    public Output<Optional<Boolean>> enablePullRequestPreview() {
        return Codegen.optional(this.enablePullRequestPreview);
    }
    /**
     * The environment variables for the branch.
     * 
     */
    @Export(name="environmentVariables", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> environmentVariables;

    /**
     * @return The environment variables for the branch.
     * 
     */
    public Output<Optional<Map<String,String>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * The framework for the branch.
     * 
     */
    @Export(name="framework", type=String.class, parameters={})
    private Output</* @Nullable */ String> framework;

    /**
     * @return The framework for the branch.
     * 
     */
    public Output<Optional<String>> framework() {
        return Codegen.optional(this.framework);
    }
    /**
     * The Amplify environment name for the pull request.
     * 
     */
    @Export(name="pullRequestEnvironmentName", type=String.class, parameters={})
    private Output</* @Nullable */ String> pullRequestEnvironmentName;

    /**
     * @return The Amplify environment name for the pull request.
     * 
     */
    public Output<Optional<String>> pullRequestEnvironmentName() {
        return Codegen.optional(this.pullRequestEnvironmentName);
    }
    /**
     * The source branch if the branch is a pull request branch.
     * 
     */
    @Export(name="sourceBranch", type=String.class, parameters={})
    private Output<String> sourceBranch;

    /**
     * @return The source branch if the branch is a pull request branch.
     * 
     */
    public Output<String> sourceBranch() {
        return this.sourceBranch;
    }
    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @Export(name="stage", type=String.class, parameters={})
    private Output</* @Nullable */ String> stage;

    /**
     * @return Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    public Output<Optional<String>> stage() {
        return Codegen.optional(this.stage);
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The content Time To Live (TTL) for the website in seconds.
     * 
     */
    @Export(name="ttl", type=String.class, parameters={})
    private Output</* @Nullable */ String> ttl;

    /**
     * @return The content Time To Live (TTL) for the website in seconds.
     * 
     */
    public Output<Optional<String>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Branch(String name) {
        this(name, BranchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Branch(String name, BranchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Branch(String name, BranchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/branch:Branch", name, args == null ? BranchArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Branch(String name, Output<String> id, @Nullable BranchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/branch:Branch", name, state, makeResourceOptions(options, id));
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
    public static Branch get(String name, Output<String> id, @Nullable BranchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Branch(name, id, state, options);
    }
}
