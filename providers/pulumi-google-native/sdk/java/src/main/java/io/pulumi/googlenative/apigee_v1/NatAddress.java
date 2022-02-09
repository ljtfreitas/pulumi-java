// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.NatAddressArgs;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:apigee/v1:NatAddress")
public class NatAddress extends io.pulumi.resources.CustomResource {
    @OutputExport(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }

    public NatAddress(String name, NatAddressArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:NatAddress", name, args == null ? NatAddressArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NatAddress(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:NatAddress", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NatAddress get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NatAddress(name, id, options);
    }
}