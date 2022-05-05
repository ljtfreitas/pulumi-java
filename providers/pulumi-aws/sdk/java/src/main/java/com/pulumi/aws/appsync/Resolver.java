// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appsync.ResolverArgs;
import com.pulumi.aws.appsync.inputs.ResolverState;
import com.pulumi.aws.appsync.outputs.ResolverCachingConfig;
import com.pulumi.aws.appsync.outputs.ResolverPipelineConfig;
import com.pulumi.aws.appsync.outputs.ResolverSyncConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AppSync Resolver.
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
 *         var testGraphQLApi = new GraphQLApi(&#34;testGraphQLApi&#34;, GraphQLApiArgs.builder()        
 *             .authenticationType(&#34;API_KEY&#34;)
 *             .schema(&#34;&#34;&#34;
 * type Mutation {
 * 	putPost(id: ID!, title: String!): Post
 * }
 * 
 * type Post {
 * 	id: ID!
 * 	title: String!
 * }
 * 
 * type Query {
 * 	singlePost(id: ID!): Post
 * }
 * 
 * schema {
 * 	query: Query
 * 	mutation: Mutation
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var testDataSource = new DataSource(&#34;testDataSource&#34;, DataSourceArgs.builder()        
 *             .apiId(testGraphQLApi.getId())
 *             .name(&#34;tf_example&#34;)
 *             .type(&#34;HTTP&#34;)
 *             .httpConfig(DataSourceHttpConfig.builder()
 *                 .endpoint(&#34;http://example.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var testResolver = new Resolver(&#34;testResolver&#34;, ResolverArgs.builder()        
 *             .apiId(testGraphQLApi.getId())
 *             .field(&#34;singlePost&#34;)
 *             .type(&#34;Query&#34;)
 *             .dataSource(testDataSource.getName())
 *             .requestTemplate(&#34;&#34;&#34;
 * {
 *     &#34;version&#34;: &#34;2018-05-29&#34;,
 *     &#34;method&#34;: &#34;GET&#34;,
 *     &#34;resourcePath&#34;: &#34;/&#34;,
 *     &#34;params&#34;:{
 *         &#34;headers&#34;: $utils.http.copyheaders($ctx.request.headers)
 *     }
 * }
 *             &#34;&#34;&#34;)
 *             .responseTemplate(&#34;&#34;&#34;
 * #if($ctx.result.statusCode == 200)
 *     $ctx.result.body
 * #else
 *     $utils.appendError($ctx.result.body, $ctx.result.statusCode)
 * #end
 *             &#34;&#34;&#34;)
 *             .cachingConfig(ResolverCachingConfig.builder()
 *                 .cachingKeys(                
 *                     &#34;$context.identity.sub&#34;,
 *                     &#34;$context.arguments.id&#34;)
 *                 .ttl(60)
 *                 .build())
 *             .build());
 * 
 *         var mutationPipelineTest = new Resolver(&#34;mutationPipelineTest&#34;, ResolverArgs.builder()        
 *             .type(&#34;Mutation&#34;)
 *             .apiId(testGraphQLApi.getId())
 *             .field(&#34;pipelineTest&#34;)
 *             .requestTemplate(&#34;{}&#34;)
 *             .responseTemplate(&#34;$util.toJson($ctx.result)&#34;)
 *             .kind(&#34;PIPELINE&#34;)
 *             .pipelineConfig(ResolverPipelineConfig.builder()
 *                 .functions(                
 *                     aws_appsync_function.getTest1().getFunction_id(),
 *                     aws_appsync_function.getTest2().getFunction_id(),
 *                     aws_appsync_function.getTest3().getFunction_id())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_appsync_resolver` can be imported with their `api_id`, a hyphen, `type`, a hypen and `field` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appsync/resolver:Resolver example abcdef123456-exampleType-exampleField
 * ```
 * 
 */
@ResourceType(type="aws:appsync/resolver:Resolver")
public class Resolver extends com.pulumi.resources.CustomResource {
    /**
     * The API ID for the GraphQL API.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API ID for the GraphQL API.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The ARN
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The CachingConfig.
     * 
     */
    @Export(name="cachingConfig", type=ResolverCachingConfig.class, parameters={})
    private Output</* @Nullable */ ResolverCachingConfig> cachingConfig;

    /**
     * @return The CachingConfig.
     * 
     */
    public Output<Optional<ResolverCachingConfig>> cachingConfig() {
        return Codegen.optional(this.cachingConfig);
    }
    /**
     * The DataSource name.
     * 
     */
    @Export(name="dataSource", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSource;

    /**
     * @return The DataSource name.
     * 
     */
    public Output<Optional<String>> dataSource() {
        return Codegen.optional(this.dataSource);
    }
    /**
     * The field name from the schema defined in the GraphQL API.
     * 
     */
    @Export(name="field", type=String.class, parameters={})
    private Output<String> field;

    /**
     * @return The field name from the schema defined in the GraphQL API.
     * 
     */
    public Output<String> field() {
        return this.field;
    }
    /**
     * The resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @Export(name="maxBatchSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxBatchSize;

    /**
     * @return The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    public Output<Optional<Integer>> maxBatchSize() {
        return Codegen.optional(this.maxBatchSize);
    }
    /**
     * The PipelineConfig.
     * 
     */
    @Export(name="pipelineConfig", type=ResolverPipelineConfig.class, parameters={})
    private Output</* @Nullable */ ResolverPipelineConfig> pipelineConfig;

    /**
     * @return The PipelineConfig.
     * 
     */
    public Output<Optional<ResolverPipelineConfig>> pipelineConfig() {
        return Codegen.optional(this.pipelineConfig);
    }
    /**
     * The request mapping template for UNIT resolver or &#39;before mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @Export(name="requestTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestTemplate;

    /**
     * @return The request mapping template for UNIT resolver or &#39;before mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    public Output<Optional<String>> requestTemplate() {
        return Codegen.optional(this.requestTemplate);
    }
    /**
     * The response mapping template for UNIT resolver or &#39;after mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @Export(name="responseTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> responseTemplate;

    /**
     * @return The response mapping template for UNIT resolver or &#39;after mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    public Output<Optional<String>> responseTemplate() {
        return Codegen.optional(this.responseTemplate);
    }
    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @Export(name="syncConfig", type=ResolverSyncConfig.class, parameters={})
    private Output</* @Nullable */ ResolverSyncConfig> syncConfig;

    /**
     * @return Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    public Output<Optional<ResolverSyncConfig>> syncConfig() {
        return Codegen.optional(this.syncConfig);
    }
    /**
     * The type name from the schema defined in the GraphQL API.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type name from the schema defined in the GraphQL API.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Resolver(String name) {
        this(name, ResolverArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Resolver(String name, ResolverArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resolver(String name, ResolverArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/resolver:Resolver", name, args == null ? ResolverArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Resolver(String name, Output<String> id, @Nullable ResolverState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/resolver:Resolver", name, state, makeResourceOptions(options, id));
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
    public static Resolver get(String name, Output<String> id, @Nullable ResolverState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Resolver(name, id, state, options);
    }
}
