// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.SiteArgs;
import io.pulumi.awsnative.networkmanager.outputs.SiteLocation;
import io.pulumi.awsnative.networkmanager.outputs.SiteTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:networkmanager:Site")
public class Site extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }
    @OutputExport(name="location", type=SiteLocation.class, parameters={})
    private Output</* @Nullable */ SiteLocation> location;

    public Output</* @Nullable */ SiteLocation> getLocation() {
        return this.location;
    }
    @OutputExport(name="siteArn", type=String.class, parameters={})
    private Output<String> siteArn;

    public Output<String> getSiteArn() {
        return this.siteArn;
    }
    @OutputExport(name="siteId", type=String.class, parameters={})
    private Output<String> siteId;

    public Output<String> getSiteId() {
        return this.siteId;
    }
    @OutputExport(name="tags", type=List.class, parameters={SiteTag.class})
    private Output</* @Nullable */ List<SiteTag>> tags;

    public Output</* @Nullable */ List<SiteTag>> getTags() {
        return this.tags;
    }

    public Site(String name, SiteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:Site", name, args == null ? SiteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Site(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:Site", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Site get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Site(name, id, options);
    }
}