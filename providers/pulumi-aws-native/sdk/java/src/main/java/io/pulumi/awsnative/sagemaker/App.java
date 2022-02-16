// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.AppArgs;
import io.pulumi.awsnative.sagemaker.enums.AppType;
import io.pulumi.awsnative.sagemaker.outputs.AppResourceSpec;
import io.pulumi.awsnative.sagemaker.outputs.AppTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:sagemaker:App")
public class App extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appArn", type=String.class, parameters={})
    private Output<String> appArn;

    public Output<String> getAppArn() {
        return this.appArn;
    }
    @OutputExport(name="appName", type=String.class, parameters={})
    private Output<String> appName;

    public Output<String> getAppName() {
        return this.appName;
    }
    @OutputExport(name="appType", type=AppType.class, parameters={})
    private Output<AppType> appType;

    public Output<AppType> getAppType() {
        return this.appType;
    }
    @OutputExport(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    public Output<String> getDomainId() {
        return this.domainId;
    }
    @OutputExport(name="resourceSpec", type=AppResourceSpec.class, parameters={})
    private Output</* @Nullable */ AppResourceSpec> resourceSpec;

    public Output</* @Nullable */ AppResourceSpec> getResourceSpec() {
        return this.resourceSpec;
    }
    @OutputExport(name="tags", type=List.class, parameters={AppTag.class})
    private Output</* @Nullable */ List<AppTag>> tags;

    public Output</* @Nullable */ List<AppTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="userProfileName", type=String.class, parameters={})
    private Output<String> userProfileName;

    public Output<String> getUserProfileName() {
        return this.userProfileName;
    }

    public App(String name, AppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private App(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:App", name, null, makeResourceOptions(options, id));
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