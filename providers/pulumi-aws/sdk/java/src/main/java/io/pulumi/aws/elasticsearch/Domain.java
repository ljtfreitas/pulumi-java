// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticsearch.DomainArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainState;
import io.pulumi.aws.elasticsearch.outputs.DomainAdvancedSecurityOptions;
import io.pulumi.aws.elasticsearch.outputs.DomainAutoTuneOptions;
import io.pulumi.aws.elasticsearch.outputs.DomainClusterConfig;
import io.pulumi.aws.elasticsearch.outputs.DomainCognitoOptions;
import io.pulumi.aws.elasticsearch.outputs.DomainDomainEndpointOptions;
import io.pulumi.aws.elasticsearch.outputs.DomainEbsOptions;
import io.pulumi.aws.elasticsearch.outputs.DomainEncryptAtRest;
import io.pulumi.aws.elasticsearch.outputs.DomainLogPublishingOption;
import io.pulumi.aws.elasticsearch.outputs.DomainNodeToNodeEncryption;
import io.pulumi.aws.elasticsearch.outputs.DomainSnapshotOptions;
import io.pulumi.aws.elasticsearch.outputs.DomainVpcOptions;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an AWS Elasticsearch Domain.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Elasticsearch domains can be imported using the `domain_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elasticsearch/domain:Domain example domain_name
 * ```
 * 
 */
@ResourceType(type="aws:elasticsearch/domain:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    /**
     * IAM policy document specifying the access policies for the domain.
     * 
     */
    @Export(name="accessPolicies", type=String.class, parameters={})
    private Output<String> accessPolicies;

    /**
     * @return IAM policy document specifying the access policies for the domain.
     * 
     */
    public Output<String> getAccessPolicies() {
        return this.accessPolicies;
    }
    @Export(name="advancedOptions", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> advancedOptions;

    public Output<Map<String,String>> getAdvancedOptions() {
        return this.advancedOptions;
    }
    /**
     * Configuration block for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    @Export(name="advancedSecurityOptions", type=DomainAdvancedSecurityOptions.class, parameters={})
    private Output<DomainAdvancedSecurityOptions> advancedSecurityOptions;

    /**
     * @return Configuration block for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    public Output<DomainAdvancedSecurityOptions> getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }
    /**
     * ARN of the domain.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the domain.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block for the Auto-Tune options of the domain. Detailed below.
     * 
     */
    @Export(name="autoTuneOptions", type=DomainAutoTuneOptions.class, parameters={})
    private Output<DomainAutoTuneOptions> autoTuneOptions;

    /**
     * @return Configuration block for the Auto-Tune options of the domain. Detailed below.
     * 
     */
    public Output<DomainAutoTuneOptions> getAutoTuneOptions() {
        return this.autoTuneOptions;
    }
    /**
     * Configuration block for the cluster of the domain. Detailed below.
     * 
     */
    @Export(name="clusterConfig", type=DomainClusterConfig.class, parameters={})
    private Output<DomainClusterConfig> clusterConfig;

    /**
     * @return Configuration block for the cluster of the domain. Detailed below.
     * 
     */
    public Output<DomainClusterConfig> getClusterConfig() {
        return this.clusterConfig;
    }
    /**
     * Configuration block for authenticating Kibana with Cognito. Detailed below.
     * 
     */
    @Export(name="cognitoOptions", type=DomainCognitoOptions.class, parameters={})
    private Output</* @Nullable */ DomainCognitoOptions> cognitoOptions;

    /**
     * @return Configuration block for authenticating Kibana with Cognito. Detailed below.
     * 
     */
    public Output</* @Nullable */ DomainCognitoOptions> getCognitoOptions() {
        return this.cognitoOptions;
    }
    /**
     * Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * 
     */
    @Export(name="domainEndpointOptions", type=DomainDomainEndpointOptions.class, parameters={})
    private Output<DomainDomainEndpointOptions> domainEndpointOptions;

    /**
     * @return Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * 
     */
    public Output<DomainDomainEndpointOptions> getDomainEndpointOptions() {
        return this.domainEndpointOptions;
    }
    /**
     * Unique identifier for the domain.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return Unique identifier for the domain.
     * 
     */
    public Output<String> getDomainId() {
        return this.domainId;
    }
    /**
     * Name of the domain.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). Detailed below.
     * 
     */
    @Export(name="ebsOptions", type=DomainEbsOptions.class, parameters={})
    private Output<DomainEbsOptions> ebsOptions;

    /**
     * @return Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). Detailed below.
     * 
     */
    public Output<DomainEbsOptions> getEbsOptions() {
        return this.ebsOptions;
    }
    /**
     * Version of Elasticsearch to deploy. Defaults to `1.5`.
     * 
     */
    @Export(name="elasticsearchVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> elasticsearchVersion;

    /**
     * @return Version of Elasticsearch to deploy. Defaults to `1.5`.
     * 
     */
    public Output</* @Nullable */ String> getElasticsearchVersion() {
        return this.elasticsearchVersion;
    }
    /**
     * Configuration block for encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). Detailed below.
     * 
     */
    @Export(name="encryptAtRest", type=DomainEncryptAtRest.class, parameters={})
    private Output<DomainEncryptAtRest> encryptAtRest;

    /**
     * @return Configuration block for encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). Detailed below.
     * 
     */
    public Output<DomainEncryptAtRest> getEncryptAtRest() {
        return this.encryptAtRest;
    }
    /**
     * Domain-specific endpoint used to submit index, search, and data upload requests.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return Domain-specific endpoint used to submit index, search, and data upload requests.
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * Domain-specific endpoint for kibana without https scheme.
     * 
     */
    @Export(name="kibanaEndpoint", type=String.class, parameters={})
    private Output<String> kibanaEndpoint;

    /**
     * @return Domain-specific endpoint for kibana without https scheme.
     * 
     */
    public Output<String> getKibanaEndpoint() {
        return this.kibanaEndpoint;
    }
    /**
     * Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * 
     */
    @Export(name="logPublishingOptions", type=List.class, parameters={DomainLogPublishingOption.class})
    private Output</* @Nullable */ List<DomainLogPublishingOption>> logPublishingOptions;

    /**
     * @return Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<DomainLogPublishingOption>> getLogPublishingOptions() {
        return this.logPublishingOptions;
    }
    /**
     * Configuration block for node-to-node encryption options. Detailed below.
     * 
     */
    @Export(name="nodeToNodeEncryption", type=DomainNodeToNodeEncryption.class, parameters={})
    private Output<DomainNodeToNodeEncryption> nodeToNodeEncryption;

    /**
     * @return Configuration block for node-to-node encryption options. Detailed below.
     * 
     */
    public Output<DomainNodeToNodeEncryption> getNodeToNodeEncryption() {
        return this.nodeToNodeEncryption;
    }
    /**
     * Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running Elasticsearch 5.3 and later, Amazon ES takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions of Elasticsearch, Amazon ES takes daily automated snapshots.
     * 
     */
    @Export(name="snapshotOptions", type=DomainSnapshotOptions.class, parameters={})
    private Output</* @Nullable */ DomainSnapshotOptions> snapshotOptions;

    /**
     * @return Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running Elasticsearch 5.3 and later, Amazon ES takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions of Elasticsearch, Amazon ES takes daily automated snapshots.
     * 
     */
    public Output</* @Nullable */ DomainSnapshotOptions> getSnapshotOptions() {
        return this.snapshotOptions;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)). Detailed below.
     * 
     */
    @Export(name="vpcOptions", type=DomainVpcOptions.class, parameters={})
    private Output</* @Nullable */ DomainVpcOptions> vpcOptions;

    /**
     * @return Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)). Detailed below.
     * 
     */
    public Output</* @Nullable */ DomainVpcOptions> getVpcOptions() {
        return this.vpcOptions;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DomainArgs.Builder a);
    }
    private static io.pulumi.aws.elasticsearch.DomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.elasticsearch.DomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Domain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, @Nullable DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, @Nullable DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/domain:Domain", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
