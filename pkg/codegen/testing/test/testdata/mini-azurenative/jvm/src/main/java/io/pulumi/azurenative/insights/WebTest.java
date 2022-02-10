// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.WebTestArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:insights:WebTest")
public class WebTest extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="frequency", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> frequency;

    public Output</* @Nullable */ Integer> getFrequency() {
        return this.frequency;
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
    @OutputExport(name="retryEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> retryEnabled;

    public Output</* @Nullable */ Boolean> getRetryEnabled() {
        return this.retryEnabled;
    }
    @OutputExport(name="syntheticMonitorId", type=String.class, parameters={})
    private Output<String> syntheticMonitorId;

    public Output<String> getSyntheticMonitorId() {
        return this.syntheticMonitorId;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    public Output</* @Nullable */ Integer> getTimeout() {
        return this.timeout;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="webTestKind", type=String.class, parameters={})
    private Output<String> webTestKind;

    public Output<String> getWebTestKind() {
        return this.webTestKind;
    }
    @OutputExport(name="webTestName", type=String.class, parameters={})
    private Output<String> webTestName;

    public Output<String> getWebTestName() {
        return this.webTestName;
    }

    public WebTest(String name, WebTestArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:WebTest", name, args == null ? WebTestArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebTest(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:WebTest", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20150501:WebTest").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20180501preview:WebTest").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20201005preview:WebTest").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebTest get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebTest(name, id, options);
    }
}