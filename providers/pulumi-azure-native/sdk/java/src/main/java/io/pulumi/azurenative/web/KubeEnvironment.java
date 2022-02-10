// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.KubeEnvironmentArgs;
import io.pulumi.azurenative.web.outputs.AppLogsConfigurationResponse;
import io.pulumi.azurenative.web.outputs.ArcConfigurationResponse;
import io.pulumi.azurenative.web.outputs.ExtendedLocationResponse;
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

@ResourceType(type="azure-native:web:KubeEnvironment")
public class KubeEnvironment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="aksResourceID", type=String.class, parameters={})
    private Output</* @Nullable */ String> aksResourceID;

    public Output</* @Nullable */ String> getAksResourceID() {
        return this.aksResourceID;
    }
    @OutputExport(name="appLogsConfiguration", type=AppLogsConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ AppLogsConfigurationResponse> appLogsConfiguration;

    public Output</* @Nullable */ AppLogsConfigurationResponse> getAppLogsConfiguration() {
        return this.appLogsConfiguration;
    }
    @OutputExport(name="arcConfiguration", type=ArcConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ ArcConfigurationResponse> arcConfiguration;

    public Output</* @Nullable */ ArcConfigurationResponse> getArcConfiguration() {
        return this.arcConfiguration;
    }
    @OutputExport(name="defaultDomain", type=String.class, parameters={})
    private Output<String> defaultDomain;

    public Output<String> getDefaultDomain() {
        return this.defaultDomain;
    }
    @OutputExport(name="deploymentErrors", type=String.class, parameters={})
    private Output<String> deploymentErrors;

    public Output<String> getDeploymentErrors() {
        return this.deploymentErrors;
    }
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    @OutputExport(name="internalLoadBalancerEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> internalLoadBalancerEnabled;

    public Output</* @Nullable */ Boolean> getInternalLoadBalancerEnabled() {
        return this.internalLoadBalancerEnabled;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
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
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="staticIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> staticIp;

    public Output</* @Nullable */ String> getStaticIp() {
        return this.staticIp;
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

    public KubeEnvironment(String name, KubeEnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:KubeEnvironment", name, args == null ? KubeEnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private KubeEnvironment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:KubeEnvironment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20210101:KubeEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:KubeEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:KubeEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:KubeEnvironment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static KubeEnvironment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KubeEnvironment(name, id, options);
    }
}