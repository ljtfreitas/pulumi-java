// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lightsail.ContainerArgs;
import io.pulumi.awsnative.lightsail.outputs.ContainerPublicDomainName;
import io.pulumi.awsnative.lightsail.outputs.ContainerServiceDeployment;
import io.pulumi.awsnative.lightsail.outputs.ContainerTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:lightsail:Container")
public class Container extends io.pulumi.resources.CustomResource {
    @OutputExport(name="containerArn", type=String.class, parameters={})
    private Output<String> containerArn;

    public Output<String> getContainerArn() {
        return this.containerArn;
    }
    @OutputExport(name="containerServiceDeployment", type=ContainerServiceDeployment.class, parameters={})
    private Output</* @Nullable */ ContainerServiceDeployment> containerServiceDeployment;

    public Output</* @Nullable */ ContainerServiceDeployment> getContainerServiceDeployment() {
        return this.containerServiceDeployment;
    }
    @OutputExport(name="isDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isDisabled;

    public Output</* @Nullable */ Boolean> getIsDisabled() {
        return this.isDisabled;
    }
    @OutputExport(name="power", type=String.class, parameters={})
    private Output<String> power;

    public Output<String> getPower() {
        return this.power;
    }
    @OutputExport(name="publicDomainNames", type=List.class, parameters={ContainerPublicDomainName.class})
    private Output</* @Nullable */ List<ContainerPublicDomainName>> publicDomainNames;

    public Output</* @Nullable */ List<ContainerPublicDomainName>> getPublicDomainNames() {
        return this.publicDomainNames;
    }
    @OutputExport(name="scale", type=Integer.class, parameters={})
    private Output<Integer> scale;

    public Output<Integer> getScale() {
        return this.scale;
    }
    @OutputExport(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }
    @OutputExport(name="tags", type=List.class, parameters={ContainerTag.class})
    private Output</* @Nullable */ List<ContainerTag>> tags;

    public Output</* @Nullable */ List<ContainerTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="url", type=String.class, parameters={})
    private Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public Container(String name, ContainerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:Container", name, args == null ? ContainerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Container(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:Container", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Container get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Container(name, id, options);
    }
}