// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticache.GlobalReplicationGroupArgs;
import com.pulumi.aws.elasticache.inputs.GlobalReplicationGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an ElastiCache Global Replication Group resource, which manages replication between two or more Replication Groups in different regions. For more information, see the [ElastiCache User Guide](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Redis-Global-Datastore.html).
 * 
 * ## Example Usage
 * ### Global replication group with one secondary replication group
 * 
 * The global replication group depends on the primary group existing. Secondary replication groups depend on the global replication group. the provider dependency management will handle this transparently using resource value references.
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
 *         var primary = new ReplicationGroup(&#34;primary&#34;, ReplicationGroupArgs.builder()        
 *             .replicationGroupDescription(&#34;primary replication group&#34;)
 *             .engine(&#34;redis&#34;)
 *             .engineVersion(&#34;5.0.6&#34;)
 *             .nodeType(&#34;cache.m5.large&#34;)
 *             .numberCacheClusters(1)
 *             .build());
 * 
 *         var example = new GlobalReplicationGroup(&#34;example&#34;, GlobalReplicationGroupArgs.builder()        
 *             .globalReplicationGroupIdSuffix(&#34;example&#34;)
 *             .primaryReplicationGroupId(primary.getId())
 *             .build());
 * 
 *         var secondary = new ReplicationGroup(&#34;secondary&#34;, ReplicationGroupArgs.builder()        
 *             .replicationGroupDescription(&#34;secondary replication group&#34;)
 *             .globalReplicationGroupId(example.getGlobalReplicationGroupId())
 *             .numberCacheClusters(1)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * ElastiCache Global Replication Groups can be imported using the `global_replication_group_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elasticache/globalReplicationGroup:GlobalReplicationGroup my_global_replication_group okuqm-global-replication-group-1
 * ```
 * 
 */
@ResourceType(type="aws:elasticache/globalReplicationGroup:GlobalReplicationGroup")
public class GlobalReplicationGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the ElastiCache Global Replication Group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the ElastiCache Global Replication Group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A flag that indicate whether the encryption at rest is enabled.
     * 
     */
    @Export(name="atRestEncryptionEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> atRestEncryptionEnabled;

    /**
     * @return A flag that indicate whether the encryption at rest is enabled.
     * 
     */
    public Output<Boolean> atRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
    }
    /**
     * A flag that indicate whether AuthToken (password) is enabled.
     * 
     */
    @Export(name="authTokenEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> authTokenEnabled;

    /**
     * @return A flag that indicate whether AuthToken (password) is enabled.
     * 
     */
    public Output<Boolean> authTokenEnabled() {
        return this.authTokenEnabled;
    }
    /**
     * The instance class used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
     * 
     */
    @Export(name="cacheNodeType", type=String.class, parameters={})
    private Output<String> cacheNodeType;

    /**
     * @return The instance class used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
     * 
     */
    public Output<String> cacheNodeType() {
        return this.cacheNodeType;
    }
    /**
     * Indicates whether the Global Datastore is cluster enabled.
     * 
     */
    @Export(name="clusterEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> clusterEnabled;

    /**
     * @return Indicates whether the Global Datastore is cluster enabled.
     * 
     */
    public Output<Boolean> clusterEnabled() {
        return this.clusterEnabled;
    }
    /**
     * The name of the cache engine to be used for the clusters in this global replication group.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return The name of the cache engine to be used for the clusters in this global replication group.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The full version number of the cache engine running on the members of this global replication group.
     * 
     */
    @Export(name="engineVersionActual", type=String.class, parameters={})
    private Output<String> engineVersionActual;

    /**
     * @return The full version number of the cache engine running on the members of this global replication group.
     * 
     */
    public Output<String> engineVersionActual() {
        return this.engineVersionActual;
    }
    /**
     * A user-created description for the global replication group.
     * 
     */
    @Export(name="globalReplicationGroupDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> globalReplicationGroupDescription;

    /**
     * @return A user-created description for the global replication group.
     * 
     */
    public Output<Optional<String>> globalReplicationGroupDescription() {
        return Codegen.optional(this.globalReplicationGroupDescription);
    }
    /**
     * The full ID of the global replication group.
     * 
     */
    @Export(name="globalReplicationGroupId", type=String.class, parameters={})
    private Output<String> globalReplicationGroupId;

    /**
     * @return The full ID of the global replication group.
     * 
     */
    public Output<String> globalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }
    /**
     * The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
     * 
     */
    @Export(name="globalReplicationGroupIdSuffix", type=String.class, parameters={})
    private Output<String> globalReplicationGroupIdSuffix;

    /**
     * @return The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
     * 
     */
    public Output<String> globalReplicationGroupIdSuffix() {
        return this.globalReplicationGroupIdSuffix;
    }
    /**
     * The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
     * 
     */
    @Export(name="primaryReplicationGroupId", type=String.class, parameters={})
    private Output<String> primaryReplicationGroupId;

    /**
     * @return The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
     * 
     */
    public Output<String> primaryReplicationGroupId() {
        return this.primaryReplicationGroupId;
    }
    /**
     * A flag that indicates whether the encryption in transit is enabled.
     * 
     */
    @Export(name="transitEncryptionEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> transitEncryptionEnabled;

    /**
     * @return A flag that indicates whether the encryption in transit is enabled.
     * 
     */
    public Output<Boolean> transitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalReplicationGroup(String name) {
        this(name, GlobalReplicationGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalReplicationGroup(String name, GlobalReplicationGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalReplicationGroup(String name, GlobalReplicationGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/globalReplicationGroup:GlobalReplicationGroup", name, args == null ? GlobalReplicationGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalReplicationGroup(String name, Output<String> id, @Nullable GlobalReplicationGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/globalReplicationGroup:GlobalReplicationGroup", name, state, makeResourceOptions(options, id));
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
    public static GlobalReplicationGroup get(String name, Output<String> id, @Nullable GlobalReplicationGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalReplicationGroup(name, id, state, options);
    }
}
