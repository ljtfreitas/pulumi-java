// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.waf.GeoMatchSetArgs;
import io.pulumi.aws.waf.inputs.GeoMatchSetState;
import io.pulumi.aws.waf.outputs.GeoMatchSetGeoMatchConstraint;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a WAF Geo Match Set Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAF Geo Match Set can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/geoMatchSet:GeoMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/geoMatchSet:GeoMatchSet")
public class GeoMatchSet extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    @OutputExport(name="geoMatchConstraints", type=List.class, parameters={GeoMatchSetGeoMatchConstraint.class})
    private Output</* @Nullable */ List<GeoMatchSetGeoMatchConstraint>> geoMatchConstraints;

    /**
     * @return The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    public Output</* @Nullable */ List<GeoMatchSetGeoMatchConstraint>> getGeoMatchConstraints() {
        return this.geoMatchConstraints;
    }
    /**
     * The name or description of the GeoMatchSet.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the GeoMatchSet.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GeoMatchSet(String name, @Nullable GeoMatchSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/geoMatchSet:GeoMatchSet", name, args == null ? GeoMatchSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GeoMatchSet(String name, Input<String> id, @Nullable GeoMatchSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/geoMatchSet:GeoMatchSet", name, state, makeResourceOptions(options, id));
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
    public static GeoMatchSet get(String name, Input<String> id, @Nullable GeoMatchSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GeoMatchSet(name, id, state, options);
    }
}