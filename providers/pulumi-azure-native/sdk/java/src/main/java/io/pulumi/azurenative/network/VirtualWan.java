// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualWanArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:VirtualWan")
public class VirtualWan extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowBranchToBranchTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowBranchToBranchTraffic;

    public Output</* @Nullable */ Boolean> getAllowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic;
    }
    @OutputExport(name="allowVnetToVnetTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowVnetToVnetTraffic;

    public Output</* @Nullable */ Boolean> getAllowVnetToVnetTraffic() {
        return this.allowVnetToVnetTraffic;
    }
    @OutputExport(name="disableVpnEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableVpnEncryption;

    public Output</* @Nullable */ Boolean> getDisableVpnEncryption() {
        return this.disableVpnEncryption;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="office365LocalBreakoutCategory", type=String.class, parameters={})
    private Output<String> office365LocalBreakoutCategory;

    public Output<String> getOffice365LocalBreakoutCategory() {
        return this.office365LocalBreakoutCategory;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="virtualHubs", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> virtualHubs;

    public Output<List<SubResourceResponse>> getVirtualHubs() {
        return this.virtualHubs;
    }
    @OutputExport(name="vpnSites", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> vpnSites;

    public Output<List<SubResourceResponse>> getVpnSites() {
        return this.vpnSites;
    }

    public VirtualWan(String name, VirtualWanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualWan", name, args == null ? VirtualWanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualWan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualWan", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180401:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:VirtualWan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:VirtualWan").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static VirtualWan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualWan(name, id, options);
    }
}