// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.resiliencehub.AppArgs;
import io.pulumi.awsnative.resiliencehub.outputs.AppResourceMapping;
import io.pulumi.awsnative.resiliencehub.outputs.AppTagMap;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:resiliencehub:App")
public class App extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appArn", type=String.class, parameters={})
    private Output<String> appArn;

    public Output<String> getAppArn() {
        return this.appArn;
    }
    @OutputExport(name="appTemplateBody", type=String.class, parameters={})
    private Output<String> appTemplateBody;

    public Output<String> getAppTemplateBody() {
        return this.appTemplateBody;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="resiliencyPolicyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> resiliencyPolicyArn;

    public Output</* @Nullable */ String> getResiliencyPolicyArn() {
        return this.resiliencyPolicyArn;
    }
    @OutputExport(name="resourceMappings", type=List.class, parameters={AppResourceMapping.class})
    private Output<List<AppResourceMapping>> resourceMappings;

    public Output<List<AppResourceMapping>> getResourceMappings() {
        return this.resourceMappings;
    }
    @OutputExport(name="tags", type=AppTagMap.class, parameters={})
    private Output</* @Nullable */ AppTagMap> tags;

    public Output</* @Nullable */ AppTagMap> getTags() {
        return this.tags;
    }

    public App(String name, AppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resiliencehub:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private App(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resiliencehub:App", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static App get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, options);
    }
}