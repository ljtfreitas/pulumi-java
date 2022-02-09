// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.RegionSslPolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.RegionSslPolicyWarningsItemResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ServerTlsSettingsResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:compute/alpha:RegionSslPolicy")
public class RegionSslPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="customFeatures", type=List.class, parameters={String.class})
    private Output<List<String>> customFeatures;

    public Output<List<String>> getCustomFeatures() {
        return this.customFeatures;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="enabledFeatures", type=List.class, parameters={String.class})
    private Output<List<String>> enabledFeatures;

    public Output<List<String>> getEnabledFeatures() {
        return this.enabledFeatures;
    }
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="minTlsVersion", type=String.class, parameters={})
    private Output<String> minTlsVersion;

    public Output<String> getMinTlsVersion() {
        return this.minTlsVersion;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="profile", type=String.class, parameters={})
    private Output<String> profile;

    public Output<String> getProfile() {
        return this.profile;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    @OutputExport(name="tlsSettings", type=ServerTlsSettingsResponse.class, parameters={})
    private Output<ServerTlsSettingsResponse> tlsSettings;

    public Output<ServerTlsSettingsResponse> getTlsSettings() {
        return this.tlsSettings;
    }
    @OutputExport(name="warnings", type=List.class, parameters={RegionSslPolicyWarningsItemResponse.class})
    private Output<List<RegionSslPolicyWarningsItemResponse>> warnings;

    public Output<List<RegionSslPolicyWarningsItemResponse>> getWarnings() {
        return this.warnings;
    }

    public RegionSslPolicy(String name, RegionSslPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:RegionSslPolicy", name, args == null ? RegionSslPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegionSslPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:RegionSslPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RegionSslPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionSslPolicy(name, id, options);
    }
}