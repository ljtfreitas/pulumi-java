// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.CostAllocationRuleArgs;
import io.pulumi.azurenative.costmanagement.outputs.CostAllocationRulePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:costmanagement:CostAllocationRule")
public class CostAllocationRule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=CostAllocationRulePropertiesResponse.class, parameters={})
    private Output<CostAllocationRulePropertiesResponse> properties;

    public Output<CostAllocationRulePropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public CostAllocationRule(String name, CostAllocationRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:CostAllocationRule", name, args == null ? CostAllocationRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CostAllocationRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:CostAllocationRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:costmanagement/v20200301preview:CostAllocationRule").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CostAllocationRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CostAllocationRule(name, id, options);
    }
}