// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RouterArgs;
import io.pulumi.gcp.compute.inputs.RouterState;
import io.pulumi.gcp.compute.outputs.RouterBgp;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a Router resource.
 * 
 * To get more information about Router, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
 * * How-to Guides
 *     * [Google Cloud Router](https://cloud.google.com/router/docs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Router can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/router:Router default projects/{{project}}/regions/{{region}}/routers/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/router:Router default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/router:Router default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/router:Router default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/router:Router")
public class Router extends io.pulumi.resources.CustomResource {
    /**
     * BGP information specific to this router.
     * Structure is documented below.
     * 
     */
    @Export(name="bgp", type=RouterBgp.class, parameters={})
    private Output</* @Nullable */ RouterBgp> bgp;

    /**
     * @return BGP information specific to this router.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RouterBgp> getBgp() {
        return this.bgp;
    }
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
     * User-specified description for the IP range.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User-specified description for the IP range.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Field to indicate if a router is dedicated to use with encrypted
     * Interconnect Attachment (IPsec-encrypted Cloud Interconnect feature).
     * Not currently available publicly.
     * 
     */
    @Export(name="encryptedInterconnectRouter", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encryptedInterconnectRouter;

    /**
     * @return Field to indicate if a router is dedicated to use with encrypted
     * Interconnect Attachment (IPsec-encrypted Cloud Interconnect feature).
     * Not currently available publicly.
     * 
     */
    public Output</* @Nullable */ Boolean> getEncryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter;
    }
    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A reference to the network to which this router belongs.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return A reference to the network to which this router belongs.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
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
     * Region where the router resides.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the router resides.
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

    public interface BuilderApplicator {
        public void apply(RouterArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.RouterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.RouterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Router(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Router(String name) {
        this(name, RouterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Router(String name, RouterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Router(String name, RouterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/router:Router", name, args == null ? RouterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Router(String name, Output<String> id, @Nullable RouterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/router:Router", name, state, makeResourceOptions(options, id));
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
    public static Router get(String name, Output<String> id, @Nullable RouterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Router(name, id, state, options);
    }
}
