// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appsync.GraphQLApiArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiState;
import io.pulumi.aws.appsync.outputs.GraphQLApiAdditionalAuthenticationProvider;
import io.pulumi.aws.appsync.outputs.GraphQLApiLambdaAuthorizerConfig;
import io.pulumi.aws.appsync.outputs.GraphQLApiLogConfig;
import io.pulumi.aws.appsync.outputs.GraphQLApiOpenidConnectConfig;
import io.pulumi.aws.appsync.outputs.GraphQLApiUserPoolConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AppSync GraphQL API.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AppSync GraphQL API can be imported using the GraphQL API ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appsync/graphQLApi:GraphQLApi example 0123456789
 * ```
 * 
 */
@ResourceType(type="aws:appsync/graphQLApi:GraphQLApi")
public class GraphQLApi extends io.pulumi.resources.CustomResource {
    /**
     * One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    @OutputExport(name="additionalAuthenticationProviders", type=List.class, parameters={GraphQLApiAdditionalAuthenticationProvider.class})
    private Output</* @Nullable */ List<GraphQLApiAdditionalAuthenticationProvider>> additionalAuthenticationProviders;

    /**
     * @return One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    public Output</* @Nullable */ List<GraphQLApiAdditionalAuthenticationProvider>> getAdditionalAuthenticationProviders() {
        return this.additionalAuthenticationProviders;
    }
    /**
     * The ARN
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    @OutputExport(name="authenticationType", type=String.class, parameters={})
    private Output<String> authenticationType;

    /**
     * @return The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    public Output<String> getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    @OutputExport(name="lambdaAuthorizerConfig", type=GraphQLApiLambdaAuthorizerConfig.class, parameters={})
    private Output</* @Nullable */ GraphQLApiLambdaAuthorizerConfig> lambdaAuthorizerConfig;

    /**
     * @return Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    public Output</* @Nullable */ GraphQLApiLambdaAuthorizerConfig> getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig;
    }
    /**
     * Nested argument containing logging configuration. Defined below.
     * 
     */
    @OutputExport(name="logConfig", type=GraphQLApiLogConfig.class, parameters={})
    private Output</* @Nullable */ GraphQLApiLogConfig> logConfig;

    /**
     * @return Nested argument containing logging configuration. Defined below.
     * 
     */
    public Output</* @Nullable */ GraphQLApiLogConfig> getLogConfig() {
        return this.logConfig;
    }
    /**
     * A user-supplied name for the GraphqlApi.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-supplied name for the GraphqlApi.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    @OutputExport(name="openidConnectConfig", type=GraphQLApiOpenidConnectConfig.class, parameters={})
    private Output</* @Nullable */ GraphQLApiOpenidConnectConfig> openidConnectConfig;

    /**
     * @return Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    public Output</* @Nullable */ GraphQLApiOpenidConnectConfig> getOpenidConnectConfig() {
        return this.openidConnectConfig;
    }
    /**
     * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    @OutputExport(name="schema", type=String.class, parameters={})
    private Output</* @Nullable */ String> schema;

    /**
     * @return The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Output</* @Nullable */ String> getSchema() {
        return this.schema;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Map of URIs associated with the APIE.g., `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
     * 
     */
    @OutputExport(name="uris", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> uris;

    /**
     * @return Map of URIs associated with the APIE.g., `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
     * 
     */
    public Output<Map<String,String>> getUris() {
        return this.uris;
    }
    /**
     * The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @OutputExport(name="userPoolConfig", type=GraphQLApiUserPoolConfig.class, parameters={})
    private Output</* @Nullable */ GraphQLApiUserPoolConfig> userPoolConfig;

    /**
     * @return The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    public Output</* @Nullable */ GraphQLApiUserPoolConfig> getUserPoolConfig() {
        return this.userPoolConfig;
    }
    /**
     * Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    @OutputExport(name="xrayEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> xrayEnabled;

    /**
     * @return Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    public Output</* @Nullable */ Boolean> getXrayEnabled() {
        return this.xrayEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GraphQLApi(String name, GraphQLApiArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/graphQLApi:GraphQLApi", name, args == null ? GraphQLApiArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GraphQLApi(String name, Input<String> id, @Nullable GraphQLApiState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/graphQLApi:GraphQLApi", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static GraphQLApi get(String name, Input<String> id, @Nullable GraphQLApiState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GraphQLApi(name, id, state, options);
    }
}
