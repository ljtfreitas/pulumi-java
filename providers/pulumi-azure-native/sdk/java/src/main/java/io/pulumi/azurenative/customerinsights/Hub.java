// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.HubArgs;
import io.pulumi.azurenative.customerinsights.outputs.HubBillingInfoFormatResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:customerinsights:Hub")
public class Hub extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiEndpoint", type=String.class, parameters={})
    private Output<String> apiEndpoint;

    public Output<String> getApiEndpoint() {
        return this.apiEndpoint;
    }
    @OutputExport(name="hubBillingInfo", type=HubBillingInfoFormatResponse.class, parameters={})
    private Output</* @Nullable */ HubBillingInfoFormatResponse> hubBillingInfo;

    public Output</* @Nullable */ HubBillingInfoFormatResponse> getHubBillingInfo() {
        return this.hubBillingInfo;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
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
    @OutputExport(name="tenantFeatures", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tenantFeatures;

    public Output</* @Nullable */ Integer> getTenantFeatures() {
        return this.tenantFeatures;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="webEndpoint", type=String.class, parameters={})
    private Output<String> webEndpoint;

    public Output<String> getWebEndpoint() {
        return this.webEndpoint;
    }

    public Hub(String name, HubArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Hub", name, args == null ? HubArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Hub(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Hub", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:customerinsights/v20170101:Hub").build()),
                Input.of(Alias.builder().setType("azure-native:customerinsights/v20170426:Hub").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Hub get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Hub(name, id, options);
    }
}