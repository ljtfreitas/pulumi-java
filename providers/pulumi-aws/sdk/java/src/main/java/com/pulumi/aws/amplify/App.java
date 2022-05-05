// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.amplify.AppArgs;
import com.pulumi.aws.amplify.inputs.AppState;
import com.pulumi.aws.amplify.outputs.AppAutoBranchCreationConfig;
import com.pulumi.aws.amplify.outputs.AppCustomRule;
import com.pulumi.aws.amplify.outputs.AppProductionBranch;
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .buildSpec(&#34;&#34;&#34;
 *   version: 0.1
 *   frontend:
 *     phases:
 *       preBuild:
 *         commands:
 *           - yarn install
 *       build:
 *         commands:
 *           - yarn run build
 *     artifacts:
 *       baseDirectory: build
 *       files:
 *         - &#39;**{@literal /}*&#39;
 *     cache:
 *       paths:
 *         - node_modules/**{@literal /}*
 * 
 *             &#34;&#34;&#34;)
 *             .customRules(AppCustomRule.builder()
 *                 .source(&#34;/&lt;*&gt;&#34;)
 *                 .status(&#34;404&#34;)
 *                 .target(&#34;/index.html&#34;)
 *                 .build())
 *             .environmentVariables(Map.of(&#34;ENV&#34;, &#34;test&#34;))
 *             .repository(&#34;https://github.com/example/app&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Repository with Tokens
 * 
 * If you create a new Amplify App with the `repository` argument, you also need to set `oauth_token` or `access_token` for authentication. For GitHub, get a [personal access token](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line) and set `access_token` as follows:
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .accessToken(&#34;...&#34;)
 *             .repository(&#34;https://github.com/example/app&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * You can omit `access_token` if you import an existing Amplify App created by the Amplify Console (using OAuth for authentication).
 * ### Auto Branch Creation
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .autoBranchCreationConfig(AppAutoBranchCreationConfig.builder()
 *                 .enableAutoBuild(true)
 *                 .build())
 *             .autoBranchCreationPatterns(            
 *                 &#34;*&#34;,
 *                 &#34;*{@literal /}**&#34;)
 *             .enableAutoBranchCreation(true)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Rewrites and Redirects
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .customRules(            
 *                 AppCustomRule.builder()
 *                     .source(&#34;/api/&lt;*&gt;&#34;)
 *                     .status(&#34;200&#34;)
 *                     .target(&#34;https://api.example.com/api/&lt;*&gt;&#34;)
 *                     .build(),
 *                 AppCustomRule.builder()
 *                     .source(&#34;&lt;/^[^.]+$|\\.(?!(css|gif|ico|jpg|js|png|txt|svg|woff|ttf|map|json)$)([^.]+$)/&gt;&#34;)
 *                     .status(&#34;200&#34;)
 *                     .target(&#34;/index.html&#34;)
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Amplify App can be imported using Amplify App ID (appId), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:amplify/app:App example d2ypk4k47z8u6
 * ```
 * 
 *  App ID can be obtained from App ARN (e.g., `arn:aws:amplify:us-east-1:12345678:apps/d2ypk4k47z8u6`).
 * 
 */
@ResourceType(type="aws:amplify/app:App")
public class App extends com.pulumi.resources.CustomResource {
    /**
     * The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     * 
     */
    @Export(name="accessToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessToken;

    /**
     * @return The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     * 
     */
    public Output<Optional<String>> accessToken() {
        return Codegen.optional(this.accessToken);
    }
    /**
     * The Amazon Resource Name (ARN) of the Amplify app.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amplify app.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The automated branch creation configuration for an Amplify app. An `auto_branch_creation_config` block is documented below.
     * 
     */
    @Export(name="autoBranchCreationConfig", type=AppAutoBranchCreationConfig.class, parameters={})
    private Output<AppAutoBranchCreationConfig> autoBranchCreationConfig;

    /**
     * @return The automated branch creation configuration for an Amplify app. An `auto_branch_creation_config` block is documented below.
     * 
     */
    public Output<AppAutoBranchCreationConfig> autoBranchCreationConfig() {
        return this.autoBranchCreationConfig;
    }
    /**
     * The automated branch creation glob patterns for an Amplify app.
     * 
     */
    @Export(name="autoBranchCreationPatterns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> autoBranchCreationPatterns;

    /**
     * @return The automated branch creation glob patterns for an Amplify app.
     * 
     */
    public Output<Optional<List<String>>> autoBranchCreationPatterns() {
        return Codegen.optional(this.autoBranchCreationPatterns);
    }
    /**
     * The credentials for basic authorization for an Amplify app.
     * 
     */
    @Export(name="basicAuthCredentials", type=String.class, parameters={})
    private Output</* @Nullable */ String> basicAuthCredentials;

    /**
     * @return The credentials for basic authorization for an Amplify app.
     * 
     */
    public Output<Optional<String>> basicAuthCredentials() {
        return Codegen.optional(this.basicAuthCredentials);
    }
    /**
     * The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     * 
     */
    @Export(name="buildSpec", type=String.class, parameters={})
    private Output<String> buildSpec;

    /**
     * @return The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     * 
     */
    public Output<String> buildSpec() {
        return this.buildSpec;
    }
    /**
     * The custom rewrite and redirect rules for an Amplify app. A `custom_rule` block is documented below.
     * 
     */
    @Export(name="customRules", type=List.class, parameters={AppCustomRule.class})
    private Output</* @Nullable */ List<AppCustomRule>> customRules;

    /**
     * @return The custom rewrite and redirect rules for an Amplify app. A `custom_rule` block is documented below.
     * 
     */
    public Output<Optional<List<AppCustomRule>>> customRules() {
        return Codegen.optional(this.customRules);
    }
    /**
     * The default domain for the Amplify app.
     * 
     */
    @Export(name="defaultDomain", type=String.class, parameters={})
    private Output<String> defaultDomain;

    /**
     * @return The default domain for the Amplify app.
     * 
     */
    public Output<String> defaultDomain() {
        return this.defaultDomain;
    }
    /**
     * The description for an Amplify app.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for an Amplify app.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enables automated branch creation for an Amplify app.
     * 
     */
    @Export(name="enableAutoBranchCreation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutoBranchCreation;

    /**
     * @return Enables automated branch creation for an Amplify app.
     * 
     */
    public Output<Optional<Boolean>> enableAutoBranchCreation() {
        return Codegen.optional(this.enableAutoBranchCreation);
    }
    /**
     * Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     * 
     */
    @Export(name="enableBasicAuth", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBasicAuth;

    /**
     * @return Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     * 
     */
    public Output<Optional<Boolean>> enableBasicAuth() {
        return Codegen.optional(this.enableBasicAuth);
    }
    /**
     * Enables auto-building of branches for the Amplify App.
     * 
     */
    @Export(name="enableBranchAutoBuild", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBranchAutoBuild;

    /**
     * @return Enables auto-building of branches for the Amplify App.
     * 
     */
    public Output<Optional<Boolean>> enableBranchAutoBuild() {
        return Codegen.optional(this.enableBranchAutoBuild);
    }
    /**
     * Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     * 
     */
    @Export(name="enableBranchAutoDeletion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBranchAutoDeletion;

    /**
     * @return Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     * 
     */
    public Output<Optional<Boolean>> enableBranchAutoDeletion() {
        return Codegen.optional(this.enableBranchAutoDeletion);
    }
    /**
     * The environment variables map for an Amplify app.
     * 
     */
    @Export(name="environmentVariables", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> environmentVariables;

    /**
     * @return The environment variables map for an Amplify app.
     * 
     */
    public Output<Optional<Map<String,String>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * The AWS Identity and Access Management (IAM) service role for an Amplify app.
     * 
     */
    @Export(name="iamServiceRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamServiceRoleArn;

    /**
     * @return The AWS Identity and Access Management (IAM) service role for an Amplify app.
     * 
     */
    public Output<Optional<String>> iamServiceRoleArn() {
        return Codegen.optional(this.iamServiceRoleArn);
    }
    /**
     * The name for an Amplify app.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for an Amplify app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     * 
     */
    @Export(name="oauthToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> oauthToken;

    /**
     * @return The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     * 
     */
    public Output<Optional<String>> oauthToken() {
        return Codegen.optional(this.oauthToken);
    }
    /**
     * The platform or framework for an Amplify app. Valid values: `WEB`.
     * 
     */
    @Export(name="platform", type=String.class, parameters={})
    private Output</* @Nullable */ String> platform;

    /**
     * @return The platform or framework for an Amplify app. Valid values: `WEB`.
     * 
     */
    public Output<Optional<String>> platform() {
        return Codegen.optional(this.platform);
    }
    /**
     * Describes the information about a production branch for an Amplify app. A `production_branch` block is documented below.
     * 
     */
    @Export(name="productionBranches", type=List.class, parameters={AppProductionBranch.class})
    private Output<List<AppProductionBranch>> productionBranches;

    /**
     * @return Describes the information about a production branch for an Amplify app. A `production_branch` block is documented below.
     * 
     */
    public Output<List<AppProductionBranch>> productionBranches() {
        return this.productionBranches;
    }
    /**
     * The repository for an Amplify app.
     * 
     */
    @Export(name="repository", type=String.class, parameters={})
    private Output</* @Nullable */ String> repository;

    /**
     * @return The repository for an Amplify app.
     * 
     */
    public Output<Optional<String>> repository() {
        return Codegen.optional(this.repository);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, @Nullable AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, @Nullable AppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/app:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private App(String name, Output<String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/app:App", name, state, makeResourceOptions(options, id));
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
    public static App get(String name, Output<String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, state, options);
    }
}
