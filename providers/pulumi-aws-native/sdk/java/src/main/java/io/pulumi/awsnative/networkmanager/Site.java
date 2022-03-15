// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.SiteArgs;
import io.pulumi.awsnative.networkmanager.outputs.SiteLocation;
import io.pulumi.awsnative.networkmanager.outputs.SiteTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::NetworkManager::Site type describes a site.
 * 
 */
@ResourceType(type="aws-native:networkmanager:Site")
public class Site extends io.pulumi.resources.CustomResource {
    /**
     * The description of the site.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the site.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The ID of the global network.
     * 
     */
    @Export(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The location of the site.
     * 
     */
    @Export(name="location", type=SiteLocation.class, parameters={})
    private Output</* @Nullable */ SiteLocation> location;

    /**
     * @return The location of the site.
     * 
     */
    public Output</* @Nullable */ SiteLocation> getLocation() {
        return this.location;
    }
    /**
     * The Amazon Resource Name (ARN) of the site.
     * 
     */
    @Export(name="siteArn", type=String.class, parameters={})
    private Output<String> siteArn;

    /**
     * @return The Amazon Resource Name (ARN) of the site.
     * 
     */
    public Output<String> getSiteArn() {
        return this.siteArn;
    }
    /**
     * The ID of the site.
     * 
     */
    @Export(name="siteId", type=String.class, parameters={})
    private Output<String> siteId;

    /**
     * @return The ID of the site.
     * 
     */
    public Output<String> getSiteId() {
        return this.siteId;
    }
    /**
     * The tags for the site.
     * 
     */
    @Export(name="tags", type=List.class, parameters={SiteTag.class})
    private Output</* @Nullable */ List<SiteTag>> tags;

    /**
     * @return The tags for the site.
     * 
     */
    public Output</* @Nullable */ List<SiteTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(SiteArgs.Builder a);
    }
    private static io.pulumi.awsnative.networkmanager.SiteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.networkmanager.SiteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Site(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Site(String name) {
        this(name, SiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Site(String name, SiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Site(String name, SiteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:Site", name, args == null ? SiteArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Site(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:Site", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Site get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Site(name, id, options);
    }
}
