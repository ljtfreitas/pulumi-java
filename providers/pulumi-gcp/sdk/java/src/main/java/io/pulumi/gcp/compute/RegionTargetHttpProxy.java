// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionTargetHttpProxyArgs;
import io.pulumi.gcp.compute.inputs.RegionTargetHttpProxyState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a RegionTargetHttpProxy resource, which is used by one or more
 * forwarding rules to route incoming HTTP requests to a URL map.
 * 
 * To get more information about RegionTargetHttpProxy, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionTargetHttpProxies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RegionTargetHttpProxy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy default projects/{{project}}/regions/{{region}}/targetHttpProxies/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy")
public class RegionTargetHttpProxy extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The unique identifier for the resource.
     * 
     */
    @Export(name="proxyId", type=Integer.class, parameters={})
    private Output<Integer> proxyId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> getProxyId() {
        return this.proxyId;
    }
    /**
     * The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    @Export(name="urlMap", type=String.class, parameters={})
    private Output<String> urlMap;

    /**
     * @return A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    public Output<String> getUrlMap() {
        return this.urlMap;
    }

    public interface BuilderApplicator {
        public void apply(RegionTargetHttpProxyArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.RegionTargetHttpProxyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.RegionTargetHttpProxyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegionTargetHttpProxy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionTargetHttpProxy(String name) {
        this(name, RegionTargetHttpProxyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionTargetHttpProxy(String name, RegionTargetHttpProxyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionTargetHttpProxy(String name, RegionTargetHttpProxyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy", name, args == null ? RegionTargetHttpProxyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RegionTargetHttpProxy(String name, Output<String> id, @Nullable RegionTargetHttpProxyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy", name, state, makeResourceOptions(options, id));
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
    public static RegionTargetHttpProxy get(String name, Output<String> id, @Nullable RegionTargetHttpProxyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionTargetHttpProxy(name, id, state, options);
    }
}
