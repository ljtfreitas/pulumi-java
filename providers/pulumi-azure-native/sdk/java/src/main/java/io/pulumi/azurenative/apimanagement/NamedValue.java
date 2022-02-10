// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.NamedValueArgs;
import io.pulumi.azurenative.apimanagement.outputs.KeyVaultContractPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:apimanagement:NamedValue")
public class NamedValue extends io.pulumi.resources.CustomResource {
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="keyVault", type=KeyVaultContractPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultContractPropertiesResponse> keyVault;

    public Output</* @Nullable */ KeyVaultContractPropertiesResponse> getKeyVault() {
        return this.keyVault;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="secret", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> secret;

    public Output</* @Nullable */ Boolean> getSecret() {
        return this.secret;
    }
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    public Output</* @Nullable */ List<String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    public NamedValue(String name, NamedValueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:NamedValue", name, args == null ? NamedValueArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NamedValue(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:NamedValue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:NamedValue").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NamedValue get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NamedValue(name, id, options);
    }
}