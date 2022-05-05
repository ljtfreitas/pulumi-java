// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ProxyEndpointArgs;
import com.pulumi.aws.rds.inputs.ProxyEndpointState;
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
 * Provides an RDS DB proxy endpoint resource. For additional information, see the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html#rds-proxy-endpoints).
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
 *         var example = new ProxyEndpoint(&#34;example&#34;, ProxyEndpointArgs.builder()        
 *             .dbProxyName(aws_db_proxy.getTest().getName())
 *             .dbProxyEndpointName(&#34;example&#34;)
 *             .vpcSubnetIds(aws_subnet.getTest().stream().map(element -&gt; element.getId()).collect(toList()))
 *             .targetRole(&#34;READ_ONLY&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * DB proxy endpoints can be imported using the `DB-PROXY-NAME/DB-PROXY-ENDPOINT-NAME`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/proxyEndpoint:ProxyEndpoint example example/example
 * ```
 * 
 */
@ResourceType(type="aws:rds/proxyEndpoint:ProxyEndpoint")
public class ProxyEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the proxy endpoint.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the proxy endpoint.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The identifier for the proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can&#39;t end with a hyphen or contain two consecutive hyphens.
     * 
     */
    @Export(name="dbProxyEndpointName", type=String.class, parameters={})
    private Output<String> dbProxyEndpointName;

    /**
     * @return The identifier for the proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can&#39;t end with a hyphen or contain two consecutive hyphens.
     * 
     */
    public Output<String> dbProxyEndpointName() {
        return this.dbProxyEndpointName;
    }
    /**
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     * 
     */
    @Export(name="dbProxyName", type=String.class, parameters={})
    private Output<String> dbProxyName;

    /**
     * @return The name of the DB proxy associated with the DB proxy endpoint that you create.
     * 
     */
    public Output<String> dbProxyName() {
        return this.dbProxyName;
    }
    /**
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * Indicates whether this endpoint is the default endpoint for the associated DB proxy.
     * 
     */
    @Export(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    /**
     * @return Indicates whether this endpoint is the default endpoint for the associated DB proxy.
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The default is `READ_WRITE`. Valid values are `READ_WRITE` and `READ_ONLY`.
     * 
     */
    @Export(name="targetRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetRole;

    /**
     * @return Indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The default is `READ_WRITE`. Valid values are `READ_WRITE` and `READ_ONLY`.
     * 
     */
    public Output<Optional<String>> targetRole() {
        return Codegen.optional(this.targetRole);
    }
    /**
     * The VPC ID of the DB proxy endpoint.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC ID of the DB proxy endpoint.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    @Export(name="vpcSecurityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }
    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    @Export(name="vpcSubnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSubnetIds;

    /**
     * @return One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    public Output<List<String>> vpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProxyEndpoint(String name) {
        this(name, ProxyEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProxyEndpoint(String name, ProxyEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProxyEndpoint(String name, ProxyEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxyEndpoint:ProxyEndpoint", name, args == null ? ProxyEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProxyEndpoint(String name, Output<String> id, @Nullable ProxyEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxyEndpoint:ProxyEndpoint", name, state, makeResourceOptions(options, id));
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
    public static ProxyEndpoint get(String name, Output<String> id, @Nullable ProxyEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProxyEndpoint(name, id, state, options);
    }
}
