// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.UsagePlanArgs;
import com.pulumi.aws.apigateway.inputs.UsagePlanState;
import com.pulumi.aws.apigateway.outputs.UsagePlanApiStage;
import com.pulumi.aws.apigateway.outputs.UsagePlanQuotaSettings;
import com.pulumi.aws.apigateway.outputs.UsagePlanThrottleSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway Usage Plan.
 * 
 * ## Example Usage
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
 *         var exampleRestApi = new RestApi(&#34;exampleRestApi&#34;, RestApiArgs.builder()        
 *             .body(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;openapi&#34;, &#34;3.0.1&#34;),
 *                     jsonProperty(&#34;info&#34;, jsonObject(
 *                         jsonProperty(&#34;title&#34;, &#34;example&#34;),
 *                         jsonProperty(&#34;version&#34;, &#34;1.0&#34;)
 *                     )),
 *                     jsonProperty(&#34;paths&#34;, jsonObject(
 *                         jsonProperty(&#34;/path1&#34;, jsonObject(
 *                             jsonProperty(&#34;get&#34;, jsonObject(
 *                                 jsonProperty(&#34;x-amazon-apigateway-integration&#34;, jsonObject(
 *                                     jsonProperty(&#34;httpMethod&#34;, &#34;GET&#34;),
 *                                     jsonProperty(&#34;payloadFormatVersion&#34;, &#34;1.0&#34;),
 *                                     jsonProperty(&#34;type&#34;, &#34;HTTP_PROXY&#34;),
 *                                     jsonProperty(&#34;uri&#34;, &#34;https://ip-ranges.amazonaws.com/ip-ranges.json&#34;)
 *                                 ))
 *                             ))
 *                         ))
 *                     ))
 *                 )))
 *             .build());
 * 
 *         var exampleDeployment = new Deployment(&#34;exampleDeployment&#34;, DeploymentArgs.builder()        
 *             .restApi(exampleRestApi.getId())
 *             .triggers(Map.of(&#34;redeployment&#34;, exampleRestApi.getBody().apply(body -&gt; serializeJson(
 *                 body)).apply(toJSON -&gt; computeSHA1(toJSON))))
 *             .build());
 * 
 *         var development = new Stage(&#34;development&#34;, StageArgs.builder()        
 *             .deployment(exampleDeployment.getId())
 *             .restApi(exampleRestApi.getId())
 *             .stageName(&#34;development&#34;)
 *             .build());
 * 
 *         var production = new Stage(&#34;production&#34;, StageArgs.builder()        
 *             .deployment(exampleDeployment.getId())
 *             .restApi(exampleRestApi.getId())
 *             .stageName(&#34;production&#34;)
 *             .build());
 * 
 *         var exampleUsagePlan = new UsagePlan(&#34;exampleUsagePlan&#34;, UsagePlanArgs.builder()        
 *             .description(&#34;my description&#34;)
 *             .productCode(&#34;MYCODE&#34;)
 *             .apiStages(            
 *                 UsagePlanApiStage.builder()
 *                     .apiId(exampleRestApi.getId())
 *                     .stage(development.getStageName())
 *                     .build(),
 *                 UsagePlanApiStage.builder()
 *                     .apiId(exampleRestApi.getId())
 *                     .stage(production.getStageName())
 *                     .build())
 *             .quotaSettings(UsagePlanQuotaSettings.builder()
 *                 .limit(20)
 *                 .offset(2)
 *                 .period(&#34;WEEK&#34;)
 *                 .build())
 *             .throttleSettings(UsagePlanThrottleSettings.builder()
 *                 .burstLimit(5)
 *                 .rateLimit(10)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * AWS API Gateway Usage Plan can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/usagePlan:UsagePlan myusageplan &lt;usage_plan_id&gt;
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/usagePlan:UsagePlan")
public class UsagePlan extends com.pulumi.resources.CustomResource {
    /**
     * The associated API stages of the usage plan.
     * 
     */
    @Export(name="apiStages", type=List.class, parameters={UsagePlanApiStage.class})
    private Output</* @Nullable */ List<UsagePlanApiStage>> apiStages;

    /**
     * @return The associated API stages of the usage plan.
     * 
     */
    public Output<Optional<List<UsagePlanApiStage>>> apiStages() {
        return Codegen.optional(this.apiStages);
    }
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of a usage plan.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of a usage plan.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the usage plan.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the usage plan.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * 
     */
    @Export(name="productCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> productCode;

    /**
     * @return The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * 
     */
    public Output<Optional<String>> productCode() {
        return Codegen.optional(this.productCode);
    }
    /**
     * The quota settings of the usage plan.
     * 
     */
    @Export(name="quotaSettings", type=UsagePlanQuotaSettings.class, parameters={})
    private Output</* @Nullable */ UsagePlanQuotaSettings> quotaSettings;

    /**
     * @return The quota settings of the usage plan.
     * 
     */
    public Output<Optional<UsagePlanQuotaSettings>> quotaSettings() {
        return Codegen.optional(this.quotaSettings);
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The throttling limits of the usage plan.
     * 
     */
    @Export(name="throttleSettings", type=UsagePlanThrottleSettings.class, parameters={})
    private Output</* @Nullable */ UsagePlanThrottleSettings> throttleSettings;

    /**
     * @return The throttling limits of the usage plan.
     * 
     */
    public Output<Optional<UsagePlanThrottleSettings>> throttleSettings() {
        return Codegen.optional(this.throttleSettings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UsagePlan(String name) {
        this(name, UsagePlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UsagePlan(String name, @Nullable UsagePlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UsagePlan(String name, @Nullable UsagePlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/usagePlan:UsagePlan", name, args == null ? UsagePlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UsagePlan(String name, Output<String> id, @Nullable UsagePlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/usagePlan:UsagePlan", name, state, makeResourceOptions(options, id));
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
    public static UsagePlan get(String name, Output<String> id, @Nullable UsagePlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UsagePlan(name, id, state, options);
    }
}
